package com.zero.to.hero.design_pattern_frameworks.structural_dp.proxy.Example1__When_we_want_to_add_a_layer_of_security_object_to_provide_controlled_access_based_on_access_rights_of_the_client;

public class ClientClass {
    public static void main(String[] args) {

        String token ="XYZ";
        Subject proxy = new ProxyClass();
        proxy.method(token);
    }
}
