package com.wade.adam.pattern.flyweight.banas;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class RectFactoryFlyweight {

    private static final Map<Color, MyRectFlyweight> rectByColor = new HashMap<>();

    public static MyRectFlyweight getRect(Color color){

        MyRectFlyweight rect = rectByColor.get(color);

        if(rect == null){
            rect = new MyRectFlyweight(color);
            rectByColor.put(color, rect);
        }

        return rect;

    }

}
