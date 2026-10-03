import jdk.swing.interop.SwingInterOpUtils;

public class JoinRunnable extends Thread {
    public JoinRunnable(String name) {
        super(name);
    }

    @Override
    public void run() {
        String currentThread = Thread.currentThread().getName();

        for (int i = 0; i < 10; i++) {
            System.out.println("run " + i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("Complete current " + currentThread);
    }
}
