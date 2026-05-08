package app;

import java.util.Scanner;

import aplicacion.GameEngine;
import aplicacion.Mage;
import aplicacion.Warrior;
import aplicacion.Rogue;
import aplicacion.Character;



public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Cuál es tu nombre, aventurero? ");
		String nombre = sc.nextLine();
		
		System.out.println("Bienvenido, " + nombre + ", elige tu clase: ");
		System.out.println("1. Guerrero");
		System.out.println("2. Mago");
		System.out.println("3. Pícaro");
		int opcion = sc.nextInt();
		
		Character player = null;
		
		switch (opcion) {
		case 1:
			player = new Warrior(nombre, 100, 100, 20, 10);
			break;
		case 2:
			player = new Mage(nombre, 80, 80, 30, 5);
			break;
		case 3:
			player = new Rogue(nombre, 90, 90, 25, 8);
			break;
		default:
			System.out.println("Opción no válida");
		}
		
		if (player == null) {
			System.out.println("Clase no válida, saliendo...");
		}
		
		GameEngine ge = new GameEngine(player);
		ge.start();

	}

}
