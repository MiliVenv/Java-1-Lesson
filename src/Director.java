public class Director {

    private static String name;
    private static Director instance;

    private Director(String name) {
        this.name = name;
    }

    public static Director getInstance(String name) {
        if (instance == null) {
            instance = new Director(name);
        }
        return instance;
    }

    public static String getName() {
        return name;
    }
}
