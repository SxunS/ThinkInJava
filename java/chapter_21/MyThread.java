package chapter_21;

public class MyThread implements Runnable{
    private static int taskCount;
    private final int id = taskCount++;
    MyThread(){
        System.out.println("#" + id + "------->" + "MyThread的构造方法正在被调用");
    }
    @Override
    public void run() {
        doSomething();
        doSomething();
        doSomething();
        System.out.println("#" + id + "------->"  + "run方法即将结束");
    }

    private void doSomething() {
        System.out.println("#" + id + "------->"  + "正在打印消息");
        Thread.yield();
    }
}
