package com.zero.to.hero.design_pattern_frameworks.structural_dp.decorator.Example2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EncryptedDataWriter  extends StreamDecorator{
    public EncryptedDataWriter(BufferedStreamImpl inputStream) {
        super(inputStream);
    }

    @Override
    public String read(String data) {
        return super.read(data)+encryptData(data);
    }

    private Object encryptData(String data) {
        return "  encrypting data  "+data;
    }
}
