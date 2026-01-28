public abstract class Spell {
    final private String name;
    private int damage = 0;
    
    public Spell() {
        name = "";
    }
    
    public Spell(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public int getDamage(){
        return damage;
    }
    
    public void setDamage(int damage){
        this.damage = damage;
    }
}
