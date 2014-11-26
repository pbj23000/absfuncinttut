package cj.mf;

/**
 * Created by cjm on 11/22/14.
 */
public class LambdaThreads {
    public static void test(String[] args) {
        for (Integer i = 0; i < 20; i++) {
            final Integer finalI = i;
            new Thread(() -> System.out.println("Thread [" + finalI + "]")).start();
            for (Integer j = 0; j < 20; j++) {
                final Integer finalJ = j;
                new Thread(() -> System.out.println("Thread [" + finalI + "][" + finalJ + "]")).start();
                for (Integer k = 0; k < 100; k++) {
                    final Integer finalK = k;
                    new Thread(() -> System.out.println("Thread [" + finalI + "][" + finalJ + "][" + finalK + "] running...")).start();
                }
            }
        }

        for (Integer i = 0; i < 20; i++) {
            final Integer finalI = i;
            new Thread(() -> {
                for (Integer j = 0; j < 20; j++) {
                    final Integer finalJ = j;
                    new Thread(() -> {
                        for (Integer k = 0; k < 20; k++) {
                            final Integer finalK = k;
                            new Thread(() -> System.out.println("Working in thread [" + finalI + "][" + finalJ + "][" + finalK + "]")).start();
                        }
                    }).start();
                }
            }).start();
        }
    }
}
