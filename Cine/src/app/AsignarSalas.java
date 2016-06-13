package app;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

public class AsignarSalas extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JFrame frmPanel;
	private JButton botonVolver1;
	private JComboBox comboSala,comboPelis;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsignarSalas frame = new AsignarSalas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	
	
	public AsignarSalas(){
		initialize();
		frmPanel.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPanel = new JFrame();
		frmPanel.getContentPane().setBackground(new Color(204, 204, 255));
		frmPanel.setTitle("Asignar Salas");
		frmPanel.setBounds(100, 100, 450, 300);
		frmPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPanel.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 434, 261);
		frmPanel.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblSeleccionarPelcula = new JLabel("Seleccionar pel\u00EDcula");
		lblSeleccionarPelcula.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeleccionarPelcula.setBounds(35, 39, 132, 14);
		panel.add(lblSeleccionarPelcula);
		
		JLabel lblSeleccionarSala = new JLabel("Seleccionar sala");
		lblSeleccionarSala.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeleccionarSala.setBounds(35, 95, 132, 14);
		panel.add(lblSeleccionarSala);
		
		JLabel lblConfiguracinAsientos = new JLabel("Asientos sala");
		lblConfiguracinAsientos.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConfiguracinAsientos.setBounds(35, 151, 172, 14);
		panel.add(lblConfiguracinAsientos);
		
		comboPelis = new JComboBox();
		comboPelis.setBounds(218, 37, 206, 20);
		panel.add(comboPelis);
		
		comboSala = new JComboBox();
		comboSala.setBounds(218, 93, 206, 20);
		panel.add(comboSala);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(164, 213, 89, 23);
		panel.add(btnNewButton);
		
		botonVolver1 = new JButton("Volver");
		botonVolver1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		botonVolver1.setBounds(345, 236, 79, 14);
		panel.add(botonVolver1);
		
		textField = new JTextField();
		textField.setBounds(217, 149, 64, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(327, 149, 64, 20);
		panel.add(textField_1);
		
		JLabel lblX = new JLabel("x");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblX.setBounds(304, 152, 46, 14);
		panel.add(lblX);
		botonVolver1.addActionListener(this);
		
		
		
		Consultas consultas = new Consultas();
		consultas.conectar();
		
		String[][] ficha = consultas.getPeliculas();
		consultas.desconectar();
		int i, j;
		for (i = 0; i < ficha.length; i++) {
			for (j = 0; j < ficha[i].length; j++) {
				
						
				comboPelis.addItem(ficha[i][0].toString());
						break;
				}	
			}
		
		Consultas consultas2 = new Consultas();
		consultas2.conectar();
		
		String[][] lala = consultas2.getSalaID();
		consultas2.desconectar();
		int w, q;
		for (w = 0; w < lala.length; w++) {
			for (q = 0; q < lala[w].length; q++) {
				
						
				comboSala.addItem(lala[w][0].toString());
						break;
				}	
			}
		
		Consultas consultas3 = new Consultas();
		consultas3.conectar();
		String[][] lolo = consultas3.getSalaTamaño();
		
        
		
		
		
		frmPanel.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botonVolver1){
			Usuario2 gogo = new Usuario2();
			
			frmPanel.setVisible(false);
			this.dispose();
		}
		
	}
}
