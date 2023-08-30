package org.learn.design.patterns.behavioral.state.station;

public class NewsStation implements Station {
    @Override
    public void play() {
        System.out.println("News station is playing");
    }
}
