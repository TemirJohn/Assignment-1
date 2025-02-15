package org.example.Beans;

import org.springframework.stereotype.Component;


@Component
public class Toy {
    public void playWithDog(Dog dog) {
        System.out.println("Dog " + dog.getName() + " play with toy!");
    }
}
