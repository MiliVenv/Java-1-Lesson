public class MyThread extends Thread {

    private int counter;
    private static int GlobalCounter;

    @Override
    public void run() {
        while (counter < 20) {
            counter++;
            GlobalCounter++;
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(counter);
            System.out.println(GlobalCounter);
        }
    }
}
