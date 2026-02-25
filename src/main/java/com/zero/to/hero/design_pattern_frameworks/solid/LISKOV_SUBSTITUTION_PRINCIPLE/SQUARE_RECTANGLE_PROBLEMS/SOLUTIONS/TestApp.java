package com.zero.to.hero.design_pattern_frameworks.solid.LISKOV_SUBSTITUTION_PRINCIPLE.SQUARE_RECTANGLE_PROBLEMS.SOLUTIONS;

public class TestApp {
    public static void main(String[] args) {
        Shape rectangle= new Rectangle(5, 10);
        int result = rectangle.getArea();
        System.out.println("Area of Rectangle : "+ result);

        Shape square = new Square(5);
        int result1 = square.getArea();
        System.out.println("Area of Square : "+ result1);

        //Option B: Immutability
       //If you make the objects immutable (values are set only at construction), the LSP violation disappears because the "setter" side effects that
        // break the logic no longer exist.
    }
}
