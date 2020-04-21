
public abstract class Egg {
	protected String name;
	protected  int per=0;
	
	
	public Egg(String name) {
		this.name=name;
	}
	public String getEgg() {
		return name;
	}
	public void getper(int per) {
		this.per=per;
	}
	public int reper() {
		return per;
	}
	public void setper(int per) {
		this.per=per;
	}
	public abstract void useEgg(Egg egg);

}
