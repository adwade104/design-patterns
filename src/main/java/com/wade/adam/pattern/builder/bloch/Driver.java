package com.wade.adam.pattern.builder.bloch;

public class Driver {

    public static void main(String[] args){

        NutritionFacts facts = new NutritionFacts.Builder(240,8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27)
                .build();

        System.out.println(facts.toString());

    }

}
