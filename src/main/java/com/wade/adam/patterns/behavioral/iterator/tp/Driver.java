package com.wade.adam.patterns.behavioral.iterator.tp;

public class Driver {

    public static void main(String[] args){

        NameRepository namesRepository = new NameRepository();

        for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
            String name = (String)iter.next();
            System.out.println("Name : " + name);
        }

    }


}
