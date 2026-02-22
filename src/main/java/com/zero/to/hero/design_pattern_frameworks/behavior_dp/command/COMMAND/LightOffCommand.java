package com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.COMMAND;

import com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.RECEIVER.Light;

public class LightOffCommand implements Command {

    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
