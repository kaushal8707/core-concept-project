package com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.CLIENT;

import com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.COMMAND.Command;
import com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.COMMAND.LightOffCommand;
import com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.INVOKER.UniversalRemoteControl;
import com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.RECEIVER.Light;

public class Client {
    public static void main(String[] args) {

        Light light=new Light();
        Command command=new LightOffCommand(light);
        UniversalRemoteControl remoteControl=new UniversalRemoteControl(command);
        remoteControl.pressOff();

    }
}
