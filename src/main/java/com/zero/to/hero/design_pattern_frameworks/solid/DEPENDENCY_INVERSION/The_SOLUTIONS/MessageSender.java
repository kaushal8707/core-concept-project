package com.zero.to.hero.design_pattern_frameworks.solid.DEPENDENCY_INVERSION.The_SOLUTIONS;

// To fix this, we introduce an abstraction (an interface) that both the high-level and low-level modules depend on
// Implement Low-Level Modules
public interface MessageSender {
    void sendMessage(String message);
}