package cj.mf;

import cj.mf.functional.SimpleFuncInterface;

/**
 * Created by cjm on 11/22/14.
 */
public class LambdaTest {
    public static void test(String[] args) {
        carryOutWork(() -> System.out.println("Do work in lambda1 impl..."));
        carryOutWork(() -> System.out.println("Do work in lambda2 impl..."));
    }

    public static void carryOutWork(SimpleFuncInterface simpleFuncInterface) {
        simpleFuncInterface.doWork();
    }
}
