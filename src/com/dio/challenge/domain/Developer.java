package com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Developer {

    private String name;
    private Set<Contents> subscribedContents = new LinkedHashSet<>();
    private Set<Contents> doneContents = new LinkedHashSet<>();

    public void subscribeBootcamp(){}

    public void toProgress(){}

    public void calcTotalXP(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Developer developer = (Developer) o;
        return Objects.equals(name, developer.name) && Objects.equals(subscribedContents, developer.subscribedContents) && Objects.equals(doneContents, developer.doneContents);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, subscribedContents, doneContents);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Contents> getSubscribedContents() {
        return subscribedContents;
    }

    public void setSubscribedContents(Set<Contents> subscribedContents) {
        this.subscribedContents = subscribedContents;
    }

    public Set<Contents> getDoneContents() {
        return doneContents;
    }

    public void setDoneContents(Set<Contents> doneContents) {
        this.doneContents = doneContents;
    }
}
