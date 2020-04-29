package pdice;

public class DiceApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dice dice = new Dice(1);
		dice.Roll();
		System.out.println(dice.toString()); 
	}

}
