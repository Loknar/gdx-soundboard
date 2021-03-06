package com.gdx.musicevents.effects;

import com.badlogic.gdx.Gdx;
import com.gdx.musicevents.MusicState;

public class Stop implements StopEffect {

    public Stop() {
    }

    @Override
    public void beginStop(MusicState nextState, MusicState previousState) {
        Gdx.app.debug("Stop", "Stopped: " + nextState);

        nextState.stop();
    }

    @Override
    public void endStop() {

    }

    @Override
    public void update(float dt) {
    }

    @Override
    public boolean isDone() {
        return true;
    }
}
