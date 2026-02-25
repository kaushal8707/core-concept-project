package com.zero.to.hero.design_pattern_frameworks.structural_dp.proxy.Example1__When_we_want_to_add_a_layer_of_security_object_to_provide_controlled_access_based_on_access_rights_of_the_client;

public class RealSubjectClass implements Subject{
    @Override
    public void method(String token) {
        System.out.println("I am an actual implementation of Subject, rest all are proxies :D");
    }
}
