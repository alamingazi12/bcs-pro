package com.example.bcspro.model;

public class Feature {

    int imageResource;
    String  name;

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Feature(int imageResource, String name) {
        this.imageResource = imageResource;
        this.name = name;
    }
}
