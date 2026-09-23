public class PasswordConfirmExeption extends Exception {
    String msg;

    public PasswordConfirmExeption(String msg) {
        super(msg);
        this.msg = msg;
    }
}
