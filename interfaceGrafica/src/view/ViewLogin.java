package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewLogin {

	private JFrame frame;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin window = new ViewLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(91, 47, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(91, 72, 227, 20);
		frame.getContentPane().add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Senha");
		lblNewLabel_1.setBounds(91, 113, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(91, 138, 227, 20);
		frame.getContentPane().add(txtSenha);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(checkLogin(txtLogin.getText(), new String(txtSenha.getPassword()))) {
					
					JOptionPane.showMessageDialog(null, "Bem vindo ao sistema!");
				}
				
				else {
					JOptionPane.showMessageDialog(null, "Dados Inválidos", "Erro", JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		btnNewButton.setBounds(91, 181, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
	
	public boolean checkLogin(String login, String senha) {
		return login.equals("joao") && senha.equals("123");
	}
	
}
