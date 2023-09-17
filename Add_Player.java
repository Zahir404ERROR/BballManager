package basketmanager;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import Demo.CopyFile;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.DriverManager;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Add_Player {

	private JFrame frame;
	private JTextField textFieldname;
	private JTextField textField_JN;
	private JTextField textField_height;
	private JTextField textField_weight;
	private JTextField textField_EY;
	private JTextField textField_DOB;
	private String Name;
	private String Height;
	private String Weight;
	private String ExitYear;
	private String DOB;
	private String JerseyNumber;
	
	java.sql.Connection c = null;
	private JTextField textFieldsource;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Add_Player window = new Add_Player();
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
	public Add_Player() {
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
		
		JLabel lblAddPlayer = new JLabel("Add Player");
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
		
		textFieldname = new JTextField();
		textFieldname.setColumns(10);
		textFieldname.setBounds(188, 112, 266, 24);
		panel_1.add(textFieldname);
		
		JLabel label_3 = new JLabel("Height :");
		label_3.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_3.setForeground(Color.WHITE);
		label_3.setBounds(125, 152, 61, 16);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("Weight :");
		label_4.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_4.setForeground(Color.WHITE);
		label_4.setBounds(125, 189, 61, 16);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("Exit Year :");
		label_5.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_5.setForeground(Color.WHITE);
		label_5.setBounds(117, 216, 61, 26);
		panel_1.add(label_5);
		
		JLabel lblDatenOfBirth = new JLabel("Date Of Birth :");
		lblDatenOfBirth.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblDatenOfBirth.setForeground(Color.WHITE);
		lblDatenOfBirth.setBounds(95, 253, 91, 29);
		panel_1.add(lblDatenOfBirth);
		
		JLabel label_7 = new JLabel("Jersey Number :");
		label_7.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_7.setForeground(Color.WHITE);
		label_7.setBounds(78, 293, 99, 16);
		panel_1.add(label_7);
		
		textField_JN = new JTextField();
		textField_JN.setColumns(10);
		textField_JN.setBounds(188, 291, 61, 23);
		panel_1.add(textField_JN);
		
		textField_height = new JTextField();
		textField_height.setColumns(10);
		textField_height.setBounds(188, 150, 266, 24);
		panel_1.add(textField_height);
		
		textField_weight = new JTextField();
		textField_weight.setColumns(10);
		textField_weight.setBounds(188, 185, 266, 24);
		panel_1.add(textField_weight);
		
		textField_EY = new JTextField();
		textField_EY.setColumns(10);
		textField_EY.setBounds(188, 221, 266, 24);
		panel_1.add(textField_EY);
		
		textField_DOB = new JTextField();
		textField_DOB.setColumns(10);
		textField_DOB.setBounds(188, 256, 266, 24);
		panel_1.add(textField_DOB);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Add User Male_64pxt.png"));
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		label_2.setBounds(10, 11, 61, 64);
		panel_1.add(label_2);

		JButton button = new JButton("...");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                JFileChooser jFileChooser = new JFileChooser();
                int status = jFileChooser.showOpenDialog(getFrame());
                if (status == JFileChooser.APPROVE_OPTION) {
                    String selectedFilePath = jFileChooser.getSelectedFile().getAbsolutePath();
                    textFieldsource.setText(selectedFilePath);
                }
            
			}
		});
		button.setBounds(423, 325, 31, 24);
		panel_1.add(button);
		
		JLabel lblAdd = new JLabel("     ADD");
		lblAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Name = textFieldname.getText();
				Height = textField_height.getText();
				Weight = textField_weight.getText();
				ExitYear = textField_EY.getText();
				DOB = textField_DOB.getText();
				JerseyNumber = textField_JN.getText();
                                
			      try {                        
                                 Class.forName("org.postgresql.Driver");
                                 c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/players","postgres", "animon123");
                                 String sql = new StringBuilder(14).append("INSERT INTO players VALUES ('").append(Name).append("','").append(Height).append("','").append(Weight).append("','").append(ExitYear).append("','").append(DOB).append("','").append(JerseyNumber).append("', 0, 0, 0, 0, 0);").toString();
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

	                File sourceFile = new File(textFieldsource.getText());
	                File destinationFile = new File("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Internal Assesment\\Images\\" + Name + ".jpg");
	                Path sourcePath = sourceFile.toPath();
	                Path destinationPath = destinationFile.toPath();
	                try {
	                    Files.copy(sourcePath, destinationPath);
	                } catch (IOException ex) {
	                    ex.printStackTrace();
	                }
	            
    }                 
			
		});
		lblAdd.setBorder(new LineBorder(Color.WHITE));
		lblAdd.setForeground(Color.WHITE);
		lblAdd.setFont(new Font("Raleway SemiBold", Font.PLAIN, 34));
		lblAdd.setBounds(219, 376, 152, 40);
		panel_1.add(lblAdd);
		
		JLabel lblSourceImage = new JLabel("Source Image :");
		lblSourceImage.setForeground(Color.WHITE);
		lblSourceImage.setFont(new Font("Raleway SemiBold", Font.PLAIN, 12));
		lblSourceImage.setBounds(88, 328, 91, 16);
		panel_1.add(lblSourceImage);
		
		textFieldsource = new JTextField();
		textFieldsource.setBounds(188, 325, 238, 24);
		panel_1.add(textFieldsource);
		
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
	public String getName() {
		return Name;
	}

	public String getHeight() {
		return Height;
	}

	public void setName(String name) {
		Name = name;
	}
	
	public void setHeight(String height) {
		Height = height;
	}
	
	public void setWeight(String weight) {
		Weight = weight;
	}
	
	public void setExitYear(String exitYear) {
		ExitYear = exitYear;
	}
	
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public void setJerseyNumber(String jerseyNumber) {
		JerseyNumber = jerseyNumber;
	}
	
	public String getWeight() {
		return Weight;
	}

	public String getExitYear() {
		return ExitYear;
	}

	public String getDOB() {
		return DOB;
	}

	public String getJerseyNumber() {
		return JerseyNumber;
	}
}
