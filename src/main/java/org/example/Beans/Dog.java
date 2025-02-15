package org.example.Beans;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    private String name;
    private String breed;

    public Dog() {
        this.name = "Buddy";
        this.breed = "Golden Retriever";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

    public void bark() {
        System.out.println("Waw-Waw!");
    }
}
