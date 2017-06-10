package bookmyshow;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Nowplaying extends JFrame implements ListSelectionListener
{
	private JList list;
	
	JSplitPane splitPane;
	JLabel pnlmoviedetails;
	DBhandler objdb=new DBhandler();
	JLabel lblstars,lblmid,lblavailtime,lbl912,lbl1215,lbl1518,lbl1821;
	JLabel lblmidfront,lblstarsfront,lblstartdate,lblstartdatefront;
	JLabel lblenddate,lblenddatefront,lblgoldprice,lblgoldpricefront;
	JLabel lblsilverprice,lblsilverpricefront;
	clsmov obj=new clsmov();
	JLabel lblPic;
	Container c;
	JButton btnback;
	JButton btnbms;
	
public Nowplaying()
{
	setLayout(null);
	
	c=getContentPane();
	JLabel lblframeclr=new JLabel();
	lblframeclr.setBounds(0, 0, 1350,700);
	lblframeclr.setBackground(Color.darkGray);
	lblframeclr.setOpaque(true);
	
	
	JLabel lblclr=new JLabel();
	lblclr.setBounds(0,30 ,1375,40);
	lblclr.setBackground(Color.orange);
	lblclr.setOpaque(true);
	lblframeclr.add(lblclr);
	JLabel lblname=new JLabel(" NOWPLAYING MOVIES ");
	lblname.setBounds(500,10,800,20);
	lblname.setFont(new Font("Serif",Font.BOLD,15));
	lblname.setForeground(Color.white);
	lblclr.add(lblname);

	lblframeclr.add(lblclr);
	
	pnlmoviedetails=new JLabel();
	pnlmoviedetails.setLayout(null);
	pnlmoviedetails.setBounds(800,50,400,600);
	pnlmoviedetails.setBackground(Color.DARK_GRAY);
	pnlmoviedetails.setOpaque(true);
	
	lblframeclr.add(pnlmoviedetails);
	lblmid=new JLabel("Movie Id");
	lblmid.setForeground(Color.orange);
	lblmidfront=new JLabel();
	lblstars=new JLabel("Stars");
	lblstars.setForeground(Color.orange);
	lblstarsfront=new JLabel();
	lblavailtime=new JLabel("Available timE");
	lblavailtime.setForeground(Color.orange);
	lbl912=new JLabel("9-11:55 AM");
	lbl912.setVisible(false);
	lbl1215=new JLabel("12-3 PM");
	lbl1518=new JLabel("3-6 PM");
	lbl1821=new JLabel("6-9 PM");
	lbl1215.setVisible(false);
	lbl1518.setVisible(false);
	lbl1821.setVisible(false);
	
	lblmidfront.setText(obj.getStrmid());
	lblmidfront.setForeground(Color.white);
	
	lblstartdate=new JLabel("Start Date");
	lblstartdate.setForeground(Color.orange);
	lblstartdatefront=new JLabel();
	lblenddate=new JLabel("End Date");
	lblenddate.setForeground(Color.orange);
	lblenddatefront=new JLabel();
	lblgoldprice=new JLabel("gold price");
	lblgoldprice.setForeground(Color.orange);
	lblgoldpricefront= new JLabel();
	lblsilverprice=new JLabel("Silver price");
	lblsilverprice.setForeground(Color.orange);
	lblsilverpricefront=new JLabel();

	lblmid.setBounds(50,50,80,20);
	lblmidfront.setBounds(300,50, 80, 20);
	lblstars.setBounds(50,110,80,20);
	lblstarsfront.setBounds(300,110,80,20);
	lblavailtime.setBounds(50,190,80,20);
	lbl912.setBounds(150,190,80,20);
	lbl1215.setBounds(250,190,80,20);
	lbl1518.setBounds(350,190,80,20);
	lbl1821.setBounds(450,190, 80,20);
	lbl912.setForeground(Color.white);
	lbl1215.setForeground(Color.white);
	lbl1518.setForeground(Color.white);
	lbl1821.setForeground(Color.white);
	
	lblstartdate.setBounds(50,270,80,20);
	lblstartdatefront.setBounds(300,270,80,20);
	lblenddate.setBounds(50,350,80,20);
	lblenddatefront.setBounds(300,350, 80, 20);
	lblgoldprice.setBounds(50,420, 80, 20);
	lblgoldpricefront.setBounds(300,420,80,20);
	lblsilverprice.setBounds(50, 500, 80, 20);
	lblsilverpricefront.setBounds(300, 500, 80, 20);
	

	
	
	
	
	pnlmoviedetails.add(lblmid);
	pnlmoviedetails.add(lblmidfront);
	pnlmoviedetails.add(lblstars);
	pnlmoviedetails.add(lblstarsfront);
	pnlmoviedetails.add(lblavailtime);
	pnlmoviedetails.add(lbl912);
	pnlmoviedetails.add(lbl1215);
	pnlmoviedetails.add(lbl1518);
	
	pnlmoviedetails.add(lbl1821);
	pnlmoviedetails.add(lblstartdate);
	pnlmoviedetails.add(lblstartdatefront);
	pnlmoviedetails.add(lblenddate);
	pnlmoviedetails.add(lblenddatefront);
	pnlmoviedetails.add(lblgoldprice);
	pnlmoviedetails.add(lblgoldpricefront);
	pnlmoviedetails.add(lblsilverprice);
	pnlmoviedetails.add(lblsilverpricefront);
	//list = new JList();
	Vector<String> vctmname=objdb.getmovienamefromtblmovies();
	
	System.out.println(vctmname);
	
	lblPic=new JLabel("abra ka dabra");
	lblPic.setVisible(true);
	lblPic.setText("showing");
	//lblPic.setBackground(Color.BLACK);
	list = new JList(vctmname);
	JScrollPane listScrollPane=new JScrollPane(list);
	JScrollPane picScrollPane=new JScrollPane(lblPic);
	
	list.addListSelectionListener(this);

	splitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,listScrollPane, picScrollPane);
	splitPane.setOneTouchExpandable(true);
	lblframeclr.add(splitPane);
	splitPane.setBounds(50,100,650,470);
	c.add(lblframeclr);
	
	
	
	
	btnback=new JButton("Back to home");
	btnback.setBounds(30,660,150,20);
	btnback.setBackground(Color.yellow);
	lblframeclr.add(btnback);
	
	btnbms=new JButton("Book Your Show");
	btnbms.setBounds(200,590, 400, 70);
	btnbms.setForeground(Color.blue);
	btnbms.setBackground(Color.orange);
	lblframeclr.add(btnbms);
	
	setTitle(lblPic.getText());
	setVisible(true);		
	setLocation(0, 0);
	//setBounds00,1350,750)		
	setSize(Toolkit.getDefaultToolkit().getScreenSize());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	btnback.addActionListener(new ActionListener()
	{
		
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			new Homescreen();
			dispose();
			
		}
	});
	
	btnbms.addActionListener(new ActionListener()
	{
		
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			JOptionPane.showMessageDialog(null,"you have to login first to book your Show");
			new userTabbedpane();
		}
	});

}
public void valueChanged(ListSelectionEvent e) 
{
	
	int index=list.getSelectedIndex();
	System.out.println(index);
	String strmoviename=(String) list.getSelectedValue();
	System.out.println(strmoviename);
	obj=objdb.getmoviedetailbyname(strmoviename);
	System.out.println(obj.getStrmid());
	System.out.println(obj.getStrgprice());
	ImageIcon icn=new ImageIcon(obj.getStriname());
	System.out.println(obj.getStriname());
	lblPic.setIcon(icn);
	lblmidfront.setText(obj.getStrmid());
	lblmidfront.setForeground(Color.white);
	lblstarsfront.setText(obj.getStrstar());
	lblstarsfront.setForeground(Color.white);
	System.out.println(obj.getStrsdate());
	lblstartdatefront.setText(obj.getStrsdate());
	lblstartdatefront.setForeground(Color.white);
	
	lblenddatefront.setText(obj.getStredate());
	lblenddatefront.setForeground(Color.white);
	
	lblgoldpricefront.setText(obj.getStrgprice());
	lblgoldpricefront.setForeground(Color.white);
	
	
	if(obj.getStr912().equals("true"))
	{
		lbl912.setVisible(true);
	}
	
	if(obj.getStr912().equals("false"))
	{
		lbl912.setVisible(false);
	}
	
	
	if(obj.getStr1215().equals("true"))
	{
		lbl1215.setVisible(true);
	}
	if(obj.getStr1215().equals("false"))
	{
		lbl912.setVisible(false);
	}
	
	if(obj.getStr1518().equals("true"))
	{
		lbl1518.setVisible(true);
	}
	
	if(obj.getStr1518().equals("false"))
	{
		lbl1518.setVisible(false);
	}
	
	if(obj.getStr1821().equals("true"))
	{
		lbl1821.setVisible(true);
	}
	
	
	if(obj.getStr1821().equals("false"))
	{
		lbl1821.setVisible(false);
	}
	
	lblsilverpricefront.setText(obj.getStrsprice());
	lblsilverpricefront.setForeground(Color.white);
		
		
}





}
