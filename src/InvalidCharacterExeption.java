public class InvalidCharacterExeption extends Exception {
    String msg;

    public InvalidCharacterExeption(String msg) {
        super(msg);
        this.msg = msg;
    }
}
