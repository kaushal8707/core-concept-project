package com.zero.to.hero.design_pattern_frameworks.solid.LISKOV_SUBSTITUTION_PRINCIPLE.OSTRICH_PROBLEMS.The_VIOLATION;

public class TestMain {
    public static void main(String[] args) {
        Bird bird = new Ostrich();
        makeBirdFly(bird);
    }

    public static void makeBirdFly(Bird bird) {
        // This method expects ANY bird to fly.
        // If passed an Ostrich, the program crashes.
        bird.fly();
    }
}
