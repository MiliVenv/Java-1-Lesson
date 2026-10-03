public class Main {

    public static void main(String[] args) {
//        ThreadExample thread = new ThreadExample("David");
//        thread.start();
//        thread.setPriority(5);
//        Thread thread1 = new Thread(new RunnableExample("Vasya"));
//        thread.setPriority(10);
//        thread1.start();
//        System.out.println(thread.isAlive());
//        System.out.println(thread1.isAlive());
//            Thread one = new Thread(new SleepExample());
//            one.setName("1");
//            Thread two = new Thread(new SleepExample());
//            two.setName("2");
//            Thread three = new Thread(new SleepExample());
//            three.setName("3");
//
//            one.start();
//            two.start();
//            three.start();
//        JoinRunnable join1 = new JoinRunnable("A");
//        JoinRunnable join2 = new JoinRunnable("B");
//        JoinRunnable join3 = new JoinRunnable("C");
//
//        join1.start();
//        try {
//            join1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        join2.start();
//        join3.start();
        MyThread mythread1 = new MyThread();
        MyThread mythread2 = new MyThread();
        MyThread mythread3 = new MyThread();
        mythread1.start();
        mythread2.start();
        mythread3.start();
    }
}
