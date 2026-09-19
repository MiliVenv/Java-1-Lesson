public class Transport {

    void Honk() {
        System.out.println("Бип Бип");
    }

    void Honk(String msg) {
        System.out.println(msg);
    }

    void Honk(String msg, int count) {
        for (int i = 0; i <= count; i++) {
            System.out.println(msg);

        }
    }
}