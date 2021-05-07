package com.konecta.bdd;

import org.springframework.data.jpa.repository.JpaRepository;

import com.konecta.tablas.Empleado;

public interface IEmpleadoBD extends JpaRepository<Empleado, Integer>{

}
