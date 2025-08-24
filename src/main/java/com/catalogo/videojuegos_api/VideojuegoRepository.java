package com.catalogo.videojuegos_api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.catalogo.videojuegos_api.Videojuego;

@Repository
public interface VideojuegoRepository extends JpaRepository<Videojuego, Long>{
	List<Videojuego> findByGenero(String genero);
	List<Videojuego> findByPlataforma(String plataforma);
	List<Videojuego> findByDesarrollador(String desarollador);
	List<Videojuego> findByAnioLanzamiento(int anio);
}
