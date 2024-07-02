/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eli3tec.desafiodiobanco;

/**
 *
 * @author eliete
 */

public class Main {
	
	public static void main(String[ ]args) {
		
		
		Cliente cliente = new Cliente("Eliete", 123);
		cliente.setAgencia(2094);
		cliente.setConta(3546);
		cliente.setSaldo(10);
		cliente.addConta(ContaTipo.TIPO_CORRENTE.getTipo());
		cliente.addConta(ContaTipo.TIPO_POUPANCA.getTipo());
		cliente.addConta(ContaTipo.TIPO_INVESTIMENTO.getTipo());
		
		System.out.println("Nome do Cliente: " + cliente.getNome());
		System.out.println("Documento do Cliente: " + cliente.getDocumento());
		
		System.out.println("===============================");
		
		System.out.println("Agencia: " + cliente.getAgencia());
		System.out.println("Conta: " + cliente.getConta());
		System.out.println("Saldo: " + cliente.getSaldo());
		
		System.out.println("===============================");
		System.out.println("Tipos de conta da " + cliente.getNome());
		
		int i = 1;
		
		for(String tipoConta : cliente.getContas()){
			System.out.println(i + " - " + tipoConta);
			i++;
                }
        }
        