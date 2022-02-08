package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {

        String[] arr = new String[]{"a", "b", "c"};

        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(s -> System.out.println(s + " "));

        Arrays.stream(arr).forEach(s -> System.out.println(s + " "));

    }
}
