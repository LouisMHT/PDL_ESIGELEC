package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.EtudiantDAO;
import model.Etudiant_ETT;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gestionnaire_Créer_un_étudiantGUI {

	private JFrame frmEsigelec;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField_1;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gestionnaire_Créer_un_étudiantGUI window = new Gestionnaire_Créer_un_étudiantGUI();
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
	public Gestionnaire_Créer_un_étudiantGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEsigelec = new JFrame();
		frmEsigelec.setResizable(false);
		frmEsigelec.setTitle("ESIGELEC");
		frmEsigelec.setIconImage(Toolkit.getDefaultToolkit().getImage(Gestionnaire_Créer_un_étudiantGUI.class.getResource("/images/256x256bb-removebg-preview_new.png")));
		frmEsigelec.setBounds(100, 100, 1280, 720);
		frmEsigelec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEsigelec.getContentPane().setLayout(null);
		
		JButton btnDconnexion = new JButton("Déconnexion");
		btnDconnexion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDconnexion.setBounds(1053, 30, 175, 31);
		frmEsigelec.getContentPane().add(btnDconnexion);
		
		JLabel lblNewLabel = new JLabel("Création d'un étudiant");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(39, 26, 217, 39);
		frmEsigelec.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(49, 80, 58, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(117, 75, 139, 31);
		frmEsigelec.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Prénom :");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(39, 135, 74, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(117, 130, 139, 31);
		frmEsigelec.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mail :");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(49, 192, 50, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_1_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(117, 187, 400, 31);
		frmEsigelec.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Mot de passe :");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_2.setBounds(591, 193, 123, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_1_2);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setBounds(711, 188, 252, 31);
		frmEsigelec.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Filière :");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_3.setBounds(443, 136, 74, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_1_3);
		
		JLabel lblModificationDuntudiant = new JLabel("Modification d'un étudiant");
		lblModificationDuntudiant.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblModificationDuntudiant.setBounds(39, 239, 268, 39);
		frmEsigelec.getContentPane().add(lblModificationDuntudiant);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Elève :");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1.setBounds(49, 293, 58, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(117, 290, 360, 31);
		frmEsigelec.getContentPane().add(comboBox_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nom :");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(49, 352, 58, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(117, 347, 139, 31);
		frmEsigelec.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_1_4 = new JLabel("Prénom :");
		lblNewLabel_1_1_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_4.setBounds(39, 407, 74, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_1_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(117, 402, 139, 31);
		frmEsigelec.getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Mail :");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_2.setBounds(49, 464, 50, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_1_1_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(117, 459, 400, 31);
		frmEsigelec.getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Filière :");
		lblNewLabel_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_3_1.setBounds(443, 408, 74, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_1_3_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Mot de passe :");
		lblNewLabel_1_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_2_1.setBounds(591, 465, 123, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_1_2_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField_1.setBounds(711, 460, 252, 31);
		frmEsigelec.getContentPane().add(passwordField_1);
		
		JLabel lblSuppressionDuntudiant = new JLabel("Suppression d'un étudiant");
		lblSuppressionDuntudiant.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSuppressionDuntudiant.setBounds(39, 512, 268, 39);
		frmEsigelec.getContentPane().add(lblSuppressionDuntudiant);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Elève :");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1_1_1.setBounds(49, 564, 58, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_1_1_1_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setBounds(117, 561, 360, 31);
		frmEsigelec.getContentPane().add(comboBox_1_1);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnValider.setBounds(575, 561, 144, 31);
		frmEsigelec.getContentPane().add(btnValider);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnHome.setBounds(912, 642, 144, 31);
		frmEsigelec.getContentPane().add(btnHome);
		
		JButton btnValider_1_1 = new JButton("Retour");
		btnValider_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnValider_1_1.setBounds(1084, 642, 144, 31);
		frmEsigelec.getContentPane().add(btnValider_1_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(527, 130, 400, 31);
		frmEsigelec.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(527, 402, 400, 31);
		frmEsigelec.getContentPane().add(textField_7);
		
		JButton btnValider_1 = new JButton("Valider");
		btnValider_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnValider_1.setBounds(1011, 459, 144, 31);
		frmEsigelec.getContentPane().add(btnValider_1);
		
		JButton btnValider_2 = new JButton("Valider");
		btnValider_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnValider_2.setBounds(1011, 187, 144, 31);
		frmEsigelec.getContentPane().add(btnValider_2);
		//btnValider_2.addActionListener(new ActionListener() {
/**
			public void actionPerformed(ActionEvent e) {
				// Attention, il faudra faire davantage de v�rifications sur la valeur entr�e par l'utilisateur
				if ((textField.getText().length() > 0)&&(textField_1.getText().length() > 0)) {
					int id = Integer.parseInt(textField_8.getText());
					String nom = textField.getText();
					String prenom = textField_1.getText();
					String filiere = textField_1.getText();
					String mail = textField_1.getText();
					String  = textField_1.getText();
					creationEtudiant(nom, prenom);
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Vous devez entrer une r�f�rence de fournisseur", "Dialog",
							JOptionPane.ERROR_MESSAGE);
				}
			}
			
		});
		*/
		
	}
}
