package br.com.rorolabs.prueba1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rorolabs.prueba1.model.Publicacion;
import br.com.rorolabs.prueba1.repository.IPublicacionRepository;

@Service //Service = Es donde se encuentran todos los metodos y la lógica del negocio
public class PublicacionServiceImp implements IPublicacion {

	//en service siempre hay que inyectar el repositorio
	@Autowired 
	private IPublicacionRepository iPublicacionRepository; 
	
	//Que es Inyectar?
	//Introducir todos los consultas (querys) del repositorio
	
	
	@Override
	public List<Publicacion> listarTodo() {
		
		return (List<Publicacion>) iPublicacionRepository.findAll();
	}

	
	
	
}
