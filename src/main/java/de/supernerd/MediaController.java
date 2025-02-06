package de.supernerd;

import de.supernerd.interfaces.Playable;

public class MediaController {

    public void playMedia(Playable media) {
        media.play();
    }
}
