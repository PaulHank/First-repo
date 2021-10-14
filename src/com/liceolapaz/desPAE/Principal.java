package com.liceolapaz.desPAE;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Pedirle nombre al usuario
		pedirNombre();
		//Recibir el nombre y alamcenarlo
		String nombreUsuario = archivarNombre();
		//Escribir el saludo por pantalla
		Saludar(nombreUsuario);

	}

	private static void Saludar(String nombreUsuario) {
		System.out.println("Bienvenido " + nombreUsuario );
		
	}

	private static String archivarNombre() {
		Scanner escaner = new Scanner(System.in);
		return escaner.nextLine();
	}

	private static void pedirNombre() {
	System.out.print("Escriba su nombre");
		
	}

}
