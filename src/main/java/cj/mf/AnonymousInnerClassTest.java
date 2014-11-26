package cj.mf;

/**
 * Created by cjm on 11/22/14.
 */
public class AnonymousInnerClassTest {
    public static void test(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("A thread created and running ...");
            }
        }).start();
    }
}
