package app;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;

public class Usuario2 extends JFrame implements ActionListener{

	private JFrame frmPanel;
	private JPanel contentPane;
	private JButton btnAsignarSalas,btnAsignarPrecios,btnAsignarHorarios;

	public Usuario2(){
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
		frmPanel.setTitle("Gestor");
		frmPanel.setBounds(100, 100, 450, 300);
		frmPanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPanel.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 434, 261);
		frmPanel.add(panel);
		panel.setLayout(null);
		
		btnAsignarSalas = new JButton("Asignar Salas");
		btnAsignarSalas.setBounds(141, 53, 143, 23);
		panel.add(btnAsignarSalas);
		btnAsignarSalas.addActionListener(this);
		
		btnAsignarPrecios = new JButton("Asignar Precios");
		btnAsignarPrecios.setBounds(141, 118, 143, 23);
		panel.add(btnAsignarPrecios);
		btnAsignarPrecios.addActionListener(this);
		
		btnAsignarHorarios = new JButton("Asignar Horarios");
		btnAsignarHorarios.setBounds(141, 182, 143, 23);
		panel.add(btnAsignarHorarios);
		btnAsignarHorarios.addActionListener(this);
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAsignarSalas){
			AsignarSalas gogo = new AsignarSalas();
			this.dispose();
			
		}else if(e.getSource() == btnAsignarPrecios){
			AsignarPrecios gogo = new AsignarPrecios();
			
		}else if(e.getSource() == btnAsignarHorarios){
			AsignarHorarios gogo = new AsignarHorarios();
			
		}
		
	}
}
