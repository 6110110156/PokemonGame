public class Squirtle extends Pokemon{
    public Squirtle (String name){
        super(name);
        HP=(int)(Math.random()*1500);
        Lv=(int)(Math.random()*10);
        
    }
    public void attack (Pokemon enemy){
        System.out.println("Pokemon "+ name +" attack " + enemy.getName());
        enemy.damage(120);
        }
}