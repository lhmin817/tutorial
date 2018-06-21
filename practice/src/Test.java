import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Panel;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JToolTip;
import javax.swing.border.BevelBorder;

//import PortScanner.ScanResult;

public class Test extends JFrame {

		
		final ExecutorService es = Executors.newFixedThreadPool(20);
		final String ip = "192.168.0.1";
		final int timeout = 200;
		final List<Future<ScanResult>> futures = new ArrayList<>();
		
		String getport;
		
		public Test() {
		super("Network Scanner");
		//Font myFont = new Font("Serif", Font.BOLD, 16);
		// menu begin
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu ScanMenu = new JMenu("Scan");
		JMenu GotoMenu = new JMenu("Go to");
		JMenu CommandsMenu = new JMenu("Commands");
		JMenu FavoritesMenu = new JMenu("Favorites");
		JMenu ToolsMenu = new JMenu("Tools");
		JMenu HelpMenu = new JMenu("Help");
		menuBar.add(ScanMenu);
		menuBar.add(GotoMenu);
		menuBar.add(CommandsMenu);
		menuBar.add(FavoritesMenu);
		menuBar.add(ToolsMenu);
		menuBar.add(HelpMenu);
		JMenuItem Action1 = new JMenuItem("Load from file..."); 
		JMenuItem Action2 = new JMenuItem("Export all..."); 
		JMenuItem Action3 = new JMenuItem("Export selection..."); 
		JMenuItem Action4 = new JMenuItem("Quit"); 
		JMenuItem Action5 = new JMenuItem("Next alive host"); 
		JMenuItem Action6 = new JMenuItem("Next open host"); 
		JMenuItem Action7 = new JMenuItem("Next dead host"); 
		JMenuItem Action8 = new JMenuItem("Previous alive host"); 
		JMenuItem Action9 = new JMenuItem("Previous open host"); 
		JMenuItem Action10 = new JMenuItem("Previous dead host");
		JMenuItem Action11 = new JMenuItem("Find...");
		JMenuItem Action12 = new JMenuItem("Show details");
		JMenuItem Action13 = new JMenuItem("Rescan IP");
		JMenuItem Action14 = new JMenuItem("Delete IP");
		JMenuItem Action15 = new JMenuItem("Copy IP");
		JMenuItem Action16 = new JMenuItem("Copy details");
		JMenuItem Action18 = new JMenuItem("Add current...");
		JMenuItem Action19 = new JMenuItem("Manage favorites...");
		JMenuItem Action20 = new JMenuItem("Preferences...");
		JMenuItem Action21 = new JMenuItem("Fetchers...");
		JMenuItem Action23 = new JMenuItem("Scan statistic");
		JMenuItem Action24 = new JMenuItem("Getting started");
		JMenuItem Action25 = new JMenuItem("Official website");
		JMenuItem Action26 = new JMenuItem("FAQ");
		JMenuItem Action27 = new JMenuItem("Report an issue");
		JMenuItem Action28 = new JMenuItem("Plugins");
		JMenuItem Action29 = new JMenuItem("Command-line usage");
		JMenuItem Action30 = new JMenuItem("Check for newer version...");
		JMenuItem Action31 = new JMenuItem("About");
		
		JMenuItem Action32 = new JMenuItem("Edit openers...");
		JMenuItem Action33 = new JMenuItem("Windows Shares");
		JMenuItem Action34 = new JMenuItem("Web Browser");
		JMenuItem Action35 = new JMenuItem("FTP");
		JMenuItem Action36 = new JMenuItem("Telnet");
		JMenuItem Action37 = new JMenuItem("Ping");
		JMenuItem Action38 = new JMenuItem("Trace route");
		JMenuItem Action39 = new JMenuItem("Geo locate");
		JMenuItem Action40 = new JMenuItem("E-mail sample");
		JMenuItem Action41 = new JMenuItem("Alive hosts");
		JMenuItem Action42 = new JMenuItem("Dead hosts");
		JMenuItem Action43 = new JMenuItem("with open ports");
		JMenuItem Action44 = new JMenuItem("without open ports");
		JMenuItem Action45 = new JMenuItem("Invert selection");
		
		Action4.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		Action2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		
		
		Action12.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
Action13.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
	Action14.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});
	Action15.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});
	
	Action16.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
			
		}
	});
	
	Action33.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
			
		}
	});
	
Action34.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
			
		}
	});

Action35.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});

Action36.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});

Action37.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});
		
Action38.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});

Action39.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});

