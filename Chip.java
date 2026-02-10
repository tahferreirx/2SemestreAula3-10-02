package com.exemplo.atividade2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Chip {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	private String localColocacao;
	private String status;
	
	public Chip () {
		
	}
	
	public Chip (Long codigo, String localColocacao, String status) {
		this.codigo = codigo;
		this.localColocacao = localColocacao;
		this.status = status;
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getLocalColocacao() {
		return localColocacao;
	}

	public String getStatus() {
		return status;
	}

}
