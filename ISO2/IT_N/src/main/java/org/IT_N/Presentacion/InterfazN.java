package org.IT_N.Presentacion;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import org.ControlSancion.Presentacion.*;
import org.IT1_aperturaExpediente.Presentacion.Interface;

import org.IT2_sancionConductor.Presentacion.Interface_2;
import org.IT4_CambioPropietario.Presentacion.Interface4;

import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class InterfazN {

	private JFrame frame;
	private JPanel panel;
	private JTabbedPane tabbedPane;
	private JPanel panel_2;
	private JPanel panel_3;
	private JLabel label;
	private JPanel panel_1;
	private JPanel panel_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazN window = new InterfazN();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 490, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		{
			panel = new JPanel();
			panel.setBounds(0, 0, 763, 97);
			frame.getContentPane().add(panel);
			panel.setLayout(null);
			{
				label = new JLabel("");
				label.setIcon(new ImageIcon(InterfazN.class.getResource("/org/IT1_aperturaExpediente/Presentacion/dgtImagen.png")));
				label.setBounds(86, 12, 279, 64);
				panel.add(label);
			}
		}
		{
			tabbedPane = new JTabbedPane(JTabbedPane.TOP);
			tabbedPane.setBounds(0, 97, 763, 375);
			frame.getContentPane().add(tabbedPane);
			{
				panel_3 = new JPanel();
				tabbedPane.addTab("RADAR", null, panel_3, null);
				panel_3.setLayout(null);
				Interface inter=new Interface();
				inter.setBounds(0,0,471,322);
				panel_3.add(inter);
			}
			{
				panel_2 = new JPanel();
				tabbedPane.addTab("SANCIÓN", null, panel_2, null);
				panel_2.setLayout(null);
				Interface_2 in=new Interface_2();
				in.setBounds(0, 0, 471, 322);
				panel_2.add(in);
			}
			{
				panel_1 = new JPanel();
				tabbedPane.addTab("PAGAR SANCION", null, panel_1, null);
				panel_1.setLayout(null);
				Interface3 in3=new Interface3();
				in3.setBounds(0, 0, 471, 322);
				panel_1.add(in3);
			}
			
			panel_4 = new JPanel();
			tabbedPane.addTab("CAMBIAR PROPIETARIO", null, panel_4, null);
			panel_4.setLayout(null);
			Interface4 in4=new Interface4();
			in4.setBounds(0, 0, 471, 322);
			panel_4.add(in4);
		}
	}
}
