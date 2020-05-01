import java.awt.Component;

import javax.swing.JTextField;

public class TextField extends JTextField {
	
	JTextField text1 = new JTextField(4);
	
	
	public Component textConfig () {
		
		text1.setDragEnabled(true);
		text1.setVisible(true);
		
		return text1;
		
	}

}
