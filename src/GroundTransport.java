public class GroundTransport extends Transport{
    @Override
    void Honk() {
        System.out.println("Уйди с дороги");
    }

    @Override
    void Honk(String msg) {
        System.out.println("Уйди с дороги " + msg);
    }

    void Honk(boolean event, String msg) {
        if (event) System.out.println("Уйди с дороги " + msg);
        else System.out.println("Убегай с дороги " + msg);
    }
}
