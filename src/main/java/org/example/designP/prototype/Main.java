package org.example.designP.prototype;

import org.example.designP.prototype.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setTail("a");
        dog.setSkin("b");
        dog.setVoice("c");
        Dog dogClone=  dog.clone();
        System.out.println(dog);
        System.out.println(dogClone);

    }
}
