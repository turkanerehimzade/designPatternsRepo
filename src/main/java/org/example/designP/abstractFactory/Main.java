package org.example.designP.abstractFactory;

import java.util.Scanner;

public class Main {
    public static Production doProduction(){
        Production example;
        BrandFactory brandFactory;
        Scanner scanner=new Scanner(System.in);
        String brand= scanner.next();
        if(brand.equals("Zara")){
        brandFactory=new ZaraFactory();
        }else
//            niye ikinci shert vere bilmedim?
//            if(brand.equals("Bershka"))
            {
            brandFactory=new BershkaFactory();
        }
        example=new Production(brandFactory);
        return example;
    }
    public static void main(String[] args) {
        Production production=doProduction();
        production.sew();

    }
}
