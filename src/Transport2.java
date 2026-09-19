public interface Transport2 {

    String transportType = "ДВС";

    void move(int path);

    default void Honk() {
        System.out.println("Бип Бип");
    }
}
