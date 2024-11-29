package Project_content;

import java.awt.*;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class Master extends JFrame {
	
	static JLabel lblNewLabel_2;
	
	private JPanel contentPane;
	private  String images[] = {"img1.jpg","img2.jpg","img3.jpg","img4.jpg","img5.jpg","img6.jpg","img7.jpg","img8.jpg","img9.jpg"};
	private int i = 0;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Master();
						
					} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	
	public Master() {
		setVisible(true);
		setTitle("Tour-Planner -- Home");
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
		
		JLabel logo = new JLabel("New label");
		logo.setBounds(10, 10, 178, 178);
		logo.setHorizontalAlignment(SwingConstants.CENTER);
		logo.setIcon(new ImageIcon(Master.class.getResource("/resources/logo.jpg")));
		panel.add(logo);
		
		JButton btnNewButton_1 = new JButton("International\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new International();
			}
		});
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
		
		JButton btnNewButton_3 = new JButton("Sign Out\r\n");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(contentPane, "Sure You want to exit?","Confirm",JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION)
				{
					setVisible(false);
					new LoginWin();
				}	
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3.setBounds(922, 10, 137, 36);
		panel_1.add(btnNewButton_3);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome\r\n");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(492, 8, 185, 36);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton_3_1 = new JButton("Home\r\n");
		btnNewButton_3_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_3_1.setBounds(23, 10, 137, 36);
		panel_1.add(btnNewButton_3_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(222, 81, 402, 452);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JTextPane txtpnNoticeWeFollow = new JTextPane();
		txtpnNoticeWeFollow.setText("Notice\r\n\r\n1. We follow all the COVID-19 guidelines laid by the government.\r\n\r\n2. COVID-19 test reports are Mandatory in order to be a part of any trip.\r\n\r\n3. Strict Action will be taken by the organisation if an indivudual violates COVID-19 SOP.\r\n\r\n4. Organisation Will provide 1 Mask and 1 bottle of Pocket Sanitizer per head.");
		txtpnNoticeWeFollow.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtpnNoticeWeFollow.setBounds(10, 10, 382, 432);
		panel_2.add(txtpnNoticeWeFollow);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(665, 81, 589, 396);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setIcon(new ImageIcon(Master.class.getResource("/resources/"+images[i])));
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Next Image");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(i>=images.length-2)
				{
					i = 0;
					lblNewLabel_2.setIcon(new ImageIcon(Master.class.getResource("/resources/"+images[i])));
				}
					
				else
				{
					++i;
					lblNewLabel_2.setIcon(new ImageIcon(thailand.class.getResource("/resources/"+images[i])));
				}	
			}
		});
		btnNewButton.setBounds(873, 487, 188, 46);
		contentPane.add(btnNewButton);
		
	}
}
