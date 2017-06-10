package bookmyshow;

import java.awt.Color;
import java.awt.Window;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

//import Mainframe;

public class Animapbar extends JFrame 

{
	Thread t=null;
	JProgressBar progressbar;
	//int pval=0;
private JLabel imag;
 private ImageIcon icn;
	public Animapbar()
	{
		
		
		icn=new ImageIcon("progress.gif");
		imag=new JLabel(icn);
		
		imag.setBounds(0,0,500,400);
		add(imag);
	
		
	
		progressbar=new JProgressBar();
		progressbar.setBounds(0,370,500,30);
		progressbar.setMinimum(0);
		progressbar.setMaximum(100);
		progressbar.setStringPainted(true);
		progressbar.setBackground(Color.white);
		progressbar.setForeground(Color.red);
		add(progressbar);
		//c.add(progressbar);
	//	add(btnpnl,BorderLayout.SOUTH);
	
		
	
	//t.start();
		setTitle("icsd");
		///setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500,400);
		setLocationRelativeTo(null);
		setLayout(null);
		setUndecorated(true);


	


	
	Thread t = new Thread()
	{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		int temp=0;
		while(temp<=100)
		{
			
		progressbar.setValue(temp);
			
				try
				{
					sleep(100);
					
				} 
				catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				temp=temp+1;
			
		}
	}
	};
	t.start();
	}

}
		
