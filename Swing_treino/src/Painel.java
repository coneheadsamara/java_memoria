import java.awt.Component;

import javax.swing.JPanel;

public class Painel extends JPanel  {
	private Botoes botao1 = new Botoes ();
	private JPanel panel1 = new JPanel ();
	private Label label1 = new Label ();
	private TextField text1 = new TextField();

	public JPanel getPanel1() {
		return panel1;
	}

	public void setPanel1(JPanel panel1) {
		this.panel1 = panel1;
	}
	
	public Component janelaConfig () {
		//panel1.add(label1.labelConfig());
		//panel1.add(label1.label2Config());
		panel1.add(botao1.botoesConfig());
		//panel1.add(text1.textConfig());
		panel1.setVisible(true);
		return panel1;
	}
	
	

}
