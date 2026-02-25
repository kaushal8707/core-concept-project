package com.zero.to.hero.design_pattern_frameworks.structural_dp.decorator.Example1;

public class ChristmasTreeGarland extends ChristmasTreeDecorator{

    public ChristmasTreeGarland(ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decoratingWithGarland();
    }

    private Object decoratingWithGarland() {
        return "with Garland !!";
    }
}
