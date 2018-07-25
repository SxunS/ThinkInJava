package chapter_21;

/**
 * 练习1：实现一个Runnable。在run（）内部打印一个消息，然后调用yield（）。
 * 重复这个操作3次，然后从run中返回。在构造器中放置一条启动消息，
 * 并且放置一条在任务终止时的关闭消息。
 * 适用线程创建大量的这种任务并驱动他们
 */
public class Practice1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new MyThread()).start();
        }
    }
}

