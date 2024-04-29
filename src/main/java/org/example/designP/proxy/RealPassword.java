package org.example.designP.proxy;

public class RealPassword implements AccessControl{
    private static String password;
    public  RealPassword(String password){
        this.password=password;
        entering();
    }
    private static void entering(){
        System.out.println("password is entering:"+password);
    }
    public void control() {
        System.out.println("password is check:"+password);
    }
}
