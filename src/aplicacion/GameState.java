package aplicacion;

public class GameState {

	private String playerName;
	private int playerHp;
	private int playerMaxHp;
	private String currentRoom;
	private int roomsVisited;

	public GameState(String playerName, int playerHp, int playerMaxHp, String currentRoom, int roomsVisited) {
		this.playerName = playerName;
		this.playerHp = playerHp;
		this.playerMaxHp = playerMaxHp;
		this.currentRoom = currentRoom;
		this.roomsVisited = roomsVisited;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerHp() {
		return playerHp;
	}

	public void setPlayerHp(int playerHp) {
		this.playerHp = playerHp;
	}

	public int getPlayerMaxHp() {
		return playerMaxHp;
	}

	public void setPlayerMaxHp(int playerMaxHp) {
		this.playerMaxHp = playerMaxHp;
	}

	public String getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(String currentRoom) {
		this.currentRoom = currentRoom;
	}

	public int getRoomsVisited() {
		return roomsVisited;
	}

	public void setRoomsVisited(int roomVisited) {
		this.roomsVisited = roomVisited;
	}

	@Override
	public String toString() {
		return "Nombre del jugador: " + playerName + " |Vida del jugador: " + playerHp + " |Vida máxima: " + playerMaxHp
				+ " |Sala actual: " + currentRoom + " |Salas visitadas: " + roomsVisited;
	}

}
