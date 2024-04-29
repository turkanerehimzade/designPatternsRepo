package org.example.designP.abstractFactory;

public class BershkaFactory implements BrandFactory{


    @Override
    public Shirt createShirt() {
        return new BershkaShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new BershkaTrousers();
    }
}
