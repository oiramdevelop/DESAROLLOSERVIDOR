package com.calabazo.mapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.calabazo.mapa.model.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Long> {

    // Ya ta

}