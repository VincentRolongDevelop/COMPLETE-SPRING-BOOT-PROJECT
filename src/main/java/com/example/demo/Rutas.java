package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/*
	1- RUTAS
	
	ENG:
	
	Spring 4.0 introduced the @RestController annotation in order to simplify 
	the creation of RESTful web services. It's a convenient annotation that 
	combines @Controller and @ResponseBody, which eliminates the need to annotate 
	every request handling method of the controller class with the @ResponseBody annotation.
	 
	 
	- What is the difference between @controller and @rest controller?
	
	The @Controller is a common annotation that is used to mark a class }
	as Spring MVC Controller while @RestController is a special controller 
	used in RESTFul web services and the equivalent of @Controller + @ResponseBody.
	
	SPN:
	
	La anotación @RestController marca la clase como un controlador donde 
	cada método devuelve un objeto de dominio en lugar de una vista. 
	Al anotar una clase con esta anotación, ya no necesita agregar @ResponseBody 
	a todos los métodos RequestMapping. Significa que ya no usa resuelve vistas 
	ni envía HTML en respuesta.
	
	Las clases que tengan @RestController significa que tienen rutas
*/

@RestController
public class Rutas {
	
	//GET ROUTE
	@GetMapping("/hello")
	String baseRoute() {
		return "Hello, first route of project :) ";
	}
	
	/*
	 
	 2- PARAMETROS DE RUTA
	 
	 ENG
	 
	 The @PathVariable annotation is used to extract the value of the 
	 template variables and assign their value to a method variable. 
	 A Spring controller method to process above
	 example is shown below; @RequestMapping("/users/{userid}", method=RequestMethod.
	 
	 SPN
	 
	 Spring @PathVariable es la anotación que nos sirve dentro de 
	 Spring framework para configurar variables dentro de los propios 
	 segmentos de la URL algo que a nivel de Arquitecturas REST es imprescindible. 
	 Vamos a ver un par de ejemplos de como construir unas urls REST que se apoyen 
	 en este tipo de anotación.
	 
	 */
	
	@GetMapping("/book/{id}")
	String readBook(@PathVariable int id) {
		return "Readin the book id:"+id;
	}
	
	//YOU CAN USE SEVERAL ROUTE PARAMETERS

	@GetMapping("/book/{id}/editorial/{id2}")
	String readBook2(@PathVariable int id, @PathVariable String id2) {
		return "Readin the book id:"+id+" editorial: "+id2;
	}
	
	
	
	
}

















