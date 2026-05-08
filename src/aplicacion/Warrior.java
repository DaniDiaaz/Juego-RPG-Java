package aplicacion;

public class Warrior extends Character {

	private int rage;

	public Warrior(String name, int hp, int maxHp, int attackPower, int defense) {
		super(name, hp, maxHp, attackPower, defense);
		this.rage = 0;
	}

	public int getRage() {
		return rage;
	}

	public void setRage(int rage) {
		this.rage = rage;
	}

	@Override
	public String getDescription() {
		return "Guerrero resistente, especialista en combate cuerpo a cuerpo";
	}

	@Override
	public String useSpecialSkill() {
		this.rage += 20;
		return "¡Furia acumulada! Rabia: " + rage;
	}

}
