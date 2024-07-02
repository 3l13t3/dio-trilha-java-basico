/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eli3tec.desafiodiobanco;

/**
 *
 * @author eliete
 */
import java.util.ArrayList;

public class Cliente  extends Pessoa {
	
	private int agencia;
	private int conta;
	private int saldo;
	private ArrayList<String> contas;
	
	
	public Cliente(String nome, int documento) {
		super.nome = nome;
		super.documento = documento;
		contas = new ArrayList<String>();
		// TODO Auto-generated constructor stub
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public ArrayList<String> getContas() {
		return contas;
	}

	public void setContas(ArrayList<String> contas) {
		this.contas = contas;
	}
	
	public void addConta(String contaTipo) {
		contas.add(contaTipo);
	}
	
	public String getNome() {
		return super.nome;
	}
	
	public int getDocumento() {
		return super.documento;
	}

}