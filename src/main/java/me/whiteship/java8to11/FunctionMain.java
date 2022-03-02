package me.whiteship.java8to11;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {
        Plus10 plus10 = new Plus10();
        System.out.println(plus10.apply(10));

        //클래스 없이 가능
        Function<Integer, Integer> plus20 = (i) -> {
            return i + 20;
        };
        System.out.println(plus20.apply(1));

        //한줄인 경우 한줄로 표현 가능
        Function<Integer, Integer> plus30 = (i) -> i + 30;
        System.out.println(plus30.apply(1));

    }

}
