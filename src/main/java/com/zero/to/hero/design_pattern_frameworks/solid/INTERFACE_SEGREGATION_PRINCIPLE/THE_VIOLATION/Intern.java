package com.zero.to.hero.design_pattern_frameworks.solid.INTERFACE_SEGREGATION_PRINCIPLE.THE_VIOLATION;

class Intern implements Worker {
    public void work() { /* ... */ }
    public void takeBreak() { /* ... */ }

    // Violation: Interns don't manage teams, but are forced to implement it.
    public void manageTeam() {
        throw new UnsupportedOperationException("Interns can't manage!");
    }
}

// This design is problematic because changes to manageTeam() might force the Intern class to be recompiled or updated,
// even though it never uses that method.