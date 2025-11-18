# Trabajo Practico para Ingeniería de Software

Este proyecto demuestra cómo crear una aplicación básica de Spring Boot y desplegarla en un contenedor de Docker.

## Técnologia utilizada

1. JDK 17
2. Maven 3.6
3. Docker

## Pasos para creación de la api dockerizada

1. Se crea proyecto inicial puede ser con Spring Initializr o en mi caso desde el IDE IntellJ
2. Se crea un repositorio publico en github y se agrega el origen del proyecto para que apunte al repositorio creado
3. Se crea un controlador de prueba y se prueba en el localhost
4. Se agrega el dockerfile
5. Se buildea y se levanta en local el contenedor de la aplicación
6. Se utiliza curl para la prueba local de la aplicación

## Pasos para pruebas en un ambiente local
1. Ir a la carpeta del dockerfile desde el terminal
2. Buildear la imagen: `docker build -t ingsoft-app .`
3. Levantar la imagen: `docker run -p 8080:8080 ingsoft-app`
4. Probar con curl la api: `curl http://localhost:8080/`
