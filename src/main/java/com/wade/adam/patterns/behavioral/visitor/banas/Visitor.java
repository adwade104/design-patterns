package com.wade.adam.patterns.behavioral.visitor.banas;

public interface Visitor {

    double visit(Liquor liquor);
    double visit(Tobacco tobacco);
    double visit(Necessity necessity);

}
