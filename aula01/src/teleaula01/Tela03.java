package teleaula01;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela03 {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setTitle("Minha primeira tela GUI");
		tela.setSize(300, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		
		tela.getContentPane().setLayout(null);
		
		JTextField textField =  new JTextField();
		textField.setColumns(30);
		textField.setBounds(16, 60, 100, 200);
		textField.setEditable(true);
		
		
		tela.getContentPane().add(textField);
		tela.setResizable(true);
		tela.setVisible(true);
	}
}
