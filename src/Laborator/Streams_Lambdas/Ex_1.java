package Laborator.Streams_Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex_1 {
    public static void main(String[] args) {
        //metoda MAP = mapeaza obiectele dintr-o colectie, in alte obiecte conform Predicatului care este oferit ca argument
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        for(Integer i:square)
            System.out.print(i + " ");
        System.out.println("");
        //metoda FILTER = selecteaza obiectele conform Predicatului care este oferit ca argument
        List<String> names = Arrays.asList("Reflection","Collection","Stream","String","Object");
        List<String> result=names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
        for(String s:result)
            System.out.print(s + " ");
        System.out.println("");
        //metoda SORTED = sorteaza un stream
        List<String> namesSorted = names.stream().sorted().collect(Collectors.toList());
        for(String s:namesSorted)
            System.out.print(s + " ");
        System.out.println("");


        //Operatii terminale pe streamurile rezultate in urma diverselor operatii

        //metoda collect = returneaza rezultatele realizate pe un stream
        List<Integer> number2 = Arrays.asList(1,2,3,1,2,3,3);
        Set<Integer> squareSet = number2.stream().map(x -> x * x).collect(Collectors.toSet());
        List<Integer> squareList = number2.stream().map(x -> x * x).collect(Collectors.toList());
        for(Integer i:squareSet)
            System.out.print(i + " ");
        System.out.println("");
        for(Integer i:squareList)
            System.out.print(i + " ");
        System.out.println("");

        //metoda foreach = pentru a intera printr-un stream
        number2.stream().map(x->x*x).forEach(y->System.out.print(y + " "));
        System.out.println("");
        number2.stream().map(x->x*x).collect(Collectors.toList()).forEach(y->System.out.print(y + " "));
        System.out.println("");
        number2.stream().map(x->x*x).collect(Collectors.toSet()).forEach(y->System.out.print(y + " "));
        System.out.println("");

        //metoda reduce = folosita pentru a reduce rezultatul unui stream la o singura valoare
        //suma elem pare din lista
        List<Integer> number3 = Arrays.asList(7,8,9,10);
        int even = number3.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);

    }
}
