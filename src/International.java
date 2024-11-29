package Project_content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.ImageIcon;

public class International extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					International frame = new International();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public International() {
		setTitle("Tour-Planner -- International-Packages");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1293, 594);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 153));
		panel.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(0, 0, 198, 563);
		contentPane.add(panel);
		panel.setLayout(null);
		
		ImageIcon icon = new ImageIcon("E:\\java_lab\\Project images\\logo.jpg");
		
		JLabel logo = new JLabel("New label");
		logo.setBounds(10, 10, 178, 178);
		panel.add(logo);
		
		Image img_icon = icon.getImage();
		Image imgscale = img_icon.getScaledInstance(logo.getWidth(),logo.getHeight(),Image.SCALE_SMOOTH);
		ImageIcon scaled_icon = new ImageIcon(imgscale);
		logo.setIcon(scaled_icon);
		
		JButton btnNewButton_1 = new JButton("International\r\n");
		btnNewButton_1.setBounds(10, 345, 178, 36);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Popular\r\n");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Popular();
			}
		});
		btnNewButton_2.setBounds(10, 281, 178, 36);
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("    Navigate\r\n\r\n\r\n");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel.setBounds(10, 223, 178, 36);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1_1 = new JButton("Domestic");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Domestic();
			}
		});
		btnNewButton_1_1.setBounds(10, 409, 178, 36);
		panel.add(btnNewButton_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 51, 153));
		panel_1.setBounds(196, 0, 1083, 59);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("Sign-Out");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(922, 10, 137, 36);
		panel_1.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("International Packages\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(417, 8, 206, 36);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_3_1 = new JButton("Home");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new Master();
			}
		});
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_1.setBounds(23, 10, 137, 36);
		panel_1.add(btnNewButton_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setLayout(null);
		panel_2.setBounds(248, 114, 437, 143);
		contentPane.add(panel_2);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(10, 10, 194, 123);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(International.class.getResource("/resources/dubai_logo.jpg")));
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dubai");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_3.setBounds(275, 21, 132, 45);
		panel_2.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Explore");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new dubai();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(261, 98, 107, 21);
		panel_2.add(btnNewButton);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2_1.setLayout(null);
		panel_2_1.setBounds(797, 114, 437, 143);
		contentPane.add(panel_2_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setBounds(10, 10, 191, 123);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setIcon(new ImageIcon(International.class.getResource("/resources/singapore_logo.jpg")));
		panel_2_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Singapore");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_3_1.setBounds(255, 22, 132, 45);
		panel_2_1.add(lblNewLabel_3_1);
		
		JButton btnNewButton_4 = new JButton("Explore");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new singapore();
			}
		});
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_4.setBounds(261, 98, 107, 21);
		panel_2_1.add(btnNewButton_4);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setLayout(null);
		panel_2_2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2_2.setBounds(248, 321, 437, 143);
		contentPane.add(panel_2_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setBounds(10, 10, 195, 123);
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setIcon(new ImageIcon(International.class.getResource("/resources/malasiya_logo.jpg")));
		panel_2_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("Malaysia");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_3_2.setBounds(261, 21, 132, 45);
		panel_2_2.add(lblNewLabel_3_2);
		
		JButton btnNewButton_5 = new JButton("Explore");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new malaysia();
			}
		});
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_5.setBounds(261, 98, 107, 21);
		panel_2_2.add(btnNewButton_5);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setLayout(null);
		panel_2_3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2_3.setBounds(797, 321, 437, 143);
		contentPane.add(panel_2_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("");
		lblNewLabel_2_3.setBounds(10, 10, 197, 123);
		lblNewLabel_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_3.setIcon(new ImageIcon(International.class.getResource("/resources/thailand_logo.jpg")));
		panel_2_3.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Thailand");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel_3_3.setBounds(261, 21, 132, 45);
		panel_2_3.add(lblNewLabel_3_3);
		
		JButton btnNewButton_6 = new JButton("Explore");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new thailand();
			}
		});
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_6.setBounds(261, 98, 107, 21);
		panel_2_3.add(btnNewButton_6);
	}
}
