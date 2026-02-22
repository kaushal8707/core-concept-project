package com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.COMMAND;

import com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.RECEIVER.TV;

public class TvOnCommand implements Command {

    TV tv;
    TvOnCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.on();
    }
}
