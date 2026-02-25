package com.zero.to.hero.design_pattern_frameworks.structural_dp.decorator.Example2;

public class StreamDecorator extends BufferedStreamImpl{

    BufferedStreamImpl inputStream;

    public StreamDecorator(BufferedStreamImpl inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public String read(String data) {
        return  inputStream.read(data);
    }
}
