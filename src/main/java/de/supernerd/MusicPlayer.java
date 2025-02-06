package de.supernerd;

import de.supernerd.interfaces.Playable;

public class MusicPlayer implements Playable {

    @Override
    public void play() {
        System.out.println("Musik wird abgespielt.");
    }
}
