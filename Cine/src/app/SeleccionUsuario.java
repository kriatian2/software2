package app;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import java.awt.Color;


public class SeleccionUsuario extends JFrame implements ActionListener{
	private JTextField textField;
	private JPasswordField textField_1;
	private JButton botonValidar,btnSalir;
	private int checked;

	public SeleccionUsuario() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		buildWindowLogIn();

	}

	/**
	 * Create the frame.
	 */
	private void buildWindowLogIn() {
		getContentPane().setLayout(null);
		setTitle("           Cine          ");
		
		setBounds(100, 100, 360, 300);
		setResizable(false);
		getContentPane().setLayout(null);
		
		
		
		
		JLabel labelUser = new JLabel("User:");
		labelUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelUser.setBounds(62, 108, 38, 14);
		getContentPane().add(labelUser);
		
		JLabel labelPassword = new JLabel("Password:");
		labelPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		labelPassword.setBounds(62, 145, 100, 14);
		getContentPane().add(labelPassword);
		
		textField = new JTextField();
		textField.setBounds(149, 107, 100, 18);
		getContentPane().add(textField);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(149, 144, 100, 18);
		getContentPane().add(textField_1);
		
		botonValidar = new JButton("Log in");
		botonValidar.setBounds(124, 200, 89, 23);
		getContentPane().add(botonValidar);
		botonValidar.addActionListener(this);
		
		JLabel lblSeleccinDeUsuarios = new JLabel("                     Login de Usuarios");
		lblSeleccinDeUsuarios.setForeground(new Color(102, 0, 204));
		lblSeleccinDeUsuarios.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblSeleccinDeUsuarios.setBounds(-1, 33, 250, 20);
		getContentPane().add(lblSeleccinDeUsuarios);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnSalir.setBounds(245, 232, 89, 18);
		getContentPane().add(btnSalir);
		btnSalir.addActionListener(this);
		
		this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonValidar) {
			checked = 0;
			String cad1 = textField.getText();
			// Guardamos el user
			@SuppressWarnings("deprecation")
			String cad2 = textField_1.getText();
			
			checked = checkUserPassword(cad1, cad2);
			if (checked == 1) {
				Usuario3 ilvl1 = new Usuario3();
				this.dispose();
			} else if (checked == 2) {
				Usuario2 ilvl1 = new Usuario2();
				this.dispose();
			} else if (checked == 3) {
				AdminSalas ilvl1 = new AdminSalas();
				this.dispose();
			} else {
				// Si no logea ponemos esto
				JOptionPane.showMessageDialog(null,
						"Usuario o contraseña introducidos no válidos");
				textField.setText("");
				textField_1.setText("");
			}
		} else if (e.getSource() == btnSalir){
			System.exit(0);
		}

	}
	
	
	private int checkUserPassword(String cad1, String cad2) {

		int secLvlReturned = 0;
		Consultas consultas = new Consultas();
		consultas.conectar();
		String[][] usuarios = consultas.getUsuarios();
		
		consultas.desconectar();
		int i, j;
		for (i = 0; i < usuarios.length; i++) {
			for (j = 0; j < usuarios[i].length; j++) {
				if (j == 0) {
					if ((usuarios[i][j]).equals(cad1)) {
						if ((usuarios[i][j + 1]).equals(cad2)) {
							secLvlReturned = Integer
									.parseInt(usuarios[i][j + 2]);
							return secLvlReturned;
						}
					}
				}
			}
		}
		return secLvlReturned;
	}
}
