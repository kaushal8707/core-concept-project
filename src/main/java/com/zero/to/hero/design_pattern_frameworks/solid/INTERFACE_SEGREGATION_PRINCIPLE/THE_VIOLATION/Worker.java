package com.zero.to.hero.design_pattern_frameworks.solid.INTERFACE_SEGREGATION_PRINCIPLE.THE_VIOLATION;

// Instead of creating one large, "fat" interface that contains every possible action, you should split it into smaller, more specific interfaces

public interface Worker {
    void work();
    void takeBreak();
    void manageTeam(); // Not all workers manage teams!
}
