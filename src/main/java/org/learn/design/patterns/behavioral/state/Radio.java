package org.learn.design.patterns.behavioral.state;

import org.learn.design.patterns.behavioral.state.station.DanceMusinStation;
import org.learn.design.patterns.behavioral.state.station.NewsStation;
import org.learn.design.patterns.behavioral.state.station.RockMusicStation;
import org.learn.design.patterns.behavioral.state.station.Station;

public class Radio {
    private Station station;

    public void setStation(Station station) {
        this.station = station;
    }

    public void switchStation() {
        if (station == null) {
            System.out.println("You should set station first");
        }
        else if (station instanceof RockMusicStation) {
            setStation(new DanceMusinStation());
        }
        else if (station instanceof DanceMusinStation) {
            setStation(new NewsStation());
        }
        else if (station instanceof NewsStation) {
            setStation(new RockMusicStation());
        }
    }

    public void play() {
        if (station == null) {
            System.out.println("You should set station first");
        } else {
            station.play();
        }
    }
}
