/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santander.banco.desafio.desafio.dio.poo;

/**
 *
 * @author eliete
 */
public class Curso {
  private  String titulo;
  private String descricao;
  private int cargaHoraria;

    public Curso() {
    }
  
  

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + titulo + ", descricao=" + descricao + ", cargaHoraria=" + cargaHoraria + '}';
    }
  
  
    
  
}
