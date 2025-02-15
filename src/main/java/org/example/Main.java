package org.example;

import org.example.Beans.Dog;
import org.example.Beans.Person;
import org.example.Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);
        Dog dog = context.getBean(Dog.class);
        System.out.println(person);

        person.setName("Alice Smith");
        person.getDog().setName("Max");
        person.getDog().setBreed("Labrador");

        System.out.println("After modifications:");
        System.out.println(person);

        System.out.println();
        person.sayHello();

        dog.bark();


        person.playWithDog();
        person.takeDogToVet();

        context.close();
    }
}