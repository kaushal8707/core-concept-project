package com.zero.to.hero.design_pattern_frameworks.structural_dp.adapter.media_player.ADAPTER_CLASS;

import com.zero.to.hero.design_pattern_frameworks.structural_dp.adapter.media_player.ADAPTEE_CLASS.Mp4Player;
import com.zero.to.hero.design_pattern_frameworks.structural_dp.adapter.media_player.ADAPTEE_CLASS.VlcPlayer;
import com.zero.to.hero.design_pattern_frameworks.structural_dp.adapter.media_player.TARGET_INTERFACE.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

        VlcPlayer vlcPlayer;
        Mp4Player mp4Player;

        public MediaAdapter(String audioType) {
            if(audioType.equalsIgnoreCase("vlc")){
                vlcPlayer = new VlcPlayer();
            } else if(audioType.equalsIgnoreCase("mp4")){
                mp4Player = new Mp4Player();
            }
        }

        public void play(String audioType, String fileName) {
            if(audioType.equalsIgnoreCase("vlc")){
                vlcPlayer.playVlc(fileName);
            } else if(audioType.equalsIgnoreCase("mp4")){
                mp4Player.playMp4(fileName);
            }
        }
    }
