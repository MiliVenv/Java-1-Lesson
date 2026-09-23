public class EmptyLoginExeption extends Exception {
    String msg;

    public EmptyLoginExeption(String msg) {
        super(msg);
        this.msg = msg;
    }
}
