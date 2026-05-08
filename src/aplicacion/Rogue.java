package aplicacion;

public class Rogue extends Character {
	
	private boolean stealth;
	
	public Rogue(String name, int hp, int maxHp, int attackPower, int defense) {
		super(name, hp, maxHp, attackPower, defense);
		this.stealth = false;
	}

	public boolean isStealth() {
		return stealth;
	}

	public void setStealth(boolean stealth) {
		this.stealth = stealth;
	}

	@Override
	public String getDescription() {
		return "Ladrón silencioso capaz de desaparecer entre las sombras";
	}

	@Override
	public String useSpecialSkill() {
		this.stealth = !stealth;
		if (stealth) {
			return "Sigilo activado";
		} else {
			return "Sigilo desactivado";
		}
	}
	
	
	
}
