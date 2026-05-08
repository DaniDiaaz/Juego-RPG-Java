package aplicacion;

public class Dragon extends Character {
	
	private int fireBreath;
	
	public Dragon(String name, int hp, int maxHp, int attackPower, int defense) {
		super(name, hp, maxHp, attackPower, defense);
		this.fireBreath = 50;
	}

	public int getFireBreath() {
		return fireBreath;
	}

	public void setFireBreath(int fireBreath) {
		this.fireBreath = fireBreath;
	}

	@Override
	public String getDescription() {
		return "Dragón peligroso que escupe fuego por la boca";
	}

	@Override
	public String useSpecialSkill() {
		return "¡El dragón lanza un aliento de fuego causando " + fireBreath + " de daño!";
	}
}
