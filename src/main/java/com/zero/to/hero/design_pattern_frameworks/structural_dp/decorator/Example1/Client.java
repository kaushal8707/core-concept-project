package com.zero.to.hero.design_pattern_frameworks.structural_dp.decorator.Example1;

public class Client {
    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTreeBubbleLight(new ChristmasTreeImpl());
        String result= christmasTree.decorate();
        System.out.println("Result : "+result);

        ChristmasTreeGarland christmasTreeGarland = new ChristmasTreeGarland(new ChristmasTreeBubbleLight(new ChristmasTreeImpl()));
        String resulr2= christmasTreeGarland.decorate();
        System.out.println("Result : "+resulr2);

        ChristmasTreeGarland christmasTreeGarland1 = new ChristmasTreeGarland(new ChristmasTreeGarland(new ChristmasTreeBubbleLight(new ChristmasTreeImpl())));
        String resulr3= christmasTreeGarland1.decorate();
        System.out.println("Result : "+resulr3);
    }
}
