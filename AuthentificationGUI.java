package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class AuthentificationGUI {

	private JFrame frmEsigelec;
	private JTextField textField_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuthentificationGUI window = new AuthentificationGUI();
					window.frmEsigelec.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AuthentificationGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEsigelec = new JFrame();
		frmEsigelec.setResizable(false);
		frmEsigelec.setTitle("ESIGELEC - Authentification");
		frmEsigelec.setIconImage(Toolkit.getDefaultToolkit().getImage(AuthentificationGUI.class.getResource("/images/256x256bb-removebg-preview_new.png")));
		frmEsigelec.setBounds(100, 100, 1280, 720);
		frmEsigelec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEsigelec.getContentPane().setLayout(null);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(454, 312, 500, 31);
		frmEsigelec.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Vérifier");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(833, 362, 121, 31);
		frmEsigelec.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Adresse Mail :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(268, 312, 176, 31);
		frmEsigelec.getContentPane().add(lblNewLabel);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe :");
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMotDePasse.setBounds(268, 362, 176, 31);
		frmEsigelec.getContentPane().add(lblMotDePasse);
		
		JLabel lblNewLabel_1 = new JLabel("Veuillez vous identifier");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(297, 253, 327, 46);
		frmEsigelec.getContentPane().add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(454, 362, 369, 31);
		frmEsigelec.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AuthentificationGUI.class.getResource("/images/256x256bb-removebg-preview_new.png")));
		lblNewLabel_2.setBounds(527, 33, 219, 210);
		frmEsigelec.getContentPane().add(lblNewLabel_2);
	}
}
