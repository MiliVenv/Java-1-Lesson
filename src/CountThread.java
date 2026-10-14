import java.util.concurrent.locks.ReentrantLock;

class CountThread implements Runnable {

    ReentrantLock rent;
    CommonResource comm;

    public CountThread(ReentrantLock rent, CommonResource commm) {
        this.rent = rent;
        comm = commm;
    }

    @Override
    public void run() {

        rent.lock();
        try {
            comm.x = 1;
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), comm.x);
                comm.x++;
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            rent.unlock();
        }
    }
}
