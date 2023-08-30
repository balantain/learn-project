package org.learn.design.patterns.behavioral.state;

import org.learn.design.patterns.behavioral.state.station.RockMusicStation;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.play();
        radio.switchStation();
        radio.setStation(new RockMusicStation());
        IntStream.range(0, 4).forEach(i -> {
            radio.play();
            radio.switchStation();
        });
    }
}
