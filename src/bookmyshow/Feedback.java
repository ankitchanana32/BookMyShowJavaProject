package bookmyshow;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Feedback extends JFrame 
{
	JTextField txtuid,txtuname,txteid,txtmob,txtcomment;
	JPasswordField txtpwd;
	JLabel lblcomnt,lbluname,lblueid,lblumob;
	DBhandler dbh=new DBhandler();
	JButton btnsubmit;
	JLabel lblsubmit;
	JButton back;
public Feedback()

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
	
	JLabel lblname=new JLabel("PLEASE GIVE YOUR PRECIOUS FEEDBACK");
	lblname.setBounds(500,10,800,20);
	lblname.setFont(new Font("Serif",Font.BOLD,15));
	lblname.setForeground(Color.white);
//	lblname.setOpaque(true);
	lblclr.add(lblname);

	lblframeclr.add(lblclr);
	txtuid=new JTextField();
	txtuid.setBounds(160, 180, 100, 20);
	lblframeclr.add(txtuid);
	
	JLabel lblunm=new JLabel("user id");
	lblunm.setBounds(50, 180, 100, 20);
	lblunm.setForeground(Color.white);
	lblframeclr.add(lblunm);
	
	JLabel lblpwd=new JLabel(" user password");
	lblpwd.setBounds(50, 250, 100, 20);
	lblpwd.setForeground(Color.white);
	lblframeclr.add(lblpwd);
	

	txtpwd=new JPasswordField();
	txtpwd.setBounds(160,250,100,20);
	lblframeclr.add(txtpwd);
	
	lbluname=new JLabel("Name");
	lbluname.setBounds(100,350,100 ,20);
	lblframeclr.add(lbluname);
	lbluname.setForeground(Color.white);
	lbluname.setVisible(false);
	
	
	txtuname=new JTextField();
	txtuname.setBounds(250,350,300, 20);
	lblframeclr.add(txtuname);
	txtuname.setVisible(false);
	
	 lblueid=new JLabel("Email Id");
	lblueid.setBounds(100,400, 100, 20);
	lblframeclr.add(lblueid);
	lblueid.setVisible(false);
	lblueid.setForeground(Color.white);
	
	txteid=new JTextField();
	txteid.setBounds(250,400,300,20);
	lblframeclr.add(txteid);
	txteid.setVisible(false);
	
	 lblumob=new JLabel("Mobile number");
	lblumob.setBounds(100, 450, 100, 20);
	lblframeclr.add(lblumob);
	lblumob.setVisible(false);
	lblumob.setForeground(Color.white);
	
	
	txtmob=new JTextField();
	txtmob.setBounds(250, 450, 300, 20);
	lblframeclr.add(txtmob);
	txtmob.setVisible(false);
	
	
	
	lblcomnt=new JLabel("Comment");
	lblcomnt.setBounds(100, 500,100, 20);
	lblframeclr.add(lblcomnt);
	lblcomnt.setVisible(false);
	
	lblcomnt.setForeground(Color.white);
	
	txtcomment=new JTextField();
	txtcomment.setBounds(250,480,300, 100);
	lblframeclr.add(txtcomment);
	txtcomment.setVisible(false);
	

	btnsubmit=new JButton("SubMit");
	btnsubmit.setBounds(150,600,200,40);
	btnsubmit.setBackground(Color.orange);
	lblframeclr.add(btnsubmit);
	btnsubmit.setVisible(false);
	
	lblsubmit=new JLabel("submitted succesfully");
	lblsubmit.setBounds(150,630,400,20);
	lblframeclr.add(lblsubmit);
	lblsubmit.setForeground(Color.white);
	lblsubmit.setVisible(false);
	
	
	back=new JButton("Back To Home");
	back.setBounds(200,100,200,40);
	lblframeclr.add(back);
	back.setBackground(Color.yellow);
	
	Button bnlogin=new Button("Login");
	bnlogin.setBackground(Color.orange);
	bnlogin.setBounds(100, 300, 100, 20);
	lblframeclr.add(bnlogin);
	
	
	setLayout(null);	
	setTitle("FEEDBACKFORM");
	setBounds(0,0,1375,725);
	setVisible(true);
	setDefaultCloseOperation(2);
	
	
	bnlogin.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0) 
		{
			dbh.getdbconwithoracle();
			boolean res=dbh.isvalidclient(txtuid.getText(),txtpwd.getText());
			if(res)
			{
				System.out.println("login succesfull");
				txtcomment.setVisible(true);
				lblcomnt.setVisible(true);
				lbluname.setVisible(true);
				
				lblueid.setVisible(true);
				lblumob.setVisible(true);
				txtuid.setVisible(true);
				txtuname.setVisible(true);
				txteid.setVisible(true);
				txtmob.setVisible(true);
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
		if(txtuname.getText()==null||txtuname.getText().equals("")||txtmob.getText()==null||txtmob.getText().equals("")||txteid.getText()==null||txteid.getText().equals("")||txtcomment.getText().equals("")||txtcomment.getText()==null)
		{
			JOptionPane.showMessageDialog(null,"please enter full Details");
		}
	
		lblsubmit.setVisible(true);
	}
});
back.addActionListener(new ActionListener()
{
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
	new Homescreen();
	dispose();
	}
});
	
}
}
