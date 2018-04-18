package Laborator.Streams_Lambdas;

import java.util.ArrayList;
import java.util.List;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ionut");
        names.add("Ciprian");
        names.add("Lavinia");
        names.add("Mihaela");
        //use a lambda
        names.forEach(name -> System.out.println(name));
        //use method refference instead of lambda
        names.forEach(System.out::println);
    }
}
