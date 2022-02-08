package me.whiteship.java8to11;

@FunctionalInterface
public interface RunSomething {
    abstract int doIt(int number);

    public static void printName() {
        System.out.println("kkambo");
    }

    default void printAge( ) {
        System.out.println("31");
    }
}
