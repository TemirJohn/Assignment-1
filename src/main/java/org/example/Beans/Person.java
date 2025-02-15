package org.example.Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private final Dog dog;
    private final Vet vet;
    private final Toy toy;

    @Autowired
    public Person(Dog dog, Vet vet, Toy toy) {
        this.dog = dog;
        this.name = "John Doe";
        this.vet = vet;
        this.toy = toy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void sayHello() {
        System.out.println("Hi, my dog's name is " + dog.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "'" + name + '\'' +
                ", " + dog +
                '}';
    }

    public void takeDogToVet() {
        vet.healDog(dog);
    }

    public void playWithDog() {
        toy.playWithDog(dog);
    }
}
