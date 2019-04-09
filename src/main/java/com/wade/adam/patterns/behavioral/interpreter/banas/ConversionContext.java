package com.wade.adam.patterns.behavioral.interpreter.banas;

public class ConversionContext {

    private String conversionQuestion;
    private String conversionResponse;

    private String fromConversion;
    private String toConversion;

    private double quantity;

    private String[] partsOfQuestion;

    public ConversionContext(String input){

        conversionQuestion = input;

        partsOfQuestion = conversionQuestion.split(" ");

        fromConversion = getCapitalized(partsOfQuestion[1]);

        toConversion = getLowercase(partsOfQuestion[3]);

        quantity = Double.valueOf(partsOfQuestion[0]);

        conversionResponse = partsOfQuestion[0] + " " + partsOfQuestion[1] + " equals ";
    }


    public String getConversionQuestion() {
        return conversionQuestion;
    }

    public String getConversionResponse() {
        return conversionResponse;
    }

    public String getFromConversion() {
        return fromConversion;
    }

    public String getToConversion() {
        return toConversion;
    }

    public double getQuantity() {
        return quantity;
    }

    private String getLowercase(String wordToLowercase){

        return wordToLowercase.toLowerCase();

    }

    private String getCapitalized(String wordToCapitalize){

        wordToCapitalize = wordToCapitalize.toLowerCase();
        wordToCapitalize = Character.toUpperCase(wordToCapitalize.charAt(0)) + wordToCapitalize.substring(1);

        int lengthOfWord = wordToCapitalize.length();

        if((wordToCapitalize.charAt(lengthOfWord - 1  )) != 's'){
            wordToCapitalize = new StringBuffer(wordToCapitalize).insert(lengthOfWord, "s").toString();
        }

        return wordToCapitalize;
    }

}
