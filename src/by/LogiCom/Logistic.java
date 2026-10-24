package by.LogiCom;

public abstract class Logistic {

    public void dologistics() {
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}
