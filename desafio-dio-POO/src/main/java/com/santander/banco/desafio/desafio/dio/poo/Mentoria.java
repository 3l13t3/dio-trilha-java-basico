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
public class Mentoria {
    
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria() {
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + '}';
    }


    
    
}
