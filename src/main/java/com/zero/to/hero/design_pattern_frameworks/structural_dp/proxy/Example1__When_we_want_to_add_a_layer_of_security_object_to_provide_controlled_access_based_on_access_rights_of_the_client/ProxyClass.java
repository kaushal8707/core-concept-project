package com.zero.to.hero.design_pattern_frameworks.structural_dp.proxy.Example1__When_we_want_to_add_a_layer_of_security_object_to_provide_controlled_access_based_on_access_rights_of_the_client;

/**
 *
 * Proxy prevents the real method call or
 * the real object's method call
 *
 * generally it used to do authentication or security check
 * if pass then will call the real object call method
 *
 */

//extends
public class ProxyClass extends RealSubjectClass{

    @Override
    public void method(String token) {

        System.out.println("Hi, I am Proxy i will perform authentication and security checks");

        //Logic to check if user is authenticated or not, If yes then use real object
        // method else don't call below method
        if(!token.equals("XYZ")){
            System.out.println("Try with a Valid Token !!");
            return;
        }

        System.out.println("Calling the real method of real subject implementing call after the" +
                "call is authenticated ");
        super.method(token);
    }
}
