package teleaula01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exercicio01 {
	public static void main(String[] args) {
		JFrame tela = new JFrame();
		tela.setSize(350, 250);
		tela.setTitle("Exercício 01");
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel pn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		pn1.add(new JLabel("Tela de cadastro"));
		tela.getContentPane().add(pn1, BorderLayout.NORTH);
		
		JPanel pn2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		pn2.add(new JLabel("nome"));
		pn2.add(new JTextField(30));
		pn2.add(new JLabel("Endereço"));
		pn2.add(new JTextField(30));
		pn2.add(new JLabel("Cidade"));
		pn2.add(new JComboBox(new String[] {"Cidade 01", "Cidade02", "Cidade03"}));
		JCheckBox ck = new JCheckBox("Casado");
		ck.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("Ganhou foco...");
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		pn2.add(ck);
		tela.getContentPane().add(pn2, BorderLayout.CENTER);
		
		JPanel pn3 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JButton btSalvar = new JButton("Salvar");
		btSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Usuário clicou no botão salvar...");
			}
		});
		
		pn3.add(btSalvar);
		pn3.add(new JButton("Alterar"));
		pn3.add(new JButton("Cancelar"));
		
		tela.getContentPane().add(pn3, BorderLayout.SOUTH);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);
		
	}
}
