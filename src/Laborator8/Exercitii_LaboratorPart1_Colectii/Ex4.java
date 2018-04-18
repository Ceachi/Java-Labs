package Laborator8.Exercitii_LaboratorPart1_Colectii;

import java.util.*;

public class Ex4 {
    //maximum using foreach
    public static <T extends Comparable<T>> T max_foreach(Collection<T> coll) {
        T candidate = coll.iterator().next();
        for (T elt : coll) {
            if (candidate.compareTo(elt) < 0) candidate = elt;
        }
        return candidate;
    }
    //maximum using iterator
    public static <T extends Comparable<T>> T max_iterator(Collection<T> coll) {
        Iterator<T> it = coll.iterator();
        T candidate = it.next();
        while (it.hasNext()) {
            T elt = it.next();
            if (candidate.compareTo(elt) < 0) candidate = elt;
        }
        return candidate;
    }

    public static void main(String[] args) {
        //using max method
        List<Integer> ints = Arrays.asList(0,1,2);
        System.out.println(max_foreach(ints));
        assert max_foreach(ints) == 2;
        List<String> strs = Arrays.asList("zero","one","two");
        System.out.println(max_foreach(strs));
        assert max_foreach(strs).equals("zero");


        //using max_2 method
        System.out.println(max_iterator(ints));
        assert max_iterator(ints) == 2;
        System.out.println(max_iterator(strs));
        assert max_iterator(strs).equals("zero");
    }
}
