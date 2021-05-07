/**
 * 
 */
package com.konecta.controlador;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.konecta.bdd.IEmpleadoBD;
import com.konecta.bdd.ISolicitudBD;
import com.konecta.tablas.Empleado;
import com.konecta.tablas.Solicitud;

@Controller
public class Controlador {
	
	@Autowired
	private IEmpleadoBD ebd;
	
	@Autowired
	private ISolicitudBD sbd;
	
	@GetMapping("/")
	public String inicio() {
		return "index";
	}
	
	@GetMapping("/empleado.html")
	public String empleado(Model model) {;
		model.addAttribute("empleados",ebd.findAll());
		return "empleado";
	}
	
	@GetMapping("/solicitud.html")
	public String solicitud(Model model) {
		model.addAttribute("solicitudes",sbd.findAll());
		return "solicitud";
	}
	
	@PostMapping("/empleado.html")
	public String ingresoE(Model model){		
		
		Empleado e = new Empleado();
		e.setIdEmpleado((int)model.getAttribute("id"));
		e.setFecha((Date)model.getAttribute("fecha"));
		e.setNombre((String)model.getAttribute("nombre"));
		e.setSalario((int)model.getAttribute("salario"));
		ebd.save(e);
		
		return "empleado";
	}
	
	
	@PostMapping("/solicitud.html")
	public String ingresoS(Model model){		
		
		Solicitud s = new Solicitud();
		s.setIdSolicitud((int)model.getAttribute("id"));
		s.setCodigo((String)model.getAttribute("codigo"));
		s.setDesc((String)model.getAttribute("desc"));
		s.setResumen((String)model.getAttribute("res"));
		sbd.save(s);
		
		return "solicitud";
	}
	
}
