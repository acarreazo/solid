package com.java.uml.liskov.persona;

public class Programa {

	public static void mostrarSaludo(Persona persona){
		persona.saludar();
	}
	
	public static void main(String[] args) {
		Persona persona = new Ingles();
		mostrarSaludo(persona);

		
	}
}
