import java.util.ArrayList;
import java.util.*;
public class Actor {
    ArrayList<Pokemon> bag;
    private Scanner s;
    private String name;
    private int Money=0;

    public Actor(String name,int Money){
        bag=new ArrayList<Pokemon>();
        bag.add(new Cleffa("Cleffa"));
        bag.add(new Togepi("Togepi"));
        bag.add(new Charmander("Charmander"));
        s=new Scanner(System.in);
        this.name = name;
        this.Money = Money;
    }
    
    public String getPname(){
        return name;
    }
    public int grtMoney() {
    	return Money;
    }
    
    public void setMoney(int Money) {
    	this.Money=Money;
    }

    public void showPokemon(ArrayList<Pokemon> bag){
        int number=0;
        for(Pokemon p: bag){
            System.out.println("HP:"+p.getHp());
            number++;
        }
    }
    public ArrayList<Pokemon> getBag(){
        return bag;
    }

}