package com.example.search;

public class Model {
    private String title;
    private String description;

    public Model(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
