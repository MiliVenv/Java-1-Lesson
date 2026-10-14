public class Store {
    private int item;

    public synchronized void put() throws InterruptedException {
        while (item >= 3) {
            wait();
        }
        item++;
        System.out.println("Покупатель положил товар, остаток " + item);
        notify();
    }

    public synchronized void get() throws InterruptedException {
        while (item < 1) {
            wait();
        }
        item--;
        System.out.println("Покупатель приобрёл товар, остаток " + item);
        notify();
    }
}
