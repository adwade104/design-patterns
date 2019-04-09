package com.wade.adam.pattern.visitor.banas;

public interface Visitor {

    double visit(Liquor liquor);
    double visit(Tobacco tobacco);
    double visit(Necessity necessity);

}
