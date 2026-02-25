package com.zero.to.hero.design_pattern_frameworks.solid.LISKOV_SUBSTITUTION_PRINCIPLE.SQUARE_RECTANGLE_PROBLEMS.VIOLATION_LSP;

public class TestApp {
    public static void main(String[] args) {                                      // For a Rectangle, area should be 50.
        Rectangle rectangle= new Rectangle();                                 // But if 'r' is a Square, the area will be 100!
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        int result = rectangle.getArea();
        System.out.println("Area of Rectangle : "+ result);


        Rectangle rectangle1 = new Square();
        rectangle1.setHeight(5);
        rectangle1.setWidth(10);
        int result1 = rectangle1.getArea();
        System.out.println("Area of Square : "+ result1);

       // To fix this, we should acknowledge that while squares and rectangles are related, they behave differently when being "set." We can use a
        // common interface or an abstract class that focuses on read-only properties, or separate them entirely.
    }
}
