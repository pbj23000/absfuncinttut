package cj.mf;

import cj.mf.functional.SimpleFuncInterface;

/**
 * Created by cjm on 11/22/14.
 */
public class SimpleFunInterfaceTest {
    public static void test(String[] args) {
        carryOutWork(new SimpleFuncInterface() {
            @Override
            public void doWork() {
                System.out.println("Do work in SimpleFun impl...");
            }
        });
        carryOutWork(() -> System.out.println("Do work in lambda exp impl..."));
    }

    public static void carryOutWork(SimpleFuncInterface simpleFuncInterface) {
        simpleFuncInterface.doWork();
    }
}
