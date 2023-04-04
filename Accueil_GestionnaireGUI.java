package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class Accueil_GestionnaireGUI {

	private JFrame frmEsigelec;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil_GestionnaireGUI window = new Accueil_GestionnaireGUI();
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
	public Accueil_GestionnaireGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEsigelec = new JFrame();
		frmEsigelec.setResizable(false);
		frmEsigelec.setTitle("ESIGELEC - Gestionnaire - Page d'accueil");
		frmEsigelec.setIconImage(Toolkit.getDefaultToolkit().getImage(Accueil_GestionnaireGUI.class.getResource("/images/256x256bb-removebg-preview_new.png")));
		frmEsigelec.setBounds(100, 100, 1280, 720);
		frmEsigelec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEsigelec.getContentPane().setLayout(null);
		
		JButton btnGrerLesPlaning = new JButton("Gérer les planning");
		btnGrerLesPlaning.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGrerLesPlaning.setBounds(637, 343, 226, 31);
		frmEsigelec.getContentPane().add(btnGrerLesPlaning);
		
		JButton btnCrerUntudiant = new JButton("Créer un étudiant");
		btnCrerUntudiant.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCrerUntudiant.setBounds(340, 406, 226, 31);
		frmEsigelec.getContentPane().add(btnCrerUntudiant);
		
		JButton btnCrerUnCours = new JButton("Créer un cours");
		btnCrerUnCours.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCrerUnCours.setBounds(637, 406, 226, 31);
		frmEsigelec.getContentPane().add(btnCrerUnCours);
		
		JButton btnGre = new JButton("Gérer les absences");
		btnGre.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnGre.setBounds(340, 343, 226, 31);
		frmEsigelec.getContentPane().add(btnGre);
		
		JButton btnDconnexion = new JButton("Déconnexion");
		btnDconnexion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDconnexion.setBounds(1053, 30, 175, 31);
		frmEsigelec.getContentPane().add(btnDconnexion);
		
		JButton btnCrerUnGroupe = new JButton("Créer un groupe");
		btnCrerUnGroupe.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCrerUnGroupe.setBounds(340, 470, 226, 31);
		frmEsigelec.getContentPane().add(btnCrerUnGroupe);
		
		JButton btnCrerUnEnseignant = new JButton("Créer un enseignant");
		btnCrerUnEnseignant.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCrerUnEnseignant.setBounds(637, 470, 226, 31);
		frmEsigelec.getContentPane().add(btnCrerUnEnseignant);
		
		JButton btnDclarerUnePriode = new JButton("Déclarer une période de fermeture");
		btnDclarerUnePriode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDclarerUnePriode.setBounds(409, 607, 385, 31);
		frmEsigelec.getContentPane().add(btnDclarerUnePriode);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Accueil_GestionnaireGUI.class.getResource("/images/256x256bb-removebg-preview_new.png")));
		lblNewLabel_2.setBounds(489, 29, 219, 210);
		frmEsigelec.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("GESTIONNAIRE");
		lblNewLabel.setFont(new Font("Imprint MT Shadow", Font.PLAIN, 30));
		lblNewLabel.setBounds(477, 249, 266, 51);
		frmEsigelec.getContentPane().add(lblNewLabel);
	}

}
