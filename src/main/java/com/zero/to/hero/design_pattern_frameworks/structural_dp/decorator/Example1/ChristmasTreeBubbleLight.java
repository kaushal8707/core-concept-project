package com.zero.to.hero.design_pattern_frameworks.structural_dp.decorator.Example1;

public class ChristmasTreeBubbleLight extends ChristmasTreeDecorator{

    public ChristmasTreeBubbleLight(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decoratingWithBubbleLight();
    }

    private Object decoratingWithBubbleLight() {
        return "with Bubble Light !! ";
    }
}
