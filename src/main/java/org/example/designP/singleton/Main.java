package org.example.designP.singleton;

public class Main {
    public static void main(String[] args) {
        String dataBase=DataBase.getInstance();
        System.out.println(dataBase);
    }
}
