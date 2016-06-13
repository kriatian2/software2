package app;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;




public class AdminSalas extends JFrame implements ActionListener{

	private JFrame frmPanel;
	private JPanel contentPane;
	private JButton jb,botonEliminarDescuento,botonPeliculas,botonSalas,btnAadirHorario,btnVerVentas,btnAadirOfertas,btnCopiaDeSeguridad,btnAadirUsuario,botonGuardarPelicula,botonAñadirHorario,botonAñadirDescuento,botonIr;
	private JPanel panelPeliculas,panelSalas,panelHorarios,panelVentas,panelOfertas,panelCopia;
	private JPanel panel_1;
	private JTextField textFieldTitulo;
	private JTextField textFieldDirector;
	private JTextField textFieldDuracion;
	private JTextField textFieldProductora;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox comboVisualizacion,comboGenero,combo2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JLabel lblIdSala;
	private JTextField textField_6;

	public AdminSalas(){
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
		frmPanel.setTitle("Admin");
		frmPanel.setBounds(100, 100, 450, 300);
		frmPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPanel.getContentPane().setLayout(null);
		
		panelPeliculas = new JPanel();
		panelPeliculas.setBackground(Color.LIGHT_GRAY);
		panelPeliculas.setBounds(160, -1, 274, 262);
		frmPanel.getContentPane().add(panelPeliculas);
		panelPeliculas.setLayout(null);
		panelPeliculas.setVisible(false);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setBounds(127, 39, 112, 20);
		panelPeliculas.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);
		
		textFieldDirector = new JTextField();
		textFieldDirector.setColumns(10);
		textFieldDirector.setBounds(127, 70, 112, 20);
		panelPeliculas.add(textFieldDirector);
		
		textFieldDuracion = new JTextField();
		textFieldDuracion.setColumns(10);
		textFieldDuracion.setBounds(127, 101, 112, 20);
		panelPeliculas.add(textFieldDuracion);
		
		textFieldProductora = new JTextField();
		textFieldProductora.setColumns(10);
		textFieldProductora.setBounds(127, 163, 112, 20);
		panelPeliculas.add(textFieldProductora);
		
		JLabel labelTitulo = new JLabel("T\u00EDtulo");
		labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelTitulo.setBounds(30, 42, 61, 14);
		panelPeliculas.add(labelTitulo);
		
		JLabel labelDirector = new JLabel("Director");
		labelDirector.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelDirector.setBounds(30, 73, 86, 14);
		panelPeliculas.add(labelDirector);
		
		JLabel labelDuracion = new JLabel("Duraci\u00F3n");
		labelDuracion.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelDuracion.setBounds(30, 104, 86, 14);
		panelPeliculas.add(labelDuracion);
		
		JLabel labelGenero = new JLabel("G\u00E9nero");
		labelGenero.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelGenero.setBounds(30, 135, 86, 14);
		panelPeliculas.add(labelGenero);
		
		JLabel labelProductora = new JLabel("Productora");
		labelProductora.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelProductora.setBounds(30, 166, 86, 14);
		panelPeliculas.add(labelProductora);
		
		JLabel labelVisualizacion = new JLabel("Visualizaci\u00F3n");
		labelVisualizacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		labelVisualizacion.setBounds(30, 197, 86, 14);
		panelPeliculas.add(labelVisualizacion);
		
		comboGenero = new JComboBox();
		comboGenero.setToolTipText("");
		comboGenero.setModel(new DefaultComboBoxModel(new String[] {"Acci\u00F3n", "Animaci\u00F3n", "Ciencia ficci\u00F3n", "Comedia", "Drama", "Documental", "Fantas\u00EDa", "Guerra", "Horror", "Romance", "Suspense", "+18"}));
		comboGenero.setBounds(127, 132, 112, 20);
		panelPeliculas.add(comboGenero);
		comboGenero.addActionListener(this);
		
		comboVisualizacion = new JComboBox();
		comboVisualizacion.setModel(new DefaultComboBoxModel(new String[] {"Digital", "3D", "Digital+3D"}));
		comboVisualizacion.setBounds(127, 195, 112, 20);
		panelPeliculas.add(comboVisualizacion);
		comboVisualizacion.addActionListener(this);
		
