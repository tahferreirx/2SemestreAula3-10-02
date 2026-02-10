package com.exemplo.atividade2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String tamanho;
	private String dataNasc;
	
	public Pet () {
		
	}
	
	public Pet (String nome, String tamanho, String dataNasc) {
		this.nome = nome;
		this.tamanho = tamanho;
		this.dataNasc = dataNasc;
	}

	public String getNome() {
		return nome;
	}

	public String getTamanho() {
		return tamanho;
	}

	public String getDataNasc() {
		return dataNasc;
	}
	

}
