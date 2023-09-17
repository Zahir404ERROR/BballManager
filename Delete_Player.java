package basketmanager;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import basketballmanager.MainWindow;

import javax.swing.JTextField;

public class Delete_Player {

	private JFrame frame;
	public String Name;
	public String Height;
	public String Weight;
	public String ExitYear;
	public String DOB;
	public String JerseyNumber;
	public String Age;
	java.sql.Connection c;
	private JTextField textFieldname;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Delete_Player window = new Delete_Player();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Delete_Player() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setFrame(new JFrame());
		getFrame().setBounds(100, 100, 924, 583);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(30, 139, 195));
		panel.setBounds(0, 0, 908, 63);
		getFrame().getContentPane().add(panel);
		
		JLabel lblAddPlayer = new JLabel("Delete Player");
		lblAddPlayer.setForeground(Color.WHITE);
		lblAddPlayer.setFont(new Font("Raleway", Font.PLAIN, 36));
		lblAddPlayer.setBounds(672, 11, 226, 35);
		panel.add(lblAddPlayer);
		
		JLabel label_8 = new JLabel("___________________________________________________________________________________");
		label_8.setForeground(Color.WHITE);
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_8.setBounds(0, 35, 919, 30);
		panel.add(label_8);
		
		JLabel label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Main_Window window = new Main_Window();
				window.getFrame().setVisible(true);
				getFrame().dispose();
			}
		});
		label.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\icons8_Back_To_48.png"));
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 12));
		label.setBounds(0, 0, 76, 59);
		panel.add(label);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(37, 116, 169));
		panel_1.setBounds(372, 61, 536, 451);
		getFrame().getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Add User Male_64pxt.png"));
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_2.setBounds(10, 11, 61, 64);
		panel_1.add(label_2);
		
		JLabel lblAdd = new JLabel("     DELETE");
		lblAdd.addMouseListener(new MouseAdapter() {
			
			
			@Override
			public void mouseClicked(MouseEvent e) {
			
				try {
					CreateConnection();
					String name = textFieldname.getText();
					System.out.println(name);
					String sql = new StringBuilder(100).append("DELETE FROM players WHERE name = '").append(name).append("';").toString();
					System.out.println(sql);
					java.sql.PreparedStatement stmt =c.prepareStatement(sql);
                    stmt.executeUpdate();
                    stmt.close();
					c.close();
				} catch (Exception e1) {
					System.err.println(e1.getClass().getName() + ": " + e1.getMessage());
				
				} 
			
			}
		});
		lblAdd.setBorder(new LineBorder(Color.WHITE));
		lblAdd.setForeground(Color.WHITE);
		lblAdd.setFont(new Font("Raleway SemiBold", Font.PLAIN, 34));
		lblAdd.setBounds(187, 237, 202, 40);
		panel_1.add(lblAdd);
		
		textFieldname = new JTextField();
		textFieldname.setColumns(10);
		textFieldname.setBounds(170, 92, 252, 20);
		panel_1.add(textFieldname);
		
		JLabel label_3 = new JLabel("Name :");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_3.setBounds(113, 93, 47, 16);
		panel_1.add(label_3);
		
		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setForeground(Color.BLACK);
		panel_12.setBackground(new Color(30, 139, 195));
		panel_12.setBounds(0, 510, 908, 34);
		getFrame().getContentPane().add(panel_12);
		
		JLabel label_21 = new JLabel("");
		label_21.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\icons8_Gmail_32.png"));
		label_21.setForeground(Color.WHITE);
		label_21.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 12));
		label_21.setBounds(825, 0, 32, 35);
		panel_12.add(label_21);
		
		JLabel label_22 = new JLabel("\u00A9 St.George Basketball Manger");
		label_22.setForeground(Color.WHITE);
		label_22.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 12));
		label_22.setBounds(10, 0, 188, 35);
		panel_12.add(label_22);
		
		JLabel label_23 = new JLabel("");
		label_23.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\icons8_Facebook_32.png"));
		label_23.setForeground(Color.WHITE);
		label_23.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 12));
		label_23.setBounds(788, 0, 32, 35);
		panel_12.add(label_23);
		
		JLabel label_24 = new JLabel("");
		label_24.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\icons8_Play_Button_32.png"));
		label_24.setForeground(Color.WHITE);
		label_24.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 12));
		label_24.setBounds(867, 0, 32, 35);
		panel_12.add(label_24);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(107, 185, 240));
		panel_2.setBounds(0, 61, 374, 451);
		getFrame().getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Basketball-Background-for-Laptop.jpg"));
		label_1.setBounds(0, 11, 372, 411);
		panel_2.add(label_1);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	private void CreateConnection() {
	      try {
	         Class.forName("org.postgresql.Driver");
	         c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/players","postgres", "animon123");
	      } 
	      catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully");
	}
}