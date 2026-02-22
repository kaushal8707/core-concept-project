package com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.COMMAND;

import com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.RECEIVER.TV;

public class TvOffCommand implements Command {

    TV tv;
    TvOffCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.off();
    }
}
