package com.zero.to.hero.design_pattern_frameworks.behavior_dp.observer.RECOMMENDED_APPROACH;

public class MainApp {
    public static void main(String[] args) {
        PCLNewsAgency observerable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observerable.addPropertyChangeListener(observer);
        observerable.setNews("Pleasent Morning");

        System.out.println("Observer received news :" +observer.getNews());
    }
}
