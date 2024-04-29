package org.example.designP.factory;

public class Main {
    public static void main(String[] args) {
     SubjectsFactory subjectsFactory=new SubjectsFactory();
     Subjects subjectsFactory1= subjectsFactory.getSubject("Math");
     subjectsFactory1.study();
    }
}