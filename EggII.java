public class EggII extends Egg{

	public EggII() {
		super("EggII");
		
	}
public void useEgg(Egg egg) {
		
		int e = egg.reper()+5;
	
		egg.setper(e);
		
	}
}
