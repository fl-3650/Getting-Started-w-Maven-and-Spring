package com.fl.spring;

public class MusicPlayer {
    private IMusic music;

    // IoC
    public MusicPlayer(IMusic music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println(String.format("Now playing: '%s'", music.getSong()));
    }
}
