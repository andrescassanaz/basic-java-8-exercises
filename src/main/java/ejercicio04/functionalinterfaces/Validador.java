package ejercicio04.functionalinterfaces;

import java.util.List;
import java.util.ArrayList;

/**
 * El objetivo de esta clase es validar que objetos del tipo T cumplen unos determinados requisitos.
 * Estos requisitos son dinamicos (se pueden configurar durante la ejecucion), por lo que, 
 * en lugar de tener una comprobacion fija, tendremos una lista de validadores individuales.
 * El usuario de esta clase podra sumar validadores mediante un metodo add ( que teneis que implementar ).
 * El metodo valida debera devolver true si el objeto que se pasa como parametro cumple con todos los 
 * validadores de la lista y false si no.
 * 
 * Para completar esta clase falta:
 *  - indicar el tipo de los elementos de la List validadores: pensad, debe ser un tipo que nos diga
 *       si un objeto del tipo T cumple con una condicion o no.
 *  - implementar el metodo add para aceptar un nuevo validador individual y acumularlo a la lista validadores
 *  - implementar el metodo valida para que realice la accion indicada mas arriba. Sera necesario cambiar el 
 *       tipo del parametro de Object al tipo adecuado
 */
public class Validador <T> {

	// falta indicar el tipo de List
	List validadores = new ArrayList<>();
	
	public boolean valida(Object valor) { // cambiar Object por el tipo adecuado
	   // true si pasa todos los validadores, falso si no
		return true;
	}
	
	// falta un metodo add que admite nuevas validaciones
}
