package com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.controller;

import com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.enums.EncodingPatternEnum;
import com.zero.to.hero.design_pattern_frameworks.behavior_dp.strategy.factory.EncryptionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    EncryptionFactory factory;

    @GetMapping("/encrypt")
    public void encryptWithEncryptor(@RequestParam EncodingPatternEnum encodingPatternEnum) {
        factory.findEncryptionType(encodingPatternEnum).encrypt("Code Decode");
    }
}
