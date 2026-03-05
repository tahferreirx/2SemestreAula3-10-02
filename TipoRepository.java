package com.exemplo.atividade2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.atividade2.entity.Tipo;

public interface TipoRepository extends JpaRepository<Tipo, Long>{
	

}
