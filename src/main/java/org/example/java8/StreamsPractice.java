package org.example.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice {
    public static void main(String[] args) {

        Person person1 = new Person("john",21,"john@gmail.com");
        Person person2 = new Person("lang",23,"lang@gmail.com");
        Person person3 = new Person("ram",19,"ram@gmail.com");

        List<Person> listOfPersons = new ArrayList<>();
        listOfPersons.add(person1);
        listOfPersons.add(person2);
        listOfPersons.add(person3);
        List<String> collectedList = listOfPersons.stream().
                filter(p -> p.getAge() > 20).map(p -> p.getName()).collect(Collectors.toList());

        System.out.println("Collected List "+collectedList);
        collectedList.forEach(System.out::println);
        List<String> collectedRam = listOfPersons.stream().
                filter(p -> p.getEmail().equals("ram@gmail.com")).map(p->p.getName()).collect(Collectors.toList());
        System.out.println(collectedRam);

        System.out.println("thread name is "+Thread.currentThread().getName());
        System.out.println("thread active is "+Thread.activeCount());
    }
}
