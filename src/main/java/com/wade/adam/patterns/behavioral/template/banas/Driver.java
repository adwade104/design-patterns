package com.wade.adam.patterns.behavioral.template.banas;

public class Driver {

    public static void main(String[] args){

        Hoagie italianHoagie = new ItalianHoagie();
        italianHoagie.makeSandwich();

        System.out.println();

        Hoagie veggieHoagie = new VeggieHoagie();
        veggieHoagie.makeSandwich();

    }


}
