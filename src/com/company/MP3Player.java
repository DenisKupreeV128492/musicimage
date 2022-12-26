package com.company;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.IOException;

public class MP3Player {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\проекты\\music image\\src\\com\\company\\music1.mp3")) {
            try {
                Player player = new Player(inputStream);
                player.play();
            } catch (JavaLayerException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}