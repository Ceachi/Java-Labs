package Laborator.Streams_Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Person {

    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return getAge() == person.getAge();
    }

    @Override
    public int hashCode() {
        return getAge();
    }

    public static void main(String[] args) {
        //the average of the age of the people older than 20
        List<Person> persons = Arrays.asList(
                new Person(25, "Alex"),
                new Person(18, "Catalin"),
                new Person(30, "Alin"),
                new Person(17, "Vali"),
                new Person(28, "Alma"),
                new Person(15, "Sebastian"),
                new Person(35, "Ionut")
        );

        int sumOfAge = 0;
        int numberOfPersons = 0;
        for( Person person: persons ){
            if( person.getAge() > 20 ){
                numberOfPersons++;
                sumOfAge += person.getAge();
            }
        }

        double averageAge= (double)sumOfAge/numberOfPersons;
        System.out.println("Media varstei este: "+ averageAge);

        Stream<Person> personStream = persons.stream();
        OptionalDouble averageOptional =  personStream.mapToInt(person -> person.getAge()).filter(age -> age > 20).average();
        if( averageOptional.isPresent() ){
            System.out.println("Media varstei cu streams: "+ averageOptional.getAsDouble());
        }

        //persoanele peste 20 de ani
        List<Person> personsAbove20 =  persons.stream().filter(p -> p.getAge() > 20).collect(Collectors.toList());
        personsAbove20.forEach(System.out::println);

        List<String> names = Arrays.asList("My", "Name", "is", "John", "Doe");
        //only the elements with less than 4 characters
        List<String> namesWithLessThan4 = names.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        namesWithLessThan4.forEach(System.out::println);
    }
}