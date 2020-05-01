import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class Botoes extends JButton implements ActionListener {
	
	private JButton botaoOK = new JButton ("Começar");
	private JButton botaoVoltar = new JButton("Voltar");
	Label label1 = new Label();
	AnimaisMimica animais = new AnimaisMimica ();
	Random r = new Random ();

	
	
	
	public Component botoesConfig () {
		botaoOK.setVisible(true);
		botaoOK.setSize(30, 40);
		botaoOK.addActionListener(this);
		return botaoOK; 
	
	}

	public JButton getBotaoVoltar() {
		return botaoVoltar;
	}

	public void setBotaoVoltar(JButton botaoVoltar) {
		this.botaoVoltar = botaoVoltar;
	}

	public JButton getBotaoOK() {
		return botaoOK;
	}

	public void setBotaoOK(JButton botaoOK) {
		this.botaoOK = botaoOK;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = animais.pegarVetorPosição();
		System.out.println(str);
		

		
		
		
		
	}
	
	

}