		botonGuardarPelicula = new JButton("Registrar pel\u00EDcula");
		botonGuardarPelicula.setBounds(59, 228, 150, 23);
		panelPeliculas.add(botonGuardarPelicula);
		botonGuardarPelicula.addActionListener(this);
		panelPeliculas.setVisible(false);
		
		
		panelSalas = new JPanel();
		panelSalas.setBounds(160, -1, 274, 262);
		frmPanel.getContentPane().add(panelSalas);
		panelSalas.setBackground(new Color(95, 158, 160));
		panelSalas.setLayout(null);
		
		JLabel lblCrearSala = new JLabel("Crear sala:");
		lblCrearSala.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblCrearSala.setBounds(104, 11, 138, 14);
		panelSalas.add(lblCrearSala);
		
		JLabel lblTamaoSala = new JLabel("Tama\u00F1o Sala:");
		lblTamaoSala.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTamaoSala.setBounds(10, 41, 85, 14);
		panelSalas.add(lblTamaoSala);
		
		
		botonIr = new JButton("Ir");
		botonIr.setFont(new Font("Tahoma", Font.PLAIN, 10));
		botonIr.setBounds(216, 80, 48, 23);
		panelSalas.add(botonIr);
		
		textField_4 = new JTextField();
		textField_4.setBounds(101, 36, 31, 20);
		panelSalas.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblX = new JLabel("x");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblX.setBounds(142, 41, 16, 14);
		panelSalas.add(lblX);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(161, 36, 31, 20);
		panelSalas.add(textField_5);
		
		lblIdSala = new JLabel("ID sala:");
		lblIdSala.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIdSala.setBounds(10, 84, 85, 14);
		panelSalas.add(lblIdSala);
		
		textField_6 = new JTextField();
		textField_6.setBounds(104, 81, 86, 20);
		panelSalas.add(textField_6);
		textField_6.setColumns(10);
		
		
		botonIr.addActionListener(this);
		panelSalas.setVisible(false);
		
		panelOfertas = new JPanel();
		panelOfertas.setBackground(new Color(95, 158, 160));
		panelOfertas.setBounds(160, -1, 274, 262);
		frmPanel.getContentPane().add(panelOfertas);
		panelOfertas.setLayout(null);
		panelOfertas.setVisible(false);
		
		JLabel lblOfertasDisponibles = new JLabel("Ofertas disponibles");
		lblOfertasDisponibles.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOfertasDisponibles.setBounds(10, 11, 138, 14);
		panelOfertas.add(lblOfertasDisponibles);
		
		combo2 = new JComboBox();
		combo2.setBounds(135, 8, 129, 20);
		panelOfertas.add(combo2);
		
		JLabel lblAadirPromocin = new JLabel("A\u00F1adir promoci\u00F3n:");
		lblAadirPromocin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAadirPromocin.setBounds(10, 104, 138, 14);
		panelOfertas.add(lblAadirPromocin);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(36, 132, 59, 14);
		panelOfertas.add(lblNombre);
		
		textField_2 = new JTextField();
		textField_2.setBounds(135, 129, 129, 20);
		panelOfertas.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDescuento = new JLabel("Descuento:");
		lblDescuento.setBounds(36, 170, 89, 14);
		panelOfertas.add(lblDescuento);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(135, 167, 129, 20);
		panelOfertas.add(textField_3);
		
		botonAñadirDescuento = new JButton("A\u00F1adir descuento");
		botonAñadirDescuento.setBounds(77, 215, 138, 23);
		panelOfertas.add(botonAñadirDescuento);
		botonAñadirDescuento.addActionListener(this);
		
		botonEliminarDescuento = new JButton("Eliminar descuento");
		botonEliminarDescuento.setBounds(47, 43, 168, 23);
		panelOfertas.add(botonEliminarDescuento);
		botonEliminarDescuento.addActionListener(this);
		
		panelHorarios = new JPanel();
		panelHorarios.setToolTipText("");
		panelHorarios.setBackground(Color.LIGHT_GRAY);
		panelHorarios.setBounds(160, -1, 274, 262);
		frmPanel.getContentPane().add(panelHorarios);
		panelHorarios.setLayout(null);
		panelHorarios.setVisible(false);
		
		JLabel lblComienzo = new JLabel("Comienzo:");
		lblComienzo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComienzo.setBounds(22, 79, 81, 31);
		panelHorarios.add(lblComienzo);
		
