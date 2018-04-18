package Laborator.Streams_Lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ionut");
        names.add("Maria");
        names.add("Nelu");
        names.add("Ionelul");
        names.add("Ciprian");
        names.add("Lavinia");
        names.add("Mihaela");

        Predicate<String> predicateString = s -> s.length() <= 5;
        Predicate<String> predicateForAnotherString = s-> s.startsWith("I") || s.startsWith("M");
        //Predicate chain
        Predicate<String> predicateWithTwoConditions = predicateString.and(predicateForAnotherString);
        names.stream().filter(predicateWithTwoConditions).collect(Collectors.toList()).forEach(System.out::println);
    }
}
