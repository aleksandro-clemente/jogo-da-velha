import javax.swing.*;

public class JogoDaVelha extends JFrame {
	
	public JogoDaVelha() {
		setVisible(true);
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(3);
		setLayout(null);
		setBounds(250,100,700,500);
	}
	public static void main(String[] args) {
		new JogoDaVelha();
	}
}