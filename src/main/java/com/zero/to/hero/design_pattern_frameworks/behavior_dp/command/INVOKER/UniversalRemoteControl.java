package com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.INVOKER;
import com.zero.to.hero.design_pattern_frameworks.behavior_dp.command.COMMAND.Command;

public class UniversalRemoteControl {

    Command command;
    public UniversalRemoteControl(Command command){
        this.command = command;
    }

    public void pressOn(){
        command.execute();
    }

    public void pressOff(){
        command.execute();
    }
}
