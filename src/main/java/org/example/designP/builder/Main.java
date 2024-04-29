package org.example.designP.builder;

public class Main {
    public static void main(String[] args) {
        Person person=new Person.PersonBuilder("Turkane","Rehimzade",19,"turkanerehimzade09@gmail.com").create();
        System.out.println(person);
    }
}
