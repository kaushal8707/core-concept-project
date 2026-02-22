package com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.service.impl;

import com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.enums.EncodingPatternEnum;
import com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.service.Encryption;
import org.springframework.stereotype.Service;

@Service
public class MD5Encryption implements Encryption {
    @Override
    public void encrypt(String toBeEncrypted) {
        System.out.println("I am Encrypting using MD5 encryption method");
    }

    @Override
    public EncodingPatternEnum getEncryptionType() {
        return EncodingPatternEnum.MD5;
    }
}
