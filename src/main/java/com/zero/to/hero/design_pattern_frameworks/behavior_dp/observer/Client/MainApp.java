package com.zero.to.hero.design_pattern_frameworks.behavior_dp.observer.Client;

import com.zero.to.hero.design_pattern_frameworks.behavior_dp.observer.Observarable.NewsAgency;
import com.zero.to.hero.design_pattern_frameworks.behavior_dp.observer.Observers.EntertainmentChannels;
import com.zero.to.hero.design_pattern_frameworks.behavior_dp.observer.Observers.NewsChannels;

public class MainApp {
    public static void main(String[] args) throws InterruptedException {
        NewsAgency observable = new NewsAgency();
        NewsChannels observers1 = new NewsChannels();
        EntertainmentChannels observers2 = new EntertainmentChannels();

        observable.addObservers(observers1);
        observable.addObservers(observers2);

        observable.setNews("Hi");

        System.out.println("Observer Name  NewsChannels: "+observers1.getNews());
        System.out.println("Observer Name  EntertainmentChannels: "+observers2.getNews());
    }
}
