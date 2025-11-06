package test.three;

public class Defender extends AbstractMonster{
	public Defender() {
		super("Defender", 20, 13, 25);
	}

	@Override
	public int attack() {
		System.out.println("Defender - Attack");
		return attack;
	}
}
