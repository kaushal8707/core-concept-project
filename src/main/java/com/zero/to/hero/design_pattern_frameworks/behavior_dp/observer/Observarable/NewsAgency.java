package com.zero.to.hero.design_pattern_frameworks.behavior_dp.observer.Observarable;
import com.zero.to.hero.design_pattern_frameworks.behavior_dp.observer.Observers.Channel;
import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    String news;
    private List<Channel> channels;

    public NewsAgency() {
        channels = new ArrayList<>();
    }

    public void addObservers( Channel channel) {
        this.channels.add(channel);
    }

    public void removeObservers( Channel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for(Channel channel : channels){
            channel.updateNews(news);
        }
    }
}
