package com.zero.to.hero.design_pattern_frameworks.solid.LISKOV_SUBSTITUTION_PRINCIPLE.SQUARE_RECTANGLE_PROBLEMS.VIOLATION_LSP;

public class Square extends Rectangle{

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);   //Forced side effect
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);   // Forced side effect
    }
}
