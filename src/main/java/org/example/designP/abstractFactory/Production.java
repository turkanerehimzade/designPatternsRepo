package org.example.designP.abstractFactory;

public class Production {
    private Shirt shirt;
    private Trousers trousers;
     public Production(BrandFactory brandFactory){
         shirt=brandFactory.createShirt();
         trousers=brandFactory.createTrousers();
     }
     public void sew(){
         shirt.sew();
         trousers.sew();
     }
}
