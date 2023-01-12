package br.com.dio.challange.domain;

import java.sql.Time;

public class Course extends Content {
    private Double workload;

    @Override
    public double xpCalculus() {
        return XP_DEFAULT * getWorkload();
    }

    public Double getWorkload() {
        return workload;
    }

    public void setWorkload(Double workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" + " title='" + getTitle() + '\'' +
                ", description ='" + getDescription() + '\'' +
                ", workload ='" + workload + '\'' +
                '}';
    }



}
