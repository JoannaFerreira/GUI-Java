package teleaula01;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Tela06 {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setTitle("Minha primeira tela GUI");
		tela.setSize(300, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		
		tela.getContentPane().setLayout(null);
		
		JButton botao = new JButton();
		botao.setToolTipText("Clique para salvar");
		botao.setText("Salvar");
		botao.setMnemonic('S');
		
		botao.setBounds(5, 30, 100, 200);
		botao.setEnabled(true);
		
		tela.getContentPane().add(botao);
		tela.setResizable(true);
		tela.setVisible(true);

}
	}


