package org.example.Beans;

import org.springframework.stereotype.Component;

@Component
public class Vet {
    public void healDog(Dog dog) {
        System.out.println("A veterinarian treats a dog " + dog.getName());
    }
}
