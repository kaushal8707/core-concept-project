package com.zero.to.hero.design_pattern_frameworks.creational_dp.builders;

public class HttpClient {
    private String method;
    private String url;
    private String body;
    private String headers;
    private String userName;
    private String password;

    public HttpClient(HttpClientBuilder httpClientBuilder) {
        this.method = httpClientBuilder.method;
        this.url = httpClientBuilder.url;
        this.body = httpClientBuilder.body;
        this.headers = httpClientBuilder.headers;
        this.userName = httpClientBuilder.userName;
        this.password = httpClientBuilder.password;
    }

    public static class HttpClientBuilder {
        private String method;
        private String url;
        private String body;
        private String headers;
        private String userName;
        private String password;

        public HttpClientBuilder method(String method) {
            this.method=method;
            return this;
        }
        public HttpClientBuilder url(String url) {
            this.url=url;
            return this;
        }
        public HttpClientBuilder headers(String headers) {
            this.headers=headers;
            return this;
        }
        public HttpClientBuilder body(String body) {
            this.body=body;
            return this;
        }
        public HttpClientBuilder body(String username, String password) {
            this.userName=userName;
            this.password=password;
            return this;
        }
        public HttpClient build() {
            return new HttpClient(this);
        }
    }

    public String getMethod() {
        return method;
    }

    public String getUrl() {
        return url;
    }

    public String getBody() {
        return body;
    }

    public String getHeaders() {
        return headers;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "HttpClient{" +
                "method='" + method + '\'' +
                ", url='" + url + '\'' +
                ", body='" + body + '\'' +
                ", headers='" + headers + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
