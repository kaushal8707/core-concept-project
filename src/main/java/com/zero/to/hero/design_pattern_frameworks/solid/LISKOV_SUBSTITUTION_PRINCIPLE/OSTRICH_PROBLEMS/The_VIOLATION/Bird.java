package com.zero.to.hero.design_pattern_frameworks.solid.LISKOV_SUBSTITUTION_PRINCIPLE.OSTRICH_PROBLEMS.The_VIOLATION;

// In this example, the code assumes all birds can fly. When we introduce an Ostrich, the program crashes because
// the subclass cannot fulfill the contract of the superclass.

public class Bird {
    public void fly() {
        System.out.println("Flying High !!");
    }
}
