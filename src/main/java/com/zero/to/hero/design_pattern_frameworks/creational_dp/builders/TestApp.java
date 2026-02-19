package com.zero.to.hero.design_pattern_frameworks.creational_dp.builders;

public class TestApp {
    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient.HttpClientBuilder()
                .url("http://localhost:8080")
                .body("{}")
                .build();
        System.out.println(httpClient);
    }
}
