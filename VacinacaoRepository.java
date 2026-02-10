package com.exemplo.atividade2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.atividade2.entity.Vacinacao;

public interface VacinacaoRepository extends JpaRepository<Vacinacao, Long>{

}
