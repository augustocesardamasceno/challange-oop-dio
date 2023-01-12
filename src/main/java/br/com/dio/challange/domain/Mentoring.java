package br.com.dio.challange.domain;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    @Override
    public double xpCalculus() {
        return XP_DEFAULT + 20d;
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
                "title = '" + getTitle() + '\'' +
                ", description = '" + getDescription() + '\'' +
                ", date = " + date +
                '}';
    }

    public void calcularXp(){}
}
