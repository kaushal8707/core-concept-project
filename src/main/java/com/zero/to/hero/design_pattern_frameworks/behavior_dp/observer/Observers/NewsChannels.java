package com.zero.to.hero.design_pattern_frameworks.behavior_dp.observer.Observers;

public class NewsChannels implements Channel{

    String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void updateNews(String news) {
        this.setNews(news);
    }
}
