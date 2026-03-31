package teleaula01;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Tela04 {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setTitle("Minha primeira tela GUI");
		tela.setSize(300, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		
		tela.getContentPane().setLayout(null);
		
		JPasswordField pass = new JPasswordField();
		pass.setToolTipText("Digite a senha...");
		pass.setColumns(30);
		pass.setBounds(5, 30, 100, 200);
		pass.setEnabled(true);
		
		tela.getContentPane().add(pass);
		tela.setResizable(true);
		tela.setVisible(true);
	}
}
