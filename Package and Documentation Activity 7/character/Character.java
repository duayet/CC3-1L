package character;
import item.*;
public abstract class Character implements Weapon, Armor
{
    static Dice dice = new Dice();
    String name;
   protected int strength, dexterity, intelligence, maxlife, currentlife;

    public Character(String n, int s, int d, int i) {
        this.name = n;
        this.strength = s;
        this.dexterity = d;
        this.intelligence = i;
        this.currentlife = maxlife;
        this.heal(20);
        this.wound(15);
    }
    
    protected abstract int attack();
   

    public void wound(int damage) {
        maxlife = currentlife - damage;
        
    }

    public void heal(int heal) {
        if(currentlife<maxlife){
            currentlife = currentlife + heal;
        }
        
    }
//name
    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
//strength
    public int getStrength() {
        return strength;
    }

    public void setStrength(int s) {
        strength = s;
    }
//dexterity
    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int d) {
        dexterity = d;
    }
//intelligence
    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int i) {
        intelligence = i;
    }
//current life(status)
    public void setCurrentlife() {
        currentlife = maxlife;
    }

    public int getCurrentLife() {
        return currentlife;
    }
//maxlife
    public void setMaxLife(int ml) {
        maxlife = ml;
    }

    public int getMaxLife() {
        return maxlife;
    }
}