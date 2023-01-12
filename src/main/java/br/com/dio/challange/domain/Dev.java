package br.com.dio.challange.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String name;
    private Set<Content> signedContent = new LinkedHashSet<>();
    private Set<Content> completedContent = new LinkedHashSet<>();

    public void signInBootcamp(Bootcamp bootcamp){}

    public void progress(){}

    public void totalXp(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Content> getSignedContent() {
        return signedContent;
    }

    public void setSignedContent(Set<Content> signedContent) {
        this.signedContent = signedContent;
    }

    public Set<Content> getCompletedContent() {
        return completedContent;
    }

    public void setCompletedContent(Set<Content> completedContent) {
        this.completedContent = completedContent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getName(), dev.getName()) && Objects.equals(getSignedContent(), dev.getSignedContent()) && Objects.equals(getCompletedContent(), dev.getCompletedContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSignedContent(), getCompletedContent());
    }
}
