package me.whiteship.java8to11;

/**
 * RunSomething 함수형 인터페이스 구현하기 위한 구현체
 *
 */
public class Foo {
    public static void main(String[] args) {

        // 익명 내부 클래스 anonymous inner class
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };

        // 람다 표현식으로 변경
        RunSomething runSomething2 = () -> System.out.println("Hello");


        //2줄인 경우
        RunSomething runSomething3 = () -> {
            System.out.println("Hello");
            System.out.println("lammda");
        };

        /**
         * 함수를 First class Object로 사용할 수 있다.
         * 자바에서의 함수는 특정한 형태의 Object 이기 때문에
         * Object를 return type으로 쓰거나 parameter Type으로 당연히 사용 가능하다.         *
         */

        PureFunction pureFunction = (number) -> {
            return number + 10;
        };

        /**
         * 같은 값을 넣으면 같은 값이 나와야 한다.
         * 외부의 값을 변경하지 못함, 주의해서 프로그래밍 해야함
         * 함수 내부에 있는 값, 파라미터로 전달 받은 값만 사용하자.
         * */
        System.out.println(pureFunction.doIt(1));
        System.out.println(pureFunction.doIt(1));
        System.out.println(pureFunction.doIt(1));
        System.out.println(pureFunction.doIt(1));
        System.out.println(pureFunction.doIt(1));
        System.out.println(pureFunction.doIt(1));

    }
}
