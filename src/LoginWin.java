package Project_content;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;
import java.awt.AWTException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.awt.Cursor;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginWin extends JFrame {
	
	private JPanel contentPane;
	private JTextField txtUsername;
	private JPasswordField txtPassword;
	public static String full_uname;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new LoginWin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginWin() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(280, 100, 848, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea Signup = new JTextArea();
		Signup.setEditable(false);
		Signup.setForeground(new Color(255, 255, 255));
		Signup.setText("Sign-up & plan your\r\n     trip today !\r\n");
		Signup.setFont(new Font("MV Boli", Font.BOLD, 25));
		Signup.setBackground(new Color(255, 165, 0));
		Signup.setBounds(42, 251, 257, 93);
		contentPane.add(Signup);
		
		JLabel message = new JLabel("Welcome!");
		message.setBounds(52, 44, 225, 49);
		message.setVerticalAlignment(SwingConstants.TOP);
		message.setBackground(new Color(255, 250, 250));
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setFont(new Font("Verdana", Font.BOLD, 39));
		message.setForeground(new Color(255, 255, 255));
		contentPane.add(message);
		
		JTextArea submessage = new JTextArea();
		submessage.setEditable(false);
		submessage.setBounds(20, 103, 301, 138);
		submessage.setFont(new Font("Verdana", Font.ITALIC, 16));
		submessage.setBackground(new Color(255, 165, 0));
		submessage.setText("Your adventurous & fun-filled travel \r\nexperience awaits...\r\n\r\nLogin to your account to plan \r\nyour perfect trip !");
		contentPane.add(submessage);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 350, 468);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel.setBackground(new Color(255, 165, 0));
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(434, 212, 312, 49);
		panel.setBorder(new LineBorder(new Color(255, 165, 0), 2, true));
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsername = new JTextField();
		txtUsername.setHorizontalAlignment(SwingConstants.LEFT);
		txtUsername.setBorder(null);
		txtUsername.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtUsername.setText("Username");
		txtUsername.setBounds(10, 10, 202, 29);
		panel.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setBounds(224, 10, 78, 29);
		lblUsername.setIcon(new ImageIcon(LoginWin.class.getResource("/resources/user2.png")));
		panel.add(lblUsername);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(434, 275, 312, 49);
		contentPane.add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(255, 165, 0), 2, true));
		panel_1.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.setBorder(null);
		txtPassword.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtPassword.setText("Password");
		txtPassword.setBounds(10, 10, 202, 29);
		panel_1.add(txtPassword);
		
		JLabel lblPassword = new JLabel("");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(222, 10, 78, 29);
		lblPassword.setIcon(new ImageIcon(LoginWin.class.getResource("/resources/pwd3.png")));
		panel_1.add(lblPassword);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(42, 354, 257, 49);
		lblNewLabel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new SignupWin();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(0, 0, 257, 49);
		panel_3.add(btnNewButton);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(434, 356, 312, 49);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		
		
		JButton btnNewButton_1 = new JButton("Log In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtUsername.getText().equals("Username") | txtPassword.getText().equals("Password"))
				{
					JOptionPane.showMessageDialog(btnNewButton_1, "User Credentials Can't have Pre-set values");
				}
				else if(txtUsername.getText().equals("") | txtPassword.getText().equals(""))
				{
					JOptionPane.showMessageDialog(btnNewButton_1, "User Credentials Can't be Empty");
				}
				else
				{
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
						String login_query = "Select * from login_users where u_name=? and pass =?";
						PreparedStatement p = conn.prepareStatement(login_query);
						p.setString(1,txtUsername.getText());
						p.setString(2, txtPassword.getText());
						ResultSet valid = p.executeQuery();
						
						if(valid.next())
						{
							JOptionPane.showMessageDialog(btnNewButton_1, "Login Successful");
							setVisible(false);
							conn.close();
							new Master(); 
							
						}
						else
						{
							JOptionPane.showMessageDialog(btnNewButton_1, "Incorrect Credentials Entered! Try Again");
						}
					}
					catch(Exception ex)	
					{
						JOptionPane.showMessageDialog(btnNewButton_1, "Sorry Currently the Services are unavailable"+ex);
					}
				}
			}
		});
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		btnNewButton_1.setBounds(0, 0, 312, 49);
		panel_4.add(btnNewButton_1);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setBounds(432, 31, 314, 158);
		contentPane.add(lblIconLogo);
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setIcon(new ImageIcon(SignupWin.class.getResource("/resources/logofin.png")));
		setUndecorated(true);
	}
}
