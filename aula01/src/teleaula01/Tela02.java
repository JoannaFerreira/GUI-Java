package teleaula01;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela02 {

	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setTitle("Minha primeira tela GUI");
		tela.setSize(300, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		tela.setResizable(true);
		tela.setVisible(true);
		
		tela.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Aula 01");
		label.setBounds(5, 5, 100, 20);
		label.setToolTipText("ToolTip - aula");
		
		tela.getContentPane().add(label);
		tela.setResizable(true);
		tela.setVisible(true);
	}
}
