package cj.mf;

import cj.mf.functional.ComplexFunctionalInterface;

/**
 * Created by cjm on 11/25/14.
 */
public class ComplexFunInterfaceTest {
    public static void test(String[] args) {
        carryOutWork(new ComplexFunctionalInterface() {
            @Override
            public void doWork() {
                System.out.println("Do work in anonymous inner class impl...");
            }
        });

        carryOutWork(() -> System.out.println("Do work in lambda exp impl..."));
    }

    public static void carryOutWork(ComplexFunctionalInterface complexFunctionalInterface) {
        complexFunctionalInterface.doWork();
        complexFunctionalInterface.doSomeWork();
        complexFunctionalInterface.doSomeOtherWork();
    }
}
