package com.dio.challenge.domain;

import java.time.LocalDate;

public class ChallengeApplication {
    public static void main(String[] args) {

        Course course = new Course();
        course.setTitle("Entendendo POO");
        course.setDescription("Neste curso, você irá aprender tudo sobre esse paradigma!");
        course.setWorkload(2);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Abstração e Encapsulamento");
        mentoring.setDescription("Nesta mentoria, você aprenderá seus conceitos e também colocará em prática o conteúdo estudado.");
        mentoring.setDate(LocalDate.now());

        Contents contents1 = new Course();
        Contents contents2 = new Mentoring();


        System.out.println(course);
        System.out.println(mentoring);
    }
}
