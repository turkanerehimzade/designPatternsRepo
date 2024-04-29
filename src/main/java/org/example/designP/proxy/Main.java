package org.example.designP.proxy;

public class Main {
    public static void main(String[] args) {
        AccessControl accessControl1=new ProxyPassword("p@ssword1");
        AccessControl accessControl2=new ProxyPassword("p@ssword2");
        accessControl1.control();
        accessControl2.control();
        accessControl1.control();
    }


}
