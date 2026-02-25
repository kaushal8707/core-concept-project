package com.zero.to.hero.design_pattern_frameworks.solid.LISKOV_SUBSTITUTION_PRINCIPLE.OSTRICH_PROBLEMS.The_SOLUTIONS;

// To follow LSP, we should only include fly() in a class or interface where it actually makes sense. We split the logic so that the code only calls fly()
// on birds that are explicitly capable of it.

// 1. General base class for all birds
public abstract class Bird {
    public void eat() {
        System.out.println("Eating...");
    }
}