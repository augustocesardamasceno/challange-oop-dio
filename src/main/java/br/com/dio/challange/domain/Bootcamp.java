package br.com.dio.challange.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private LocalDate initialDate = LocalDate.now();
    private LocalDate finalDate = initialDate.plusDays(45);
    private Set<Dev> signedDevs = new LinkedHashSet<>();
    private Set<Content> contentBootcamp = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(LocalDate initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    public Set<Dev> getSignedDevs() {
        return signedDevs;
    }

    public void setSignedDevs(Set<Dev> signedDevs) {
        this.signedDevs = signedDevs;
    }

    public Set<Content> getContentBootcamp() {
        return contentBootcamp;
    }

    public void setContentBootcamp(Set<Content> contentBootcamp) {
        this.contentBootcamp = contentBootcamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getName(), bootcamp.getName()) && Objects.equals(getDescription(), bootcamp.getDescription()) && Objects.equals(getInitialDate(), bootcamp.getInitialDate()) && Objects.equals(getFinalDate(), bootcamp.getFinalDate()) && Objects.equals(getSignedDevs(), bootcamp.getSignedDevs()) && Objects.equals(getContentBootcamp(), bootcamp.getContentBootcamp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getInitialDate(), getFinalDate(), getSignedDevs(), getContentBootcamp());
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", initialDate=" + initialDate +
                ", finalDate=" + finalDate +
                ", signedDevs=" + signedDevs +
                ", contentBootcamp=" + contentBootcamp +
                '}';
    }
}
