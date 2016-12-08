package org.ControlSancion.Presentacion;


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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

public class Interface3 extends JPanel {
	private JPanel panel;
	private JButton btnSancionar;
	private JScrollBar scrollBar;
	private JPanel panel_1;
	private JList list;

	/**
	 * Create the panel.
	 */
	public Interface3() {
		setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 218, 450, 82);
		add(panel);
		panel.setLayout(null);
		
		btnSancionar = new JButton("Pagar Sancion ");
		btnSancionar.setBounds(99, 12, 267, 25);
		panel.add(btnSancionar);
		btnSancionar.addActionListener(new BtnSancionarActionListener());
		
		panel_1 = new JPanel();
		panel_1.setBounds(0, 12, 450, 205);
		add(panel_1);
		panel_1.setLayout(null);
		
		scrollBar = new JScrollBar();
		scrollBar.setBounds(0, 0, 17, 202);
		panel_1.add(scrollBar);
		{
			list = new JList();
			list.setBounds(0, 0, 450, 201);
			panel_1.add(list);
		}

	}

	private class BtnSancionarActionListener implements ActionListener {
		public void actionPerformed(ActionEvent arg0) {
		}
	}
}
