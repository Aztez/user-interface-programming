//User Interface Programming coursework by Atte Tornberg 2019

//imported packages
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.border.AbstractBorder;
import javax.swing.ListCellRenderer;
import javax.imageio.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("unchecked") 

//class
public class theHub{
	
	//start screen of the Hub
	theHub(){
		
		//creating frame
		JFrame frame = new JFrame("The Hub");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
		//creating top panel
		JPanel top = new JPanel();
		top.setLayout(new BorderLayout());
		top.setBackground(Color.WHITE);
		top.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		frame.getContentPane().add(top);
		
		//creating bottom panel
		JPanel bottom = new JPanel();
		bottom.setLayout(new GridLayout(3,3,45,45));
		bottom.setBackground(Color.WHITE);
		bottom.setBorder(BorderFactory.createEmptyBorder(25,25,25,25));
		frame.getContentPane().add(bottom);
		
		//setting up icons
		ImageIcon icon1 = new ImageIcon("resources/image10.png");
		ImageIcon icon2 = new ImageIcon("resources/image1.png");
		ImageIcon icon3 = new ImageIcon("resources/image9.png");
		ImageIcon icon4 = new ImageIcon("resources/image8.png");
		ImageIcon icon5 = new ImageIcon("resources/image2.png");
		
		//creating objects
		JLabel label1 = new JLabel("   The Hub");
		JLabel label2 = new JLabel("16.25");
		JButton button1 = new JButton(icon1);
		JButton button2 = new JButton("Sisalampotila");
		JButton button3 = new JButton("Valot olohuone");
		JButton button4 = new JButton("Valot keittio");
		JButton button5 = new JButton("Jaakaappi");
		JButton button6 = new JButton("19.2 C");
		JButton button7 = new JButton("Tunnelma");
		JButton button8 = new JButton("Kylma");
		JButton button9 = new JButton("4 C");
		JButton toggle1 = new JButton(icon3);
		JButton toggle2 = new JButton(icon4);
		JButton empty1 = new JButton();
		JButton empty2 = new JButton();
		JButton empty3 = new JButton();
		JButton empty4 = new JButton();
		JButton empty5 = new JButton();
		JButton empty6 = new JButton();
		JButton empty7 = new JButton();
		JButton empty8 = new JButton();
		JButton empty9 = new JButton();
		JLabel empty10 = new JLabel();
		JLabel empty11 = new JLabel();
		JLabel empty12 = new JLabel();
		
		//big panels for handling smaller objects inside them
		ImagePanel big1 = new ImagePanel(new ImageIcon("resources/image1.png").getImage());
		big1.setLayout(new GridLayout(2,2));
		big1.setBackground(Color.WHITE);
		big1.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		frame.getContentPane().add(big1);
		
		ImagePanel big2 = new ImagePanel(new ImageIcon("resources/image1.png").getImage());
		big2.setLayout(new GridLayout(2,2));
		big2.setBackground(Color.WHITE);
		big2.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		frame.getContentPane().add(big2);
  
		ImagePanel big3 = new ImagePanel(new ImageIcon("resources/image1.png").getImage());
		big3.setLayout(new GridLayout(2,2));
		big3.setBackground(Color.WHITE);
		big3.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		frame.getContentPane().add(big3);
		
		ImagePanel big4 = new ImagePanel(new ImageIcon("resources/image1.png").getImage());
		big4.setLayout(new GridLayout(2,2));
		big4.setBackground(Color.WHITE);
		big4.setBorder(BorderFactory.createEmptyBorder(15,15,15,15));
		frame.getContentPane().add(big4);
  
		//customising buttons
		button1.setMargin(new Insets(0,0,0,0));
		button1.setBorder(null);
		button1.setBackground(null);
		
		button2.setMargin(new Insets(0,0,0,0));
		button2.setBorder(null);
		button2.setBackground(null);
		button2.setFont(new Font("SansSerif", Font.PLAIN, 16));
		button2.setHorizontalAlignment(SwingConstants.LEFT);
		
		button3.setMargin(new Insets(0,0,0,0));
		button3.setBorder(null);
		button3.setBackground(null);
		button3.setFont(new Font("SansSerif", Font.PLAIN, 16));
		button3.setHorizontalAlignment(SwingConstants.LEFT);
		
		button4.setMargin(new Insets(0,0,0,0));
		button4.setBorder(null);
		button4.setBackground(null);
		button4.setFont(new Font("SansSerif", Font.PLAIN, 16));
		button4.setHorizontalAlignment(SwingConstants.LEFT);
		
		button5.setMargin(new Insets(0,0,0,0));
		button5.setBorder(null);
		button5.setBackground(null);
		button5.setFont(new Font("SansSerif", Font.PLAIN, 16));
		button5.setHorizontalAlignment(SwingConstants.LEFT);
		
		button6.setMargin(new Insets(0,0,0,0));
		button6.setBorder(null);
		button6.setBackground(null);
		button6.setFont(new Font("SansSerif", Font.PLAIN, 26));
		button6.setHorizontalAlignment(SwingConstants.LEFT);
		
		button7.setMargin(new Insets(0,0,0,0));
		button7.setBorder(null);
		button7.setBackground(null);
		button7.setFont(new Font("SansSerif", Font.PLAIN, 26));
		button7.setHorizontalAlignment(SwingConstants.LEFT);
		
		button8.setMargin(new Insets(0,0,0,0));
		button8.setBorder(null);
		button8.setBackground(null);
		button8.setFont(new Font("SansSerif", Font.PLAIN, 26));
		button8.setHorizontalAlignment(SwingConstants.LEFT);
		
		button9.setMargin(new Insets(0,0,0,0));
		button9.setBorder(null);
		button9.setBackground(null);
		button9.setFont(new Font("SansSerif", Font.PLAIN, 26));
		button9.setHorizontalAlignment(SwingConstants.LEFT);
		
		toggle1.setMargin(new Insets(0,0,0,0));
		toggle1.setBorder(null);
		toggle1.setBackground(null);
		toggle1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		toggle2.setMargin(new Insets(0,0,0,0));
		toggle2.setBorder(null);
		toggle2.setBackground(null);
		toggle2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		empty1.setMargin(new Insets(0,0,0,0));
		empty1.setBorder(null);
		empty1.setBackground(null);
		empty1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		empty2.setMargin(new Insets(0,0,0,0));
		empty2.setBorder(null);
		empty2.setBackground(null);
		empty2.setHorizontalAlignment(SwingConstants.RIGHT);
		
		empty3.setMargin(new Insets(0,0,0,0));
		empty3.setBorder(null);
		empty3.setBackground(null);
		empty3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		empty4.setMargin(new Insets(0,0,0,0));
		empty4.setBorder(null);
		empty4.setBackground(null);
		empty4.setHorizontalAlignment(SwingConstants.RIGHT);
		
		empty5.setMargin(new Insets(0,0,0,0));
		empty5.setBorder(null);
		empty5.setBackground(null);
		empty5.setHorizontalAlignment(SwingConstants.RIGHT);
		
		empty6.setMargin(new Insets(0,0,0,0));
		empty6.setBorder(null);
		empty6.setBackground(null);
		empty6.setHorizontalAlignment(SwingConstants.RIGHT);
		
		empty7.setMargin(new Insets(0,0,0,0));
		empty7.setBorder(null);
		empty7.setBackground(null);
		empty7.setHorizontalAlignment(SwingConstants.RIGHT);
		
		empty8.setMargin(new Insets(0,0,0,0));
		empty8.setBorder(null);
		empty8.setBackground(null);
		empty8.setHorizontalAlignment(SwingConstants.RIGHT);
		
		empty9.setMargin(new Insets(0,0,0,0));
		empty9.setBorder(null);
		empty9.setBackground(null);
		empty9.setHorizontalAlignment(SwingConstants.RIGHT);
		
		//adding objects to the panels
		top.add(button1, "West");
		top.add(label1, "Center");
		top.add(label2, "East");
		bottom.add(big1);
		bottom.add(big2);
		bottom.add(big3);
		bottom.add(big4);
		bottom.add(empty10);
		bottom.add(empty11);
		bottom.add(empty12); 
		
		//setting the panel locations
		frame.getContentPane().add(top, "North");
		frame.getContentPane().add(bottom, "Center");
		
		//setting font style for text
		Font f = new Font("SansSerif",Font.PLAIN,40);
		label1.setFont(f);
		label2.setFont(f);
		
		//adding the big panels
		big1.add(button2);
		big1.add(empty4);
		big1.add(button6);
		big1.add(empty5);
		
		big2.add(button3);
		big2.add(toggle1);
		big2.add(button7);
		big2.add(empty6);
		
		big3.add(button4);
		big3.add(toggle2);
		big3.add(button8);
		big3.add(empty7);
		
		big4.add(button5);
		big4.add(empty8);
		big4.add(button9);
		big4.add(empty9);
		
		//functions for adding new device
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
				frame.dispose();
				JFrame frame2 = new JFrame("The Hub");
				frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame2.setSize(new Dimension(1000, 800));
				frame2.setLocationRelativeTo(null);
				frame2.setResizable(false);
				frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame2.setVisible(true);
			
				//creating top panel
				JPanel top = new JPanel();
				top.setLayout(new BorderLayout());
				top.setBackground(Color.WHITE);
				top.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
				frame2.getContentPane().add(top);
			
				//creating bottom panel
				JPanel bottom = new JPanel();
				bottom.setLayout(new GridLayout(5,1));
				bottom.setBackground(Color.WHITE);
				bottom.setBorder(BorderFactory.createEmptyBorder(10,120,350,300));
				frame2.getContentPane().add(bottom);
				
				//setting the panel locations
				frame2.getContentPane().add(top, "North");
				frame2.getContentPane().add(bottom, "Center");
			
				//creating top objects & customising them
				ImageIcon icon1 = new ImageIcon("resources/image7.png");
				JButton button1 = new JButton(icon1);
				button1.setMargin(new Insets(0, 0, 0, 0));
				button1.setBorder(null);
				button1.setBackground(null);
				JLabel label1 = new JLabel("   Lisaa laite");
				Font f = new Font("SansSerif",Font.PLAIN,40);
				label1.setFont(f);
				
				//adding objects to the panels
				top.add(button1, "West");
				top.add(label1, "Center");
				
				//creating objects
				String[] deviceList = { "Smart-TV", "UnknownDevice", "Termostaatti"};
				JComboBox<String> combo = new JComboBox<>(deviceList);
				combo.setBorder(new SimpleRoundBorder());
				combo.setRenderer(new MyComboBoxRenderer("Selaa laitteita klikkaamalla..."));
				combo.setSelectedIndex(-1);
				JTextField textfield = new JTextField("Syota nimi klikkaamalla...",10);
				JButton button9 = new JButton("", icon5);
				JLabel title1 = new JLabel("Valitse laite");
				JLabel title2 = new JLabel("Laitteen nimi");
				
				//adding objects
				bottom.add(title1);
				bottom.add(combo);
				bottom.add(title2);
				bottom.add(textfield);
				bottom.add(button9);
				
				//customising objects
				combo.setBackground(null);
				combo.setFont(new Font("SansSerif", Font.PLAIN, 26));
				
				title1.setBackground(null);
				title1.setFont(new Font("SansSerif", Font.PLAIN, 12));
				title1.setHorizontalAlignment(SwingConstants.LEFT);
				
				title2.setBackground(null);
				title2.setFont(new Font("SansSerif", Font.PLAIN, 12));
				title2.setHorizontalAlignment(SwingConstants.LEFT);
			
				textfield.setMargin(new Insets(0,0,0,0));
				textfield.setBorder(new SimpleRoundBorder());
				textfield.setBackground(null);
				textfield.setFont(new Font("SansSerif", Font.PLAIN, 26));
				textfield.setHorizontalAlignment(SwingConstants.LEFT);
		
				button9.setMargin(new Insets(0,0,0,0));
				button9.setBorder(null);
				button9.setBackground(null);
				button9.setFont(new Font("SansSerif", Font.PLAIN, 26));
				button9.setHorizontalAlignment(SwingConstants.RIGHT);
				
				//clear text input field
				textfield.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseClicked(MouseEvent e){
						textfield.setText("");
					}
				});
			
				//closing action for add device window
				button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						frame2.dispose();
						new theHub();
					}
				});
				
				//action for save button
				button9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(2,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 26));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("haluat lisata laitteen?");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 26));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
								frame2.dispose();
								new theHub();
								
							}
						});
					}
				});	
			}
		});
		
		//functions for editing existing device
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
				frame.dispose();
				JFrame frame3 = new JFrame("The Hub");
				frame3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame3.setSize(new Dimension(1000, 800));
				frame3.setLocationRelativeTo(null);
				frame3.setResizable(false);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.setVisible(true);
				
				//creating top panel
				JPanel top = new JPanel();
				top.setLayout(new BorderLayout());
				top.setBackground(Color.WHITE);
				top.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
				frame3.getContentPane().add(top);
				
				//creating center panel
				JPanel center = new JPanel();
				center.setLayout(new GridLayout(2,1));
				center.setBackground(Color.WHITE);
				center.setBorder(BorderFactory.createEmptyBorder(25,120,0,300));
				frame3.getContentPane().add(center);
				
				//creating bottom panel
				JPanel bottom = new JPanel();
				bottom.setLayout(new GridLayout(4,2,15,15));
				bottom.setBackground(Color.WHITE);
				bottom.setBorder(BorderFactory.createEmptyBorder(25,120,320,300));
				frame3.getContentPane().add(bottom);
				
				//setting the panel locations
				frame3.getContentPane().add(top, "North");
				frame3.getContentPane().add(center, "Center");
				frame3.getContentPane().add(bottom, "South");
			
				//creating top objects & customising them
				ImageIcon icon1 = new ImageIcon("resources/image7.png");
				JButton button1 = new JButton(icon1);
				button1.setMargin(new Insets(0, 0, 0, 0));
				button1.setBorder(null);
				button1.setBackground(null);
				ImageIcon icon2 = new ImageIcon("resources/image8002.png");
				JButton button2 = new JButton(icon2);
				button2.setMargin(new Insets(0, 0, 0, 0));
				button2.setBorder(null);
				button2.setBackground(null);
				JLabel label1 = new JLabel("   Sisalampotila");
				Font f = new Font("SansSerif",Font.PLAIN,40);
				label1.setFont(f);
				
				//adding objects to the panels
				top.add(button1, "West");
				top.add(label1, "Center");
				top.add(button2, "East");
				
				//creating objects
				JLabel label2 = new JLabel("Laitteen nimi");
				JTextField textfield = new JTextField("Sisalampotila");
				JLabel label3 = new JLabel("Lampotila");
				JLabel label4 = new JLabel("Laitteen tila");
				JButton button8 = new JButton("", icon3);
				JLabel label5 = new JLabel("Nayta tila aloitusnaytossa");
				JButton button9 = new JButton("", icon4);
				
				//Creating spinner
				SpinnerNumberModel spin = new SpinnerNumberModel(19.2, 19.2 - 10.0, 19.2 + 10.0, 0.1);
				JSpinner spinneri = new JSpinner(spin);
				
				//adding buttons
				center.add(label2);
				center.add(textfield);
				bottom.add(label3);
				bottom.add(spinneri);
				bottom.add(label4);
				bottom.add(button8);
				bottom.add(label5);
				bottom.add(button9);
				
				//customising objects
				label2.setBackground(null);
				label2.setFont(new Font("SansSerif", Font.PLAIN, 12));
				label2.setHorizontalAlignment(SwingConstants.LEFT);
				
				textfield.setMargin(new Insets(0,0,0,0));
				textfield.setBorder(new SimpleRoundBorder());
				textfield.setBackground(null);
				textfield.setFont(new Font("SansSerif", Font.PLAIN, 24));
				textfield.setHorizontalAlignment(SwingConstants.LEFT);
				
				label3.setBackground(null);
				label3.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label3.setHorizontalAlignment(SwingConstants.LEFT);
				
				spinneri.setBackground(null);
				spinneri.setFont(new Font("SansSerif", Font.PLAIN, 24));
				
				label4.setBackground(null);
				label4.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label4.setHorizontalAlignment(SwingConstants.LEFT);
				
				label5.setBackground(null);
				label5.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label5.setHorizontalAlignment(SwingConstants.LEFT);
				
				button8.setMargin(new Insets(0,0,0,0));
				button8.setBorder(null);
				button8.setBackground(null);
				button8.setFont(new Font("SansSerif", Font.PLAIN, 24));
				button8.setHorizontalAlignment(SwingConstants.RIGHT);
		
				button9.setMargin(new Insets(0,0,0,0));
				button9.setBorder(null);
				button9.setBackground(null);
				button9.setFont(new Font("SansSerif", Font.PLAIN, 24));
				button9.setHorizontalAlignment(SwingConstants.RIGHT);
				
				//clear text input field
				textfield.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseClicked(MouseEvent e){
						textfield.setText("");
					}
				});
				
				//closing action for device information window
				button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						frame3.dispose();
						new theHub();
					}
				});
				
				//action for delete button
				button2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(2,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("haluat poistaa laitteen?");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
								frame3.dispose();
								new theHub();
								
							}
						});
					}
				});	
				
				//action for toggle switch
				button8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(2,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta haluat");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("kytkea laitteen pois paalta?");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
					}
				});	
				
				//action for toggle switch
				button9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(3,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta haluat");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("nayttaa laitteen tilan");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label3 = new JLabel("aloitusnaytossa?");
						label3.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label3.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						top.add(label3);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
					}
				});	
			}
		});
		
		//functions for editing existing device
		empty4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
				frame.dispose();
				JFrame frame3 = new JFrame("The Hub");
				frame3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame3.setSize(new Dimension(1000, 800));
				frame3.setLocationRelativeTo(null);
				frame3.setResizable(false);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.setVisible(true);
				
				//creating top panel
				JPanel top = new JPanel();
				top.setLayout(new BorderLayout());
				top.setBackground(Color.WHITE);
				top.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
				frame3.getContentPane().add(top);
				
				//creating center panel
				JPanel center = new JPanel();
				center.setLayout(new GridLayout(2,1));
				center.setBackground(Color.WHITE);
				center.setBorder(BorderFactory.createEmptyBorder(25,120,0,300));
				frame3.getContentPane().add(center);
				
				//creating bottom panel
				JPanel bottom = new JPanel();
				bottom.setLayout(new GridLayout(4,2,15,15));
				bottom.setBackground(Color.WHITE);
				bottom.setBorder(BorderFactory.createEmptyBorder(25,120,320,300));
				frame3.getContentPane().add(bottom);
				
				//setting the panel locations
				frame3.getContentPane().add(top, "North");
				frame3.getContentPane().add(center, "Center");
				frame3.getContentPane().add(bottom, "South");
			
				//creating top objects & customising them
				ImageIcon icon1 = new ImageIcon("resources/image7.png");
				JButton button1 = new JButton(icon1);
				button1.setMargin(new Insets(0, 0, 0, 0));
				button1.setBorder(null);
				button1.setBackground(null);
				ImageIcon icon2 = new ImageIcon("resources/image8002.png");
				JButton button2 = new JButton(icon2);
				button2.setMargin(new Insets(0, 0, 0, 0));
				button2.setBorder(null);
				button2.setBackground(null);
				JLabel label1 = new JLabel("   Sisalampotila");
				Font f = new Font("SansSerif",Font.PLAIN,40);
				label1.setFont(f);
				
				//adding objects to the panels
				top.add(button1, "West");
				top.add(label1, "Center");
				top.add(button2, "East");
				
				//creating objects
				JLabel label2 = new JLabel("Laitteen nimi");
				JTextField textfield = new JTextField("Sisalampotila");
				JLabel label3 = new JLabel("Lampotila");
				JLabel label4 = new JLabel("Laitteen tila");
				JButton button8 = new JButton("", icon3);
				JLabel label5 = new JLabel("Nayta tila aloitusnaytossa");
				JButton button9 = new JButton("", icon4);
				
				//Creating spinner
				SpinnerNumberModel spin = new SpinnerNumberModel(19.2, 19.2 - 10.0, 19.2 + 10.0, 0.1);
				JSpinner spinneri = new JSpinner(spin);
				
				//adding buttons
				center.add(label2);
				center.add(textfield);
				bottom.add(label3);
				bottom.add(spinneri);
				bottom.add(label4);
				bottom.add(button8);
				bottom.add(label5);
				bottom.add(button9);
				
				//customising objects
				label2.setBackground(null);
				label2.setFont(new Font("SansSerif", Font.PLAIN, 12));
				label2.setHorizontalAlignment(SwingConstants.LEFT);
				
				textfield.setMargin(new Insets(0,0,0,0));
				textfield.setBorder(new SimpleRoundBorder());
				textfield.setBackground(null);
				textfield.setFont(new Font("SansSerif", Font.PLAIN, 24));
				textfield.setHorizontalAlignment(SwingConstants.LEFT);
				
				label3.setBackground(null);
				label3.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label3.setHorizontalAlignment(SwingConstants.LEFT);
				
				spinneri.setBackground(null);
				spinneri.setFont(new Font("SansSerif", Font.PLAIN, 24));
				
				label4.setBackground(null);
				label4.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label4.setHorizontalAlignment(SwingConstants.LEFT);
				
				label5.setBackground(null);
				label5.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label5.setHorizontalAlignment(SwingConstants.LEFT);
				
				button8.setMargin(new Insets(0,0,0,0));
				button8.setBorder(null);
				button8.setBackground(null);
				button8.setFont(new Font("SansSerif", Font.PLAIN, 24));
				button8.setHorizontalAlignment(SwingConstants.RIGHT);
		
				button9.setMargin(new Insets(0,0,0,0));
				button9.setBorder(null);
				button9.setBackground(null);
				button9.setFont(new Font("SansSerif", Font.PLAIN, 24));
				button9.setHorizontalAlignment(SwingConstants.RIGHT);
				
				//clear text input field
				textfield.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseClicked(MouseEvent e){
						textfield.setText("");
					}
				});
				
				//closing action for device information window
				button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						frame3.dispose();
						new theHub();
					}
				});
				
				//action for delete button
				button2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(2,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("haluat poistaa laitteen?");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
								frame3.dispose();
								new theHub();
								
							}
						});
					}
				});	
				
				//action for toggle switch
				button8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(2,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta haluat");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("kytkea laitteen pois paalta?");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
					}
				});	
				
				//action for toggle switch
				button9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(3,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta haluat");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("nayttaa laitteen tilan");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label3 = new JLabel("aloitusnaytossa?");
						label3.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label3.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						top.add(label3);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
					}
				});	
			}
		});
		
		//functions for editing existing device
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
				frame.dispose();
				JFrame frame3 = new JFrame("The Hub");
				frame3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame3.setSize(new Dimension(1000, 800));
				frame3.setLocationRelativeTo(null);
				frame3.setResizable(false);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.setVisible(true);
				
				//creating top panel
				JPanel top = new JPanel();
				top.setLayout(new BorderLayout());
				top.setBackground(Color.WHITE);
				top.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
				frame3.getContentPane().add(top);
				
				//creating center panel
				JPanel center = new JPanel();
				center.setLayout(new GridLayout(2,1));
				center.setBackground(Color.WHITE);
				center.setBorder(BorderFactory.createEmptyBorder(25,120,0,300));
				frame3.getContentPane().add(center);
				
				//creating bottom panel
				JPanel bottom = new JPanel();
				bottom.setLayout(new GridLayout(4,2,15,15));
				bottom.setBackground(Color.WHITE);
				bottom.setBorder(BorderFactory.createEmptyBorder(25,120,320,300));
				frame3.getContentPane().add(bottom);
				
				//setting the panel locations
				frame3.getContentPane().add(top, "North");
				frame3.getContentPane().add(center, "Center");
				frame3.getContentPane().add(bottom, "South");
			
				//creating top objects & customising them
				ImageIcon icon1 = new ImageIcon("resources/image7.png");
				JButton button1 = new JButton(icon1);
				button1.setMargin(new Insets(0, 0, 0, 0));
				button1.setBorder(null);
				button1.setBackground(null);
				ImageIcon icon2 = new ImageIcon("resources/image8002.png");
				JButton button2 = new JButton(icon2);
				button2.setMargin(new Insets(0, 0, 0, 0));
				button2.setBorder(null);
				button2.setBackground(null);
				JLabel label1 = new JLabel("   Sisalampotila");
				Font f = new Font("SansSerif",Font.PLAIN,40);
				label1.setFont(f);
				
				//adding objects to the panels
				top.add(button1, "West");
				top.add(label1, "Center");
				top.add(button2, "East");
				
				//creating objects
				JLabel label2 = new JLabel("Laitteen nimi");
				JTextField textfield = new JTextField("Sisalampotila");
				JLabel label3 = new JLabel("Lampotila");
				JLabel label4 = new JLabel("Laitteen tila");
				JButton button8 = new JButton("", icon3);
				JLabel label5 = new JLabel("Nayta tila aloitusnaytossa");
				JButton button9 = new JButton("", icon4);
				
				//Creating spinner
				SpinnerNumberModel spin = new SpinnerNumberModel(19.2, 19.2 - 10.0, 19.2 + 10.0, 0.1);
				JSpinner spinneri = new JSpinner(spin);
				
				//adding buttons
				center.add(label2);
				center.add(textfield);
				bottom.add(label3);
				bottom.add(spinneri);
				bottom.add(label4);
				bottom.add(button8);
				bottom.add(label5);
				bottom.add(button9);
				
				//customising objects
				label2.setBackground(null);
				label2.setFont(new Font("SansSerif", Font.PLAIN, 12));
				label2.setHorizontalAlignment(SwingConstants.LEFT);
				
				textfield.setMargin(new Insets(0,0,0,0));
				textfield.setBorder(new SimpleRoundBorder());
				textfield.setBackground(null);
				textfield.setFont(new Font("SansSerif", Font.PLAIN, 24));
				textfield.setHorizontalAlignment(SwingConstants.LEFT);
				
				label3.setBackground(null);
				label3.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label3.setHorizontalAlignment(SwingConstants.LEFT);
				
				spinneri.setBackground(null);
				spinneri.setFont(new Font("SansSerif", Font.PLAIN, 24));
				
				label4.setBackground(null);
				label4.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label4.setHorizontalAlignment(SwingConstants.LEFT);
				
				label5.setBackground(null);
				label5.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label5.setHorizontalAlignment(SwingConstants.LEFT);
				
				button8.setMargin(new Insets(0,0,0,0));
				button8.setBorder(null);
				button8.setBackground(null);
				button8.setFont(new Font("SansSerif", Font.PLAIN, 24));
				button8.setHorizontalAlignment(SwingConstants.RIGHT);
		
				button9.setMargin(new Insets(0,0,0,0));
				button9.setBorder(null);
				button9.setBackground(null);
				button9.setFont(new Font("SansSerif", Font.PLAIN, 24));
				button9.setHorizontalAlignment(SwingConstants.RIGHT);
				
				//clear text input field
				textfield.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseClicked(MouseEvent e){
						textfield.setText("");
					}
				});
				
				//closing action for device information window
				button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						frame3.dispose();
						new theHub();
					}
				});
				
				//action for delete button
				button2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(2,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("haluat poistaa laitteen?");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
								frame3.dispose();
								new theHub();
								
							}
						});
					}
				});	
				
				//action for toggle switch
				button8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(2,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta haluat");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("kytkea laitteen pois paalta?");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
					}
				});	
				
				//action for toggle switch
				button9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(3,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta haluat");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("nayttaa laitteen tilan");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label3 = new JLabel("aloitusnaytossa?");
						label3.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label3.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						top.add(label3);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
					}
				});	
			}
		});
		
		//functions for editing existing device
		empty5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			
				frame.dispose();
				JFrame frame3 = new JFrame("The Hub");
				frame3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
				frame3.setSize(new Dimension(1000, 800));
				frame3.setLocationRelativeTo(null);
				frame3.setResizable(false);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.setVisible(true);
				
				//creating top panel
				JPanel top = new JPanel();
				top.setLayout(new BorderLayout());
				top.setBackground(Color.WHITE);
				top.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
				frame3.getContentPane().add(top);
				
				//creating center panel
				JPanel center = new JPanel();
				center.setLayout(new GridLayout(2,1));
				center.setBackground(Color.WHITE);
				center.setBorder(BorderFactory.createEmptyBorder(25,120,0,300));
				frame3.getContentPane().add(center);
				
				//creating bottom panel
				JPanel bottom = new JPanel();
				bottom.setLayout(new GridLayout(4,2,15,15));
				bottom.setBackground(Color.WHITE);
				bottom.setBorder(BorderFactory.createEmptyBorder(25,120,320,300));
				frame3.getContentPane().add(bottom);
				
				//setting the panel locations
				frame3.getContentPane().add(top, "North");
				frame3.getContentPane().add(center, "Center");
				frame3.getContentPane().add(bottom, "South");
			
				//creating top objects & customising them
				ImageIcon icon1 = new ImageIcon("resources/image7.png");
				JButton button1 = new JButton(icon1);
				button1.setMargin(new Insets(0, 0, 0, 0));
				button1.setBorder(null);
				button1.setBackground(null);
				ImageIcon icon2 = new ImageIcon("resources/image8002.png");
				JButton button2 = new JButton(icon2);
				button2.setMargin(new Insets(0, 0, 0, 0));
				button2.setBorder(null);
				button2.setBackground(null);
				JLabel label1 = new JLabel("   Sisalampotila");
				Font f = new Font("SansSerif",Font.PLAIN,40);
				label1.setFont(f);
				
				//adding objects to the panels
				top.add(button1, "West");
				top.add(label1, "Center");
				top.add(button2, "East");
				
				//creating objects
				JLabel label2 = new JLabel("Laitteen nimi");
				JTextField textfield = new JTextField("Sisalampotila");
				JLabel label3 = new JLabel("Lampotila");
				JLabel label4 = new JLabel("Laitteen tila");
				JButton button8 = new JButton("", icon3);
				JLabel label5 = new JLabel("Nayta tila aloitusnaytossa");
				JButton button9 = new JButton("", icon4);
				
				//Creating spinner
				SpinnerNumberModel spin = new SpinnerNumberModel(19.2, 19.2 - 10.0, 19.2 + 10.0, 0.1);
				JSpinner spinneri = new JSpinner(spin);
				
				//adding buttons
				center.add(label2);
				center.add(textfield);
				bottom.add(label3);
				bottom.add(spinneri);
				bottom.add(label4);
				bottom.add(button8);
				bottom.add(label5);
				bottom.add(button9);
				
				//customising objects
				label2.setBackground(null);
				label2.setFont(new Font("SansSerif", Font.PLAIN, 12));
				label2.setHorizontalAlignment(SwingConstants.LEFT);
				
				textfield.setMargin(new Insets(0,0,0,0));
				textfield.setBorder(new SimpleRoundBorder());
				textfield.setBackground(null);
				textfield.setFont(new Font("SansSerif", Font.PLAIN, 24));
				textfield.setHorizontalAlignment(SwingConstants.LEFT);
				
				label3.setBackground(null);
				label3.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label3.setHorizontalAlignment(SwingConstants.LEFT);
				
				spinneri.setBackground(null);
				spinneri.setFont(new Font("SansSerif", Font.PLAIN, 24));
				
				label4.setBackground(null);
				label4.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label4.setHorizontalAlignment(SwingConstants.LEFT);
				
				label5.setBackground(null);
				label5.setFont(new Font("SansSerif", Font.PLAIN, 24));
				label5.setHorizontalAlignment(SwingConstants.LEFT);
				
				button8.setMargin(new Insets(0,0,0,0));
				button8.setBorder(null);
				button8.setBackground(null);
				button8.setFont(new Font("SansSerif", Font.PLAIN, 24));
				button8.setHorizontalAlignment(SwingConstants.RIGHT);
		
				button9.setMargin(new Insets(0,0,0,0));
				button9.setBorder(null);
				button9.setBackground(null);
				button9.setFont(new Font("SansSerif", Font.PLAIN, 24));
				button9.setHorizontalAlignment(SwingConstants.RIGHT);
				
				//clear text input field
				textfield.addMouseListener(new MouseAdapter(){
					@Override
					public void mouseClicked(MouseEvent e){
						textfield.setText("");
					}
				});
				
				//closing action for device information window
				button1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						frame3.dispose();
						new theHub();
					}
				});
				
				//action for delete button
				button2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(2,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("haluat poistaa laitteen?");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
								frame3.dispose();
								new theHub();
								
							}
						});
					}
				});	
				
				//action for toggle switch
				button8.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(2,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(30,30,0,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta haluat");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("kytkea laitteen pois paalta?");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
					}
				});	
				
				//action for toggle switch
				button9.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent ae) {
						
						//creating dialog frame
						JFrame dialog = new JFrame("");
						dialog.setSize(new Dimension(400, 250));
						dialog.setLocationRelativeTo(null);
						dialog.setResizable(false);
						dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						dialog.setVisible(true);
						
						//creating top panel
						JPanel top = new JPanel();
						top.setLayout(new GridLayout(3,1));
						top.setBackground(Color.WHITE);
						top.setBorder(BorderFactory.createEmptyBorder(20,30,20,30));
						dialog.getContentPane().add(top);
					
						//creating bottom panel
						JPanel bottom = new JPanel();
						bottom.setLayout(new GridLayout(1,2));
						bottom.setBackground(Color.WHITE);
						bottom.setBorder(BorderFactory.createEmptyBorder(0,70,30,70));
						dialog.getContentPane().add(bottom);
						
						//setting the panel locations
						dialog.getContentPane().add(top, "North");
						dialog.getContentPane().add(bottom, "Center");
						
						//creating objects
						JLabel label1 = new JLabel("Oletko varma, etta haluat");
						label1.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label1.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label2 = new JLabel("nayttaa laitteen tilan");
						label2.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label2.setHorizontalAlignment(SwingConstants.CENTER);
						JLabel label3 = new JLabel("aloitusnaytossa?");
						label3.setFont(new Font("SansSerif", Font.PLAIN, 24));
						label3.setHorizontalAlignment(SwingConstants.CENTER);
						ImageIcon icon1 = new ImageIcon("resources/image5.png");
						JButton button1 = new JButton(icon1);
						button1.setMargin(new Insets(0, 0, 0, 0));
						button1.setBorder(null);
						button1.setBackground(null);
						ImageIcon icon2 = new ImageIcon("resources/image6.png");
						JButton button2 = new JButton(icon2);
						button2.setMargin(new Insets(0, 0, 0, 0));
						button2.setBorder(null);
						button2.setBackground(null);
						
						//adding objects to panels
						top.add(label1);
						top.add(label2);
						top.add(label3);
						bottom.add(button1);
						bottom.add(button2);
						
						//actions for buttons
						button1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
						
						button2.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent ae) {
								dialog.dispose();
							}
						});
					}
				});	
			}
		});
		
		//setting the frame size
		frame.setSize(new Dimension(1000, 800));
		//set the start positon
		frame.setLocationRelativeTo(null);
		//disable resize
		frame.setResizable(false);
		//default close operation
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//packing frame
		frame.pack();
		//setting frame visible
		frame.setVisible(true);
	}
	
	//main function
	public static void main(String[] args){
		new theHub();
	}
}

