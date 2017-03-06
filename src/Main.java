import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 210, 169);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelUsuario = new JLabel("Usuario:");
		labelUsuario.setBounds(10, 11, 77, 14);
		contentPane.add(labelUsuario);
		
		JLabel labelContrasena = new JLabel("Contrase\u00F1a:");
		labelContrasena.setBounds(10, 39, 77, 14);
		contentPane.add(labelContrasena);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(97, 8, 86, 20);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirmar");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String testua = textFieldUsuario.getText();
				String pasahitza = String.valueOf(passwordFieldContraseña.getPassword());
//				String pasahitza = passwordFieldContraseña.getText();
				
				if (testua.equals("ikaslea") && pasahitza.equals("1234")){
						btnNewButton.setForeground(Color.GREEN);
				}else{
					btnNewButton.setForeground(Color.RED);
				}
			}
		});
		btnNewButton.setBounds(45, 90, 101, 23);
		contentPane.add(btnNewButton);
		
		passwordFieldContraseña = new JPasswordField();
		passwordFieldContraseña.setBounds(97, 36, 86, 20);
		contentPane.add(passwordFieldContraseña);
		
		JCheckBox chckbxAceptarTerminosDe = new JCheckBox("Aceptar terminos de uso");
		chckbxAceptarTerminosDe.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxAceptarTerminosDe.setBounds(10, 60, 177, 23);
		contentPane.add(chckbxAceptarTerminosDe);
	}
}
