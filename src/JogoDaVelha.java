import java.awt.Button;

import javax.swing.*;

public class JogoDaVelha extends JFrame {
	
	JButton bt[] = new JButton[9];
	public JogoDaVelha() {
		setVisible(true);
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(3);
		setLayout(null);
		setBounds(250,100,700,500);
		int cont = 0;
		for(int i=0;i<3;i++) {
			for(int j = 0; j<3; j++) {
				bt[cont] = new JButton();
				add(bt[cont]);
				bt[cont].setBounds((100 *i)+50, (100*j) +50, 95, 95);
				cont++;
			}
		}
	}
	public static void main(String[] args) {
		new JogoDaVelha();
	}
}