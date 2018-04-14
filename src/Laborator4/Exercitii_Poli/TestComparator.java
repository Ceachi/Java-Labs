package Laborator4.Exercitii_Poli;

import java.util.*;

/**
 * Created by Ciprian Mihai on 3/6/2018.
 */
public class TestComparator {
    public static void sortPersonsBy(FlexiblePersonComparator.Order sortingBy) {
        List<Person> persons = new ArrayList<Person>();  // useless line, just for clarification
        Person p = new Person("Ion", "10", "Romania");
        Person q = new Person("Maria", "20", "Italia");
        persons.add(p);
        persons.add(q);
        persons.add(p);
        FlexiblePersonComparator comparator = new FlexiblePersonComparator();
        comparator.setSortingBy(sortingBy);
        System.out.println(persons.get(0).toString());
        System.out.println(persons.get(1).toString());
        System.out.println(persons.get(2).toString());
        Collections.sort(persons, comparator); // now we have a sorted list
        System.out.println("****");
        System.out.println(persons.get(0).toString());
        System.out.println(persons.get(1).toString());
        System.out.println(persons.get(2).toString());
    }

    public static void main(String[] args) {
        sortPersonsBy(FlexiblePersonComparator.Order.Country);
    }
}

class FlexiblePersonComparator implements Comparator<Person> {
    public enum Order {Name, Age, Country}

    private Order sortingBy;

    @Override
    public int compare(Person person1, Person person2) {
        switch(sortingBy) {
            case Name: return person1.name.compareTo(person2.name);
            case Age: return person1.age.compareTo(person2.age);
            case Country: return person1.country.compareTo(person2.country);
        }
        throw new RuntimeException("Practically unreachable code, can't be thrown");
    }

    public void setSortingBy(Order sortBy) {
        this.sortingBy = sortBy;
    }
}

class Person{
    String name;
    String age;
    String country;

    public Person(String name, String age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}