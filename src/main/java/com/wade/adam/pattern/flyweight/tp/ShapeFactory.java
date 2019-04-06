package com.wade.adam.pattern.flyweight.tp;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private static final Map<Color, Circle> circleByColor = new HashMap<>();

    public static Shape getCircle(Color color) {
        Circle circle = circleByColor.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleByColor.put(color, circle);
        }

        return circle;
    }
}
