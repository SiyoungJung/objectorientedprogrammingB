package test.three;

public class Game {

	public static void main(String[] args) {
		AbstractMonster m1 = new Attacker();
		AbstractMonster m2 = new Defender();
		
		m1.defense(m2.attack());
		m2.defense(m1.attack());
		
		System.out.println("Arracker:" + m1.getHp());
		System.out.println("Defender:" + m2.getHp());
	}
}
