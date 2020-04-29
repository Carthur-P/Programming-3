package pdemoframe;

public class App {

	public static void main(String[] args) {
		//OneFrameButton frame = new OneFrameButton();
		SimpleGUI frame = new SimpleGUI();
		
		//this is better done in the JFrame class itself
		frame.setTitle("Simple GUI");
		frame.setSize(200, 300);
		frame.setResizable(false);
		frame.setVisible(true);
	}

}
