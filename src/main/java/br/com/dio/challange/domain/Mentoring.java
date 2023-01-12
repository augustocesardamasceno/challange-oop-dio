package br.com.dio.challange.domain;

import java.time.LocalDate;
import java.util.Date;

public class Mentoring {
    private String title;
    private String description;
    private LocalDate date;

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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + title + '\'' +
                ", description ='" + description + '\'' +
                ", date =" + date +
                '}';
    }

    public void calcularXp(){}
}
