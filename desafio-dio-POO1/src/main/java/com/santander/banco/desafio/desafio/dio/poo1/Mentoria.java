/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santander.banco.desafio.desafio.dio.poo1;

import java.time.LocalDate;

/**
 *
 * @author eliete
 */
public class Mentoria extends Conteudo{
    
    private LocalDate data;
    
    public Mentoria(String titulo, String descricao, LocalDate data){
        super(titulo, descricao);
        this.data = data;
    }
    
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp(){
        return XP_PADRAO + 20d;
    }
    
//    @Override
//    public String toString(){
//        return "";
//    }
    
    
//    @Override
//    public String toString() {
//        return "Mentoria{" + 
//                "titulo=" + getTitulo() + 
//                ", descricao=" + getDescricao() + 
//                ", data=" + data + 
//                '}';
//    }
//    
    
}
