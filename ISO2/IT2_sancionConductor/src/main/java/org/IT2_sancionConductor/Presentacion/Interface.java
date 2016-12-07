package org.IT2_sancionConductor.Presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;

import org.IT1_aperturaExpediente.Dominio.Expediente;
import org.IT2_sancionConductor.Dominio.GestorSancion;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface extends JPanel {
	private JPanel panel;
	private JLabel lblDniConductor;
	private JTextField textField;
	private JButton btnSancionar;
	private JScrollPane scrollPane;
	private JScrollBar scrollBar;
	private DefaultListModel<Integer> modelo;
	private JList list;
	private GestorSancion g;
	/**
	 * Create the panel.
	 */
	public Interface() {
		setLayout(new BorderLayout(0, 0));
		modelo= new DefaultListModel<Integer>();
		panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		lblDniConductor = new JLabel("DNI Conductor: ");
		panel.add(lblDniConductor);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		btnSancionar = new JButton("Sancionar");
		btnSancionar.addActionListener(new BtnSancionarActionListener());
		panel.add(btnSancionar);
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
		scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		g=new GestorSancion();
		g.leerExpedientes();
		list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		try{
			g=new GestorSancion();
			g.leerExpedientes();
			Expediente[]exp;
			exp=g.getExp();
				if(exp.length!=0){
					for(int i=0;i<exp.length;i++){
						modelo.addElement(exp[i].getRadar().getVeh().getMatricula());
						System.out.println(exp[i].getRadar().getVeh().getMatricula());
					}
						list.updateUI();
				}
		}catch(Exception e){
		
		}
		scrollPane.setViewportView(list);

	}

	private class BtnSancionarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
			
		}
	}
}