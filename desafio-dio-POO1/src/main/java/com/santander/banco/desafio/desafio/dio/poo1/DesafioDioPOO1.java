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
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao Curso Java");
        curso1.setCargaHoraria(12);
        
         Curso curso2 = new Curso();
        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("descricao Curso PHP");
        curso2.setCargaHoraria(12);
        
        
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Metoria de Java");
        mentoria.setDescricao("descricao Mentoria Java");
        mentoria.setData(LocalDate.now());
        
        
       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/
       
       Bootcamp bootcamp = new  Bootcamp();
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
        System.out.println("Conteudos incritos Eliete: " + devEliete.getConteudosInscritos());
        System.out.println("Conteudos concluidos Eliete: " + devEliete.getConteudosConcluidos());
        System.out.println("XP" + devEliete.calcularTotalXp());
        
        System.out.println("------------");
        
        Dev devRogerio = new Dev();
       devRogerio.setNome("Rogerio");
       devRogerio.inscreverBootcamp(bootcamp);
       
        System.out.println("Conteudos incritos Rogerio: " + devRogerio.getConteudosInscritos());
        devRogerio.progredir();
        devRogerio.progredir();
        System.out.println("-");
        System.out.println("Conteudos incritos Rogerio: " + devRogerio.getConteudosInscritos());
        System.out.println("Conteudos concluidos Rogerio: " + devRogerio.getConteudosConcluidos());
        System.out.println("XP" + devRogerio.calcularTotalXp());
    }
}
