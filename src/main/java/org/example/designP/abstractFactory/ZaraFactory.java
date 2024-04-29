package org.example.designP.abstractFactory;

public class ZaraFactory implements BrandFactory{

    @Override
    public Shirt createShirt() {
        return new ZaraShirt();
    }

    @Override
    public Trousers createTrousers() {
        return new ZaraTrousers();
    }
}
