package app;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class AsignarHorarios extends JFrame {

	private JPanel contentPane;
	private JFrame frmPanel;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AsignarHorarios frame = new AsignarHorarios();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	
	public AsignarHorarios(){
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
		frmPanel.setTitle("Asignar Horarios");
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
		lblSeleccionarPelcula.setBounds(46, 47, 143, 14);
		panel.add(lblSeleccionarPelcula);
		
		JLabel label = new JLabel("Seleccionar pel\u00EDcula");
		label.setFont(new Font("Tahoma", Font.BOLD, 12));
		label.setBounds(46, 103, 143, 14);
		panel.add(label);
		
		JLabel lblSeleccionarHorario = new JLabel("Seleccionar horario");
		lblSeleccionarHorario.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSeleccionarHorario.setBounds(46, 165, 143, 14);
		panel.add(lblSeleccionarHorario);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAadir.setBounds(176, 216, 89, 23);
		panel.add(btnAadir);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(215, 45, 209, 20);
		panel.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(215, 101, 209, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(215, 159, 209, 20);
		panel.add(comboBox_2);
		
		JButton button = new JButton("Volver");
		button.setFont(new Font("Tahoma", Font.PLAIN, 9));
		button.setBounds(345, 236, 79, 14);
		panel.add(button);
	}

}
