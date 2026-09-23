public class LengthExeption extends Exception {
    String msg;

    public LengthExeption(String msg) {
        super(msg);
        this.msg = msg;
    }
}
