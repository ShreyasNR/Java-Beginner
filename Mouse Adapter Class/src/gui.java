import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame{
	
	private String details;
	private JLabel statusbar;
	
	public gui(){
		super("Title");
		
		statusbar = new JLabel("this is default");
		add(statusbar, BorderLayout.SOUTH);
		addMouseListener(new Mouseclass());
	}
	
	private class Mouseclass extends MouseAdapter{
		
		public void mouseClicked(MouseEvent event){
			details = String.format("you clicked %d", event.getClickCount());
			
			if (event.isMetaDown())
				details += " with your right mouse button";
			else if (event.isAltDown())
				details += " with your center mouse button";
			else
				details += " with your left mouse button";
			
			statusbar.setText(details);
		}
	}

}
