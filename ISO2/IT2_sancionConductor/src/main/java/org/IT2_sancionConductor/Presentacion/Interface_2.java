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
import java.awt.Dimension;

public class Interface_2 extends JPanel {
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
	public Interface_2() {
		modelo= new DefaultListModel<Integer>();
		setLayout(null);
		panel = new JPanel();
		panel.setBounds(0, 216, 450, 84);
		
		add(panel);
		panel.setLayout(null);
		
		lblDniConductor = new JLabel("DNI Conductor: ");
		lblDniConductor.setBounds(40, 32, 122, 20);
		panel.add(lblDniConductor);
		
		textField = new JTextField();
		textField.setBounds(168, 30, 114, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		btnSancionar = new JButton("Sancionar");
		btnSancionar.setBounds(308, 27, 105, 25);
		btnSancionar.addActionListener(new BtnSancionarActionListener());
		panel.add(btnSancionar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 450, 216);
		add(scrollPane);
		
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
		panel.setMinimumSize(new Dimension(10, 15));
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