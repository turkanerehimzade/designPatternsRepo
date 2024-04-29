package org.example.designP.proxy;

public class ProxyPassword implements AccessControl {
    public RealPassword realPassword;
    public String password;
    public ProxyPassword(String password){
        this.password=password;
    }
    @Override
    public void control() {
        if(realPassword==null){
            realPassword=new RealPassword(password);
        }
        realPassword.control();

    }
}
