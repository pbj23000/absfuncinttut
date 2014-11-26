package cj.mf.functional;

/**
 * Created by cjm on 11/22/14.
 */
@FunctionalInterface
public interface SimpleFuncInterface {
    public void doWork();

    // can add methods from Object and remain a functional interface
    public String toString();

    public boolean equals(Object o);

    // can't add another abstract method though...
    // this results in compile time error
    // public boolean isFunctional();
}
