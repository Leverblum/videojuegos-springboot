package com.catalogo.videojuegos_api;

import com.catalogo.videojuegos_api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/videojuegos")
public class VideojuegoController {

	 @Autowired
	    private VideojuegoService videojuegoService;

	    // CRUD Endpoints

	    // Obtener todos los videojuegos
	    @GetMapping
	    public List<Videojuego> getAllVideojuegos() {
	        return videojuegoService.getAllVideojuegos();
	    }

	    // Obtener videojuego por ID
	    @GetMapping("/{id}")
	    public ResponseEntity<Videojuego> getVideojuegoById(@PathVariable Long id) {
	        return videojuegoService.getVideojuegoById(id)
	                .map(ResponseEntity::ok)
	                .orElse(ResponseEntity.notFound().build());
	    }

	    // Crear nuevo videojuego
	    @PostMapping
	    public Videojuego createVideojuego(@RequestBody Videojuego videojuego) {
	        return videojuegoService.saveVideojuego(videojuego);
	    }

	    // Actualizar videojuego
	    @PutMapping("/{id}")
	    public ResponseEntity<Videojuego> updateVideojuego(@PathVariable Long id, @RequestBody Videojuego videojuego) {
	        try {
	            Videojuego updated = videojuegoService.updateVideojuego(id, videojuego);
	            return ResponseEntity.ok(updated);
	        } catch (RuntimeException e) {
	            return ResponseEntity.notFound().build();
	        }
	    }

	    // Eliminar videojuego
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteVideojuego(@PathVariable Long id) {
	        videojuegoService.deleteVideojuego(id);
	        return ResponseEntity.noContent().build();
	    }

	    // ==============================
	    // Endpoints personalizados
	    // ==============================

	    @GetMapping("/genero/{genero}")
	    public List<Videojuego> getByGenero(@PathVariable String genero) {
	        return videojuegoService.getByGenero(genero);
	    }

	    @GetMapping("/plataforma/{plataforma}")
	    public List<Videojuego> getByPlataforma(@PathVariable String plataforma) {
	        return videojuegoService.getByPlataforma(plataforma);
	    }

	    @GetMapping("/desarrollador/{desarrollador}")
	    public List<Videojuego> getByDesarrollador(@PathVariable String desarrollador) {
	        return videojuegoService.getByDesarrollador(desarrollador);
	    }

	    @GetMapping("/anio/{anio}")
	    public List<Videojuego> getByAnio(@PathVariable int anio) {
	        return videojuegoService.getByAnioLanzamiento(anio);
	    }
}
