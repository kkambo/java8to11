package me.whiteship.java8to11;

/**
 * 함수형 인터페이스
 * - 추상 메소드가 1개만 있는 인터페이스 *
 * - static method, default method 작성 가능
 * - @FunctionalInterface 로 작성해두면 컴파일에서 체크 할 수 있음
 */

@FunctionalInterface
public interface RunSomething {
    void doIt();

    static void printName(){
        System.out.println("kkambo");
    }

    default void printAge() {
        System.out.println("33");
    }
}
