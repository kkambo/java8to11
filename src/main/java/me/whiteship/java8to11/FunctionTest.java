package me.whiteship.java8to11;

import java.util.function.*;

public class FunctionTest {
    public static void main(String[] args) {

       Predicate<Integer> isEven = (i) -> i % 2 == 0;
        System.out.println(isEven.test(3));
    }
}
