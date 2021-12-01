package com.obed.carro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.obed.carro.model.Carro;

public interface CarroRepository extends JpaRepository<Carro, Integer> {

}
