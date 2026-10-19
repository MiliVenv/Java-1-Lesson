public class DirectorThread {

    private static String name;
    private static DirectorThread instance;

    private DirectorThread(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public static DirectorThread getInstance(String name) {
        if (instance == null) {
            synchronized (DirectorThread.class) {
                if (instance == null) {
                    instance = new DirectorThread(name);
                }
            }
        }
        return instance;


    }
}
