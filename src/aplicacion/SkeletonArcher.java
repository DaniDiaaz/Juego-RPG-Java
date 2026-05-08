package aplicacion;

public class SkeletonArcher extends Character {

	private int arrows;

	public SkeletonArcher(String name, int hp, int maxHp, int attackPower, int defense) {
		super(name, hp, maxHp, attackPower, defense);
		this.arrows = 10;
	}

	public int getArrows() {
		return arrows;
	}

	public void setArrows(int arrows) {
		this.arrows = arrows;
	}

	@Override
	public String getDescription() {
		return "Un arquero esqueleto con una puntería magnífica";
	}

	@Override
	public String useSpecialSkill() {
		if (arrows > 0) {
			this.arrows -= 1;
			return "¡Flecha utilizada! Restantes: " + arrows;
		} else {
			return "¡No quedan flechas!";
		}
	}
	
}
