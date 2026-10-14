import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
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
//        MyThread mythread1 = new MyThread();
//        MyThread mythread2 = new MyThread();
//        MyThread mythread3 = new MyThread();
//        mythread1.start();
//        mythread2.start();
//        mythread3.start();

//        CommonResource commonResource = new CommonResource();
//        ReentrantLock locker = new ReentrantLock();
//
//        for (int i = 0; i < 6; i++) {
//            Thread t = new Thread(new CountThread(locker, commonResource));
//            t.setName("Thread " + i);
//            t.start();
//
//        }

//        Deadlock.Friend Kol = new Deadlock.Friend("Koll");
//        Deadlock.Friend Dol = new Deadlock.Friend("Doll");
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread 1");
//                Kol.bow(Dol);
//
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread 2");
//                Dol.bow(Kol);
//
//            }
//        }).start();

//        Scanner sc = new Scanner(System.in);
//        String[] strs = sc.nextLine().split(" ");
//        HashSet<Future<Integer>> fset = new HashSet<>();
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        for (String word : strs) {
//            ExampleCallable callable = new ExampleCallable(word);
//            Future future = executorService.submit(callable);
//            fset.add(future);
//        }
//
//        int sum = 0;
//
//        for (Future<Integer> futurer : fset) {
//            sum += futurer.get();
//        }
//
//        System.out.println(sum);
//        executorService.shutdown();

        ExecutorService pool = Executors.newFixedThreadPool(3);
        Set<Future<List<String>>> futures = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            Callable<List<String>> fileGenerator = new ExampleCallable2();
            Future<List<String>> future = pool.submit(fileGenerator);
            futures.add(future);
        }

        List<String> resultList = new ArrayList<>();
        for (Future<List<String>> f : futures) {
            resultList.addAll(f.get());
        }

        System.out.println(resultList);
        pool.shutdown();
    }
}