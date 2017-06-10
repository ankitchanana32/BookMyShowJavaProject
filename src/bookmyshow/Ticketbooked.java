package bookmyshow;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ticketbooked extends JFrame
{
	JLabel lblframeclr;
	JLabel lblmname,lbluid,lblgoldseats,lblsilverseats,lbltotalprice,lblqty,lbldate,lbltime,lblusername;
	JLabel txtmname,txtuid,txtgoldseats,txtsilverseats,txttotalprice,txtqty,txtdate,txttime,txtusername;
	JTextField txtcode;
	String offercode;
	double dalde;
	JButton btncheck;
	DBhandler dbh=new DBhandler();
	public Ticketbooked()
	{
		 
	}
	public Ticketbooked(clsfinal objf) 
	{
		lblframeclr=new JLabel();
		lblframeclr.setBackground(Color.DARK_GRAY);
		lblframeclr.setOpaque(true);
		lblframeclr.setBounds(0,0,1375,700);
		add(lblframeclr);
		
		
		
		
		JLabel lblclr=new JLabel();
		lblclr.setBounds(0,30 ,1375,40);
		lblclr.setBackground(Color.orange);
		lblclr.setOpaque(true);
		lblframeclr.add(lblclr);
		JLabel lblname=new JLabel("WAY TO FINAL PAYMENT ");
		lblname.setBounds(500,10,800,20);
		lblname.setFont(new Font("Serif",Font.BOLD,15));
		lblname.setForeground(Color.white);
		lblclr.add(lblname);
		
		lblmname=new JLabel("Movie Name");
		lblmname.setBounds(100,50,100,20);
		lblmname.setForeground(Color.white);
		lblframeclr.add(lblmname);
		
		txtmname=new JLabel();
		txtmname.setBounds(900,50,100,20);
		txtmname.setForeground(Color.white);
		lblframeclr.add(txtmname);
		txtmname.setText(objf.getStrmoviename());
		
		
		
		lblusername=new JLabel("User Name");
		lblusername.setBounds(100,100,100,20);
		lblusername.setForeground(Color.white);
		lblframeclr.add(lblusername);
		
		
		txtusername=new JLabel();
		txtusername.setBounds(900,100,100,20);
		txtusername.setForeground(Color.white);
		lblframeclr.add(txtusername);
		txtusername.setText(objf.getStruname());
		
		
		lbluid=new JLabel("User Id");
		lbluid.setBounds(100,150,100,20);
		lbluid.setForeground(Color.white);
		lblframeclr.add(lbluid);
		
		txtuid=new JLabel();
		txtuid.setBounds(900,150,100,20);
		txtuid.setForeground(Color.white);
		lblframeclr.add(txtuid);
		txtuid.setText(objf.getStruid());
		
		
		
		lbldate=new JLabel("Date");
		lbldate.setBounds(100,200,100,20);
		lbldate.setForeground(Color.white);
		lblframeclr.add(lbldate);
		
		
		txtdate=new JLabel();
		txtdate.setBounds(900,200,100,20);
		txtdate.setForeground(Color.white);
		lblframeclr.add(txtdate);
		txtdate.setText(objf.getStrcurrentdate());
		
		lblgoldseats=new JLabel("Gold Seats");
		lblgoldseats.setBounds(100,250,100,20);
		lblgoldseats.setForeground(Color.white);
		lblframeclr.add(lblgoldseats);
		
		
		
		txtgoldseats=new JLabel();
		txtgoldseats.setBounds(900,250,100,20);
		txtgoldseats.setForeground(Color.white);
		lblframeclr.add(txtgoldseats);
		txtgoldseats.setText(objf.getStrgoldseats());
		
		
		
		lblsilverseats=new JLabel("Silver Seats");
		lblsilverseats.setBounds(100,300,100,20);
		lblsilverseats.setForeground(Color.white);
		lblframeclr.add(lblsilverseats);
		
		
		txtsilverseats=new JLabel();
		txtsilverseats.setBounds(900,300,100,20);
		txtsilverseats.setForeground(Color.white);
		lblframeclr.add(txtsilverseats);
		txtsilverseats.setText(objf.getStrsilverseats());
		
		lblqty=new JLabel("Quantity");
		lblqty.setBounds(100,350,100,20);
		lblqty.setForeground(Color.white);
		lblframeclr.add(lblqty);
		
		
		txtqty=new JLabel();
		txtqty.setBounds(900,350,100,20);
		txtqty.setForeground(Color.white);
		lblframeclr.add(txtqty);
		txtqty.setText(String.valueOf(objf.getQty()));
		
		
		lbltotalprice=new JLabel("Total price");
		lbltotalprice.setBounds(100,400,100,20);
		lbltotalprice.setForeground(Color.white);
		lblframeclr.add(lbltotalprice);

		txttotalprice=new JLabel();
		txttotalprice.setBounds(900,400,100,20);
		txttotalprice.setForeground(Color.white);
		lblframeclr.add(txttotalprice);
		txttotalprice.setText(String.valueOf(objf.getStrsumtotal()));
		
		 JLabel lblcode=new JLabel("Apply for BookMyShow Offer/Discount");
		 lblcode.setBounds(500, 500, 300, 30);
		 lblcode.setFont(new Font("Serif",Font.BOLD,19));
		 lblcode.setForeground(Color.orange);
		 lblframeclr.add(lblcode);
		 
		 	txtcode=new JTextField();
		 	txtcode.setBounds(500, 550, 150,30 );
		 	lblframeclr.add(txtcode);
		 	
		 	
		 	btncheck=new JButton("Check");
		 	btncheck.setBounds(680, 550, 150, 30);
		 	btncheck.setForeground(Color.white);
		 	btncheck.setBackground(Color.green);
		 	lblframeclr.add(btncheck);
		 	
		 	offercode=dbh.getcodefromtableuserofferbyid(txtuid.getText());
		 	int discount=Integer.parseInt(txttotalprice.getText());
		 	dalde=0.9*discount;
		 	
		 	
		 	btncheck.addActionListener(new ActionListener()
		 	{
				
				@Override
				public void actionPerformed(ActionEvent arg0)
				{
					if(offercode.equals(txtcode.getText()))
						{
						 JOptionPane.showMessageDialog(null,"congratulation you got discount on your total prize");
						 txttotalprice.setText(String.valueOf(dalde));
						 txtcode.setVisible(false);
						 btncheck.setVisible(false);
						}
					else
					{
						JOptionPane.showMessageDialog(null,"sorry you dont have correct offer code :'(");
					}
				}
			});
		 	
		 	
		 	JButton btnpay=new JButton("Pay");
		 	btnpay.setBounds(1000,600,100,20);
		 	btnpay.setForeground(Color.white);
		 	btnpay.setBackground(Color.orange);
		 	lblframeclr.add(btnpay);
		 	
		setTitle("ticket booked");
		setVisible(true);
		
		
		setDefaultCloseOperation(2);
		//setLocationRelativeTo(null);
		setSize(Toolkit.getDefaultToolkit().getScreenSize());
		
	}

}
