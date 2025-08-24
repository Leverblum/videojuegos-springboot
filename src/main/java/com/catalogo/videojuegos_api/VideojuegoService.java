package com.catalogo.videojuegos_api;

import com.catalogo.videojuegos_api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VideojuegoService {

	 @Autowired
	    private VideojuegoRepository videojuegoRepository;

	    // Métodos CRUD

	    // Obtener todos los videojuegos
	    public List<Videojuego> getAllVideojuegos() {
	        return videojuegoRepository.findAll();
	    }

	    // Obtener un videojuego por ID
	    public Optional<Videojuego> getVideojuegoById(Long id) {
	        return videojuegoRepository.findById(id);
	    }

	    // Guardar un nuevo videojuego
	    public Videojuego saveVideojuego(Videojuego videojuego) {
	        return videojuegoRepository.save(videojuego);
	    }

	    // Actualizar un videojuego existente
	    public Videojuego updateVideojuego(Long id, Videojuego videojuegoDetails) {
	        return videojuegoRepository.findById(id).map(videojuego -> {
	            videojuego.setTitulo(videojuegoDetails.getTitulo());
	            videojuego.setGenero(videojuegoDetails.getGenero());
	            videojuego.setPlataforma(videojuegoDetails.getPlataforma());
	            videojuego.setAnioLanzamiento(videojuegoDetails.getAnioLanzamiento());
	            videojuego.setDesarrollador(videojuegoDetails.getDesarrollador());
	            return videojuegoRepository.save(videojuego);
	        }).orElseThrow(() -> new RuntimeException("Videojuego no encontrado con ID: " + id));
	    }

	    // Eliminar un videojuego por ID
	    public void deleteVideojuego(Long id) {
	        videojuegoRepository.deleteById(id);
	    }

	    // Métodos personalizados
	    public List<Videojuego> getByGenero(String genero) {
	        return videojuegoRepository.findByGenero(genero);
	    }

	    public List<Videojuego> getByPlataforma(String plataforma) {
	        return videojuegoRepository.findByPlataforma(plataforma);
	    }

	    public List<Videojuego> getByDesarrollador(String desarrollador) {
	        return videojuegoRepository.findByDesarrollador(desarrollador);
	    }

	    public List<Videojuego> getByAnioLanzamiento(int anio) {
	        return videojuegoRepository.findByAnioLanzamiento(anio);
	    }
}
