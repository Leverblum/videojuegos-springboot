package com.catalogo.videojuegos_api;

import jakarta.persistence.*;

@Entity
@Table(name = "videojuegos")
public class Videojuego {
	
	//Creacion base de datos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 100)
	private String titulo;
	
	@Column(nullable = false, length = 50)
	private String genero;
	
	@Column(nullable = false, length = 50)
	private String plataforma;
	
	@Column(name = "anio_lanzamiento", nullable = false)
	private int anioLanzamiento;
	
	@Column(length = 50)
	private String desarrollador;
	
	//Constructor vacio
	public Videojuego() {
	}
	
	// Constructor con parametros
	public Videojuego(String titulo, String genero, String plataforma, int anioLanzamiento, String desarrollador) {
	    this.titulo = titulo;
	    this.genero = genero;
	    this.plataforma = plataforma;
	    this.anioLanzamiento = anioLanzamiento;
	    this.desarrollador = desarrollador;
	}
	
	// Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }
}
