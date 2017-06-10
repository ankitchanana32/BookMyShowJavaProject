package bookmyshow;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class slideshow extends JFrame
{
	Container c;
	CardLayout cardl;//cards ki trh hota hai ek stack of cards like
	JPanel slidepanel;
	public slideshow()
	{
		c=getContentPane();
		cardl=new CardLayout();
		slidepanel=new JPanel();
		JLabel lblside;
		//slidepanel.setLayout(new BORDER	layout(10,200));
		slidepanel.setLayout(cardl);
		JPanel btnpanel=new JPanel();
		JButton btnprev=new JButton("<<--");
		JButton btnnext=new JButton("-->>");
		for(int i=1;i<=5;i++)
		{
			lblside=new JLabel();
			lblside.setText(getImageString(i));
			//slidepanel.add(lblside,"card"+i);
			slidepanel.add(lblside);
		}
		slidepanel.setBackground(Color.red);
		//add(slidepanel.BorderLayout.center);
		c.add(slidepanel);
		btnpanel.setLayout(new FlowLayout(FlowLayout.CENTER,20,10));
		btnpanel.add(btnprev);
		btnpanel.add(btnnext);
		btnnext.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO Auto-generated method stub
			nextimg();	
			}
			
		});
		
		btnprev.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO Auto-generated method stub
			previmg();	
			}
			
		});
		add(btnpanel,BorderLayout.SOUTH);
		setBounds(0, 0, 500, 500);
		setTitle("icsd");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private void previmg()
	{
		//flips to previous card of 
		//specified container,here panel
		
		//if the currently visble card is the fisrt one ,this method flips to
		//last card in layout
		//the parent container in which to do the layout
		cardl.previous(slidepanel);
	}



	private void nextimg()
	{
		//flips to next card of 
		//specified container,here panel
		
		//if the currently visble card is the last one ,this method flips to
		//first card in layout
		//the parent container in which to do the layout
		cardl.next(slidepanel);
	}

	public String getImageString(int i)
	{
		String strimg="<html>" + "<body>" + "<img width='500' height='450'"	+ 
				"src= " + getClass().getResource("img ("+i+").jpg") + "' /> "
				+ "<br> <center> <font size=90 color=white>"
				+ "Picture" + i + "</font> </center>"
				+ "</body> </html>";
				
				System.out.println(strimg + " " + i);
				return strimg;


	}

}
