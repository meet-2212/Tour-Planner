package Project_content;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

//import login.LoginWin;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SignupWin extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPass;
	private JTextField textField;
	private boolean present = false;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new SignupWin();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public SignupWin() {
		setVisible(true);
		setTitle("Tour-Planner -- SignUp");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(280, 100, 848, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel arrow = new JLabel("");
		arrow.setHorizontalTextPosition(SwingConstants.LEADING);
		arrow.setHorizontalAlignment(SwingConstants.LEFT);
		arrow.setBounds(518, 337, 198, 67);
		arrow.setIcon(new ImageIcon(SignupWin.class.getResource("/resources/leftarrow2.png")));
		contentPane.add(arrow);
		
		JTextArea Signup = new JTextArea();
		Signup.setEditable(false);
		Signup.setForeground(new Color(255, 255, 255));
		Signup.setText("Create your account in \r\na few easy steps & plan \r\nyour perfect trip today!");
		Signup.setFont(new Font("MV Boli", Font.BOLD, 25));
		Signup.setBackground(new Color(255, 165, 0));
		Signup.setBounds(518, 195, 312, 139);
		contentPane.add(Signup);
		
		JLabel message = new JLabel("Welcome!");
		message.setBounds(613, 56, 225, 49);
		message.setVerticalAlignment(SwingConstants.TOP);
		message.setBackground(new Color(255, 250, 250));
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setFont(new Font("Verdana", Font.BOLD, 39));
		message.setForeground(new Color(0, 0, 0));
		contentPane.add(message);
		
		JTextArea submessage = new JTextArea();
		submessage.setEditable(false);
		submessage.setBounds(518, 117, 301, 57);
		submessage.setFont(new Font("Verdana", Font.ITALIC, 16));
		submessage.setBackground(new Color(255, 165, 0));
		submessage.setText("Your adventurous & fun-filled travel \r\nexperience awaits...\r\n");
		contentPane.add(submessage);
		
		JPanel panel = new JPanel();
		panel.setBounds(92, 125, 312, 49);
		panel.setBorder(new LineBorder(new Color(255, 165, 0), 2, true));
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUser = new JTextField();
		txtUser.setHorizontalAlignment(SwingConstants.LEFT);
		txtUser.setBorder(null);
		txtUser.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtUser.setText("Fullname");
		txtUser.setBounds(10, 10, 202, 29);
		panel.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(208, 0, 104, 49);
		lblNewLabel_1.setIcon(new ImageIcon(SignupWin.class.getResource("/resources/idicon.png")));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(92, 264, 312, 49);
		contentPane.add(panel_1);
		panel_1.setBorder(new LineBorder(new Color(255, 165, 0), 2, true));
		panel_1.setLayout(null);
		
		txtPass = new JPasswordField();
		txtPass.setBorder(null);
		txtPass.setFont(new Font("Verdana", Font.PLAIN, 12));
		txtPass.setText("Password");
		txtPass.setBounds(10, 10, 202, 29);
		panel_1.add(txtPass);
		
		JLabel lblPassword = new JLabel("");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setBounds(211, 0, 101, 49);
		lblPassword.setIcon(new ImageIcon(SignupWin.class.getResource("/resources/pwd3.png")));
		panel_1.add(lblPassword);
		
		JLabel lblIconLogo = new JLabel("");
		lblIconLogo.setHorizontalAlignment(SwingConstants.CENTER);
		lblIconLogo.setBounds(498, 0, 118, 120);
		lblIconLogo.setIcon(new ImageIcon(SignupWin.class.getResource("/resources/logotest.png")));
		contentPane.add(lblIconLogo);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(498, 0, 350, 468);
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblNewLabel.setBackground(new Color(255, 165, 0));
		lblNewLabel.setOpaque(true);
		contentPane.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(92, 195, 312, 49);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(255, 165, 0), 2, true));
		
		textField = new JTextField();
		textField.setText("Username");
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setFont(new Font("Verdana", Font.PLAIN, 12));
		textField.setColumns(10);
		textField.setBorder(null);
		textField.setBounds(10, 10, 202, 29);
		panel_2.add(textField);
		
		JLabel lblUsername = new JLabel("");
		lblUsername.setBounds(211, 0, 101, 49);
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setIcon(new ImageIcon(SignupWin.class.getResource("/resources/user2.png")));
		panel_2.add(lblUsername);

		JTextArea txtrKindlyFillIn = new JTextArea();
		txtrKindlyFillIn.setEditable(false);
		txtrKindlyFillIn.setForeground(new Color(255, 165, 0));
		txtrKindlyFillIn.setText("* Kindly fill in the details in the boxes below & \r\nbecome a part of the travellers' community !");
		txtrKindlyFillIn.setFont(new Font("Verdana", Font.ITALIC, 16));
		txtrKindlyFillIn.setBackground(UIManager.getColor("Button.background"));
		txtrKindlyFillIn.setBounds(47, 34, 424, 57);
		contentPane.add(txtrKindlyFillIn);
		
		
		JButton btnNewButton = new JButton("Sign Up\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtUser.getText().equals("Fullname") | textField.getText().equals("Username") | txtPass.getText().equals("Password"))
				{
					JOptionPane.showMessageDialog(contentPane, "User Credentials Can't have Pre-set values");
				}
				else if(txtUser.getText().equals("") | textField.getText().equals("") | txtPass.getText().equals(""))
				{
					JOptionPane.showMessageDialog(contentPane, "User Credentials Can't be Empty");
				}
				else
				{
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","");
						String signup = "insert into login_users(f_name,u_name,pass) VALUES ('"+txtUser.getText()+"','"+textField.getText()+"','"+txtPass.getText()+"')";
						
						String check = "select u_name from login_users";
						PreparedStatement p = conn.prepareStatement(check);
						ResultSet valid = p.executeQuery();
						
						if(valid.next())
						{
							String user_ck =  valid.getString("u_name");
							if(textField.getText().equals(user_ck))
							{
								present = true;
							}
						}
						if(present == false)
						{
							PreparedStatement prest = conn.prepareStatement(signup);
							int conf = prest.executeUpdate(signup);
						
							JOptionPane.showMessageDialog(contentPane, "Signup Successful");
							setVisible(false);
				        	new LoginWin();
				        	conn.close();
				        }
						else
						{
							JOptionPane.showMessageDialog(contentPane, "Username Already Exists. Try choosing another");
						}
					}
					catch(Exception ex)	
					{
						JOptionPane.showMessageDialog(contentPane, "Sorry Currently the Services are unavailable"+ex);
					}
				}
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(92, 357, 312, 49);
		contentPane.add(btnNewButton);
		setUndecorated(true);
	}
	
	
}
