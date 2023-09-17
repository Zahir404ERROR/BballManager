package basketmanager;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.border.LineBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;

public class Edit_Player {

	private JFrame frame;
	private JTextField textField_TO;
	private JTextField textField_points;
	private JTextField textField_Rebounds;
	private JTextField textField_Steals;
	private JTextField textField_Bloks;
	
	java.sql.Connection c = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit_Player window = new Edit_Player();
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
	public Edit_Player() {
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
		
		JLabel lblAddPlayer = new JLabel("Edit Player");
		lblAddPlayer.setForeground(Color.WHITE);
		lblAddPlayer.setFont(new Font("Raleway", Font.PLAIN, 36));
		lblAddPlayer.setBounds(715, 11, 183, 35);
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
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblName.setForeground(Color.WHITE);
		lblName.setBounds(125, 115, 47, 16);
		panel_1.add(lblName);
		
		JLabel lblPoints = new JLabel("Points :");
		lblPoints.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblPoints.setForeground(Color.WHITE);
		lblPoints.setBounds(125, 152, 61, 16);
		panel_1.add(lblPoints);
		
		JLabel lblRebounds = new JLabel("Rebounds :");
		lblRebounds.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblRebounds.setForeground(Color.WHITE);
		lblRebounds.setBounds(311, 153, 80, 16);
		panel_1.add(lblRebounds);
		
		JLabel lblSteals = new JLabel("Steals :");
		lblSteals.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblSteals.setForeground(Color.WHITE);
		lblSteals.setBounds(125, 182, 47, 26);
		panel_1.add(lblSteals);
		
		JLabel lblDatenOfBirth = new JLabel("Blocks :");
		lblDatenOfBirth.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblDatenOfBirth.setForeground(Color.WHITE);
		lblDatenOfBirth.setBounds(321, 179, 53, 29);
		panel_1.add(lblDatenOfBirth);
		
		JLabel lblTurnOvers = new JLabel("Turnovers :");
		lblTurnOvers.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblTurnOvers.setForeground(Color.WHITE);
		lblTurnOvers.setBounds(106, 222, 68, 16);
		panel_1.add(lblTurnOvers);
		
		textField_TO = new JTextField();
		textField_TO.setColumns(10);
		textField_TO.setBounds(184, 221, 61, 20);
		panel_1.add(textField_TO);
		
		textField_points = new JTextField();
		textField_points.setColumns(10);
		textField_points.setBounds(184, 149, 61, 24);
		panel_1.add(textField_points);
		
		textField_Rebounds = new JTextField();
		textField_Rebounds.setColumns(10);
		textField_Rebounds.setBounds(393, 149, 61, 24);
		panel_1.add(textField_Rebounds);
		
		textField_Steals = new JTextField();
		textField_Steals.setColumns(10);
		textField_Steals.setBounds(184, 184, 61, 24);
		panel_1.add(textField_Steals);
		
		textField_Bloks = new JTextField();
		textField_Bloks.setColumns(10);
		textField_Bloks.setBounds(393, 182, 61, 24);
		panel_1.add(textField_Bloks);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Registration_64px.png"));
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_2.setBounds(10, 11, 61, 64);
		panel_1.add(label_2);
		
		
		
		Vector Items = new Vector();

	    Connection connect =  ConnectDB();
		Statement s = null;
		try {
			s = connect.createStatement();
			
			String sql = "SELECT * FROM  players";
			
			ResultSet rec = s.executeQuery(sql);
			int row = 0;
			while((rec!=null) && (rec.next()))
            {		
				Items.add(rec.getString("name"));
            }
			rec.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, e.getMessage());
			e.printStackTrace();
		}
		
		SpinnerListModel  model = new SpinnerListModel(Items);

		JSpinner spinner = new JSpinner(model);
		spinner.setBounds(187, 113, 267, 23);
		panel_1.add(spinner);
		
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
		
		JLabel lblUpdate = new JLabel("     UPDATE");
		lblUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String Name =(String)spinner.getValue();
				int points = Integer.parseInt(textField_points.getText());
				System.out.println(Name + " " + points);
				int rebounds = Integer.parseInt(textField_Rebounds.getText());
				int steals = Integer.parseInt(textField_Steals.getText());
				int turnovers = Integer.parseInt(textField_TO.getText());
				int blocks = Integer.parseInt(textField_Bloks.getText());
                                
			      try {                        
                                 Class.forName("org.postgresql.Driver");
                                 c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/players","postgres", "animon123");
                                // UPDATE public.players
                                // SET points = players.points + 5, rebounds = players.rebounds + 10, steals = players.steals + 10, blocks = players.blocks + 10, turnovers = players.turnovers + 10
                                // WHERE name = '").append(Name)
                                // WHERE name = 'Zahir'
                                 String sql = new StringBuilder(14).append("UPDATE players SET points = players.points + ").append(points).append(", rebounds = players.rebounds + ").append(rebounds).append(", steals = players.steals + ").append(steals).append(", blocks = players.blocks + ").append(blocks).append(", turnovers = players.turnovers + ").append(turnovers).append(" WHERE name = '").append(Name).append("';").toString();
                                 java.sql.PreparedStatement stmt =c.prepareStatement(sql);
                                 stmt.executeUpdate();
                                 stmt.close();
                                 c.close();
			      } 
			      
			      catch (Exception e) {
			         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
			         System.exit(0);
			      }
			      
			      System.out.println("Records created successfully");        // TODO add your handling code here:
    }                 
			
		});
		lblUpdate.setBorder(new LineBorder(Color.WHITE));
		lblUpdate.setForeground(Color.WHITE);
		lblUpdate.setFont(new Font("Raleway SemiBold", Font.PLAIN, 34));
		lblUpdate.setBounds(194, 292, 224, 40);
		panel_1.add(lblUpdate);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	private Connection ConnectDB() {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection("jdbc:postgresql://localhost:5432/players","postgres", "animon123");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
