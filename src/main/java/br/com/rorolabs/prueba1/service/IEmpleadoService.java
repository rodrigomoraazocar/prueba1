package br.com.rorolabs.prueba1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.rorolabs.prueba1.model.Empleado;

@Service
public interface IEmpleadoService {

	public List<Empleado> listarTodos ();  
	
}
