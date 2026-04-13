package teleaula01;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Tela08 {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setTitle("Minha primeira tela GUI");
		tela.setSize(300, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		
		tela.getContentPane().setLayout(null);
		

		JCheckBox checkbok = new JCheckBox();
		checkbok.setText("Texto checkbox");
		checkbok.setToolTipText("Selecione para habilitar a gravação......");
		checkbok.setBounds(10, 10, 200, 30);
		checkbok.setEnabled(true);
		
		tela.getContentPane().add(checkbok);
		tela.setResizable(true);
		tela.setVisible(true);
	}
}
