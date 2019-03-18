package test;
import character.Character;
import item.Dice;
public class TestCharacter extends Character {
	Dice dice = new Dice();
	
     public TestCharacter(String n, int s, int d, int i) {
		super(n, s, d, i);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TestCharacter p1 = new TestCharacter("Jack",40, 70, 70);
        p1.setMaxLife(100);
        TestCharacter p2 = new TestCharacter("Empoy",40,70,70);
        p2.setMaxLife(100);
        
        int life1 = p1.maxlife;
        int life2 = p2.maxlife;
        int round = 1;
            do {
                int atk1 = p1.attack();
                int atk2 = p2.attack();
                life2 = life2 - atk1;
                System.out.println("\t****Round "+round+"****");
                System.out.println("Jack attacked " + p2.getName()+" for "+atk1+" hp !");
                System.out.println("Empoy's life meter: " +life2 +"/" + p2.getMaxLife());
                life1 = life1 - atk2;
                System.out.println("Empoy attacked " + p1.getName()+" for "+atk2+" hp !");
                //System.out.println(" Empoy used ");
                System.out.println("Jack's life meter: " +life1 + "/" + p1.getMaxLife());
                round++;
                
            } while (life1 >= 0 || life2 >= 0);
            
            System.out.println("---------WINNER!------");
            if(life1 == 0){
                System.out.println( p2.getName() + " Won!\n"
                        + "-and-\n"
                        + p1.getName() + " died!");
            }
            else{
                 System.out.println( p1.getName() + " Won!\n"
                         + "-and-\n"
                        + p2.getName() + " died!");
                
            }
            
        }

	@Override
	public int useWeapon() {
		return dice.roll() + this.getStrength();

	}

	@Override
	public int useArmor() {
		return dice.roll() + this.getStrength();
	}

	@Override
	protected int attack() {
        return dice.roll() + getStrength();   
	}
}
