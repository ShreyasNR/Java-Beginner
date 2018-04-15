import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class green extends JFrame{
	
	private JButton b;
	private Color color = (Color.WHITE);
	private JPanel panel;
	
	public green(){
		super("Title");
		panel = new JPanel();
		panel.setBackground(color);
		
		b = new JButton("Choose a Color");
		b.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					color = JColorChooser.showDialog(null, "Pick your Color", color);
					
					if (color==null)
						color=(Color.WHITE);
					
					panel.setBackground(color);
				}
			}
		);
		
		add(panel, BorderLayout.CENTER);
		add(b, BorderLayout.SOUTH);
		setSize(300,200);
		setVisible(true);
	}

}
