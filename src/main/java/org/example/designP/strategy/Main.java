package org.example.designP.strategy;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Process process=new Process(new AddOperation());
        System.out.println("add;"+process.solution(9,7));

        process=new Process(new SubstractOperation());
        System.out.println("substract;"+process.solution(5,3));
    }
}
