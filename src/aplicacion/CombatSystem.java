package aplicacion;

public class CombatSystem {
	
	public void playerAttack(Character player, Character enemy) {
		enemy.takeDamage(player.getAttackPower());
		System.out.println(player.getName() + " ataca a " + enemy.getName() + " causando " + player.getAttackPower() + " de daño");
	}
	
	public void enemyAttack(Character enemy, Character player) {
		player.takeDamage(enemy.getAttackPower());
		System.out.println(enemy.getName() + " ataca a " + player.getName() + " causando " + enemy.getAttackPower() + " de daño");
	}
	
	public boolean isCombatOver(Character player, Character enemy) {
		return !player.isAlive() || !enemy.isAlive();
	}
	
	public void printCombatStatus(Character player, Character enemy) {
		System.out.println(player.getName() + " |HP: " + player.getHp() + "/" + player.getMaxHp());
		System.out.println(enemy.getName() + " |HP: " + enemy.getHp() + "/" + enemy.getMaxHp());
	}
}
