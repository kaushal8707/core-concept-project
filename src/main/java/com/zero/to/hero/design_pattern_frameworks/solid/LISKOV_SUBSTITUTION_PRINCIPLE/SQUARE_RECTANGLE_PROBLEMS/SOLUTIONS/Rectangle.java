package com.zero.to.hero.design_pattern_frameworks.solid.LISKOV_SUBSTITUTION_PRINCIPLE.SQUARE_RECTANGLE_PROBLEMS.SOLUTIONS;

public class Rectangle implements Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public int getArea() {
        return height * width;
    }
}
