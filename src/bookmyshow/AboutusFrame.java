package bookmyshow;

import java.awt.Color;
import java.awt.Font;
import java.awt.ImageCapabilities;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class AboutusFrame extends JFrame 
{
	JTextPane pane2,pane3,pane4;
	public AboutusFrame()
	{
		
		JLabel lblframeclr=new JLabel();
		lblframeclr.setBounds(0, 0, 1375,700);
		lblframeclr.setBackground(Color.darkGray);
		lblframeclr.setOpaque(true);
		add(lblframeclr);
		JLabel lblclr=new JLabel();
		lblclr.setBounds(0,30 ,1375,40);
		lblclr.setBackground(Color.orange);
		lblclr.setOpaque(true);
		
		JLabel lblname=new JLabel("About Us");
		lblname.setBounds(600,10,800,20);
		lblname.setFont(new Font("Serif",Font.BOLD,20));
		lblname.setForeground(Color.white);

		lblclr.add(lblname);
		lblframeclr.add(lblclr);
		
		
		JLabel lblpicpvrlogo=new JLabel(new ImageIcon("pv.png"));
		lblpicpvrlogo.setBounds(0,20,150,150);
		lblpicpvrlogo.setBackground(Color.orange);
	//	lblframeclr.add(lblpicpvrlogo);
		
		
		pane2=new JTextPane();
		pane2.setContentType("text/html");
		pane2.setBounds(0,80,1350,200);
		String txt2="<center><font color=black size=5><p>PVR Cinemas is a film entertainment company in India. The company, which began as a joint venture agreement between Priya Exhibitors Private Limited and Village Roadshow Limited in 1995 with 60:40 ratio, began its commercial operations in June 1997.</p></font></center>";
		pane2.setText(txt2);
		pane2.add(lblpicpvrlogo);
		pane2.setEditable(false);
		
		pane2.setBackground(Color.orange);
		lblframeclr.add(pane2);
		
		
		
		
		JLabel lblpanipat=new JLabel(new ImageIcon("pnp.jpg"));
		lblpanipat.setBounds(10,300,400,400);
		lblframeclr.add(lblpanipat);
		
		pane3=new JTextPane();
		pane3.setContentType("text/html");
		pane3.setBounds(420,400,800,300);
		String txt3="<center><font color=white size=5><p>Address: 3rd Floor, Fun City Mall, Pati Insar N.H 1, GT Road, Opposite Nirulas, Karnal, Panipat, Haryana 132103Phone:088009 00009</p></font></center>";
		pane3.setText(txt3);
		
		pane3.setEditable(false);
		pane3.setBackground(Color.darkGray);
		lblframeclr.add(pane3);
		
		
		setLayout(null);	
		setTitle("About Us");
		setBounds(0,0,1375,725);
		setVisible(true);
		setDefaultCloseOperation(2);
		
		
		
		
		
	}
	
}
