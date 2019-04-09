package com.wade.adam.pattern.visitor.banas;

import java.text.DecimalFormat;

public class TaxVisitor implements Visitor {

    DecimalFormat decimalFormat = new DecimalFormat("#.##");

    public TaxVisitor() { }

    @Override
    public double visit(Liquor liquor) {
        System.out.println("Liquor Item: Price with Tax");
        return Double.parseDouble(decimalFormat.format((liquor.getPrice() * .18) + (liquor.getPrice())));
    }

    @Override
    public double visit(Tobacco tobacco) {
        System.out.println("Tobacco Item: Price with Tax");
        return Double.parseDouble(decimalFormat.format((tobacco.getPrice() * .32) + (tobacco.getPrice())));
    }

    @Override
    public double visit(Necessity necessity) {
        System.out.println("Necessity Item: Price with Tax");
        return Double.parseDouble(decimalFormat.format(necessity.getPrice()));
    }

}
