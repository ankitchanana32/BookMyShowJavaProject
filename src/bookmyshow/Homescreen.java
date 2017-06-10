package bookmyshow;

//import java.awt.BorderLayout;
//import java.awt.CardLayout;
import java.awt.Color;
//import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.*;

public class Homescreen extends JFrame
{

	JMenuBar menubar;
	JMenu HOME,TICKETS,NOWPLAYING,exit,SIGNIN,min,FeedBack,Aboutus,Offers;
	JMenuItem Admin,user;
	JLabel logo,imag,pic;
	JPanel home;
	Timer tm;
	int x=0;
	String[] list=
	{
			"E:/pic1/jv1.jpg",
			"E:/pic1/jv2.jpg",
			"E:/pic1/jv3.jpg",
			"E:/pic1/jv4.jpg",
			"E:/pic1/jv5.jpg",
			"E:/pic1/jv6.jpg",
			"E:/pic1/jv7.jpg",
			"E:/pic1/jv8.jpg",
			"E:/pic1/jv9.jpg",
			"E:/pic1/jv10.jpg",
			"E:/pic1/jv11.jpg",
			"E:/pic1/jv12.jpg",
	};
	
	public Homescreen() 
	{
	
		System.out.println("hello".split("h"));
		imag=new JLabel(new ImageIcon("pvr.jpg"));
		imag.setBounds(0,0,1300,700);
		setTitle("Home");
		menubar = new JMenuBar();
		menubar.setBackground(Color.GRAY);
	
	
		home=new JPanel();
		
		home.setBackground(Color.GRAY);
		home.setLayout(new BoxLayout(home, BoxLayout.Y_AXIS));

		JMenu HOME = new JMenu("HOME");
		HOME.setMnemonic(KeyEvent.VK_H);
		NOWPLAYING=new JMenu("NOW PLAYING");
		NOWPLAYING.setMnemonic(KeyEvent.VK_N);
		NOWPLAYING.addMenuListener(new MenuListener() 
		{
			
			@Override
			public void menuSelected(MenuEvent arg0)
			{
				new Nowplaying();
				dispose();
				
				
			}
			
			@Override
			public void menuDeselected(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void menuCanceled(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		SIGNIN=new JMenu("SIGN IN");
		SIGNIN.setMnemonic(KeyEvent.VK_S);
		min=new JMenu();
		min.setIcon(new ImageIcon("min.png"));
		min.addMenuListener(new MenuListener()
		{
		
		@Override
		public void menuSelected(MenuEvent arg0)
		{
			setState(ICONIFIED);
			
		}
		
		@Override
		public void menuDeselected(MenuEvent arg0) 
		{
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void menuCanceled(MenuEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		});
		
		exit=new JMenu();
		exit.setIcon(new ImageIcon("close.png"));
		exit.addMenuListener(new MenuListener()
		{
			public void menuCanceled(MenuEvent arg0)
		{
			// TODO Auto-generated method stub
			
		}
		@Override
		public void menuDeselected(MenuEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void menuSelected(MenuEvent arg0)
		{
			System.exit(0);
			
		}
		});

			
		//Admin =new JMenuItem("admin sigin");
		//Admin.setToolTipText(" only admin can login");
		
	//	user =new JMenuItem("user sigin");
		//user.setToolTipText("user login to this");
		
		
		
	
		 FeedBack=new JMenu("Feedback");
		 FeedBack.addMenuListener(new MenuListener()
		 {
			
			@Override
			public void menuSelected(MenuEvent arg0)
			{
				new Feedback();
				dispose();
			}
			
			@Override
			public void menuDeselected(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void menuCanceled(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 Aboutus=new JMenu("About Us");
		 Aboutus.addMenuListener(new MenuListener()
		 {
			
			@Override
			public void menuSelected(MenuEvent arg0) 
			{
				new AboutusFrame();
				
			}
			
			@Override
			public void menuDeselected(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void menuCanceled(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		 
		 
		 Offers=new JMenu("Offers");
		 Offers.addMenuListener(new MenuListener()
		 {
			
			@Override
			public void menuSelected(MenuEvent arg0)
			{
				new Offersframe();
				dispose();
				
			}
			
			@Override
			public void menuDeselected(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void menuCanceled(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		 
		 
		 
		 
	
		SIGNIN.addMenuListener(new MenuListener()
		{
			
			@Override
			public void menuSelected(MenuEvent arg0)
			{
				new userTabbedpane();
				dispose();
				
			}
			
			@Override
			public void menuDeselected(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void menuCanceled(MenuEvent arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		menubar.add(HOME);
		menubar.add(NOWPLAYING);
		
		
		menubar.add(SIGNIN);
		menubar.add(Offers);
		menubar.add(Aboutus);
		menubar.add(FeedBack);
		menubar.add(min);
		menubar.add(exit);
		
		

	//	menubar.add(Box.createHorizontalGlue())
		//to put menubar at rigtht side
		
		setJMenuBar(menubar);
		
		
		//home.setBorder(new EmptyBorder(new Insets(50,50,50,50)));
		add(home);
	

		logo=new JLabel(new ImageIcon("bmslogo.jpg"));
		
	//	logo.setPreferredSize(new Dimension(100,100));
	
		
	
		logo.setLayout(null);
	//	logo.setLayout(new FlowLayout());
		logo.setBackground(Color.GRAY);
		logo.setBounds(50,50,200,200);
		
		logo.setVisible(true);
		//home.
	//	imag.add(logo);
		//home.add(logo,FlowLayout.LEFT);

		//home.add(logo);
		pic=new JLabel();
		pic.setBounds(200,200,1000,400);       // 40,30,700,300
		setImagesize(7);
			
		tm=new Timer(1000,new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO Auto-generated method stub
				setImagesize(x);
				x+=1;
		
				if(x>=list.length)
					x=0;
			}
			
		});
		imag.add(pic);
		home.add(imag);
	//	add(home);
		//add(pic);
		tm.start();
		
		//setSize(800,400); // 800 400
		//getContentPane().setBackground(Color.decode("#bdb67b"));
		
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		//setUndecorated(true);
	//	setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	
	private void setImagesize(int i) 
	{
		// TODO Auto-generated method stub
		ImageIcon icon=new ImageIcon(list[i]);
		
		Image img=icon.getImage();
		Image newImg=img.getScaledInstance(pic.getWidth(),pic.getHeight(),Image.SCALE_SMOOTH);
		
		ImageIcon newImc=new ImageIcon(newImg);
		pic.setIcon(newImc);
				
		
	}		
				
}


  