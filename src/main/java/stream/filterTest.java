package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class filterTest {
    public static void main(String[] args) {
        List<Human> humanList = new ArrayList<Human>();
        humanList.add(new Human("jojae", 2900, "1991-02-26"));
        humanList.add(new Human("haha", 1000, "2003-03-02"));
        humanList.add(new Human("arebia", 30000, "2001-04-06"));

        humanList.stream().forEach(human -> System.out.println(human));

        humanList.stream().filter(h ->h.getName().equals("haha")).forEach(s -> System.out.println(s));


        Stream<String> builderStream = Stream.<String>builder().add("Eric").add("Elena").add("Java").build();
        System.out.println(builderStream);

        builderStream.forEach(s -> System.out.println(s));
    }

}
