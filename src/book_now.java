package Project_content;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.math.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.sql.*;
public class book_now extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	public static String selected;
	public static float price;
	private float total;
	private double gtotal;
	private int n_mem;
	private String full_uname;
	
	private JTextField textField_3;
	private JTextField textField_4;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new book_now(selected,price);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public book_now(String selected,float price) {
		
		this.selected = selected;
		this.price = price;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setTitle("Tour-Planner -- Book Now");
		setVisible(true);
		setBounds(250, 100, 1013, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 153));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 999, 56);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Back ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(23, 10, 105, 34);
		panel.add(btnNewButton);
		
		JButton btnhome = new JButton("Home");
		btnhome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Master();
			}
		});
		btnhome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnhome.setBounds(870, 10, 105, 34);
		panel.add(btnhome);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(10, 94, 456, 467);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Package Selected");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(26, 78, 111, 33);
		panel_1.add(lblNewLabel);
		
		JLabel lblTotalPeople = new JLabel("No. of members");
		lblTotalPeople.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotalPeople.setBounds(26, 151, 111, 33);
		panel_1.add(lblTotalPeople);
		
		textField = new JTextField(selected);
		textField.setBackground(new Color(255, 255, 255));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setEditable(false);
		textField.setBounds(221, 78, 166, 33);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(221, 153, 166, 33);
		panel_1.add(textField_1);
		
		JLabel lblTotalAmount = new JLabel("Total Amount");
		lblTotalAmount.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotalAmount.setBounds(26, 223, 111, 33);
		panel_1.add(lblTotalAmount);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBackground(Color.WHITE);
		textField_3.setBounds(221, 225, 166, 33);
		panel_1.add(textField_3);
		
		JLabel lblAmountToBe = new JLabel("Amount to be paid(inc. taxes)");
		lblAmountToBe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAmountToBe.setBounds(26, 298, 195, 33);
		panel_1.add(lblAmountToBe);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(221, 300, 166, 33);
		panel_1.add(textField_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(new Color(255, 51, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(41, 357, 368, 33);
		panel_1.add(lblNewLabel_1);
		
		
		JLabel lblNewLabel_2 = new JLabel("Booking Information");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(132, 10, 195, 33);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(498, 94, 491, 260);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Booking Summary\r\n");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(163, 10, 173, 33);
		panel_2.add(lblNewLabel_2_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(31, 53, 434, 182);
		panel_2.add(panel_4);
		
		JLabel lblNewLabel_3 = new JLabel();
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(10, 30, 218, 25);
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel();
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_1.setBounds(10, 76, 182, 25);
		panel_4.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel();
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_2.setBounds(10, 125, 152, 25);
		panel_4.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel();
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_3.setBounds(10, 177, 256, 25);
		panel_4.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel();
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3_4.setBounds(258, 30, 152, 25);
		panel_4.add(lblNewLabel_3_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBounds(498, 364, 491, 197);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Confirmation Code");
		lblNewLabel_2_1_1.setBounds(161, 10, 173, 33);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_3.add(lblNewLabel_2_1_1);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBounds(43, 53, 403, 50);
		panel_3.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblNewLabel_3_5 = new JLabel();
		lblNewLabel_3_5.setBounds(201, 5, 0, 0);
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4_1.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_1_1 = new JLabel();
		lblNewLabel_3_1_1.setBounds(206, 5, 0, 0);
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4_1.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel();
		lblNewLabel_3_2_1.setBounds(211, 5, 0, 0);
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4_1.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel();
		lblNewLabel_3_3_1.setBounds(216, 5, 0, 0);
		lblNewLabel_3_3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4_1.add(lblNewLabel_3_3_1);
		
		JLabel lblNewLabel_3_4_1 = new JLabel();
		lblNewLabel_3_4_1.setBounds(221, 5, 0, 0);
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_4_1.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_4 = new JLabel();
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(10, 10, 383, 30);
		panel_4_1.add(lblNewLabel_4);
		
		JTextArea txtrNote = new JTextArea();
		txtrNote.setForeground(Color.RED);
		txtrNote.setFont(new Font("Arial", Font.PLAIN, 14));
		txtrNote.setText("Note:\r\nCall us on our toll free number +180012345\r\nShare the code generated above with our staff for confirmation.\r\n");
		txtrNote.setEditable(false);
		txtrNote.setBounds(43, 119, 403, 57);
		panel_3.add(txtrNote);
		
		JButton btnNewButton_1_1 = new JButton("Calculate Price");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				n_mem = Integer.parseInt(textField_1.getText());
				total = price*(float)n_mem;
				gtotal = (total*0.18) + total;
				
				
				textField_3.setText(Float.toString(total));
				textField_4.setText(Double.toString(gtotal));
				
				lblNewLabel_3.setText("Package Selected :"+selected);
				lblNewLabel_3_1.setText("Number of Members :\r\n"+n_mem);
				lblNewLabel_3_2.setText("Total Amount : "+total);
				lblNewLabel_3_3.setText("Amout to be Paid(inc. taxes) :"+gtotal);
				lblNewLabel_3_4.setText("Booked By :");
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1_1.setBounds(240, 400, 169, 44);
		panel_1.add(btnNewButton_1_1);
		
		
		JButton btnNewButton_1 = new JButton("Confirm Booking");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField_1.getText().isEmpty())
				{
					lblNewLabel_1.setText("Warnig: Please Select number of member for trip.");
				}
				else
				{	
					n_mem = Integer.parseInt(textField_1.getText());
					total = price*(float)n_mem;
					gtotal = (total*0.18) + total;
					
					
					textField_3.setText(Float.toString(total));
					textField_4.setText(Double.toString(gtotal));
					
					//display summary
					lblNewLabel_3.setText("Package Selected :"+selected);
					
					lblNewLabel_3_1.setText("\n\rNumber of Members :"+n_mem);
					lblNewLabel_3_2.setText("\n\rTotal Amount : "+total);
					lblNewLabel_3_3.setText("\n\rAmout to be Paid(inc. taxes) :"+gtotal);
					
					String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789";
					StringBuilder sb = new StringBuilder(8);
					  
				    for (int i = 0; i < 8; i++) 
				    {
				    	int index = (int)(AlphaNumericString.length() * Math.random());
			            // add Character one by one in end of sb
				        sb.append(AlphaNumericString .charAt(index)); 
				     }
				     
				    lblNewLabel_4.setText(sb.toString()); 
				}
			}
		});
		btnNewButton_1.setBounds(41, 400, 169, 44);
		panel_1.add(btnNewButton_1);
	}
}
