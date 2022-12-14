package Vista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaEnvios {

	private JFrame frame;
	private JTextField txtorigen;
	private JTextField txtdestino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaEnvios window = new VentanaEnvios();
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
	public VentanaEnvios() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ciudad Origen:");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 24, 96, 14);
		frame.getContentPane().add(lblNewLabel);
		
		ButtonGroup origen = new ButtonGroup();
		ButtonGroup destino = new ButtonGroup();
		
		txtorigen = new JTextField();
		txtorigen.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		txtorigen.setBounds(116, 22, 86, 20);
		frame.getContentPane().add(txtorigen);
		txtorigen.setColumns(10);
		
		JRadioButton rdbtn1 = new JRadioButton("Nacional");
		rdbtn1.setSelected(true);
		
	
		rdbtn1.setBounds(75, 45, 109, 23);
		frame.getContentPane().add(rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("Extranjero");
		rdbtn2.setBounds(188, 45, 109, 23);
		frame.getContentPane().add(rdbtn2);
		
		JLabel lblNewLabel_1 = new JLabel("Ciudad Destino");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_1.setBounds(10, 75, 96, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtdestino = new JTextField();
		txtdestino.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		txtdestino.setBounds(116, 75, 86, 20);
		frame.getContentPane().add(txtdestino);
		txtdestino.setColumns(10);
		
		JRadioButton rdbtn3 = new JRadioButton("Nacional");
		rdbtn3.setSelected(true);
		rdbtn3.setBounds(75, 102, 109, 23);
		frame.getContentPane().add(rdbtn3);
		
		JRadioButton rdbtn4 = new JRadioButton("Extranjero");
		rdbtn4.setBounds(188, 102, 109, 23);
		frame.getContentPane().add(rdbtn4);
		
		origen.add(rdbtn1);
		origen.add(rdbtn2);
		
		destino.add(rdbtn3);
		destino.add(rdbtn4);
		
		
		JLabel lblNewLabel_2 = new JLabel("Tipo de envío:");
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_2.setBounds(10, 142, 96, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Paquete 10 - Antes de las 10h", "Paquete 24 - Al día siguiente"}));
		comboBox.setBounds(116, 139, 118, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Peso:");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_3.setBounds(10, 182, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		spinner.setBounds(76, 180, 40, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel_4 = new JLabel("Kg");
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(126, 182, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btn1 = new JButton("Calcular Precio");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if ((txtorigen.getText().isEmpty()) || (txtdestino.getText().isEmpty())) 
				{
					JOptionPane.showMessageDialog(null, "Origen y/o destino vacíos",
							"Calcula envío", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		btn1.setBounds(145, 227, 136, 23);
		frame.getContentPane().add(btn1);
		
		
	}
}
