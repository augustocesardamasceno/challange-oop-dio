package br.com.dio.challange.domain;

import java.sql.Time;

public class Course {
    private String title;
    private String description;
    private String workload;

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

    public String getWorkload() {
        return workload;
    }

    public void setWorkload(String workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Course{" + " title='" + title + '\'' +
                ", description ='" + description + '\'' +
                ", workload ='" + workload + '\'' +
                '}';
    }

    public void calcularXp(){

    }


}
