package teleaula01;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Tela07 {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setTitle("Minha primeira tela GUI");
		tela.setSize(300, 300);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		
		tela.getContentPane().setLayout(null);
		
		String[] itens =  new String[] {"Item1", "Item2", "Item3", "Item4"};
		JComboBox combo = new JComboBox(itens);
		combo.setToolTipText("Ajuda.....");
		combo.setBounds(5, 10, 80, 30);
		combo.setEnabled(true);
		
		tela.getContentPane().add(combo);
		tela.setResizable(true);
		tela.setVisible(true);

}
	}


