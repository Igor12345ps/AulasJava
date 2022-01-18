import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

public class frmcalc extends JFrame {
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		 try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            System.err.println(ex);
	        } catch (InstantiationException ex) {
	        	System.err.println(ex);
	        } catch (IllegalAccessException ex) {
	        	System.err.println(ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	        	System.err.println(ex);
	        }
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmcalc frame = new frmcalc();
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
	public frmcalc() {
				
		setResizable(false);
		setTitle("Programa\u00E7\u00E3o de Computadores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 405);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("N1");
		label.setAlignment(Label.RIGHT);
		label.setBounds(36, 36, 62, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("N2");
		label_1.setAlignment(Label.RIGHT);
		label_1.setBounds(36, 77, 62, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("Resultado");
		label_2.setAlignment(Label.RIGHT);
		label_2.setBounds(36, 126, 62, 22);
		contentPane.add(label_2);
		
		TextField txt_N1 = new TextField();
		txt_N1.setBounds(133, 36, 140, 22);
		contentPane.add(txt_N1);
		
		TextField txt_N2 = new TextField();
		txt_N2.setBounds(133, 77, 140, 22);
		contentPane.add(txt_N2);
		
		TextField txt_res = new TextField();
		txt_res.setBounds(133, 126, 140, 22);
		contentPane.add(txt_res);
		
		Button btn_soma = new Button("+");
		btn_soma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x,y, z;
				String r;
				
				x = Integer.valueOf(txt_N1.getText());
				y = Integer.valueOf(txt_N2.getText());
				
				z = x + y;
				r = String.valueOf(z);
				txt_res.setText(r);
			}
		});
		btn_soma.setBounds(28, 216, 70, 62);
		contentPane.add(btn_soma);
		
		Button btn_sub = new Button("-");
		btn_sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x,y, z;
				String r;
				
				x = Integer.parseInt(txt_N1.getText());
				y = Integer.parseInt(txt_N2.getText());
				
				z = x - y;
				r = String.valueOf(z);
				txt_res.setText(r);
			}
		});
		btn_sub.setBounds(112, 216, 70, 62);
		contentPane.add(btn_sub);
		
		Button btn_mult = new Button("*");
		btn_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x,y, z;
				String r;
				
				x = Integer.parseInt(txt_N1.getText());
				y = Integer.parseInt(txt_N2.getText());
				
				z = x * y;
				r = String.valueOf(z);
				txt_res.setText(r);
			}
		});
		btn_mult.setBounds(28, 284, 70, 65);
		contentPane.add(btn_mult);
		
		Button btn_div = new Button("/");
		btn_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x,y, z;
				String r;
				
				x = Integer.parseInt(txt_N1.getText());
				y = Integer.parseInt(txt_N2.getText());
				
				z = x / y;
				r = String.valueOf(z);
				txt_res.setText(r);
			}
		});
		btn_div.setBounds(112, 284, 70, 65);
		contentPane.add(btn_div);
		
		Button btn_novo = new Button("Novo");
		btn_novo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_N1.setEditable(true);
				txt_N2.setEditable(true);
				txt_res.setEditable(false);
			}
		});
		btn_novo.setBounds(28, 178, 70, 22);
		contentPane.add(btn_novo);
		
		Button btn_limpar = new Button("Limpar");
		btn_limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_N1.setText("");
				txt_N2.setText("");
				txt_res.setText("");
			}
		});
		btn_limpar.setBounds(112, 178, 70, 22);
		contentPane.add(btn_limpar);
		
		Button btn_sair = new Button("Sair");
		btn_sair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btn_sair.setBounds(203, 256, 70, 22);
		contentPane.add(btn_sair);
		
		Button btn_retornar = new Button("Retornar");
		btn_retornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmcalc frame1 = new frmcalc();
				
				frame1.setVisible(true);
				dispose();
			}
		});
		btn_retornar.setBounds(203, 178, 70, 22);
		contentPane.add(btn_retornar);
		
		Button btn_compara = new Button("Compara\u00E7\u00E3o");
		btn_compara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double texto1 = Double.valueOf(txt_N1.getText());
				double texto2 = Double.valueOf(txt_N2.getText());
				
				if(Double.valueOf(txt_N1.getText()) < Double.valueOf(txt_N2.getText())) {
					txt_res.setText(texto1 + " < " + texto2);
				}
				else {
					txt_res.setText(texto2 + " < " + texto1);
				}
			}
		});
		btn_compara.setBounds(203, 216, 70, 22);
		contentPane.add(btn_compara);
		

		txt_N1.setEditable(false);
		txt_N2.setEditable(false);
		txt_res.setEditable(false);
	}
}
