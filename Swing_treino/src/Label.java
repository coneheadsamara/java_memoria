import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;

public class Label extends JLabel {
	
	private JLabel label1 = new JLabel ();
	private JLabel label2 = new JLabel ("Sou colorido");
	
	public Component labelConfig () {
		
		label1.setVisible(true);
		label1.setForeground(Color.red);
		
		return label1;
		
	}
	
	public Component label2Config () {
		
		label2.setVisible(true);
		label2.setForeground(Color.magenta);
		
		return label2;
	}
	

}
