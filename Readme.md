# Proyecto API Videojuegos - Spring Boot

Este proyecto es una API REST creada con **Spring Boot** que permite gestionar información sobre videojuegos.  
Incluye operaciones CRUD y búsquedas por atributos.

---

## Tecnologías usadas
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## Configuración del proyecto
1. Clona el repositorio:
   ```bash
   git clone https://github.com/Leverblum/videojuegos-springboot.git

2. Configura la base de datos en application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/videojuegos_db
spring.datasource.username=root
spring.datasource.password=

3. Corre la aplicacion

## Endpoints
Crear videojuego
URL:
```bash 
http://localhost:8080/api/videojuegos
```
Body (JSON):
```json
{
  "titulo": "The Legend of Zelda: Breath of the Wild",
  "genero": "Aventura",
  "plataforma": "Nintendo Switch",
  "desarrollador": "Nintendo",
  "anioLanzamiento": 2017
}
```

Obtener todos los videojuegos
URL: 
```bash 
http://localhost:8080/api/videojuegos
```

Obtener un videojuego por ID
URL:
```bash 
http://localhost:8080/api/videojuegos/1
```

Actualizar un videojuego
URL:
```bash 
http://localhost:8080/api/videojuegos/1
```
Body(Json):
```json
{
  "titulo": "The Legend of Zelda: Breath of the Wild",
  "genero": "Aventura",
  "plataforma": "Nintendo Switch",
  "desarrollador": "Nintendo",
  "anioLanzamiento": 2017
}
```

Eliminar un videojuego
URL:
```bash 
http://localhost:8080/api/videojuegos/1
```

Buscar videojuegos por género
URL: 
```bash
http://localhost:8080/api/videojuegos/genero/Aventura
```
Buscar videojuegos por plataforma
URL: 
```bash
http://localhost:8080/api/videojuegos/plataforma/Nintendo Switch
```

Buscar videojuegos por desarrollador
URL: 
```bash
http://localhost:8080/api/videojuegos/desarrollador/Nintendo
```

Buscar videojuegos por año de lanzamiento
URL: 
```bash
http://localhost:8080/api/videojuegos/anio/2017
```