Action40.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, " No Ip address selected", "Ploblem", JOptionPane.WARNING_MESSAGE);
		
	}
});
	

		
		
		Action3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, " No scanning results are available, please perform a scan first", "Ploblem", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		

		
		JMenu openMenu = new JMenu("open");
		JMenu SelectionMenu = new JMenu("Selection");
		
		ScanMenu.add(Action1);
		ScanMenu.add(Action2);
		ScanMenu.add(Action3);
		ScanMenu.addSeparator();
		ScanMenu.add(Action4);
		
		GotoMenu.add(Action5);
		GotoMenu.add(Action6);
		GotoMenu.add(Action7);
		GotoMenu.addSeparator();
		GotoMenu.add(Action8);
		GotoMenu.add(Action9);
		GotoMenu.add(Action10);
		GotoMenu.addSeparator();
		GotoMenu.add(Action11);
		
		CommandsMenu.add(Action12);
		CommandsMenu.addSeparator();
		CommandsMenu.add(Action13);
		CommandsMenu.add(Action14);
		CommandsMenu.addSeparator();
		CommandsMenu.add(Action15);
		CommandsMenu.add(Action16);
		CommandsMenu.addSeparator();
		CommandsMenu.add(openMenu);

		FavoritesMenu.add(Action18);
		FavoritesMenu.add(Action19);
		
		ToolsMenu.add(Action20);
		ToolsMenu.add(Action21);
		ToolsMenu.addSeparator();
		ToolsMenu.add(SelectionMenu);
		ToolsMenu.add(Action23);
		
		HelpMenu.add(Action24);
		HelpMenu.addSeparator();
		HelpMenu.add(Action25);
		HelpMenu.add(Action26);
		HelpMenu.add(Action27);
		HelpMenu.add(Action28);
		HelpMenu.addSeparator();
		HelpMenu.add(Action29);
		HelpMenu.addSeparator();
		HelpMenu.add(Action30);
		HelpMenu.addSeparator();
		HelpMenu.add(Action31);
		
		openMenu.add(Action32);
		openMenu.addSeparator();
		openMenu.add(Action33);
		openMenu.add(Action34);
		openMenu.add(Action35);
		openMenu.add(Action36);
		openMenu.add(Action37);
		openMenu.add(Action38);
		openMenu.add(Action39);
		openMenu.add(Action40);
		
		SelectionMenu.add(Action41);
		SelectionMenu.add(Action42);
		SelectionMenu.add(Action43);
		SelectionMenu.add(Action44);
		SelectionMenu.addSeparator();
		SelectionMenu.add(Action45);
		// menu end

		// statusbar begin

		JPanel statusPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		add(statusPanel, BorderLayout.SOUTH);
		JLabel readyLabel = new JLabel("Ready");
		JLabel displayLabel = new JLabel("Display All");
		JLabel threadLabel = new JLabel("Thread: 0");
		statusPanel.add(readyLabel);
		statusPanel.add(displayLabel);
		statusPanel.add(threadLabel);
		readyLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
		displayLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
		threadLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
		readyLabel.setPreferredSize(new Dimension(300, 20));
		displayLabel.setPreferredSize(new Dimension(150, 20));
		threadLabel.setPreferredSize(new Dimension(150, 20));
		/*readyLabel.setFont(myFont);
		displayLabel.setFont(myFont);
		threadLabel.setFont(myFont);*/
		// statusbar end

		// table begin
		String titles[] = new String[] { "IP", "Ping", "TTL", "Hostname", "Ports[0+]" };
		Object[][] stats = initializeTableData();
		JTable jTable = new JTable(stats, titles);
		



		JScrollPane sp = new JScrollPane(jTable);
		add(sp, BorderLayout.CENTER);
		// table end

		// toolbar begin
		JToolBar toolbar1 = new JToolBar();
		toolbar1.setLayout(new FlowLayout(FlowLayout.LEFT));
		JToolBar toolbar2 = new JToolBar();
		toolbar2.setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel IbRangStart = new JLabel("IP Range:    ");
		JTextField tfRangeStart = new JTextField(10);
		JLabel IbRangend = new JLabel("to ");
		JTextField tfRangend = new JTextField(10);

		//IbRangend.setFont(myFont);
		tfRangend.setPreferredSize(new Dimension(90, 30));
		//IbRangStart.setFont(myFont);
		tfRangeStart.setPreferredSize(new Dimension(90, 30));

		
		JButton btset;
		ImageIcon img1 = new ImageIcon("./Start/set.jpg");
		btset= new JButton(img1);
		btset.setPreferredSize(new Dimension(35, 30));

		
		
		JButton btline;
		ImageIcon img2 = new ImageIcon("./Start/line.jpg");
		btline= new JButton(img2);
		btline.setPreferredSize(new Dimension(35, 30)); 



		
		
		
		JLabel lbHostname = new JLabel("Hostname: ");
		JTextField tfHostname = new JTextField(10);
		JButton btup = new JButton("IP");
		JComboBox cbOption = new JComboBox();
		cbOption.addItem("NetMask");
		cbOption.addItem("/26");
		cbOption.addItem("/24");
		cbOption.addItem("255...192");
		cbOption.addItem("255...128");
		cbOption.addItem("255...0");
		cbOption.addItem("255...0.0");
		cbOption.addItem("255...0.0.0");
		
		JButton btStart;
		ImageIcon img = new ImageIcon("./Start/Start.jpg");
		btStart= new JButton(img);
		btStart.setPreferredSize(new Dimension(300, 50)); 

		JComboBox ch1 = new JComboBox();
		ch1.addItem("IP RANGE ");
		ch1.addItem("RANDOM");
		ch1.addItem("TEXT FILE");

		//lbHostname.setFont(myFont);
		tfHostname.setPreferredSize(new Dimension(90, 30));
		btup.setPreferredSize(new Dimension(90, 30));
		cbOption.setPreferredSize(new Dimension(90, 30));
		btStart.setPreferredSize(new Dimension(90, 30));


		tfHostname.setPreferredSize(new Dimension(90, 30));
		tfHostname.setPreferredSize(new Dimension(90, 30));
		cbOption.setPreferredSize(new Dimension(94, 30));
		btup.setPreferredSize(new Dimension(35, 30));
		btStart.setPreferredSize(new Dimension(90, 30));
		ch1.setPreferredSize(new Dimension(90, 30));
		
		toolbar1.add(IbRangStart);
		toolbar1.add(tfRangeStart);
		toolbar1.add(IbRangend);
		toolbar1.add(tfRangend);
		toolbar1.add(ch1);
		toolbar1.add(btset);
		
		toolbar2.add(lbHostname);
		toolbar2.add(tfHostname);
		toolbar2.add(btup);
		toolbar2.add(cbOption);
		toolbar2.add(btStart);
		toolbar2.add(btline);

		JPanel pane = new JPanel(new BorderLayout());
		pane.add(toolbar1, BorderLayout.NORTH);
		pane.add(toolbar2, BorderLayout.SOUTH);

		add(pane, BorderLayout.NORTH);

		// toolbar end

		String myIp = null;
		String myHostname = null;
		try {
			InetAddress ia = InetAddress.getLocalHost();

			myIp = ia.getHostAddress();
			myHostname = ia.getHostName();
		} catch (Exception e) {

		}
		String fixedIp = myIp.substring(0, myIp.lastIndexOf(".") + 1);
		tfRangeStart.setText(fixedIp + "1");
		tfRangend.setText(fixedIp + "254");
		tfHostname.setText(myHostname);

		// System.out.println(myIp + " " + myHostname);

		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);


		
		
		btStart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
					
				JOptionPane.showMessageDialog(null, " 실행을 시작합니다.", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
				
				Pinging[] pg = new Pinging[254];
				// add

				
				
				for(int i=0; i<=253; i++ ) {
					pg[i] = new Pinging(fixedIp+ (i+1));
					pg[i].start();
				}
				
				for(int i=0; i<=253; i++) {
					Object[] msg = pg[i].getMsg();
						
					if(msg[1] != null) {
						
						for (int port = 1; port <= 1024; port++) {
							futures.add(portlsOpen(es, ip, port, timeout));
						}
						try {
							es.awaitTermination(200L, TimeUnit.MILLISECONDS);
							int openPorts = 0;
							for (final Future<ScanResult> f : futures) {
								if (f.get().isOpen()) {
									openPorts++;
									
									getport = Integer.toString(f.get().getPort());
									
									break;
								}
							} 
						} catch (Exception e2) {
							e2.printStackTrace();
						}

						stats[i][4] = getport;
						
					}
					if(msg[1] == null) {
						msg[1] = "[n/a]";
						msg[2] = "[n/s]";
						msg[3] = "[n/s]";
						stats[i][4] = "[n/s]";
					}else if(msg[3] == null) {
						msg[3] = "[n/a]";
					}

					stats[i][0] = msg[0];
					stats[i][1] = msg[1];
					stats[i][2] = msg[2];
					stats[i][3] = msg[3];

				}
				jTable.repaint();
				JOptionPane.showMessageDialog(null, "실행완료!", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);
						
			}
				
			
		});
			
		
	}
	
	public static Future<ScanResult> portlsOpen(final ExecutorService es, final String ip, final int port, final int timeout){
		return es.submit(new Callable<ScanResult>() {
			public ScanResult call() {
				try {
					Socket socket = new Socket();
					socket.connect(new InetSocketAddress(ip, port), timeout);
					socket.close();
					return new ScanResult(port, true);
				}catch (Exception ex) {
					return new ScanResult(port, false);
				}
			}
		});
	}
		
	public Object[][] initializeTableData() {
		Object[][] results = new Object[254][5];
		return results;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test op = new Test();
	}

}