package aplicacion;

import java.util.ArrayList;

public class MapManager {

	private ArrayList<Room> rooms;
	private Room currentRoom;

	public MapManager() {
		this.rooms = new ArrayList<>();
		this.currentRoom = null;
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}

	public void addRoom(Room room) {
		rooms.add(room);
	}

	public void moveToRoom(Room room) {
		this.currentRoom = room;
		room.setVisited(true);
		System.out.println("Te has movido a: " + room.getName());
	}

	public void printCurrentRoom() {
		System.out.println("Sala: " + currentRoom.getName());
		System.out.println(currentRoom.getDescription());
	}

	public int getRoomsVisited() {
		int contador = 0;
		for (Room room : rooms) {
			if (room.isVisited()) {
				contador++;
			}
		}
		return contador;
	}
}
