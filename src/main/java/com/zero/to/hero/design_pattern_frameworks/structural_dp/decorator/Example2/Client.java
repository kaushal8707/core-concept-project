package com.zero.to.hero.design_pattern_frameworks.structural_dp.decorator.Example2;

public class Client {
    public static void main(String[] args) {
        IStream iStream = new BufferedStreamImpl();
        String result1 = iStream.read("Hello");
        System.out.println("Result 1 = "+result1);

        IStream iStream2 = new EncryptedDataWriter(new BufferedStreamImpl());
        String result2 = iStream2.read("Hello");
        System.out.println("Result 2 = "+result2);

        IStream iStream3 = new EncryptedDataWriter(new DecryptedDataWriter(new BufferedStreamImpl()));
        String result3 = iStream3.read("Hello");
        System.out.println("Result 3 = "+result3);

    }
}
