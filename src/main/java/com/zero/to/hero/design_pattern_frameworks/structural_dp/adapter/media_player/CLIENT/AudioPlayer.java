package com.zero.to.hero.design_pattern_frameworks.structural_dp.adapter.media_player.CLIENT;

import com.zero.to.hero.design_pattern_frameworks.structural_dp.adapter.media_player.ADAPTER_CLASS.MediaAdapter;
import com.zero.to.hero.design_pattern_frameworks.structural_dp.adapter.media_player.TARGET_INTERFACE.MediaPlayer;

class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc")
                || audioType.equalsIgnoreCase("mp4")){

            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Invalid media format.");
        }
    }

    public static void main(String[] args) {
        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("mp4", "nextGen Song..");
    }
}