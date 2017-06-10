package bookmyshow;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Offersframe extends JFrame 
{
	JTextField txtuid;
	JPasswordField txtpwd;
	DBhandler dbh=new DBhandler();
	JRadioButton q1lunchbox,q1yjHd,q1grandmasti,q1talash;
	JRadioButton q2faWad,q2salman,q2aamir,q2shahrukh;
	JRadioButton q3RBNJ,q3sultan,q3badmash,q3Pk;
	JButton btnsubmit;
	JTextPane pane2,pane3,pane4;
	DBhandler objdb=new DBhandler();
public Offersframe()
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

	JLabel lblname=new JLabel("TEST YOUR KNOWLEDGE HERE");
	lblname.setBounds(500,10,800,20);
	lblname.setFont(new Font("Serif",Font.BOLD,15));
	lblname.setForeground(Color.white);
//	lblname.setOpaque(true);
	lblclr.add(lblname);
	lblframeclr.add(lblclr);
	JTextPane pane1=new JTextPane();
	pane1.setContentType("text/html");
	pane1.setBounds(0, 80,1375,100);
	String txt1="<h1 align='center' '>Grab the Discount Offer</h1><p> just Login and give answer to simple question</p>";
	pane1.setText(txt1);
	pane1.setEditable(false);
	pane1.setForeground(Color.white);
	pane1.setBackground(Color.orange);
	
	lblframeclr.add(pane1);
	
	
	pane2=new JTextPane();
	pane2.setContentType("text/html");
	pane2.setBounds(500,200,800,40);
	String txt2="<center><font color=red size=4><p>Question 1:-Which of the following movie was nominated for oscar?</p></font></center>";
	pane2.setText(txt2);
	pane2.setEditable(false);
	pane2.setForeground(Color.white);
	pane2.setBackground(Color.orange);
	lblframeclr.add(pane2);
	pane2.setVisible(false);
	
	q1lunchbox=new JRadioButton("LUNCHBOX");
	q1lunchbox.setBounds(530,280,100,20);
	q1lunchbox.setBackground(Color.darkGray);
	q1lunchbox.setForeground(Color.white);
	
	q1grandmasti=new JRadioButton("Grand MAsti");
	q1grandmasti.setBounds(700,280,100,20);
	q1grandmasti.setBackground(Color.darkGray);
	q1grandmasti.setForeground(Color.white);
	
	q1talash=new JRadioButton("TALASH");
	q1talash.setBounds(850,280,100,20);
	q1talash.setBackground(Color.darkGray);
	q1talash.setForeground(Color.white);
	
	
	
	q1yjHd=new JRadioButton("YJHD");
	q1yjHd.setBounds(1000,280,100,20);
	q1yjHd.setBackground(Color.darkGray);
	q1yjHd.setForeground(Color.white);
	

	ButtonGroup group1=new ButtonGroup();
	group1.add(q1grandmasti);
	group1.add(q1lunchbox);
	group1.add(q1talash);
	group1.add(q1yjHd);
	
	
	lblframeclr.add(q1grandmasti);
	lblframeclr.add(q1lunchbox);
	lblframeclr.add(q1talash);
	lblframeclr.add(q1yjHd);
	
	
	pane3=new JTextPane();
	pane3.setContentType("text/html");
	pane3.setBounds(500,350,800,40);
	String txt3="<center><font color=red size=4><p>Question 2:-Which bollywood superstar is also known as king khan</p></font></center>";
	pane3.setText(txt3);
	pane3.setEditable(false);
	pane3.setForeground(Color.white);
	pane3.setBackground(Color.orange);
	lblframeclr.add(pane3);
	pane3.setVisible(false);
	q2aamir=new JRadioButton("AAMIR KHAN");
	q2aamir.setBounds(530,430,100,20);
	q2aamir.setBackground(Color.darkGray);
	q2aamir.setForeground(Color.white);
	
	q2faWad=new JRadioButton("FAwad Khan");
	q2faWad.setBounds(700,430,100,20);
	q2faWad.setBackground(Color.darkGray);
	q2faWad.setForeground(Color.white);
	
	q2salman=new JRadioButton("Salman Khan");
	q2salman.setBounds(850,430,100,20);
	q2salman.setBackground(Color.darkGray);
	q2salman.setForeground(Color.white);
	
	
	
	q2shahrukh=new JRadioButton("SHahrukh KHAN");
	q2shahrukh.setBounds(1000,430,150,20);
	q2shahrukh.setBackground(Color.darkGray);
	q2shahrukh.setForeground(Color.white);

	
	ButtonGroup group2=new ButtonGroup();
	group2.add(q2aamir);
	group2.add(q2faWad);
	group2.add(q2salman);
	group2.add(q2shahrukh);
	
	
	lblframeclr.add(q2aamir);
	lblframeclr.add(q2faWad);
	lblframeclr.add(q2salman);
	lblframeclr.add(q2shahrukh);
	
	
	
	pane4=new JTextPane();
	pane4.setContentType("text/html");
	pane4.setBounds(500,500,800,40);
	String txt4="<center><font color=red size=4><p>Question 3:-which was the Debut film of Anushka Sharma? </p></font></center>";
	pane4.setText(txt4);
	pane4.setEditable(false);
	pane4.setForeground(Color.white);
	pane4.setBackground(Color.orange);
	lblframeclr.add(pane4);
	pane4.setVisible(false);
	
	q3badmash=new JRadioButton("Badmash Comapny");
	q3badmash.setBounds(530,580,150,20);
	q3badmash.setBackground(Color.darkGray);
	q3badmash.setForeground(Color.white);
	
	q3Pk=new JRadioButton("P.K");
	q3Pk.setBounds(700,580,100,20);
	q3Pk.setBackground(Color.darkGray);
	q3Pk.setForeground(Color.white);
	
	q3RBNJ=new JRadioButton("Rab Ne bNa di Jodi");
	q3RBNJ.setBounds(850,580,200,20);
	q3RBNJ.setBackground(Color.darkGray);
	q3RBNJ.setForeground(Color.white);
	
	
	
	q3sultan=new JRadioButton("SultaN");
	q3sultan.setBounds(1100,580,150,20);
	q3sultan.setBackground(Color.darkGray);
	q3sultan.setForeground(Color.white);

	
	ButtonGroup group3=new ButtonGroup();
	group3.add(q3badmash);
	group3.add(q3Pk);
	group3.add(q3RBNJ);
	group3.add(q3sultan);
	
	
	lblframeclr.add(q3badmash);
	lblframeclr.add(q3Pk);
	lblframeclr.add(q3RBNJ);
	lblframeclr.add(q3sultan);
	
	btnsubmit=new JButton("SubMit");
	btnsubmit.setBounds(700,620,100,40);
	btnsubmit.setBackground(Color.orange);
	lblframeclr.add(btnsubmit);
	btnsubmit.setVisible(false);
	
	
	
	
	JLabel lblunm=new JLabel("user id");
	lblunm.setBounds(50,190, 100, 20);
	lblunm.setForeground(Color.white);
	lblframeclr.add(lblunm);
	
	txtuid=new JTextField();
	txtuid.setBounds(160, 190, 100, 20);
	lblframeclr.add(txtuid);
	
	JLabel lblpwd=new JLabel(" user password");
	lblpwd.setBounds(50, 250, 100, 20);
	lblpwd.setForeground(Color.white);
	lblframeclr.add(lblpwd);
	

	txtpwd=new JPasswordField();
	txtpwd.setBounds(160,250,100,20);
	lblframeclr.add(txtpwd);
	
	Button bnlogin=new Button("Login");
	bnlogin.setBackground(Color.orange);
	bnlogin.setBounds(100, 300, 100, 20);
	lblframeclr.add(bnlogin);
	
	JButton btnsignup=new JButton("Sign up ");
	btnsignup.setBounds(250,300,100,20);
	btnsignup.setBackground(Color.yellow);
	lblframeclr.add(btnsignup);
	
	btnsignup.addActionListener(new ActionListener()
	{
		
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			// TODO Auto-generated method stub
			new userTabbedpane();
		}
	});
	
	Button back=new Button("Back");
	back.setBackground(Color.orange);
	back.setBounds(100,620, 100, 20);
	lblframeclr.add(back);
	
	
	
	q1lunchbox.setVisible(false);
	q1yjHd.setVisible(false);
	q1grandmasti.setVisible(false);
	q1talash.setVisible(false);
	q2faWad.setVisible(false);
	q2salman.setVisible(false);
	q2aamir.setVisible(false);
	q2shahrukh.setVisible(false);
	
	q3RBNJ.setVisible(false);
	q3sultan.setVisible(false);
	q3badmash.setVisible(false);
	q3Pk.setVisible(false);
	
	back.addActionListener(new ActionListener()
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			new Homescreen();
			dispose();
		}
		
	});
	
	
	
	bnlogin.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			dbh.getdbconwithoracle();
			boolean res=dbh.isvalidclient(txtuid.getText(),txtpwd.getText());
			if(res)
			{
				System.out.println("login succesfull");
				q1lunchbox.setVisible(true);
				q1yjHd.setVisible(true);
				q1grandmasti.setVisible(true);
				q1talash.setVisible(true);
				q2faWad.setVisible(true);
				q2salman.setVisible(true);
				q2aamir.setVisible(true);
				q2shahrukh.setVisible(true);
				
				q3RBNJ.setVisible(true);
				q3sultan.setVisible(true);
				q3badmash.setVisible(true);
				q3Pk.setVisible(true);
				pane2.setVisible(true);
				pane3.setVisible(true);
				pane4.setVisible(true);
				btnsubmit.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(null,"please enter valid credential");
			}
			//dispose();				
			
		}
		
	});

btnsubmit.addActionListener(new ActionListener() 
{
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		if(q1lunchbox.isSelected()&&q2shahrukh.isSelected()&&q3RBNJ.isSelected())
		{
			JOptionPane.showMessageDialog(null,"you have won a promo code apply this on buying ticket to get discount your code is ds716");
			dbh.insertintouseroffertable(txtuid.getText(),"ds716");
				new Homescreen();
				dispose();
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Sorry better luck next tIme :'( ");
			 new Homescreen();
			 dispose();
		}
		
	}
});
	
	
	
	
	
	
	
	setLayout(null);	
	setTitle("OFFERS");
	setBounds(0,0,1375,725);
	setVisible(true);
	setDefaultCloseOperation(2);
	
	
	
}
}
