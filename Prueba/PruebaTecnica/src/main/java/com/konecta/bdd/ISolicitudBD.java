package com.konecta.bdd;

import org.springframework.data.jpa.repository.JpaRepository;

import com.konecta.tablas.Solicitud;

public interface ISolicitudBD extends JpaRepository<Solicitud, Integer>{

}
