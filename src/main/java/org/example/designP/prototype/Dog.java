package org.example.designP.prototype;

public class Dog extends Animals{
    private String tail;
    public Dog(){

    }


    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }



    public Dog(Dog target){
        super(target);
        this.tail=target.tail;

    }

    @Override
    public Dog clone() {
        return new Dog(this);

    }

    @Override
    public String toString() {
        return "Dog{" +
                "tail='" + tail + '\'' +
                "} " + super.toString();
    }
}
