package com.wade.adam.pattern.factory.banas;

import java.util.Scanner;

public class Driver {

    public static void main(String[] arg){

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();

        EnemyShip enemyShip = null;

        System.out.println("What type of ship? (U / R / B)");

        Scanner userInput = new Scanner(System.in);
        if (userInput.hasNextLine()){
            String typeOfShip = userInput.nextLine();
            enemyShip = enemyShipFactory.makeEnemyShip(typeOfShip);
        }

        if (enemyShip != null){
            enableEnemyShip(enemyShip);
        }

    }

    public static void enableEnemyShip(EnemyShip enemyShip){
        enemyShip.displayEnemyShip();
        enemyShip.followHeroShip();
        enemyShip.enemyShipShoots();
    }

    public void whenToUsePattern(){

        /* Original bad way,
           when you see yourself doing something like this,
           utilize the factory pattern*/

        System.out.println("What type of ship? (U / R)");
        Scanner userInput = new Scanner(System.in);

        String enemyShipOption = "";
        if(userInput.hasNextLine()){
            enemyShipOption = userInput.nextLine();
        }

        EnemyShip enemyShip = null;
        if("U".equalsIgnoreCase(enemyShipOption)){
            enemyShip = new UFOEnemyShip();
        }
        else if ("R".equalsIgnoreCase(enemyShipOption)){
            enemyShip = new RocketEnemyShip();
        }

        if(enemyShip != null) {
            enableEnemyShip(enemyShip);
        }

    }

}
