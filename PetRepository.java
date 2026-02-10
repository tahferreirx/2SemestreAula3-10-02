package com.exemplo.atividade2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.atividade2.entity.Pet;

public interface PetRepository extends JpaRepository<Pet, Long>{

}
