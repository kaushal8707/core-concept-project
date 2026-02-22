package com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.service;

import com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.enums.EncodingPatternEnum;

public interface Encryption {

    public void encrypt(String toBeEncrypted);
    public EncodingPatternEnum getEncryptionType();
}
