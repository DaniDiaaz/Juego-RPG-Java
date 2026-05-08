package aplicacion;

import java.util.ArrayList;

public abstract class Character implements Describable, Combatable {

	private String name;
	private int hp;
	private int maxHp;
	private int attackPower;
	private int defense;
	private ArrayList<Item> inventory;

	public Character(String name, int hp, int maxHp, int attackPower, int defense) {
		this.name = name;
		this.hp = maxHp;
		this.maxHp = maxHp;
		this.attackPower = attackPower;
		this.defense = defense;
		this.inventory = new ArrayList<>();
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public int getAttackPower() {
		return attackPower;
	}

	public int getDefense() {
		return defense;
	}

	public ArrayList<Item> getInventory() {
		return inventory;
	}

	@Override
	public void takeDamage(int amount) {
		if (amount >= 0) {
			int resultado = Math.max(0, amount - defense);
			this.hp = this.hp - resultado;
			System.out.println("Le has quitado " + resultado + " de vida");
		} else {
			System.out.println("Primero tienes que hacerle daño");
		}
	}

	@Override
	public boolean isAlive() {
		return hp > 0;
	}

	@Override
	public String toString() {
		return "Nombre: " + name + " |HP: " + hp + " |ATK: " + attackPower;
	}

	public abstract String useSpecialSkill();

}
