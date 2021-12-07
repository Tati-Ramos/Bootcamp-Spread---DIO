package br.com.dio.desafio;

import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTatiane = new Dev();
        devTatiane.setNome("Tatiane");
        devTatiane.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devTatiane.getConteudosInscritos());

        devTatiane.progredir();
        devTatiane.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devTatiane.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devTatiane.getConteudosConcluidos());
        System.out.println("XP: " + devTatiane.calcularTotalXp());

        System.out.println("----------------------------------------------------");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.increverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos:" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos:" + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }
}
