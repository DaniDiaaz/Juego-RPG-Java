package aplicacion;

public enum ItemType {
	
	WEAPON("Arma"),
	ARMOR("Armadura"),
	POTION("Poción"),
	ACCESSORY("Accesorio");
	
	private final String displayName;  // el campo
	
	ItemType(String displayName) {  // el constructor (siempre privado)
		this.displayName = displayName;
	}
	
	// el getter
	public String getDisplayName() {
		return displayName;
	}
	
}
