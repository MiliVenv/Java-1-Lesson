public class RunnableExample implements Runnable {
    private String localname;

    public RunnableExample(String localname) {
        this.localname = localname;
    }

    @Override
    public void run() {
        System.out.println("Start " + this.localname);
    }
}

