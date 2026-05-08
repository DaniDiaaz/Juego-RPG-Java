package aplicacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SaveManager {

	public void saveGame(GameState state, String filename) throws IOException {

		BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
		writer.write(state.getPlayerName());
		writer.newLine();
		writer.write(String.valueOf(state.getPlayerHp()));
		writer.newLine();
		writer.write(String.valueOf(state.getPlayerMaxHp()));
		writer.newLine();
		writer.write(state.getCurrentRoom());
		writer.newLine();
		writer.write(String.valueOf(state.getRoomsVisited()));
		writer.close();

	}
	
	public GameState loadGame(String filename) throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String playerName = reader.readLine();
		int playerHp = Integer.parseInt(reader.readLine());
		int playerMaxHp = Integer.parseInt(reader.readLine());
		String currentRoom = reader.readLine();
		int roomsVisited = Integer.parseInt(reader.readLine());
		reader.close();
		
		return new GameState(playerName, playerHp, playerMaxHp, currentRoom, roomsVisited);
	}
}
