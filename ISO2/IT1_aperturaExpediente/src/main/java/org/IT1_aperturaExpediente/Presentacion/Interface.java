package org.IT1_aperturaExpediente.Presentacion;

import javax.swing.JPanel;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

import org.IT1_aperturaExpediente.Dominio.*;

import javax.swing.AbstractListModel;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import javax.swing.JScrollBar;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;

import java.awt.Graphics;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class Interface extends JPanel {

	protected static final Graphics g = null;
	private JFrame frame;
	private JButton btnIniciar;
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTable table;
	private JLabel lblNewLabel;
	private DefaultTableModel modelo;
	GestorRadar gr= new GestorRadar();
	static int n=0;
	/**
	 * Create the panel.
	 */
	public Interface() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 579, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(10, 165, 543, 171);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		scrollPane = new JScrollPane();
		panel.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
	
		modelo=(DefaultTableModel) table.getModel();
		String cabecera[]=new String[]{"Localización", "Mátricula", "Velocidad", "V. Máxima", "Multado"};

		modelo.setColumnIdentifiers(cabecera);
		scrollPane.setViewportView(table);
		{
			
			btnIniciar = new JButton("Capturar Coche");
			btnIniciar.setBounds(230, 114, 144, 25);
			frame.getContentPane().add(btnIniciar);
			
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Interface.class.getResource("/org/IT1_aperturaExpediente/Presentacion/dgtImagen.png")));
			lblNewLabel.setBounds(167, 12, 318, 80);
			frame.getContentPane().add(lblNewLabel);
			
			btnIniciar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {  //Se inician todos los radares
					Expediente exp;
					n=n+1;
					modelo.addRow(gr.VehiculoAleatorio());
					if(gr.getRadar().getVeh().getVelocidad()>gr.getRadar().getVeh().getVelocidadMax()){
						exp=new Expediente(gr.getRadar(),n);
						exp.insertarExpediente();
					}
				}

			});
			
		}
	}
}
