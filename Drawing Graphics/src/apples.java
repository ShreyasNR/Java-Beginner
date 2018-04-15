import javax.swing.JFrame;
public class apples {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("Title");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		colorGraphic cg = new colorGraphic();
		f.add(cg);
		f.setSize(400,200);
		f.setVisible(true);
		
		
	}

}
