package com.dio.challenge.domain;

public abstract class Contents {
    private String title;
    private String description;

    protected final double XP_PADRAO = 10d;

    public Contents() {
    }

    public abstract double calcXP();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
