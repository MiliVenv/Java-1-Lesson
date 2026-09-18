public class Car {
    final String model;
    static String color;
    double fuelConsumtion;
    int volume;
    int fuelLevel;

    Car(String model) {
        this.model = model;
        color = "Белый";
        fuelConsumtion = 8;
        volume = 45;
        fuelLevel = 10;
    }

    void move(int x1, int y1, int x2, int y2) {
        double path = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println(path);
        fuelLevel = (int) (fuelLevel - path / 100 * fuelConsumtion);
        if (fuelLevel < 0) {
            System.out.println("Не доехал нужно заправится");
        }else {
            System.out.println(fuelLevel);
        }
    }

    void refrash(int fuel) {
        fuelLevel = fuelLevel + fuel;
        if (fuelLevel > volume) {
            System.out.println("Топливо льётся через край");
            fuelLevel = volume;
        }else {
            System.out.println("Вы заправили и у вас в баке" + fuelLevel);
        }
    }
}
