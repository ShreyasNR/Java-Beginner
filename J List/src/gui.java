import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class gui extends JFrame{
	
	private JList list;
	private static String[] colornames = {"green", "orange", "blue", "red"};
	private static Color[] colors = {Color.GREEN, Color.ORANGE, Color.BLUE, Color.RED};
	
	public gui(){
		
		super("Title");
		setLayout(new FlowLayout());
		
		list = new JList(colornames);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		add(new JScrollPane(list));
		
		list.addListSelectionListener(
				new ListSelectionListener(){
					public void valueChanged(ListSelectionEvent event){
						getContentPane().setBackground(colors[list.getSelectedIndex()]);
					}
				}
		);
	}

}
