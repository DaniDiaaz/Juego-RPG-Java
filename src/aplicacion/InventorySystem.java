package aplicacion;

public class InventorySystem {
	
	public void addItem(Character character, Item item) {
		character.getInventory().add(item);
		System.out.println("Item añadido: " + item.getName());
	}
	
	public void removeItem(Character character, Item item) {
		character.getInventory().remove(item);
		System.out.print("Item eliminado: " + item.getName());
	}
	
	public void showInventory(Character character) {
		for (Item item : character.getInventory()) {
			System.out.println("Item: " + item.getName());
		}
	}
	
	public boolean hasItem(Character character, Item item) {
		return character.getInventory().contains(item);
	}
}
