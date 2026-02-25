package com.zero.to.hero.design_pattern_frameworks.structural_dp.decorator.Example2;

public class BufferedStreamImpl implements IStream{
    @Override
    public String read(String data) {
       return "  Reading Data ";
    }
}
