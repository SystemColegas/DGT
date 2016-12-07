package org.IT1_aperturaExpediente.Presentacion;

import javax.swing.JPanel;
import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.IT1_aperturaExpediente.Dominio.GestorRadar;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JPanel {
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblDt;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;
	DefaultTableModel modelo;
	static int n;
	GestorRadar gr= new GestorRadar();
	/**
	 * Create the panel.
	 */
	public Interface() {
		setLayout(new BorderLayout(0, 0));
		{
			panel = new JPanel();
			add(panel, BorderLayout.CENTER);
			panel.setLayout(null);
			{
				panel_1 = new JPanel();
				panel_1.setBounds(12, 126, 426, 162);
				panel.add(panel_1);
				panel_1.setLayout(new BorderLayout(0, 0));
				{
					/*scrollPane = new JScrollPane();
					panel_1.add(scrollPane);
					modelo = (DefaultTableModel) table.getModel();
					String cabecera[]=new String[]{"Localización", "Mátricula", "Velocidad", "V. Máxima", "Multado"};
					modelo.setColumnIdentifiers(cabecera);
					scrollPane.setViewportView(table);
					*/
				}
				
			}
			{
				lblDt = new JLabel("");
				lblDt.setBounds(141, 12, 297, 65);
				lblDt.setIcon(new ImageIcon(Interface.class.getResource("/org/IT1_aperturaExpediente/Presentacion/dgtImagen.png")));
				panel.add(lblDt);
			}
			{
				btnNewButton = new JButton("Capturar Coche");
				btnNewButton.addActionListener(new BtnNewButtonActionListener());
				btnNewButton.setBounds(190, 89, 179, 25);
				panel.add(btnNewButton);
			}
		}

	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			/*Expediente exp;
			 n = n+1;
			modelo.addRow(gr.VehiculoAleatorio());
			if(gr.getRadar().getVeh().getVelocidad()>gr.getRadar().getVeh().getVelocidadMax()){
				exp=new Expediente(gr.getRadar(),n);
				exp.insertarExpediente();
			}
		*/
		}
	}
}
