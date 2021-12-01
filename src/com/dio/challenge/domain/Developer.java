package com.dio.challenge.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {

    private String name;
    private Set<Contents> subscribedContents = new LinkedHashSet<>();
    private Set<Contents> doneContents = new LinkedHashSet<>();

    public void subscribeBootcamp(Bootcamp bootcamp){
        this.subscribedContents.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    public void toProgress(){
        Optional<Contents> contents = this.subscribedContents.stream().findFirst();
        if (contents.isPresent()){
            this.doneContents.add(contents.get());
            this.subscribedContents.remove(contents.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcTotalXP(){
        return this.doneContents
                .stream()
                .mapToDouble(Contents::calcXP)
                .sum();
    }

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

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", subscribedContents=" + subscribedContents +
                ", doneContents=" + doneContents +
                '}';
    }
}
