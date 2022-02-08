package stream;

import java.util.stream.Stream;

public class Builder {
    public static void main(String[] args) {
        Stream<String> builderStream = Stream.<String>builder().add("Eric").add("Elena").add("Java").build();
        System.out.println(builderStream);

        builderStream.forEach(s -> System.out.println(s));
    }
}
