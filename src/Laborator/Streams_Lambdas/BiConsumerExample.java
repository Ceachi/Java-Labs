package Laborator.Streams_Lambdas;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiConsumerExample {
    public static void main(String[] args) {
        Map<String, Integer> hmap = new HashMap<>();

        BiConsumer<String, Integer> b1 = hmap::put;

        b1.accept("ion", 20);

        System.out.println(hmap.get("ion"));

        BiConsumer<String, Integer> b2 = (k, v) -> hmap.put(k,v);

        b2.accept("maria", 10);
        hmap.forEach((k,v)-> System.out.println(v));

        Predicate<String> testPred = s->s.startsWith("S");
        Predicate<String> testPred2 = s->s.length()<=5 || s.length()>=10;
        Predicate<String> testPred3 = testPred.and(testPred2);

        List<String> st = Arrays.asList("Ionel", "Mariaa", "Raul", "Matei Matei Ma", "Simona", "Simon");
        st.stream().filter(testPred3).forEach(System.out::println);

        List<Person> l = Arrays.asList(new Person(10, "Mihai"),
                new Person(10, "Mihai"),
                new Person(13, "Maria"));
        Set<Person> s = new HashSet<>(l);
        System.out.println(s);

        Stream<String> s1 = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s1.min((s_1, s_2) -> s_1.length()-s_2.length());
        min.ifPresent(System.out::println); // ape

        List list1 = Arrays.asList(1,23, 1);
    }
}
