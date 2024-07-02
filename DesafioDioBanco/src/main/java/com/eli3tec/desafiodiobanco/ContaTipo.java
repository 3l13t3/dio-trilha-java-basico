/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eli3tec.desafiodiobanco;

/**
 *
 * @author eliete
 */
public enum ContaTipo {
	
	TIPO_CORRENTE("Conta Corrente"),
	TIPO_POUPANCA("Conta Poupança"),
	TIPO_INVESTIMENTO("Conta de Investimento");
	
	
	private final String tipo;
	
	ContaTipo(String tipo){
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

}
