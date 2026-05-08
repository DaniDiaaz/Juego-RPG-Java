package aplicacion;

import java.util.ArrayList;

public class Room implements Describable {

	private String name;
	private String description;
	private ArrayList<Item> items;
	private boolean visited;

	public Room(String name, String description) {
		this.name = name;
		this.description = description;
		this.items = new ArrayList<>();
		this.visited = false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public void addItem(Item item) {
		items.add(item);
	}

	public void removeItem(Item item) {
		items.remove(item);
	}

	@Override
	public String toString() {
		return name + "[" + (visited ? "visitada" : "no visitada") + "]";
	}

}
