package com.zero.to.hero.design_pattern_frameworks.solid.LISKOV_SUBSTITUTION_PRINCIPLE.OSTRICH_PROBLEMS.The_SOLUTIONS;

// 3. Swan can fly, so it implements FlyingBird
class Swan extends Bird implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Swan is flying gracefully.");
    }
}