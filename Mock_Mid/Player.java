public class Player {
    final private String name;
    final private int attackDamage = 2;
    private Houses houses;
    private int hp = 20;
    private int mana = 50;
    
    public Player() {
        name = "";
    }
    public Player(String name) {
        this.name = name;
    }
    public Player(String name, int hp){
        this.name = name;
        setHP(hp);
    }
    public String getName() {
        return name;
    }
    public int getHP() {
        return hp;
    }
    public void setHP(int hp) {
        if (hp < 0) {
            this.hp = 0;
        }
        else if (hp <= 20) {
            this.hp = hp;
        }
        else if (hp > 20) {
            this.hp = 20;
        }
    }
    public int getAttackDamage() {
        return attackDamage;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        if (mana < 0) {
            this.mana = 0;
        }
        else if (mana <= 50) {
            this.mana = mana;
        }
        else if (mana > 50) {
            this.mana = 50;
        }
    }
    public Houses getHouses() {
        return houses;
    }
    public void setHouses(Houses houses) {
        this.houses = houses;
    }
    public String toString() {
        return "[Player] : " + name + " HP: " + hp + " Mana: " + mana + " || " + houses;
    }
    public boolean equals(Player player) {
        if (this.name.equals(player.name) && this.houses.equals(player.houses)) {
            return true;
        }
        else {
            return false;
        }
    }
    public void attack(Player target, Spell spell) {
        ((Magicable)houses).attackSpell(this,target, spell);
        if (target.hp == 0) {
            System.out.print("[DEAD]: " + target.name + " was killed by " + name);
        }
    }
    public void protectFromPlayer(Player target) {
        ((Magicable)houses).defense(this, target);
    }
    
}
