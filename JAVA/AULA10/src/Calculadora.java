import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField txt_n1;
	private JTextField txt_n2;
	private JTextField txt_res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Programa DEV!");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 386, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N1");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(29, 25, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N2");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(29, 50, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(29, 75, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		txt_n1 = new JTextField();
		txt_n1.setBounds(127, 22, 166, 20);
		contentPane.add(txt_n1);
		txt_n1.setColumns(10);
		
		txt_n2 = new JTextField();
		txt_n2.setColumns(10);
		txt_n2.setBounds(127, 47, 166, 20);
		contentPane.add(txt_n2);
		
		txt_res = new JTextField();
		txt_res.setColumns(10);
		txt_res.setBounds(127, 72, 166, 20);
		contentPane.add(txt_res);
		
		JButton btn_retornar = new JButton("Retornar");
		btn_retornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calculadora frame1 = new Calculadora();
				
				frame1.setVisible(true);
				dispose();
			}
		});
		btn_retornar.setBounds(228, 113, 107, 23);
		contentPane.add(btn_retornar);
		
		JButton btn_limpar = new JButton("Limpar");
		btn_limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txt_n1.setText("");
				txt_n2.setText("");
				txt_res.setText("");
			}
		});
		btn_limpar.setBounds(120, 113, 89, 23);
		contentPane.add(btn_limpar);
		
		JButton btn_novo = new JButton("Novo");
		btn_novo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_n1.setEditable(true);
				txt_n2.setEditable(true);
				txt_res.setEditable(false);
			}
		});
		btn_novo.setBounds(12, 113, 89, 23);
		contentPane.add(btn_novo);
		
		JButton btn_adicao = new JButton("+");
		btn_adicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int x, y, z;
				
				x = Integer.valueOf(txt_n1.getText());
				y = Integer.valueOf(txt_n2.getText());
				
				z = x + y;
				
				txt_res.setText(String.valueOf(z));
				
			}
		});
		btn_adicao.setBounds(12, 147, 89, 38);
		contentPane.add(btn_adicao);
		
		JButton btn_mult = new JButton("*");
		btn_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int x, y, z;
				
				x = Integer.valueOf(txt_n1.getText());
				y = Integer.valueOf(txt_n2.getText());
				
				z = x * y;
				
				txt_res.setText(String.valueOf(z));
				
				
				
				
			}
		});
		btn_mult.setBounds(12, 196, 89, 43);
		contentPane.add(btn_mult);
		
		JButton btn_sub = new JButton("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int x, y, z;
				
				x = Integer.valueOf(txt_n1.getText());
				y = Integer.valueOf(txt_n2.getText());
				
				z = x - y;
				
				txt_res.setText(String.valueOf(z));
				
			}
		});
		btn_sub.setBounds(120, 147, 89, 38);
		contentPane.add(btn_sub);
		
		JButton btn_div = new JButton("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int x, y, z;
				
				x = Integer.valueOf(txt_n1.getText());
				y = Integer.valueOf(txt_n2.getText());
				
				z = x / y;
				
				txt_res.setText(String.valueOf(z));
				
			}
		});
		btn_div.setBounds(120, 196, 89, 43);
		contentPane.add(btn_div);
		
		JButton btn_compara = new JButton("Compara\u00E7\u00E3o");
		btn_compara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				int texto1 = Integer.valueOf(txt_n1.getText());
				int texto2 = Integer.valueOf(txt_n2.getText());
				
				
				if(texto1 < texto2) {
					txt_res.setText(texto1 + " < " + texto2);
				}else if(texto2 < texto1) {
					txt_res.setText(texto2 + " < " + texto1);
				}else {
					txt_res.setText(texto1 + " = " + texto2);
				}
				
			}
		});
		btn_compara.setBounds(228, 147, 107, 23);
		contentPane.add(btn_compara);
		
		JButton btn_sair = new JButton("Sair");
		btn_sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_sair.setBounds(228, 181, 107, 23);
		contentPane.add(btn_sair);
		
		txt_n1.setEditable(false);
		txt_n2.setEditable(false);
		txt_res.setEditable(false);
	}

}
