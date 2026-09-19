public abstract class GroundTransport2 implements Transport2 {

    abstract void refuel(int liters);

    @Override
    public void Honk() {
        System.out.println("Бап Бап");
    }

}
