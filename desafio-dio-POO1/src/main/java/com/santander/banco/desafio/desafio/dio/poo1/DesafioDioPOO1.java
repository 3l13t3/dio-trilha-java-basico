/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.santander.banco.desafio.desafio.dio.poo1;

import java.time.LocalDate;

/**
 *
 * @author eliete
 */
public class DesafioDioPOO1 {

    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso Java", "descricao Curso Java", 12);
        Curso curso2 = new Curso("Curso PHP", "descricao Curso PHP", 12);
        Mentoria mentoria = new Mentoria("Metoria de Java", "descricao Mentoria Java", LocalDate.now());

        /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Basico");
        bootcamp.setDescricao("Descricao Java Basico");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEliete = new Dev();
        devEliete.setNome("Eliete");
        devEliete.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos incritos Eliete: " + devEliete.getConteudosInscritos());
        devEliete.progredir();
        devEliete.progredir();
        System.out.println("-");
        System.out.println("Conteudos incritos Eliete: ");

        for (Conteudo c : devEliete.getConteudosInscritos()) {
            System.out.println("\t" + c.getTitulo());
            System.out.println("\t" + c.getDescricao());
        }

        System.out.println("Conteudos concluidos Eliete: " + devEliete.getConteudosConcluidos());
        System.out.println("XP" + devEliete.calcularTotalXp());

        System.out.println("------------");

        Dev devRogerio = new Dev();
        devRogerio.setNome("Rogerio");
        devRogerio.inscreverBootcamp(bootcamp);
        
        
        for (Conteudo c : devEliete.getConteudosInscritos()) {
            System.out.println("\t" + c.getTitulo());
            System.out.println("\t" + c.getDescricao());
        }


        System.out.println("Conteudos incritos Rogerio: " + devRogerio.getConteudosInscritos());
        devRogerio.progredir();
        devRogerio.progredir();
        System.out.println("-");
        System.out.println("Conteudos incritos Rogerio: " + devRogerio.getConteudosInscritos());
        System.out.println("Conteudos concluidos Rogerio: " + devRogerio.getConteudosConcluidos());
        System.out.println("XP" + devRogerio.calcularTotalXp());
    }
}
