package cj.mf;

import java.util.Enumeration;
import java.util.List;
import java.util.Properties;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("system properties");
        Properties p = System.getProperties();
        p.list(System.out);

        System.out.println("command line arguments:");
        for (String s: args) {
            System.out.println(s);
        }

        AnonymousInnerClassTest.test(null);
        SimpleFunInterfaceTest.test(null);
        ComplexFunInterfaceTest.test(null);
        LambdaTest.test(null);
        LambdaThreads.test(null);
    }
}
