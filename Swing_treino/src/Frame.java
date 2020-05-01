import javax.swing.JFrame;

public class Frame extends JFrame {
	private Botoes botao1 = new Botoes();
	private Painel painel1 = new Painel ();
	private JFrame frame1 = new JFrame("Jogo da mímica");
	
	
	public void criarJanela() {
		frame1.add(painel1.janelaConfig());
		frame1.setVisible(true);
		frame1.setSize(500, 500);
		
	}
}
