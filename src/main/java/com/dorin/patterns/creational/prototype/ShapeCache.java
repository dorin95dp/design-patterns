package com.dorin.patterns.creational.prototype;

import com.dorin.patterns.creational.prototype.shapes.Circle;
import com.dorin.patterns.creational.prototype.shapes.Rectangle;
import com.dorin.patterns.creational.prototype.shapes.Shape;
import com.dorin.patterns.creational.prototype.shapes.Square;

import java.util.HashMap;

public class ShapeCache {

    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId.toLowerCase());

        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("circle");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("square");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("rectangle");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}

