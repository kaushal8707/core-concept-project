package com.zero.to.hero.design_pattern_frameworks.solid.INTERFACE_SEGREGATION_PRINCIPLE.THE_SOLUTION;

// Director implements both
class Director implements Workable, Managerial {
    public void work() { /* ... */ }
    public void takeBreak() { /* ... */ }
    public void manageTeam() { /* ... */ }
}