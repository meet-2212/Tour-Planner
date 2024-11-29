package Project_content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;


public class dubai extends JFrame {

	private JPanel contentPane;
	private String images[] = {"dubai1.jpeg","dubai2.jpg","dubai3.jfif","dubai.jpg","dubai5.jpg"};
	private int i = 0;
	private JTextField textField;
	private JTextField txtdnIncTravel;
	private JTextField txtAirport;
	private JTextField txtAirport_1;
	public static String selected;
	public final float price = 51000f;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dubai frame = new dubai();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public dubai() {
		setVisible(true);
		setTitle("Tour-Planner -- Dubai"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1294, 594);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 153));
		panel.setBounds(0, 0, 1280, 58);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new International();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 10, 102, 38);
		panel.add(btnNewButton);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Master();
			}
		});
		btnHome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnHome.setBounds(1168, 10, 102, 38);
		panel.add(btnHome);
		
		JLabel lblNewLabel = new JLabel("Dubai");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(557, 10, 217, 38);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(10, 111, 752, 415);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(10, 69, 404, 336);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Description\r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(155, 10, 92, 19);
		panel_4.add(lblNewLabel_2);
		
		JTextArea txtrTheNextDay = new JTextArea();
		txtrTheNextDay.setEditable(false);
		txtrTheNextDay.setText("Places You Visit\r\n\r\n1.Dubai (3D,2N)\r\n2.Abu-Dhabi(3D,2N)\r\n\r\nNote: \r\n\r\n1. Fees For Visiting any Place not Incuded in the package will have to be \r\npaid by the guest.\r\n2. The Organisation is not responsible for belongings lost by an individual \r\nduring visit or sighseeing a place.\r\n3. Carry Prescribed medicines if an individual has any disease or is \r\nunder medication.\r\n4. Misconduct or intolerable behaviour exercised by any individual during \r\nthe trip will lead to exclusion.\r\n  ");
		txtrTheNextDay.setBounds(10, 60, 384, 266);
		panel_4.add(txtrTheNextDay);
		
		JPanel panel_4_1 = new JPanel();
		panel_4_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4_1.setBackground(Color.WHITE);
		panel_4_1.setBounds(424, 69, 318, 336);
		panel_1.add(panel_4_1);
		panel_4_1.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("About");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(140, 10, 54, 19);
		panel_4_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Trip Date\r\n");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(10, 58, 79, 26);
		panel_4_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Trip Duration");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(10, 104, 106, 27);
		panel_4_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Trip Starts\r\n");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_2.setBounds(10, 151, 79, 27);
		panel_4_1.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Trip Ends");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_2_1.setBounds(10, 196, 79, 26);
		panel_4_1.add(lblNewLabel_3_2_1);
		
		JButton btnNewButton_1 = new JButton("Book Now @51,000/ per head");
		btnNewButton_1.setActionCommand("Dubai");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected = btnNewButton_1.getActionCommand();
				new book_now(selected,price);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnNewButton_1.setBounds(10, 268, 298, 40);
		panel_4_1.add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setText("01/05/21\r\n");
		textField.setFont(new Font("Arial Black", Font.PLAIN, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(151, 58, 136, 26);
		panel_4_1.add(textField);
		
		txtdnIncTravel = new JTextField();
		txtdnIncTravel.setText("8D,7N inc. Travel\r\n");
		txtdnIncTravel.setFont(new Font("Arial Black", Font.PLAIN, 13));
		txtdnIncTravel.setEditable(false);
		txtdnIncTravel.setColumns(10);
		txtdnIncTravel.setBounds(151, 104, 136, 26);
		panel_4_1.add(txtdnIncTravel);
		
		txtAirport = new JTextField();
		txtAirport.setToolTipText("");
		txtAirport.setText("01/05/21 Airport");
		txtAirport.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtAirport.setEditable(false);
		txtAirport.setColumns(10);
		txtAirport.setBounds(151, 151, 136, 26);
		panel_4_1.add(txtAirport);
		
		txtAirport_1 = new JTextField();
		txtAirport_1.setText("08/05/21 Airport\r\n");
		txtAirport_1.setFont(new Font("Arial Black", Font.PLAIN, 12));
		txtAirport_1.setEditable(false);
		txtAirport_1.setColumns(10);
		txtAirport_1.setBounds(151, 196, 136, 26);
		panel_4_1.add(txtAirport_1);
		
		
		JLabel lblPackageInformation = new JLabel("Package Information");
		lblPackageInformation.setForeground(Color.BLACK);
		lblPackageInformation.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblPackageInformation.setBackground(SystemColor.menu);
		lblPackageInformation.setBounds(303, 10, 228, 38);
		panel_1.add(lblPackageInformation);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(783, 111, 487, 415);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblImageGallery = new JLabel("Image Gallery");
		lblImageGallery.setBackground(new Color(240, 240, 240));
		lblImageGallery.setForeground(new Color(0, 0, 0));
		lblImageGallery.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblImageGallery.setBounds(164, 10, 156, 38);
		panel_2.add(lblImageGallery);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 57, 467, 358);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 0, 467, 317);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(dubai.class.getResource("/resources/"+images[i])));
		panel_3.add(lblNewLabel_1);
	
		JButton btnNewButton_1_1 = new JButton("Next");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i>=images.length-1)
				{
					i = 0;
					lblNewLabel_1.setIcon(new ImageIcon(dubai.class.getResource("/resources/"+images[i])));
				}
				else
				{
					++i;
					lblNewLabel_1.setIcon(new ImageIcon(dubai.class.getResource("/resources/"+images[i])));
				}
			}
		});
		btnNewButton_1_1.setBounds(348, 327, 85, 21);
		panel_3.add(btnNewButton_1_1);
	}

}
