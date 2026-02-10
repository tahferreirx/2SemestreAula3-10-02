package com.exemplo.atividade2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.atividade2.entity.Chip;

public interface ChipRepository extends JpaRepository<Chip, Long>{

}
