package basketmanager;

import java.awt.EventQueue; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main_Window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Window window = new Main_Window();
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
	public Main_Window() {
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
		panel.setBackground(new Color(30,139,195));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 908, 99);
		getFrame().getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblMainWindow = new JLabel("Main Window");
		lblMainWindow.setForeground(Color.WHITE);
		lblMainWindow.setFont(new Font("Raleway", Font.PLAIN, 36));
		lblMainWindow.setBounds(10, 11, 229, 35);
		panel.add(lblMainWindow);
		
		int x = 25;
		JLabel lblAddPlayer = new JLabel("Add Player");
		lblAddPlayer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Add_Player window = new Add_Player();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
			
		});
		
		lblAddPlayer.setForeground(Color.WHITE);
		lblAddPlayer.setFont(new Font("Raleway ExtraLight", Font.PLAIN, x));
		lblAddPlayer.setBounds(10, 57, 123, 35);
		panel.add(lblAddPlayer);
		lblAddPlayer.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseEntered(MouseEvent arg0) {
			int x = 50;
		}
		});
		
		JLabel lblListPlayer = new JLabel("Edit Player");
		lblListPlayer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Edit_Player window = new Edit_Player();
				window.getFrame().setVisible(true);
				frame.dispose();
			
			}
		});
		lblListPlayer.setForeground(Color.WHITE);
		lblListPlayer.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 25));
		lblListPlayer.setBounds(143, 57, 123, 35);
		panel.add(lblListPlayer);
		
		JLabel label = new JLabel("List Player");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List_Player window = new List_Player();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 25));
		label.setBounds(276, 57, 123, 35);
		panel.add(label);
		
		JLabel lblSearchPlayer = new JLabel("Search Player");
		lblSearchPlayer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Search_Player window = new Search_Player();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		lblSearchPlayer.setForeground(Color.WHITE);
		lblSearchPlayer.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 25));
		lblSearchPlayer.setBounds(408, 57, 160, 35);
		panel.add(lblSearchPlayer);
		
		JLabel lblDeletePlayer = new JLabel("Delete Player");
		lblDeletePlayer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Delete_Player window = new Delete_Player();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		lblDeletePlayer.setForeground(Color.WHITE);
		lblDeletePlayer.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 25));
		lblDeletePlayer.setBounds(578, 57, 160, 35);
		panel.add(lblDeletePlayer);
		
		JLabel lblMvp = new JLabel("MVP");
		lblMvp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MVP window = new MVP();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		lblMvp.setForeground(Color.WHITE);
		lblMvp.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 25));
		lblMvp.setBounds(747, 57, 61, 35);
		panel.add(lblMvp);
		
		JLabel lblDrilss = new JLabel("Drills");
		lblDrilss.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Drills window = new Drills();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		lblDrilss.setForeground(Color.WHITE);
		lblDrilss.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 25));
		lblDrilss.setBounds(825, 57, 61, 35);
		panel.add(lblDrilss);
		
		JLabel label_1 = new JLabel("___________________________________________________________________________________");
		label_1.setBounds(0, 29, 919, 30);
		panel.add(label_1);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setForeground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(37,116,169));
		panel_1.setBounds(0, 97, 908, 414);
		getFrame().getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(107,185,240));
		panel_3.setBounds(20, 57, 158, 137);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Add_Player window = new Add_Player();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label_5.setBounds(34, 11, 114, 107);
		label_5.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Add User Male_96px.png"));
		panel_3.add(label_5);
		
		JLabel lblAddPlayer_1 = new JLabel("              Add Player");
		lblAddPlayer_1.setForeground(Color.WHITE);
		lblAddPlayer_1.setFont(new Font("Raleway SemiBold", Font.PLAIN, 14));
		lblAddPlayer_1.setBounds(0, 112, 158, 25);
		panel_3.add(lblAddPlayer_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(107,185,240));
		panel_4.setBounds(20, 222, 158, 137);
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblMvp_1 = new JLabel("                     MVP");
		lblMvp_1.setForeground(Color.WHITE);
		lblMvp_1.setFont(new Font("Raleway SemiBold", Font.PLAIN, 14));
		lblMvp_1.setBounds(0, 112, 158, 25);
		panel_4.add(lblMvp_1);
		
		JLabel label_14 = new JLabel("");
		label_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MVP window = new MVP();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label_14.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Trophy_96px.png"));
		label_14.setBounds(34, 11, 114, 107);
		panel_4.add(label_14);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(107,185,240));
		panel_5.setBounds(200, 57, 158, 137);
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblEditPlayer = new JLabel("              Edit Player");
		lblEditPlayer.setForeground(Color.WHITE);
		lblEditPlayer.setFont(new Font("Raleway SemiBold", Font.PLAIN, 14));
		lblEditPlayer.setBounds(0, 112, 158, 25);
		panel_5.add(lblEditPlayer);
		
		JLabel label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Edit_Player window = new Edit_Player();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label_7.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Edit_96px.png"));
		label_7.setBounds(34, 11, 114, 107);
		panel_5.add(label_7);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(107,185,240));
		panel_6.setBounds(200, 222, 158, 137);
		panel_1.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel label_16 = new JLabel("");
		label_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MDP window = new MDP();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label_16.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Medal_96px.png"));
		label_16.setBounds(34, 11, 114, 107);
		panel_6.add(label_16);
		
		JLabel lblMdp = new JLabel("                     MDP");
		lblMdp.setForeground(Color.WHITE);
		lblMdp.setFont(new Font("Raleway SemiBold", Font.PLAIN, 14));
		lblMdp.setBounds(0, 112, 158, 25);
		panel_6.add(lblMdp);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(107,185,240));
		panel_7.setBounds(377, 57, 158, 137);
		panel_1.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblListPlayer_1 = new JLabel("             List Player");
		lblListPlayer_1.setForeground(Color.WHITE);
		lblListPlayer_1.setFont(new Font("Raleway SemiBold", Font.PLAIN, 14));
		lblListPlayer_1.setBounds(0, 112, 158, 25);
		panel_7.add(lblListPlayer_1);
		
		JLabel label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				List_Player window = new List_Player();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label_8.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\List View_96px.png"));
		label_8.setBounds(34, 11, 114, 107);
		panel_7.add(label_8);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(107,185,240));
		panel_8.setBounds(377, 222, 158, 137);
		panel_1.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel label_18 = new JLabel("");
		label_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OVP window = new OVP();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label_18.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Medal_96px.png"));
		label_18.setBounds(34, 11, 114, 107);
		panel_8.add(label_18);
		
		JLabel lblOvp = new JLabel("                     OVP");
		lblOvp.setForeground(Color.WHITE);
		lblOvp.setFont(new Font("Raleway SemiBold", Font.PLAIN, 14));
		lblOvp.setBounds(0, 112, 158, 25);
		panel_8.add(lblOvp);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(107,185,240));
		panel_9.setBounds(554, 57, 158, 137);
		panel_1.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblSearchPlayer_1 = new JLabel("            Search Player");
		lblSearchPlayer_1.setForeground(Color.WHITE);
		lblSearchPlayer_1.setFont(new Font("Raleway SemiBold", Font.PLAIN, 14));
		lblSearchPlayer_1.setBounds(0, 112, 158, 25);
		panel_9.add(lblSearchPlayer_1);
		
		JLabel label_10 = new JLabel("");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Search_Player window = new Search_Player();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label_10.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Search_96px.png"));
		label_10.setBounds(23, 11, 114, 107);
		panel_9.add(label_10);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(107,185,240));
		panel_10.setBounds(554, 222, 158, 137);
		panel_1.add(panel_10);
		panel_10.setLayout(null);
		
		JLabel label_20 = new JLabel("");
		label_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				MIP window = new MIP();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label_20.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Medal_96px.png"));
		label_20.setBounds(34, 11, 114, 107);
		panel_10.add(label_20);
		
		JLabel lblMip = new JLabel("                      MIP");
		lblMip.setForeground(Color.WHITE);
		lblMip.setFont(new Font("Raleway SemiBold", Font.PLAIN, 14));
		lblMip.setBounds(0, 112, 158, 25);
		panel_10.add(lblMip);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(107,185,240));
		panel_11.setBounds(728, 57, 158, 137);
		panel_1.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblDeletePlayer_1 = new JLabel("            Delete Player");
		lblDeletePlayer_1.setForeground(Color.WHITE);
		lblDeletePlayer_1.setFont(new Font("Raleway SemiBold", Font.PLAIN, 14));
		lblDeletePlayer_1.setBounds(0, 112, 158, 25);
		panel_11.add(lblDeletePlayer_1);
		
		JLabel label_12 = new JLabel("");
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Delete_Player window = new Delete_Player();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label_12.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Denied_96px.png"));
		label_12.setBounds(21, 11, 114, 107);
		panel_11.add(label_12);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(107,185,240));
		panel_12.setBounds(728, 222, 158, 137);
		panel_1.add(panel_12);
		panel_12.setLayout(null);
		
		JLabel label_22 = new JLabel("");
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Drills window = new Drills();
				window.getFrame().setVisible(true);
				frame.dispose();
			}
		});
		label_22.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\Whistle_96px.png"));
		label_22.setBounds(34, 11, 114, 107);
		panel_12.add(label_22);
		
		JLabel lblDrills = new JLabel("                     Drills");
		lblDrills.setForeground(Color.WHITE);
		lblDrills.setFont(new Font("Raleway SemiBold", Font.PLAIN, 14));
		lblDrills.setBounds(0, 112, 158, 25);
		panel_12.add(lblDrills);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.BLACK);
		panel_2.setBackground(new Color(30, 139, 195));
		panel_2.setBounds(0, 510, 908, 34);
		getFrame().getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WebPage WP = new WebPage();
				WP.Mail();
			}
		});
		label_3.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\icons8_Gmail_32.png"));
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 12));
		label_3.setBounds(825, 0, 32, 35);
		panel_2.add(label_3);
		
		JLabel lblStgeorgeBasketball = new JLabel("\u00A9 St.George Basketball Manger");
		lblStgeorgeBasketball.setForeground(Color.WHITE);
		lblStgeorgeBasketball.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 12));
		lblStgeorgeBasketball.setBounds(10, 0, 188, 35);
		panel_2.add(lblStgeorgeBasketball);
		
		JLabel label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WebPage WP = new WebPage();
				WP.Facebook();
			}
		});
		label_2.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\icons8_Facebook_32.png"));
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 12));
		label_2.setBounds(788, 0, 32, 35);
		panel_2.add(label_2);
		
		JLabel label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				WebPage WP = new WebPage();
				WP.Ytube();
			}
		});
		label_4.setIcon(new ImageIcon("C:\\Users\\Zahir Animon\\Documents\\Computer Science\\Icons\\icons8_Play_Button_32.png"));
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Raleway ExtraLight", Font.PLAIN, 12));
		label_4.setBounds(867, 0, 32, 35);
		panel_2.add(label_4);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
