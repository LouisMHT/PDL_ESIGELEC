package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;

public class PDLGUI {

	private JFrame frmEsigelec;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PDLGUI window = new PDLGUI();
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
	public PDLGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEsigelec = new JFrame();
		frmEsigelec.setResizable(false);
		frmEsigelec.setTitle("ESIGELEC");
		frmEsigelec.setIconImage(Toolkit.getDefaultToolkit().getImage(PDLGUI.class.getResource("/images/256x256bb-removebg-preview_new.png")));
		frmEsigelec.setBounds(100, 100, 1280, 720);
		frmEsigelec.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmEsigelec.getContentPane().setLayout(null);
	}

}
