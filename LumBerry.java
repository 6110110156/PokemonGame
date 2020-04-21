
public class LumBerry extends Berry {

	public LumBerry() {
		super("Lum Berry");
		
	} 
	public void useBerry(Pokemon pokemon,Berry berry) {
		int hp = pokemon.getHp()+10;
		pokemon.setHp(hp);
		
	}
	

}
