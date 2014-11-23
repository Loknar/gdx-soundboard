package com.soundboard;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.files.FileHandle;

public class Event {
    private String name;
    private FileHandle fileHandle;
    private boolean matchPosition;

    private final Music music;

    float position;
    float length;

    public Event(String name, FileHandle fileHandle) {
        this.name = name;
        this.fileHandle = fileHandle;
        music = Gdx.audio.newMusic(fileHandle);
        music.setOnCompletionListener(new Music.OnCompletionListener() {
            @Override
            public void onCompletion(Music music) {
                position = 0;
            }
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileHandle getFileHandle() {
        return fileHandle;
    }

    public void setFileHandle(FileHandle fileHandle) {
        this.fileHandle = fileHandle;
    }

    public boolean isMatchPosition() {
        return matchPosition;
    }

    public void setMatchPosition(boolean matchPosition) {
        this.matchPosition = matchPosition;
    }

    public Music getMusic() {
        return music;
    }

    @Override
    public String toString() {
        return name + " (" + fileHandle.name() + ")";
    }

    public float getPosition() {
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
        this.music.setPosition(position);
    }

    public void update(float dt) {
        position += dt;
    }
}