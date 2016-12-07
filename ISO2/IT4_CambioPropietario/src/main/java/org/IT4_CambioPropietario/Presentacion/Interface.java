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

public class Interface extends JPanel {
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
	public Interface() {
		setLayout(new BorderLayout(0, 0));
		
		panel = new JPanel();
		add(panel, BorderLayout.SOUTH);
		
		lblDniConductor = new JLabel("DNI Propietario Nuevo");
		panel.add(lblDniConductor);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		btnSancionar = new JButton("Cambiar");
		panel.add(btnSancionar);
		
		scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);
		
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