package com.saranya.travellingapp;

public class AdapterFlipperModel {
    String name,state;
    int image;
    public AdapterFlipperModel(String name, String state, int image) {
        this.name = name;
        this.state = state;
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
