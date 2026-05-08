package aplicacion;

public class Mage extends Character {

	private int mana;

	public Mage(String name, int hp, int maxHp, int attackPower, int defense) {
		super(name, hp, maxHp, attackPower, defense);
		this.mana = 100;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	@Override
	public String getDescription() {
		return "Mago con muchos poderes, su bastón le permite crear varios hechizos";
	}

	@Override
	public String useSpecialSkill() {
		if (mana >= 30) {
			this.mana -= 30;
			return "¡Maná utilizado! Poder restante: " + mana;
		} else {
			return "Sin maná suficiente";
		}
	}

}
