package com.dio.challenge.domain;

import java.time.LocalDate;

public class Mentoring extends Contents {
    private LocalDate date;

    public Mentoring() {
    }

    @Override
    public double calcXP() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "\nMentoring: " + getTitle() + '\n' +
                "Description: " + getDescription() + '\n' +
                "Date: " + date + "\n";
    }
}