//ImagePanel class for adding background picture to JPanel
class ImagePanel extends JPanel{
	private Image img;

	public ImagePanel(String img){
		this(new ImageIcon(img).getImage());
	}

	public ImagePanel(Image img){
		this.img = img;
		Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
		setSize(size);
		setLayout(null);
	}

	public void paintComponent(Graphics g){
		g.drawImage(img, 0, 0, null);
	}
}

//Class for editing combobox
class SimpleRoundBorder extends AbstractBorder {
	Color bgColor = new Color( 0,0,0,220 );
	
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height){
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ((Graphics2D)g).setColor( bgColor );
        ((Graphics2D)g).drawRoundRect(x, y, width-1, height-1, 60, 60); 
    }
	
    public Insets getBorderInsets(Component c){
		return new Insets(10, 10, 10, 10);
    }
 
    public Insets getBorderInsets(Component c, Insets insets){
		insets.top = insets.left = insets.bottom = insets.right = 3;
		return insets;
    }
}

//class for showing title for combobox

class MyComboBoxRenderer extends JLabel implements ListCellRenderer{
	private String _title;
	
	public MyComboBoxRenderer(String title){
		_title = title;
	}

    @Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean hasFocus){
		if (index == -1 && value == null) setText(_title);
		else setText(value.toString());
		return this;
	}
}