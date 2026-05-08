package aplicacion;

import java.io.IOException;
import java.util.Scanner;

public class GameEngine {

	private Character player;
	private MapManager mapManager;
	private CombatSystem combatSystem;
	private InventorySystem inventorySystem;
	private SaveManager saveManager;
	private Scanner scanner;

	public GameEngine(Character player) {
		this.player = player;
		this.mapManager = new MapManager();
		this.combatSystem = new CombatSystem();
		this.inventorySystem = new InventorySystem();
		this.saveManager = new SaveManager();
		this.scanner = new Scanner(System.in);
	}

	public void start() {

		while (player.isAlive()) {
			handleInput();
		}
	}

	private void setUpMap() {
		Room entrada = new Room("Entrada", "Una sala oscura con antorchas en las paredes");
		entrada.addItem(new Item("Espada de hierro", "Una espada oxidada", ItemType.WEAPON, 10));
		mapManager.addRoom(entrada);
		mapManager.setCurrentRoom(entrada);

		Room sala1 = new Room("Bodega", "Sala con un montón de pociones y de comida");
		sala1.addItem(new Item("Cardo amargo", "Fruta con mal sabor pero curativa", ItemType.POTION, 30));
		mapManager.addRoom(sala1);

		Room sala2 = new Room("Campo de batalla", "Peligroso campo abierto");
		sala2.addItem(new Item("Peto de grebas de hierro", "Potente armadura", ItemType.ARMOR, 40));
		mapManager.addRoom(sala2);

	}

	private void showActions() {
		System.out.println("==== ¿QUÉ QUIERES HACER? ====");
		System.out.println("1. Explorar");
		System.out.println("2. Ver inventario");
		System.out.println("3. Guardar partida");
		System.out.println("4. Salir");
	}

	public void handleInput() {
		showActions();

		int opcion = scanner.nextInt();

		switch (opcion) {
		case 1:
			explore();
			break;
		case 2:
			inventorySystem.showInventory(player);
			break;
		case 3:
			saveGame();
			break;
		case 4:
			System.out.println("¡Hasta pronto!");
			break;
		default:
			System.out.println("Opción no válida, prueba de nuevo");
		}
	}

	public void saveGame() {

		try {
			GameState partida1 = new GameState(player.getName(), player.getHp(), player.getMaxHp(),
					mapManager.getCurrentRoom().getName(), mapManager.getRoomsVisited());
			saveManager.saveGame(partida1, "partida.txt");
			System.out.println("Partida guardada correctamente");
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}

	private void explore() {
		
		setUpMap();
		mapManager.printCurrentRoom();
		if (mapManager.getCurrentRoom().getItems().isEmpty()) {
			System.out.println("No hay items en la sala");
		} else {
			for (Item items : mapManager.getCurrentRoom().getItems()) {
				System.out.println(items);
			}
		}
	}
}
