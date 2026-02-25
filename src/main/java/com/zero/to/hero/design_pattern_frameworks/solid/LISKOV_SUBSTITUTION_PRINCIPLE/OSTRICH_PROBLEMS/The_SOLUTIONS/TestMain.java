package com.zero.to.hero.design_pattern_frameworks.solid.LISKOV_SUBSTITUTION_PRINCIPLE.OSTRICH_PROBLEMS.The_SOLUTIONS;

public class TestMain {
    public static void main(String[] args) {

        Swan bird = new Swan();
        bird.fly();
        bird.eat();

        Ostrich bird1 = new Ostrich();
//        bird1.fly();   // Compiler Error: This prevents a runtime crash!
        bird1.eat();
    }
}
