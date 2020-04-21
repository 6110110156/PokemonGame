
public class WikiBerry extends Berry{

	public WikiBerry() {
		super("Wiki Berry");
		
	}
public void useBerry(Pokemon pokemon,Berry berry) {
		
		int hp = pokemon.getHp()+30;
	
		pokemon.setHp(hp);
		
	}
}
