package teleaula01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Tela09 {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setTitle("Minha primeira tela GUI");
		tela.setSize(300, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		
		tela.getContentPane().setLayout(null);
		

		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		tela.getContentPane().add(panel);
		tela.setResizable(true);
		tela.setVisible(true);
	}
}
