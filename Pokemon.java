
public abstract class Pokemon {

	protected String name;
    protected int HP=0;
    protected int Lv=0;
    protected String gender;
    protected String ele;
    

    public Pokemon (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getHp(){
        return HP;
    }
    public void setHp(int HP){
        this.HP = HP;
      
    }
    
    public int getLv(){
        return Lv;
    }
    public void setLv(int Lv){
        this.Lv = Lv;
    }
    
    public String getGender() {
      int gen = (int)(Math.random()*2);
             if (gen == 0){
                 gender = "Male";
             }
             else if(gen == 1){
                 gender = "Female";
             }
               return gender;
         }
    public  String getEle() {
    	int e = (int)(Math.random()*5);
    	if(e==0) {
    		ele="FIRE";
    	}
    	else if(e==1) {
    		ele="WATER";
    	}
    	else if(e==2) {
    		ele="DARK";
    	}
    	
    	else if(e==3) {
    		ele="ROCK";
    	}
    	
    	else if(e==4) {
    		ele="GRASS";
    	}
    	
    	return ele;
    	
    }
    
    
    
    public boolean damage(int value){
        if(HP==0){
            return false;
        }
        int currentHP = HP - value;
        if(currentHP>=0){
            this.HP = currentHP;
            return true;
        }     
        else{
              this.HP=0;
              return true;
        }
          
    }
    public abstract void attack (Pokemon enemy);
    public String toString(){
        return name;
    }
   
   
}