		JLabel lblFinal = new JLabel("Final:");
		lblFinal.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFinal.setBounds(22, 121, 81, 31);
		panelHorarios.add(lblFinal);
		
		textField = new JTextField();
		textField.setToolTipText("lalaa");
		textField.setBounds(118, 85, 129, 20);
		panelHorarios.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 127, 129, 20);
		panelHorarios.add(textField_1);
		
		botonAñadirHorario = new JButton("A\u00F1adir");
		botonAñadirHorario.setBounds(71, 197, 117, 23);
		panelHorarios.add(botonAñadirHorario);
		
		JLabel lblAadirHorario = new JLabel("A\u00F1adir horario:");
		lblAadirHorario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAadirHorario.setBounds(71, 28, 138, 14);
		panelHorarios.add(lblAadirHorario);
		botonAñadirHorario.addActionListener(this);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(95, 158, 160));
		panel_1.setBounds(0, 32, 161, 32);
		frmPanel.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		botonSalas = new JButton("Gestionar salas");
		botonSalas.setBounds(10, 5, 141, 23);
		panel_1.add(botonSalas);
		botonSalas.addActionListener(this);
		
		panelCopia = new JPanel();
		panelCopia.setBackground(Color.LIGHT_GRAY);
		panelCopia.setBounds(160, -1, 274, 262);
		frmPanel.getContentPane().add(panelCopia);
		panelCopia.setLayout(null);
		panelCopia.setVisible(false);
		
		panelVentas = new JPanel();
		panelVentas.setBackground(Color.LIGHT_GRAY);
		panelVentas.setBounds(160, -1, 274, 262);
		frmPanel.getContentPane().add(panelVentas);
		panelVentas.setLayout(null);
		panelVentas.setVisible(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 161, 32);
		frmPanel.getContentPane().add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setLayout(null);
		
		botonPeliculas = new JButton("A\u00F1adir pel\u00EDcula");
		botonPeliculas.setBounds(10, 5, 141, 23);
		panel.add(botonPeliculas);
		botonPeliculas.addActionListener(this);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setBounds(0, 64, 161, 32);
		frmPanel.getContentPane().add(panel_2);
		
		btnAadirHorario = new JButton("Gestionar horarios");
		btnAadirHorario.setBounds(10, 5, 141, 23);
		panel_2.add(btnAadirHorario);
		btnAadirHorario.addActionListener(this);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(95, 158, 160));
		panel_3.setBounds(0, 96, 161, 32);
		frmPanel.getContentPane().add(panel_3);
		
		btnAadirUsuario = new JButton("Gesti\u00F3n de usuarios");
		btnAadirUsuario.setBounds(10, 5, 141, 23);
		panel_3.add(btnAadirUsuario);
		btnAadirUsuario.addActionListener(this);
		
		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBackground(Color.LIGHT_GRAY);
		panel_4.setBounds(0, 128, 161, 32);
		frmPanel.getContentPane().add(panel_4);
		
		btnVerVentas = new JButton("Ver taquilla");
		btnVerVentas.setBounds(10, 5, 141, 23);
		panel_4.add(btnVerVentas);
		btnVerVentas.addActionListener(this);
		
		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBackground(new Color(95, 158, 160));
		panel_5.setBounds(0, 160, 161, 32);
		frmPanel.getContentPane().add(panel_5);
		
		btnAadirOfertas = new JButton("Gestionar ofertas");
		btnAadirOfertas.setBounds(10, 5, 141, 23);
		panel_5.add(btnAadirOfertas);
		btnAadirOfertas.addActionListener(this);
		
		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBackground(Color.LIGHT_GRAY);
		panel_6.setBounds(0, 192, 161, 32);
		frmPanel.getContentPane().add(panel_6);
		
		btnCopiaDeSeguridad = new JButton("Copia de seguridad");
		btnCopiaDeSeguridad.setBounds(10, 5, 141, 23);
		panel_6.add(btnCopiaDeSeguridad);
		btnCopiaDeSeguridad.addActionListener(this);
		
		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBackground(new Color(95, 158, 160));
		panel_7.setBounds(0, 224, 161, 37);
		frmPanel.getContentPane().add(panel_7);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(10, 5, 141, 23);
		panel_7.add(btnSalir);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonPeliculas){
			panelSalas.setVisible(false);
			panelHorarios.setVisible(false);
			panelVentas.setVisible(false);
			panelOfertas.setVisible(false);
			panelCopia.setVisible(false);
			panelPeliculas.setVisible(true);
			
			

		}else if (e.getSource() == botonGuardarPelicula) {
			if(textFieldTitulo.getText().equals("")|textFieldDirector.getText().equals("")|textFieldDuracion.getText().equals("")|
					textFieldProductora.getText().equals("")){
				JOptionPane.showMessageDialog(null,
						"Rellena los campos vacíos");
			}else{
			Consultas consultas = new Consultas();
			consultas.conectar();
		
			consultas.insertarPelicula(
					textFieldTitulo.getText(),
					textFieldDirector.getText(),
					textFieldDuracion.getText(),
					comboGenero.getSelectedItem(),
					textFieldProductora.getText(),
					comboVisualizacion.getSelectedItem());
			
			consultas.desconectar();
			JOptionPane.showMessageDialog(null,
					"Película registrada con éxito");
			}
		}else if (e.getSource() == botonSalas){
			panelPeliculas.setVisible(false);
			panelHorarios.setVisible(false);
			panelVentas.setVisible(false);
			panelOfertas.setVisible(false);
			panelCopia.setVisible(false);
			panelSalas.setVisible(true);
			
		}else if (e.getSource() == botonIr){
			Consultas consultas = new Consultas();
			consultas.conectar();
			
			consultas.insertarSala(
					textField_4.getText(),
					textField_5.getText(),
					textField_6.getText());	
			
			consultas.desconectar();
			JOptionPane.showMessageDialog(null,
					"Sala creada con éxito");
				
		}else if (e.getSource() == btnAadirHorario){
			panelPeliculas.setVisible(false);
			panelSalas.setVisible(false);
			panelVentas.setVisible(false);
			panelOfertas.setVisible(false);
			panelCopia.setVisible(false);
			panelHorarios.setVisible(true);
			
		}else if (e.getSource() == botonAñadirHorario){
			Consultas consultas = new Consultas();
			consultas.conectar();
			
			consultas.insertarHorario(
					textField.getText(),
					textField_1.getText());	
			
			consultas.desconectar();
			JOptionPane.showMessageDialog(null,
					"Horario registrado con éxito");
		}else if (e.getSource() == btnVerVentas){
			panelPeliculas.setVisible(false);
			panelSalas.setVisible(false);
			panelHorarios.setVisible(false);
			panelOfertas.setVisible(false);
			panelCopia.setVisible(false);
			panelVentas.setVisible(true);
		}else if (e.getSource() == btnAadirOfertas){
			panelPeliculas.setVisible(false);
			panelSalas.setVisible(false);
			panelHorarios.setVisible(false);
			panelVentas.setVisible(false);
			panelCopia.setVisible(false);
			panelOfertas.setVisible(true);
			
			Consultas consultas = new Consultas();
			consultas.conectar();
			
			String[][] ficha = consultas.getOfertas();
			consultas.desconectar();
			int i, j;
			for (i = 0; i < ficha.length; i++) {
				for (j = 0; j < ficha[i].length; j++) {
					
							
					combo2.addItem(ficha[i][0].toString());
							break;
					}	
				}
			
		}else if (e.getSource() == botonEliminarDescuento){
			boolean encontrado = false;
			Consultas consultas = new Consultas();
			consultas.conectar();
			String[][] ficha = consultas.getOfertas();
			for (int i = 0; i < ficha.length; i++){
				if (ficha[i][0].equals(combo2.getSelectedItem())){
					consultas.eliminarOferta(combo2.getSelectedItem());
					JOptionPane.showMessageDialog(null,"Oferta eliminada correctamente");
					encontrado = true;
					break;
				}
			}
			if (!encontrado){
				JOptionPane.showMessageDialog(null,"La oferta no existe");
			
			}
			consultas.desconectar();
		}else if (e.getSource() == btnCopiaDeSeguridad){
				panelPeliculas.setVisible(false);
				panelSalas.setVisible(false);
				panelHorarios.setVisible(false);
				panelVentas.setVisible(false);
				panelOfertas.setVisible(false);
				panelCopia.setVisible(true);
		}else if (e.getSource() == btnAadirUsuario){
			GestorUsuarios gestor = new GestorUsuarios();
			
			
			
		}
	}
}
