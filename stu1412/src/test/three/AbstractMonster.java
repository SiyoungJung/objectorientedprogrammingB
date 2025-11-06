package test.three;

public abstract class AbstractMonster {
	protected String name;
	protected int hp, attack, defense;
	
	public String getName() {
		return name;
	}

	public int getHp() {
		return hp;
	}

	public int getAttack() {
		return attack;
	}

	public int getDefense() {
		return defense;
	}

	AbstractMonster(String name, int hp, int attact, int defense) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
		this.defense = defense;
	}
	
	public boolean defense(int attack) {
		if (this.defense >= hp) {
			return true;
		} else {
			int temp = attack - defense;
			hp -= temp;
			return false;
		}
	}
	
	public abstract int attack();
}
