package com.zero.to.hero.design_pattern_frameworks.structural_dp.decorator.Example1;

public abstract class ChristmasTreeDecorator implements ChristmasTree{
    ChristmasTree christmasTree;

    public ChristmasTreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
