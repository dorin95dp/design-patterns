package com.dorin.patterns.creational.prototype;

import com.dorin.patterns.creational.prototype.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape1 = ShapeCache.getShape("circle");
        System.out.println("Shape : " + clonedShape1.getType());
        clonedShape1.draw();


        Shape clonedShape2 = ShapeCache.getShape("square");
        System.out.println("Shape : " + clonedShape2.getType());
        clonedShape2.draw();

        Shape clonedShape3 = ShapeCache.getShape("rectangle");
        System.out.println("Shape : " + clonedShape3.getType());
        clonedShape3.draw();

    }
}
