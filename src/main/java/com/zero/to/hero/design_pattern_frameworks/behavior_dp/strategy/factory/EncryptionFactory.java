package com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.factory;

import com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.enums.EncodingPatternEnum;
import com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.service.Encryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Component
public class EncryptionFactory {

    public Map<EncodingPatternEnum, Encryption> encryptionMap;

    @Autowired
    public EncryptionFactory(Set<Encryption> encryptionTypesSet) {
        createStrategy(encryptionTypesSet);

    }

    private void createStrategy(Set<Encryption> encryptionTypesSet) {
        encryptionMap = new HashMap<EncodingPatternEnum, Encryption>();
        encryptionTypesSet.stream().forEach(encryptionTypes ->
                encryptionMap.put(encryptionTypes.getEncryptionType(), encryptionTypes));
    }

    public Encryption findEncryptionType(EncodingPatternEnum encryptionType) {
        return encryptionMap.get(encryptionType);
    }



}
