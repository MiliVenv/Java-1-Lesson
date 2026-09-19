public class Bus2 extends GroundTransport2 {

    String Model = "УАЗ";
    String honk = "Уйди с дороги";

    @Override
    public void move(int path) {
        System.out.println(path);
    }

    @Override
    public void refuel(int liters) {
        System.out.println(liters);
    }

    @Override
    public void Honk() {
        super.Honk();
        System.out.println(honk);
    }

    @Override
    public String toString() {
        return "Bus2{" +
                "Model='" + Model + '\'' +
                ", honk='" + honk + '\'' +
                '}';
    }
}
