
public class CobaBerry extends Berry {

	public CobaBerry() {
	super("Coba Berry");
		
		
	} 
	public void useBerry(Pokemon pokemon,Berry berry) {
		
		int hp = pokemon.getHp()+15;
		int lv =pokemon.getLv()+10;
	
		pokemon.setHp(hp);
		pokemon.setLv(lv);
		
	}
	

}