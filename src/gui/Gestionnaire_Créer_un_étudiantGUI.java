package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dao.Etudiant_ettDAO;

import model.Etudiant_ett;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_13;
	private JFrame frmEsigelec0;

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
		
		JButton btnValider = new JButton("Valider");
		btnValider.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnValider.setBounds(253, 561, 144, 31);
		frmEsigelec.getContentPane().add(btnValider);
		btnValider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_11.getText().length() > 0) {
					int idsuppr = Integer.parseInt(textField_11.getText());
					Etudiant_ettDAO etudDao = new Etudiant_ettDAO();
					Etudiant_ett unEtudiantsuppr = new Etudiant_ett(idsuppr, " ", " ", " ", " ", " ", 1);
					etudDao.supprimerUnEtudiant(unEtudiantsuppr);
					
				}else {
					JOptionPane.showMessageDialog(new JFrame(), "Vous devez entrer les bonnes informations", "Dialog",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
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
		
		btnValider_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField_10.getText().length() > 0) {
					int idmod = Integer.parseInt(textField_10.getText());
					
					String nom = textField_3.getText();
					String prenom = textField_4.getText();
					String Mail = textField_5.getText();
					String Filiere = textField_7.getText();
					String MDP = passwordField_1.getText();
					int ge = Integer.parseInt(textField_13.getText());
				
					Etudiant_ettDAO etudDao = new Etudiant_ettDAO();
					Etudiant_ett unEtudiantmod = new Etudiant_ett(idmod, nom, prenom, Mail, Filiere, MDP, ge);
					etudDao.modifierUnEtudiant(unEtudiantmod);
					
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Vous devez entrer les bonnes informations", "Dialog",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		JButton btnValider_2 = new JButton("Valider");
		btnValider_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnValider_2.setBounds(1011, 187, 144, 31);
		frmEsigelec.getContentPane().add(btnValider_2);
		btnValider_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ((textField.getText().length() > 0)&&(textField_1.getText().length() > 0)
						&&(textField_2.getText().length() > 0)&&(textField_6.getText().length() > 0)
						&&(passwordField.getText().length() > 0)) {
					int id = Integer.parseInt(textField_8.getText());
					String nom = textField.getText();
					String prenom = textField_1.getText();
					String Mail = textField_2.getText();
					String Filiere = textField_6.getText();
					String MDP = passwordField.getText();
					int ge = Integer.parseInt(textField_9.getText());
					
					Etudiant_ettDAO etudDao = new Etudiant_ettDAO();
					Etudiant_ett unEtudiant = new Etudiant_ett(id, nom, prenom, Mail, Filiere, MDP, ge);
					etudDao.ajouterUnEtudiant(unEtudiant);
					
				} else {
					JOptionPane.showMessageDialog(new JFrame(), "Vous devez entrer les bonnes informations", "Dialog",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setBounds(405, 75, 101, 31);
		frmEsigelec.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(663, 77, 96, 31);
		frmEsigelec.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_1_3 = new JLabel("id :");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3.setBounds(339, 80, 58, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("grp :");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3_1.setBounds(591, 80, 58, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_3_1);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_10.setColumns(10);
		textField_10.setBounds(117, 288, 101, 31);
		frmEsigelec.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setColumns(10);
		textField_11.setBounds(117, 561, 101, 31);
		frmEsigelec.getContentPane().add(textField_11);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("grp :");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_3_1_1.setBounds(591, 350, 58, 20);
		frmEsigelec.getContentPane().add(lblNewLabel_1_3_1_1);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(663, 347, 96, 31);
		frmEsigelec.getContentPane().add(textField_13);
		
		
		
	}
}
