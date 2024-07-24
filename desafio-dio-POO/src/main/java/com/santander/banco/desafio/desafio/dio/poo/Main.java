/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santander.banco.desafio.desafio.dio.poo;

import java.time.LocalDate;

/**
 *
 * @author eliete
 */
public class Main {
    public static void main(String[]args){
        
        Curso curso1 = new Curso();
        
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(20);
        
        Curso curso2 = new Curso();
        
        curso2.setTitulo("Curso PHP");
        curso2.setDescricao("Descricao curso PHP");
        curso2.setCargaHoraria(20);
        
        Curso curso3 = new Curso();
        
        curso3.setTitulo("Curso C++");
        curso3.setDescricao("Descricao curso C++");
        curso3.setCargaHoraria(20);
        
        Mentoria mentoria = new Mentoria();
        
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descricao mentoria Java");
        mentoria.setData(LocalDate.now());
        
        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.err.println(mentoria);*/
        
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Dveloper");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(curso3);
        bootcamp.getConteudos().add(mentoria);
        
        
    }
}
