package basketmanager;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;

public class Search_Player {
	String location; 
	private JFrame frmBmanage;
	private String name;
	private String height;
	private String weight;
	private String ExitYear;
	private String dob;
	private String jerseynumber;
	private String points;
	private String rebounds;
	private String steals;
	private String Blocks;
	private String Turnovers;
	public String Search;
	java.sql.Connection c = null;
	private JTextField textField;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getExitYear() {
		return ExitYear;
	}

	public void setExitYear(String exitYear) {
		ExitYear = exitYear;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getJerseynumber() {
		return jerseynumber;
	}

	public void setJerseynumber(String jerseynumber) {
		this.jerseynumber = jerseynumber;
	}

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getRebounds() {
		return rebounds;
	}

	public void setRebounds(String rebounds) {
		this.rebounds = rebounds;
	}

	public String getSteals() {
		return steals;
	}

	public void setSteals(String steals) {
		this.steals = steals;
	}

	public String getBlocks() {
		return Blocks;
	}

	public void setBlocks(String blocks) {
		Blocks = blocks;
	}

	public String getTurnovers() {
		return Turnovers;
	}

	public void setTurnovers(String turnovers) {
		Turnovers = turnovers;
	}

	public String getSearch() {
		return Search;
	}

	public void setSearch(String search) {
		Search = search;
	}

	public java.sql.Connection getC() {
		return c;
	}

	public void setC(java.sql.Connection c) {
		this.c = c;
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search_Player window = new Search_Player();
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
	public Search_Player() {
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
		
		JLabel lblAddPlayer = new JLabel("Search Player");
		lblAddPlayer.setForeground(Color.WHITE);
		lblAddPlayer.setFont(new Font("Raleway", Font.PLAIN, 36));
		lblAddPlayer.setBounds(657, 11, 241, 35);
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
		label_2.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Search_64px.png"));
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_2.setBounds(10, 11, 61, 64);
		panel_1.add(label_2);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setColumns(10);
		textField.setBounds(146, 77, 316, 20);
		panel_1.add(textField);
		
		JLabel label_3 = new JLabel("Name :");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_3.setBounds(102, 78, 47, 16);
		panel_1.add(label_3);
		
		JLabel label_5 = new JLabel("Name :");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_5.setBounds(29, 132, 47, 16);
		panel_1.add(label_5);
		
		JLabel lblWeight = new JLabel("Weight :");
		lblWeight.setForeground(Color.WHITE);
		lblWeight.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblWeight.setBounds(266, 132, 61, 16);
		panel_1.add(lblWeight);
		
		JLabel lblJerseyNumber = new JLabel("Jersey Number :");
		lblJerseyNumber.setForeground(Color.WHITE);
		lblJerseyNumber.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblJerseyNumber.setBounds(266, 185, 101, 16);
		panel_1.add(lblJerseyNumber);
		
		JLabel lblExitYear = new JLabel("Exit Year :");
		lblExitYear.setForeground(Color.WHITE);
		lblExitYear.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblExitYear.setBounds(29, 185, 61, 16);
		panel_1.add(lblExitYear);
		
		JLabel lblHeight = new JLabel("Height :");
		lblHeight.setForeground(Color.WHITE);
		lblHeight.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblHeight.setBounds(133, 132, 47, 16);
		panel_1.add(lblHeight);
		
		JLabel lblDob = new JLabel("Date Of Birth :");
		lblDob.setForeground(Color.WHITE);
		lblDob.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblDob.setBounds(133, 185, 85, 16);
		panel_1.add(lblDob);
		
		JLabel lblPicture = new JLabel("Picture :");
		lblPicture.setForeground(Color.WHITE);
		lblPicture.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblPicture.setBounds(363, 114, 47, 16);
		panel_1.add(lblPicture);
		
		JLabel lblPoints = new JLabel("Points :");
		lblPoints.setForeground(Color.WHITE);
		lblPoints.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblPoints.setBounds(29, 236, 47, 16);
		panel_1.add(lblPoints);
		
		JLabel lblRebounds = new JLabel("Rebounds :");
		lblRebounds.setForeground(Color.WHITE);
		lblRebounds.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblRebounds.setBounds(86, 236, 74, 16);
		panel_1.add(lblRebounds);
		
		JLabel lblSteals = new JLabel("Steals :");
		lblSteals.setForeground(Color.WHITE);
		lblSteals.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblSteals.setBounds(157, 236, 47, 16);
		panel_1.add(lblSteals);
		
		JLabel lblBlocks = new JLabel("Blocks :");
		lblBlocks.setForeground(Color.WHITE);
		lblBlocks.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblBlocks.setBounds(209, 236, 47, 16);
		panel_1.add(lblBlocks);
		
		JLabel lblTurnovers = new JLabel("Turnovers :");
		lblTurnovers.setForeground(Color.WHITE);
		lblTurnovers.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblTurnovers.setBounds(266, 236, 74, 16);
		panel_1.add(lblTurnovers);
		
		JLabel lblnm = new JLabel();
		lblnm.setBounds(29, 160, 74, 14);
		panel_1.add(lblnm);
		
		JLabel label_hght = new JLabel();
		label_hght.setBounds(133, 160, 71, 14);
		panel_1.add(label_hght);
		
		JLabel label_wght = new JLabel();
		label_wght.setBounds(266, 159, 74, 14);
		panel_1.add(label_wght);
		
		JLabel label_EY = new JLabel();
		label_EY.setBounds(29, 212, 65, 14);
		panel_1.add(label_EY);
		
		JLabel label_Dob = new JLabel();
		label_Dob.setBounds(133, 212, 75, 14);
		panel_1.add(label_Dob);
		
		JLabel label_JN = new JLabel();
		label_JN.setBounds(266, 212, 87, 14);
		panel_1.add(label_JN);
		
		JLabel label_pts = new JLabel();
		label_pts.setBounds(29, 263, 46, 14);
		panel_1.add(label_pts);
		
		JLabel label_Rbds = new JLabel();
		label_Rbds.setBounds(96, 263, 46, 14);
		panel_1.add(label_Rbds);
		
		JLabel label_stls = new JLabel();
		label_stls.setBounds(158, 263, 46, 14);
		panel_1.add(label_stls);
		
		JLabel label_blck = new JLabel();
		label_blck.setBounds(205, 263, 46, 14);
		panel_1.add(label_blck);
		
		JLabel label_TO = new JLabel();
		label_TO.setBounds(266, 263, 46, 14);
		panel_1.add(label_TO);
		
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
	
		JLabel lblAdd = new JLabel("     Search");
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Search = textField.getText();
				
				try
			    {
			    CreateConnection();
			    String sql = new StringBuilder(14).append("SELECT * FROM players WHERE name = '").append(Search).append("';").toString();
			    java.sql.PreparedStatement st =c.prepareStatement(sql);
			    ResultSet rs = st.executeQuery();
			    while (rs.next()) 
			    {
			    	name = rs.getString(1);
			    	System.out.println(name);
			    	height = rs.getString(2);
			    	weight = rs.getString(3);
			    	ExitYear = rs.getString(4);
			    	dob = rs.getString(5);
			    	jerseynumber = rs.getString(6);
			    	points = Integer.toString(rs.getInt(7));
			    	rebounds = Integer.toString(rs.getInt(8));
			    	steals = Integer.toString(rs.getInt(9));
			    	Blocks = Integer.toString(rs.getInt(10));
			    	Turnovers = Integer.toString(rs.getInt(11));
			    	lblnm.setText(name);
			    	label_hght.setText(height);
			    	label_wght.setText(weight);
			    	label_EY.setText(ExitYear);
			    	label_Dob.setText(dob);
			    	label_JN.setText(jerseynumber);
			    	label_pts.setText(points);
			    	label_Rbds.setText(rebounds);
			    	label_stls.setText(steals);
			    	label_blck.setText(Blocks);
			    	label_TO.setText(Turnovers);
			    	
			    }
			    c.close();
			    }
			    catch(Exception ex)
			    {
			    JOptionPane.showMessageDialog(null, ex.toString());
			    }
				
				System.out.println(name);
			    location = new StringBuilder(14).append("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Internal Assesment\\Images\\").append(name).append(".jpg").toString();
				System.out.println(location);
			}
		});

		lblAdd.setBorder(new LineBorder(Color.WHITE));
		lblAdd.setForeground(Color.WHITE);
		lblAdd.setFont(new Font("Raleway SemiBold", Font.PLAIN, 34));
		lblAdd.setBounds(205, 400, 190, 40);
		panel_1.add(lblAdd);
			
			Search = textField.getText();
			System.out.println(Search);
		    location = new StringBuilder(14).append("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Internal Assesment\\Images\\").append(Search).append(".jpg").toString();
			System.out.println(location);
			JLabel label_4 = new JLabel("");
		    label_4.setIcon(new ImageIcon(location));
		    label_4.setBounds(363, 132, 163, 149);
			panel_1.add(label_4);
	
	}

	public JFrame getFrame() {
		return frmBmanage;
	}

	public void setFrame(JFrame frame) {
		this.frmBmanage = frame;
		frmBmanage.setTitle("BManage");
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