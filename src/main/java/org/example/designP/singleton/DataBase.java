package org.example.designP.singleton;

import java.util.StringJoiner;

public class DataBase {
    private static String foo;
    private static String instance;
    private DataBase(String foo){
        this.foo=foo;


    }
    public static String getInstance(){
        if(instance==null){
            return new DataBase("foo").toString();
        }return instance;
    }

    public String getFoo() {
        return foo;
    }

    public static void setFoo(String foo) {
        DataBase.foo = foo;
    }

    @Override
    public String toString() {
        return "Foo  "+foo;
    }
}
