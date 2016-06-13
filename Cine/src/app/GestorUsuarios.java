package app;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;




import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;








public class GestorUsuarios extends JFrame implements ActionListener {

	private JFrame frmPanel;
	private JPanel contentPane,panelOpcion,panelCrearUsuario,panelBorrarUsuario;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnVolver,btnNewButton,btnEliminarUsuario,btnCrearNuevoUsuario,btnEliminarUsuario_1;
	private JTextField textField_2;
	private JRadioButton radioButton1, radioButton2;
	private JButton button;
	private JButton button_1;
	private JComboBox combo1;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorUsuarios frame = new GestorUsuarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	public GestorUsuarios(){
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
		frmPanel.setTitle("Gestor de usuarios");
		frmPanel.setBounds(100, 100, 450, 300);
		frmPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPanel.getContentPane().setLayout(null);
								
								panelCrearUsuario = new JPanel();
								panelCrearUsuario.setBackground(Color.LIGHT_GRAY);
								panelCrearUsuario.setBounds(0, 0, 434, 262);
								frmPanel.getContentPane().add(panelCrearUsuario);
								panelCrearUsuario.setLayout(null);
								panelCrearUsuario.setVisible(false);
								
								JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario");
								lblNombreDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
								lblNombreDeUsuario.setBounds(52, 37, 135, 26);
								panelCrearUsuario.add(lblNombreDeUsuario);
								
								textField = new JTextField();
								textField.setBounds(197, 38, 157, 26);
								panelCrearUsuario.add(textField);
								textField.setColumns(10);
								
								JLabel lblNivelDePrivilegios = new JLabel("Contrase\u00F1a");
								lblNivelDePrivilegios.setFont(new Font("Tahoma", Font.BOLD, 12));
								lblNivelDePrivilegios.setBounds(52, 74, 135, 26);
								panelCrearUsuario.add(lblNivelDePrivilegios);
								
								textField_1 = new JTextField();
								textField_1.setColumns(10);
								textField_1.setBounds(197, 75, 157, 26);
								panelCrearUsuario.add(textField_1);
								
								JLabel lblNivelDeUsuario = new JLabel("Nivel de usuario:");
								lblNivelDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 12));
								lblNivelDeUsuario.setBounds(52, 174, 135, 26);
								panelCrearUsuario.add(lblNivelDeUsuario);
								
								radioButton1 = new JRadioButton("1");
								radioButton1.setBounds(197, 177, 52, 23);
								panelCrearUsuario.add(radioButton1);
								radioButton1.setSelected(true);
								
								radioButton2 = new JRadioButton("2");
								radioButton2.setBounds(300, 177, 52, 23);
								panelCrearUsuario.add(radioButton2);
								
								btnNewButton = new JButton("Guardar");
								btnNewButton.setBounds(160, 228, 89, 23);
								panelCrearUsuario.add(btnNewButton);
								btnNewButton.addActionListener(this);
								
								JLabel lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a");
								lblRepetirContrasea.setFont(new Font("Tahoma", Font.BOLD, 12));
								lblRepetirContrasea.setBounds(52, 110, 135, 26);
								panelCrearUsuario.add(lblRepetirContrasea);
								
								textField_2 = new JTextField();
								textField_2.setColumns(10);
								textField_2.setBounds(195, 111, 157, 26);
								panelCrearUsuario.add(textField_2);
								
								button = new JButton("Volver");
								button.setBounds(335, 228, 89, 23);
								panelCrearUsuario.add(button);
								button.addActionListener(this);
								
								panelBorrarUsuario = new JPanel();
								panelBorrarUsuario.setBackground(Color.LIGHT_GRAY);
								panelBorrarUsuario.setBounds(0, 0, 434, 262);
								frmPanel.getContentPane().add(panelBorrarUsuario);
								panelBorrarUsuario.setLayout(null);
								panelBorrarUsuario.setVisible(false);
								
								JLabel lblVerUsuarios = new JLabel("Ver usuarios");
								lblVerUsuarios.setFont(new Font("Tahoma", Font.BOLD, 12));
								lblVerUsuarios.setBounds(84, 80, 107, 38);
								panelBorrarUsuario.add(lblVerUsuarios);
								
								combo1 = new JComboBox();
								combo1.setBounds(201, 85, 149, 31);
								panelBorrarUsuario.add(combo1);
								
								btnEliminarUsuario_1 = new JButton("Eliminar usuario");
								btnEliminarUsuario_1.setBounds(143, 174, 149, 23);
								panelBorrarUsuario.add(btnEliminarUsuario_1);
								btnEliminarUsuario_1.addActionListener(this);
								
								button_1 = new JButton("Volver");
								button_1.setBounds(335, 228, 89, 23);
								panelBorrarUsuario.add(button_1);
								button_1.addActionListener(this);
						
								
								
								
								
								
								panelOpcion = new JPanel();
								panelOpcion.setBackground(Color.LIGHT_GRAY);
								panelOpcion.setBounds(0, 0, 434, 262);
								frmPanel.getContentPane().add(panelOpcion);
								panelOpcion.setLayout(null);
								
								btnCrearNuevoUsuario = new JButton("Crear nuevo usuario");
								btnCrearNuevoUsuario.setBounds(133, 87, 171, 23);
								panelOpcion.add(btnCrearNuevoUsuario);
								btnCrearNuevoUsuario.addActionListener(this);
								
								btnEliminarUsuario = new JButton("Eliminar usuario");
								btnEliminarUsuario.setBounds(133, 135, 171, 23);
								panelOpcion.add(btnEliminarUsuario);
								btnEliminarUsuario.addActionListener(this);
								
								btnVolver = new JButton("Volver");
								btnVolver.setBounds(335, 228, 89, 23);
								panelOpcion.add(btnVolver);
								btnVolver.addActionListener(this);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCrearNuevoUsuario){
			panelOpcion.setVisible(false);
			panelBorrarUsuario.setVisible(false);
			panelCrearUsuario.setVisible(true);
			
		}else if (e.getSource() == btnEliminarUsuario){
			panelOpcion.setVisible(false);
			panelCrearUsuario.setVisible(false);
			panelBorrarUsuario.setVisible(true);
			
			Consultas consultas = new Consultas();
			consultas.conectar();
			String[][] ficha = consultas.getUsuarios();
			consultas.desconectar();
			int i, j;
			for (i = 0; i < ficha.length; i++) {
				for (j = 0; j < ficha[i].length; j++) {
					
							
						combo1.addItem(ficha[i][0].toString());
							break;
					}	
				}
			
			
			
			
			
			
		}else if (e.getSource() == btnNewButton){
			boolean repetido = false;
			if ((!textField.getText().equals("") && (!textField_1.getText().equals("") && (!textField_2.getText().equals(""))) && (textField_1.getText().equals(textField_2.getText()))) ){
				int n = 0;
				if (radioButton1.isSelected()){
					n = 1;
				}else if (radioButton2.isSelected()){
					n = 2;
				}
				Consultas consultas = new Consultas();
				consultas.conectar();
				String[][] ficha = consultas.getUsuarios();
				for (int i = 0; i < ficha.length; i++){
					if (ficha[i][0].equals(textField.getText())){
						JOptionPane.showMessageDialog(null,"Ya existe un usuario con ese nombre");
						repetido = true;
						limpiar();
						break;
					}
				}
				if (!repetido){
					consultas.insertarUsuario(textField.getText(), textField_1.getText(), n);
					consultas.desconectar();
					JOptionPane.showMessageDialog(null,"Nuevo usuario creado correctamente");
					limpiar();
				}
			}else{
				JOptionPane.showMessageDialog(null,"Debe rellenar todos los campos y las contraseñas deben coincidir");
				limpiar();
			}
		}else if (e.getSource() == btnVolver){
			AdminSalas gogo = new AdminSalas();
			this.dispose();
			frmPanel.setVisible(false);
			
		}else if (e.getSource() == button){
			AdminSalas gogo = new AdminSalas();
			this.dispose();
			frmPanel.setVisible(false);
			
		}else if (e.getSource() == button_1){
			AdminSalas gogo = new AdminSalas();
			this.dispose();
			frmPanel.setVisible(false);
			
		}if (e.getSource() == btnEliminarUsuario_1){
			boolean encontrado = false;
			Consultas consultas = new Consultas();
			consultas.conectar();
			String[][] ficha = consultas.getUsuarios();
			
			for (int i = 0; i < ficha.length; i++){
				if (ficha[i][0].equals(combo1.getSelectedItem()) && (!ficha[i][2].equals("3"))){
					consultas.eliminarUsuario(combo1.getSelectedItem());
					JOptionPane.showMessageDialog(null,"Usuario eliminado correctamente");
					encontrado = true;
					limpiar();
					break;
				}
			}
			if (!encontrado){
				JOptionPane.showMessageDialog(null,"El usuario introducido no existe");
				limpiar();
			}
			consultas.desconectar();
		} 
		
	}
	
	public void limpiar(){
		textField.setText("");
		textField_1.setText("");
		textField_2.setText("");
	}

	
}
