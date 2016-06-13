package app;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AsignarPrecios extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JFrame frmPanel;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsignarPrecios frame = new AsignarPrecios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	
	public AsignarPrecios(){
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
		frmPanel.setTitle("Asignar Precios");
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
		lblSeleccionarPelcula.setBounds(42, 33, 134, 14);
		panel.add(lblSeleccionarPelcula);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(186, 31, 217, 20);
		panel.add(comboBox);
		
		JLabel lblProductora = new JLabel("Productora");
		lblProductora.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblProductora.setBounds(44, 79, 88, 14);
		panel.add(lblProductora);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(186, 77, 217, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblVisualizacin = new JLabel("Visualizaci\u00F3n");
		lblVisualizacin.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblVisualizacin.setBounds(42, 122, 88, 14);
		panel.add(lblVisualizacin);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(186, 120, 217, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAsignarPrecio = new JLabel("Asignar precio");
		lblAsignarPrecio.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAsignarPrecio.setBounds(42, 169, 88, 14);
		panel.add(lblAsignarPrecio);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(186, 167, 217, 20);
		panel.add(textField_2);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.setBounds(171, 214, 89, 23);
		panel.add(btnNewButton);
		
		JButton button = new JButton("Volver");
		button.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button.setBounds(345, 236, 79, 14);
		panel.add(button);
	}
}
