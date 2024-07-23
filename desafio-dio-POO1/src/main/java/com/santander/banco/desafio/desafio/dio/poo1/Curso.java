/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.santander.banco.desafio.desafio.dio.poo1;

/**
 *
 * @author eliete
 */
public class Curso extends Conteudo{
    
    private int cargaHoraria;

    @Override
    public double calcularXp() {
      return XP_PADRAO * cargaHoraria;
    }

    

    public Curso() {
    }
   

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" + "titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", cargaHoraria=" + cargaHoraria + '}';
    }
    
    
}
