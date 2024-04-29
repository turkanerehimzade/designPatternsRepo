package org.example.designP.prototype;

public abstract class Animals {
    private String skin;
    private String voice;

    @Override
    public abstract Animals clone();

    public Animals(Animals target) {
        this.skin = target.skin;
        this.voice = target.voice;
    }

    public Animals() {

    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "skin='" + skin + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
}
