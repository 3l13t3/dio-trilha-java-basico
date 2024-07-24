/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santander.banco.desafio.desafio.dio.poo;

/**
 *
 * @author eliete
 */
public abstract class Conteudo {
    protected  static final Double XP_PADRAO = 10d;
    
    private String titulo;
    private  String descricao;
    
    public abstract Double calcularXp();
    
    public String getTitulo(){
        return titulo;
    }
    
    public  void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public  String getDescricao(){
        return descricao;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
}
