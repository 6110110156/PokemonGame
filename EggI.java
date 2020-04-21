public class EggI extends Egg{

	public EggI() {
		super("EggI");
		
	}
public void useEgg(Egg egg) {
		
		int e = egg.reper()+10;
	
		egg.setper(e);
		
	}
}
