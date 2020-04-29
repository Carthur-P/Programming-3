package pbox;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box1 = new Box(80);
		System.out.println("Box 1 should have everthing the same");
		System.out.println(box1.toString());
		
		Box box2 = new Box(50, 120);
		System.out.println("\nBox 2 should have the width and length the same but height different");
		System.out.println(box2.toString());
		
		Box box3 = new Box(80, 90, 120);
		System.out.println("\nBox 3 should have all its demension different");
		System.out.println(box3.toString());
			
	}

}
