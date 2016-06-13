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
import javax.swing.JButton;
import javax.swing.JTextField;

public class Usuario3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JFrame frmPanel;

	public Usuario3(){
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
		frmPanel.setTitle("Taquilla");
		frmPanel.setBounds(100, 100, 450, 300);
		frmPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPanel.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 434, 261);
		frmPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblSeleccionarPelcula = new JLabel("Seleccionar pel\u00EDcula");
		lblSeleccionarPelcula.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeleccionarPelcula.setBounds(10, 11, 127, 14);
		panel.add(lblSeleccionarPelcula);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(147, 9, 228, 20);
		panel.add(comboBox);
		
		JButton btnIr = new JButton("Ir");
		btnIr.setBounds(385, 8, 41, 23);
		panel.add(btnIr);
		
		JLabel lblSeleccionarSala = new JLabel("Seleccionar sala");
		lblSeleccionarSala.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeleccionarSala.setBounds(10, 42, 127, 14);
		panel.add(lblSeleccionarSala);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(147, 40, 228, 20);
		panel.add(comboBox_1);
		
		JLabel lblSeleccionarHorario = new JLabel("Seleccionar horario");
		lblSeleccionarHorario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeleccionarHorario.setBounds(10, 73, 127, 14);
		panel.add(lblSeleccionarHorario);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(147, 71, 228, 20);
		panel.add(comboBox_2);
		
		JButton button = new JButton("Ir");
		button.setBounds(385, 70, 41, 23);
		panel.add(button);
		
		JButton btnSeleccionarAsientos = new JButton("Seleccionar asientos");
		btnSeleccionarAsientos.setBounds(118, 108, 216, 23);
		panel.add(btnSeleccionarAsientos);
		
		JLabel lblPrecioEntrada = new JLabel("Precio entrada(s):");
		lblPrecioEntrada.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrecioEntrada.setBounds(53, 152, 127, 14);
		panel.add(lblPrecioEntrada);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(206, 150, 169, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblAplicarDescuento = new JLabel("Aplicar descuento");
		lblAplicarDescuento.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAplicarDescuento.setBounds(10, 213, 127, 14);
		panel.add(lblAplicarDescuento);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(147, 211, 228, 20);
		panel.add(comboBox_3);
		
		JButton button_1 = new JButton("Ir");
		button_1.setBounds(385, 210, 41, 23);
		panel.add(button_1);
		
		this.setVisible(true);
	}

}
