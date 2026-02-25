package com.zero.to.hero.design_pattern_frameworks.structural_dp.decorator.Example2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecryptedDataWriter extends StreamDecorator{
    public DecryptedDataWriter(BufferedStreamImpl inputStream) {
        super(inputStream);
    }

    @Override
    public String read(String data) {
        return super.read(data)+decryptData(data);
    }

    private String decryptData(String data) {
        return "  decrypting data "+data;
    }
}
