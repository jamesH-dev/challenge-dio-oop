package com.dio.challenge.domain;

public class Course extends Contents {
    private Integer workload;

    public Course() {
    }

    @Override
    public double calcXP() {
        return XP_PADRAO * workload;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curse{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", workload=" + workload +
                '}';
    }
}
