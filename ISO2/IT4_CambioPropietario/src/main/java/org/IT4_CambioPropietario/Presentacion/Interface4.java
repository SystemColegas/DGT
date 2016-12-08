package org.IT4_CambioPropietario.Presentacion;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.AbstractListModel;

public class Interface4 extends JPanel {
	private JPanel panel;
	private JLabel lblDniConductor;
	private JTextField textField;
	private JButton btnSancionar;
	private JScrollPane scrollPane;
	private JScrollBar scrollBar;
	private JList list;

	/**
	 * Create the panel.
	 */
	public Interface4() {
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 215, 450, 85);
		add(panel);
		panel.setLayout(null);
		
		lblDniConductor = new JLabel("DNI Propietario Nuevo");
		lblDniConductor.setBounds(24, 35, 156, 15);
		panel.add(lblDniConductor);
		
		textField = new JTextField();
		textField.setBounds(203, 33, 114, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		btnSancionar = new JButton("Cambiar");
		btnSancionar.setBounds(346, 30, 92, 25);
		panel.add(btnSancionar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 450, 217);
		add(scrollPane);
		
		scrollBar = new JScrollBar();
		scrollPane.setRowHeaderView(scrollBar);
		
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
		scrollPane.setViewportView(list);

	}

}