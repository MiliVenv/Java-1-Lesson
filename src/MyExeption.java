public class MyExeption extends Exception {
    public String message;
    public String fileName;

    public MyExeption(String message, String fileName) {
        super(message);
        this.message = message;
        this.fileName = fileName;
    }
}
