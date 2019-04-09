package com.wade.adam.patterns.structural.flyweight.banas;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Driver extends JFrame {

    private JButton startDrawing;
    private int windowWidth = 1750;
    private int windowHeight = 1000;

    private Color[] shapeColor = {
            Color.orange, Color.red, Color.yellow,
            Color.blue, Color.pink, Color.cyan,
            Color.magenta, Color.black, Color.gray
    };

    public static void main(String[] args){

        new Driver();

    }

    public Driver(){ //Small variation on banas's original example

        this.setSize(windowWidth,windowHeight);
        this.setLocationRelativeTo(null); //center screen
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();
        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(e -> {

            Graphics g = drawingPanel.getGraphics();

            System.out.println("Default Example");
            long defaultTime = executeDefaultExample(g, 500000);
            System.out.println(String.format("Default took %s ms", defaultTime));

            System.out.println("Flyweight Example");
            long flyweightTime = executeFlyweightExample(g, 500000);
            System.out.println(String.format("Flyweight took %s ms", flyweightTime));

        });

        this.add(contentPane);
        this.setVisible(true);

    }

    private long executeDefaultExample(Graphics g, int numRectangles){

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < numRectangles; i++){
            MyRect myRect = new MyRect(getRandColor(), getRandX(), getRandY(), getRandX(), getRandY());
            myRect.draw(g);
        }

        long endTime = System.currentTimeMillis();

        return (endTime - startTime);
    }

    private long executeFlyweightExample(Graphics g, int numRectangles){

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < numRectangles; i++){
            MyRectFlyweight rect = RectFactoryFlyweight.getRect(getRandColor());
            rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());
        }

        long endTime = System.currentTimeMillis();

        return (endTime - startTime);

    }

    private Color getRandColor(){
        Random randomGenerator = new Random();
        int randInt = randomGenerator.nextInt(shapeColor.length);
        return shapeColor[randInt];
    }

    private int getRandX(){
        return (int) (Math.random()*windowWidth);
    }

    private int getRandY(){
        return (int) (Math.random()*windowHeight);
    }
}
