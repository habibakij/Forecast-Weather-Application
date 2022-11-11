package com.akij.app.simple_api_project.model;

public class HomeHourlyModel {

    private final int image;
    private final String name;
    private final String value;


    public HomeHourlyModel(int image, String name, String value) {
        this.image = image;
        this.name = name;
        this.value = value;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
