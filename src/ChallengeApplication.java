import com.dio.challenge.domain.Bootcamp;
import com.dio.challenge.domain.Course;
import com.dio.challenge.domain.Developer;
import com.dio.challenge.domain.Mentoring;

import java.time.LocalDate;

public class ChallengeApplication {
    public static void main(String[] args) {

        Course introduction = new Course();
        introduction.setTitle("Conhecendo o Java");
        introduction.setDescription("Neste curso, você irá ter o primeiro contato com a linguagem Java");
        introduction.setWorkload(2);

        Course paradigms = new Course();
        paradigms.setTitle("Paradigmas da Programação");
        paradigms.setDescription("Neste curso, você irá conhecer os paradigmas da programação");
        paradigms.setWorkload(6);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("Abstração e Encapsulamento");
        mentoring.setDescription("Nesta mentoria, você aprenderá seus conceitos e também colocará em prática o conteúdo estudado.");
        mentoring.setDate(LocalDate.now());

        Course finish = new Course();
        finish.setTitle("Desenvolvendo um projeto Java com POO");
        finish.setDescription("Neste curso, você irá desenvolver um projeto com tudo o que aprendeu");
        finish.setWorkload(6);

        Mentoring graduate = new Mentoring();
        graduate.setTitle("Live de Graduação do Bootcamp");
        graduate.setDescription("Finalização do Bootcamp");
        graduate.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer");
        bootcamp.setDescription("Bootcamp massa da DIO");
        bootcamp.getContents().add(introduction);
        bootcamp.getContents().add(paradigms);
        bootcamp.getContents().add(mentoring);
        bootcamp.getContents().add(finish);
        bootcamp.getContents().add(graduate);
//        System.out.println(bootcamp);

        Developer developer1 = new Developer();
        developer1.setName("James");
        developer1.subscribeBootcamp(bootcamp);

        System.out.println("\n\n**********************************");
        System.out.println("*      RELATÓRIO BOOTCAMP        *");
        System.out.println("**********************************");

        System.out.println("Desenvolvedor: " + developer1.getName());
        System.out.println("Conteúdos Inscritos: " + developer1.getSubscribedContents());
        developer1.toProgress();
        developer1.toProgress();
        developer1.toProgress();
        developer1.toProgress();
        developer1.toProgress();
        System.out.println("-----------");
        System.out.println("Conteúdos Inscritos: " + developer1.getSubscribedContents());
        System.out.println("Conteúdos Concluídos: " + developer1.getDoneContents());
        System.out.println("XP: " + developer1.calcTotalXP());


        Developer developer2 = new Developer();
        developer2.setName("Isabela");
        developer2.subscribeBootcamp(bootcamp);
        System.out.println("\n\nDesenvolvedor: " + developer2.getName());
        System.out.println("Conteúdos Inscritos: " + developer2.getSubscribedContents());
        developer2.toProgress();
        System.out.println("-----------");
        System.out.println("Conteúdos Inscritos: " + developer2.getSubscribedContents());
        System.out.println("Conteúdos Concluídos: " + developer2.getDoneContents());
        System.out.println("XP: " + developer2.calcTotalXP());



    }
}
