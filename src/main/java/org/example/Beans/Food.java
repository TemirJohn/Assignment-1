package org.example.Beans;

import org.springframework.stereotype.Component;

@Component
public class Food {
    public void eat() {
        System.out.println("Dog is eating food.");
    }
}