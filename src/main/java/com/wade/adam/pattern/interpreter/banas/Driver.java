package com.wade.adam.pattern.interpreter.banas;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver {

    public static void main(String[] args){

        JFrame frame = new JFrame();

        String questionAsked = JOptionPane.showInputDialog(frame, "What is your question?");

        ConversionContext question = new ConversionContext(questionAsked);

        String fromConversion = question.getFromConversion();

        String toConversion = question.getToConversion();

        double quantity = question.getQuantity();

        try {
            Class tempClass = Class.forName(String.format("com.wade.adam.pattern.interpreter.%s", fromConversion));

            Constructor con = tempClass.getConstructor();

            Object convertFrom = con.newInstance();

            Class[] methodParams = new Class[]{Double.TYPE};

            Method conversionMethod = tempClass.getMethod(toConversion, methodParams);

            Object[] params = new Object[]{quantity};

            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

            String answerToQuestion = question.getConversionResponse() + toQuantity + " " + toConversion;

            JOptionPane.showMessageDialog(null, answerToQuestion);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        frame.dispose();

    }

}
