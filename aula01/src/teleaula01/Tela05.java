package teleaula01;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class Tela05 {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setTitle("Minha primeira tela GUI");
		tela.setSize(300, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		
		tela.getContentPane().setLayout(null);
		
		JTextArea area = new JTextArea();
		area.setToolTipText("Digite aqui um texto...");
		area.setColumns(30);
		area.setRows(3);
		area.setBounds(5, 30, 100, 200);
		area.setEnabled(true);
		
		tela.getContentPane().add(area);
		tela.setResizable(true);
		tela.setVisible(true);

}
	}