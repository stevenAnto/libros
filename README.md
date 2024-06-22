<h1 align="center"> Proyecto LiterAlura </h1>

<p align="center">
  <img src="https://github.com/stevenAnto/libros/assets/79427465/a5fec4f8-29e8-4e53-b363-0209a478f783" alt="libros" />
</p>

## Índice

* [Descripción del proyecto](#descripción-del-proyecto)
* [Estado del proyecto](#estado-del-proyecto)
* [Características de la aplicación y demostración](#características-de-la-aplicación-y-demostración)
* [Acceso al proyecto](#acceso-al-proyecto)
* [Tecnologías utilizadas](#tecnologías-utilizadas)
* [Personas Desarrolladores del Proyecto](#personas-desarrolladores)
* [Licencia](#licencia)

## Descripción del proyecto

En este emocionante proyecto, he construido mi propio catálogo de libros: el LiterAlura. Aprendí a realizar solicitudes a una API de libros, manipular datos JSON, guardarlos en una base de datos y filtrar y mostrar libros y autores de interés. Desarrollé un Catálogo de Libros que ofrece interacción textual a través de la consola, proporcionando al menos cinco opciones de interacción para los usuarios. Realicé todo el proceso desde la configuración del ambiente Java, creación del proyecto, consumo de la API, análisis de la respuesta JSON, hasta la inserción y consulta en la base de datos y la exhibición de resultados a los usuarios. Ha sido una experiencia práctica y emocionante en el desarrollo Java, gestionando mis actividades con Trello y aplicando el sistema ágil de desarrollo.

## Estado del proyecto

Completado

## Características de la aplicación y demostración



Configuración al crear el proyecto en Spring Initializr:

- **Java**: Versión 17 en adelante
- **Maven**: Initializr utiliza la versión 4
- **Spring Boot**: Versión 3.2.3
- **Proyecto**: JAR

Dependencias para agregar al crear el proyecto en Spring Initializr:

- **Spring Data JPA**
- **Postgres Driver**

La aplicación tiene las siguientes funcionalidades:

- Buscar libro por título: Permite al usuario buscar un libro específico por su título. Esto se logra mediante una solicitud a la API de libros utilizando el título como criterio de búsqueda.

  ![consulta1](https://github.com/stevenAnto/libros/assets/79427465/e597e7e1-be7b-46f5-bbb7-b13f1bf92cc7)

- Listar libros consultados/registrados: Muestra una lista de los libros que han sido consultados o registrados previamente en la aplicación. Esto puede incluir información como el título del libro, los autores, el idioma, etc.
  ![consulta2](https://github.com/stevenAnto/libros/assets/79427465/e24e4522-3fa5-43d9-970d-538c3f64f087)

- Listar autores registrados: Muestra una lista de los autores que han sido registrados en la aplicación. Esto puede incluir información como el nombre del autor, su fecha de nacimiento, nacionalidad, etc
  ![consulta3](https://github.com/stevenAnto/libros/assets/79427465/9a97dd80-456d-46a3-bb3e-80123593c491)

- Listar autores vivos en un determinado año: Permite al usuario encontrar autores que estaban vivos en un año específico. Esto implica filtrar la lista de autores registrados basándose en su fecha de nacimiento y fecha de fallecimiento.
  ![consulta4](https://github.com/stevenAnto/libros/assets/79427465/3d030276-4c91-4c10-8d24-4ab68ed7759e)

- Listar libros por idioma: Muestra una lista de los libros disponibles en la aplicación, organizados por idioma. Esto puede ayudar a los usuarios a encontrar libros en un idioma específico de su interés.
  ![consulta5](https://github.com/stevenAnto/libros/assets/79427465/3d79a54c-4e31-4a18-8b3d-1c63797df462)
![consulta51](https://github.com/stevenAnto/libros/assets/79427465/a9583818-ec61-4b47-ac0f-cfd200f7f77d)
![consulta52](https://github.com/stevenAnto/libros/assets/79427465/866c4a51-4328-4e55-83d2-5d240bd18b0e)

  

## Acceso al proyecto

El código fuente de este proyecto está disponible en el siguiente repositorio de GitHub: [repositorio](https://github.com/stevenAnto/libros.git).

Para clonar el repositorio, puedes utilizar el siguiente comando Git en tu terminal:
```git clone https://github.com/stevenAnto/libros.git```
Una vez clonado el repositorio, puedes importar el proyecto en tu IDE de preferencia y seguir las instrucciones de configuración del entorno de desarrollo en el archivo README.md del repositorio.

Si tienes alguna pregunta o necesitas ayuda con la configuración, no dudes en contactar al equipo de desarrollo.



## Tecnologías utilizadas

La aplicación LiterAlura está construida con las siguientes tecnologías:

- **Java JDK**: Versión 17 en adelante. [Descargar Java LTS](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- **Maven**: Versión 4 en adelante.
- **Spring**: Versión 3.2.3. [Spring Initializr](https://start.spring.io/)
- **Postgres**: Versión 16 en adelante. [Descargar PostgreSQL](https://www.postgresql.org/download/)
- **IDE (Entorno de desarrollo integrado)**: IntelliJ IDEA (opcional). [Descargar IntelliJ IDEA](https://www.jetbrains.com/idea/)


## Personas Desarrolladores del Proyecto

Esteven Antonio Calcina Puma

## Licencia

Este proyecto está licenciado bajo los términos de la [Licencia MIT](https://choosealicense.com/licenses/mit/).
