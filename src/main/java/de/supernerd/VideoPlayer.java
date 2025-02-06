package de.supernerd;

import de.supernerd.interfaces.Playable;

public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Video wird abgespielt.");
    }
}
