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

import org.IT1_aperturaExpediente.Dominio.Expediente;
import org.IT1_aperturaExpediente.Dominio.GestorRadar;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JPanel {
	private JPanel panel;
	private JPanel panel_1;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;
	DefaultTableModel modelo;
	static int n;
	GestorRadar gr= new GestorRadar();
	private JScrollPane scrollPane_1;
	private JTable table_1;
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
				panel_1.setBounds(12, 83, 426, 205);
				panel.add(panel_1);
				panel_1.setLayout(null);
				{
					scrollPane_1 = new JScrollPane();
					scrollPane_1.setBounds(0, 0, 426, 205);
					panel_1.add(scrollPane_1);
					{
						table_1 = new JTable();
						
						modelo=new DefaultTableModel(0,0);
						String cabecera[]=new String[]{"Localización", "Mátricula", "Velocidad", "V. Máxima", "Multado"};
						modelo.setColumnIdentifiers(cabecera);
						scrollPane_1.setViewportView(table_1);
					}
				}
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
				btnNewButton = new JButton("Capturar Coche");
				btnNewButton.addActionListener(new BtnNewButtonActionListener());
				btnNewButton.setBounds(140, 34, 179, 25);
				panel.add(btnNewButton);
			}
		}

	}
	private class BtnNewButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			Expediente exp;
			 n = n+1;
			modelo.addRow(gr.VehiculoAleatorio());
			System.out.println("Hola!");
			if(gr.getRadar().getVeh().getVelocidad()>gr.getRadar().getVeh().getVelocidadMax()){
				exp=new Expediente(gr.getRadar(),n);
				exp.insertarExpediente();
			}
		
		}
	}
}
