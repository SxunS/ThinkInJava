package chapter_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Practice3 {
    public static void main(String[] args) {
        //cachedTest();
        //fixTest();
        singleTest();
    }

    private static void cachedTest(){
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new MyThread());
        }
        exec.shutdown();
    }

    private static void fixTest(){
        ExecutorService exec = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 5; i++) {
            exec.execute(new MyThread());
        }
        exec.shutdown();
    }

    private static void singleTest(){
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            exec.execute(new MyThread());
        }
        exec.shutdown();
    }
}
