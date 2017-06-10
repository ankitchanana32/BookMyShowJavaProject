package bookmyshow;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.Spring;

import oracle.net.aso.s;

public class Ticketstatusform extends JFrame 
{
	
	JLabel imag;
	JLabel labelg,labels,curentdate;
	JLabel textgold,textsilver,availtime,moviename,mnamefront,gprice,sprice;
	JLabel gtkt,stkt,gpricefront,gtktfront,stktfront,spricefront;
	JLabel total,totalpricefront,ticketbooked;
	JRadioButton timing912,timing1215,timing1518,timing1821;
	JLabel mid,midfront;
	clsmov obj=new clsmov();
	boolean flag=false;
	JCheckBox []arr;
	JCheckBox []arrs;
	String []chbox;
	JButton price;
	JButton bms;
	JLabel sumtotal;
	JLabel lbluid,lblunm,lbleid,lblmob,lbltid;
	JLabel uid,unm,eid,mob,tid;
	DBhandler dbh=new DBhandler();
	JButton resetbtngold,resetbtnsilver;
	int max;
	JCheckBox chb1,chb;
	int goldseatsremaining;
	int silverseatremaining;
	String sheela,munni,resetgold,resetsilver;
	clsfinal objf;
	String gold,rgold,rsilver;
	
   int count=0;
  int counts=0;
 JLabel mulcount;
 JLabel mulcounts;
 String timingvaluegold912,g912,timingvaluesilver912,s912;
 String timingvaluegold1215,g1215,timingvaluesilver1215,s1215;
 String timingvaluegold1518,g1518,timingvaluesilver1518,s1518;
 String timingvaluegold1821,g1821,timingvaluesilver1821,s1821; 
 String silver;
 Vector<String> vctrseatselected=new Vector<String>();
 Vector<String> vctrsilverseatselected=new Vector<String>();
 int g,s;
 String update,updates;
 String upd,upds;
   String qty;
 clsticket objt1=new clsticket();
public Ticketstatusform()
{
	
}
public Ticketstatusform(clsticket objt)
{

	

	imag=new JLabel();
	imag.setBackground(Color.red);
	imag.setOpaque(true);
	imag.setBounds(0,0,1360,710);
	
	DateFormat date=new SimpleDateFormat("dd/MM/YYYY");
	Calendar cal=Calendar.getInstance();
	

	//System.out.println(objt.getStrname());
	
	curentdate=new JLabel();
	curentdate.setText(date.format(cal.getTime()));
	curentdate.setBounds(560,50,100,30);
	imag.add(curentdate);
	
	
	mid=new JLabel("Mid");
	mid.setBounds(160,100,100,20);
	imag.add(mid);
	mid.setText(objt.getId2());
	
	midfront=new JLabel("Movie Id");
	midfront.setBounds(90,100,60,20);
	imag.add(midfront);
	
	
	
	
	
	
	
	moviename=new JLabel();
	moviename.setBounds(300, 100, 150, 30);
	imag.add(moviename);
	moviename.setText(objt.getName2());
	
mnamefront=new JLabel("Movie name");
mnamefront.setBounds(220, 100,80,30);
imag.add(mnamefront);


	gprice=new JLabel();
	gprice.setBounds(900,100,150,30);
	imag.add(gprice);
	
	gprice.setText(objt.gprice2);
	
	gpricefront=new JLabel("Gold price");
	gpricefront.setBounds(800,100,90,30);
	imag.add(gpricefront);
	
	sprice=new JLabel("Silver price");
	sprice.setBounds(800,130,150,30);
	imag.add(sprice);
	
	spricefront=new JLabel();
	spricefront.setBounds(900,130,150,30);
	imag.add(spricefront);
	spricefront.setText(objt.getSprice2());
	
	availtime=new JLabel("Available Timings:-");
	availtime.setBounds(100, 130, 120, 20);
	imag.add(availtime);

	
	timing912=new JRadioButton("9AM-11:55AM");
	timing912.setBounds(250, 130,130,20);
	

	timing1215=new JRadioButton("12:05PM-3PM");
	timing1215.setBounds(380, 130,130,20);
	
	
	timing1518=new JRadioButton("3:05PM-6PM");
	timing1518.setBounds(510, 130,130,20);
	
	
	timing1821=new JRadioButton("6:05PM-8:40PM");
	timing1821.setBounds(640, 130,130,20);
	
	
	lbluid=new JLabel("User Id");
	lbluid.setBounds(100,200,130,20);
	imag.add(lbluid);
	
	uid=new JLabel("0");
	uid.setBounds(180,200,100,20);
	imag.add(uid);
	uid.setText(objt.getStruid());

	lblunm=new JLabel("User Name");
	lblunm.setBounds(300,200,130,20);
	imag.add(lblunm);

	unm=new JLabel("0");
	unm.setBounds(380,200,100,20);
	imag.add(unm);
	unm.setText(objt.getStrunm());

	lbleid=new JLabel("Email Id");
	lbleid.setBounds(500,200,130,20);
	imag.add(lbleid);
	
	eid=new JLabel("0");
	eid.setBounds(580,200,200,20);
	imag.add(eid);
	
	eid.setText(objt.getStreid());
	lblmob=new JLabel("Mobile No.");
	lblmob.setBounds(800,200,130,20);
	imag.add(lblmob);
	
	mob=new JLabel("0");
	mob.setBounds(880,200,100,20);
	imag.add(mob);
	mob.setText(objt.getStrumob());
	lbltid=new JLabel("Ticket Id");
	lbltid.setBounds(700, 250, 100, 20);
	imag.add(lbltid);
	
	tid=new JLabel();
	tid.setBounds(800,250,130,20);
	imag.add(tid);
	
	String strMaxtid=dbh.getMaxticktidFromtblticket();
	tid.setText(strMaxtid);
	
	bms=new JButton("Book  show");
	bms.setBounds(1100,630,130,60);
	imag.add(bms);
	
	bms.setFont(new Font("Serif",Font.BOLD,20));
	bms.setForeground(Color.blue);
	//	timing912.setEnabled(false);
	

	
	
	
	gtkt=new JLabel("gold ticket price");
	gtkt.setBounds(1000,160,100,30);
	imag.add(gtkt);
	
	
	
	stkt=new JLabel("silver ticket price");
	stkt.setBounds(1000,200,100,30);
	imag.add(stkt);
	stktfront=new JLabel("0");
	stktfront.setBounds(1100,200,100,30);
	imag.add(stktfront);
	stktfront.setForeground(Color.white);
	
	gtktfront=new JLabel("0");
	gtktfront.setBounds(1100,160,100,30);
	gtktfront.setForeground(Color.WHITE);
	imag.add(gtktfront)	;
	total=new JLabel("Total price");
	total.setBounds(900,250,100,30);
	imag.add(total);
	totalpricefront =new JLabel("0");
	totalpricefront.setBounds(1000,250,150,30);
	imag.add(totalpricefront);
	totalpricefront.setForeground(Color.white);
	
	
	ButtonGroup grp=new ButtonGroup();
	grp.add(timing912);
	grp.add(timing1215);
	grp.add(timing1518);
	grp.add(timing1821);
	imag.add(timing1821);
	imag.add(timing912);
	imag.add(timing1215);
	imag.add(timing1518);
	
	
		
	

	

	if(objt.str1215g2.equals("false"))
	{
		timing1215.setEnabled(false);
	}
	
	 if(objt.str912g2.equals("false"))
	{
		timing912.setEnabled(false);
	}
	 if(objt.str1518g2.equals("false"))
	{
		timing1518.setEnabled(false);
	}
	
	if(objt.str1821g2.equals("false"))
	{
		timing1821.setEnabled(false);
	}
	

	price=new JButton("compute prize");
	price.setBounds(1100,400,150,20);
	imag.add(price);
	price.setVisible(false);	
	
	mulcount=new JLabel("0");
	mulcount.setVisible(true);
	mulcount.setBounds(10,600,50,20);
	imag.add(mulcount);
	max=35;
	arr=new JCheckBox[max];
	String[] checkbox=
		{
			"g1","g2","g3","g4","g5","g6","g7","g8",
			"g9","g10","g11","g12","g13","g14","g15","g16",
			"g17","g18","g19","g20","g21","g22","g23","g24",
			"g25","g26","g27","g28","g29","g30","g31","g32",
			"g33","g34","g35"
		};
	
	ticketbooked=new JLabel("0");
	ticketbooked.setBounds(1000, 600, 100, 30);
	imag.add(ticketbooked);
	
	labelg=new JLabel();
	int xpos=25;
	int ypos=25;
	//xpos+=20;
	//ypos+=30;
	
	for (int i=0;i <max; i++)
	{
				//ypos+=30;
		if(i==13||i==24)
			
		{
			ypos+=50;
			xpos=25;
			
		}
		if(i==15||i==22)
		{
			xpos+=50;
		}
		if(i==26||i==33)
		{
			xpos+=50;
		}
		arr[i]=new JCheckBox(checkbox[i]);
		arr[i].setBounds(xpos,ypos,50,50);
		//xpos++;
		xpos+=50;
		labelg.add(arr[i]);
	
		arr[i].addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			
			{
				// TODO Auto-generated method stub
			
				
				Object o=arg0.getSource();
				 chb=(JCheckBox) o;
				price.setVisible(true);
				
					
				count++;
				resetbtngold.setVisible(true);
				int goldu=1*count;
				
				
				
				goldseatsremaining=max-count;
				
				vctrseatselected.add(chb.getText());
				setTitle(vctrseatselected.toString());
				System.out.println(vctrseatselected.toString());
				
				
				
				chb.setEnabled(false);
				

			
				int k=Integer.parseInt(gprice.getText());	
				int l=k*count;
				gtktfront.setText(String.valueOf(l));
				mulcount.setText(String.valueOf(goldu));
			}
			
		});
		
	
	}
	
	
System.out.println(mulcount.getText()+"penchow");
	
	
	

mulcounts=new JLabel("0");
mulcounts.setVisible(true);
mulcounts.setBounds(10,630,50,50);
imag.add(mulcounts);
	
	labelg.setBounds(50,270,700,200);
	labelg.setBackground(Color.YELLOW);
	labelg.setOpaque(true);
	imag.add(labelg);
	
//	textgold=new JLabel();
//	textgold.setText("Gold Seats");
//	textgold.setFont(new Font("Serif",Font.BOLD,20));
//	textgold.setForeground(Color.blue);
//	textgold.setBounds(100,150,350,50);
//	imag.add(textgold);
//	



	arrs=new JCheckBox[max];
	String[] checkbox2=
		{
			"s1","s2","s3","s4","s5","s6","s7","s8",
			"s9","s10","s11","s12","s13","s14","s15","s16",
			"s17","s18","s19","s20","s21","s22","s23","s24",
			"s25","s26","s27","s28","s29","s30","s31","s32",
			"s33","s34","s35"
		};
	labels=new JLabel();
	int xpos1=25;
	int ypos1=25;
	
	for (int i=0;i <max; i++)
	{
		
		if(i==13||i==24)
			
		{
			ypos1+=50;
			xpos1=25;
			
		}
		if(i==15||i==22)
		{
			xpos1+=50;
		}
		if(i==26||i==33)
		{
			xpos1+=50;
		}
		arrs[i]=new JCheckBox(checkbox2[i]);
		arrs[i].setBounds(xpos1,ypos1,50,50);
		//xpos++;
		xpos1+=50;
		
		labels.add(arrs[i]);
		arrs[i].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				

				Object o=arg0.getSource();
				 chb1=(JCheckBox) o;
				
				price.setVisible(true);	
				resetbtnsilver.setVisible(true);	
				counts++;
				vctrsilverseatselected.add(chb1.getText());
				setTitle(vctrsilverseatselected.toString());
				System.out.println(vctrsilverseatselected.toString());
				
				mulcounts.setText(String.valueOf(counts));
				
				chb1.setEnabled(false);

			
				int k=Integer.parseInt(spricefront.getText());	
				int l=k*counts;
				stktfront.setText(String.valueOf(l));
				//mulcounts=0+counts;
				silverseatremaining=max-counts;
				//System.out.println(counts+"count silver");
			}
		});
		
	}
	
	

	
	price.addActionListener(new ActionListener()
	{
		
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			int d;
			 g=Integer.parseInt(gtktfront.getText());
			 s=Integer.parseInt(stktfront.getText());
			d=g+s;
			
			totalpricefront.setText(String.valueOf(d));
			
		}
	});

	
	
	labels.setBounds(50,500,900,200);
	labels.setBackground(Color.gray);
	labels.setOpaque(true);
	
	
	
	

	
	imag.add(labels);
	add(imag);
	
	resetbtngold=new JButton("Reset gold");
	resetbtngold.setBounds(30,20,100,20);
	imag.add(resetbtngold);
	resetbtngold.setVisible(false);
	
	resetbtnsilver=new JButton("Reset silver");
	resetbtnsilver.setBounds(30,50,130,20);
	imag.add(resetbtnsilver);
	resetbtnsilver.setVisible(false);
	resetbtngold.addActionListener(new ActionListener()
	{
		
	
		public void actionPerformed(ActionEvent arg0)
		{
			
			gtktfront.setText("0");
			count=0;
			g=0;
			resetgold=vctrseatselected.toString().substring(1,vctrseatselected.toString().length()-1);
			rgold=resetgold.substring(1,resetgold.length());
			for(String siid:rgold.split(", g",0))
			{
				arr[Integer.parseInt(siid)-1].setSelected(false);
				arr[Integer.parseInt(siid)-1].setEnabled(true);	
		
			}
			vctrseatselected.removeAllElements();
		}
		
	});
	
	resetbtnsilver.addActionListener(new ActionListener()
	{
		
		@Override
		
		public void actionPerformed(ActionEvent arg0)
		{
			counts=0;
			stktfront.setText("0");
			s=0;
			resetsilver=vctrsilverseatselected.toString().substring(1,vctrsilverseatselected.toString().length()-1);
			rsilver=resetsilver.substring(1,resetsilver.length());
		
			for(String sii:rsilver.split(", s",0))
			{
				arrs[Integer.parseInt(sii)-1].setSelected(false);
				arrs[Integer.parseInt(sii)-1].setEnabled(true);
			}
			vctrsilverseatselected.removeAllElements();
		
		}
			
		
	});
	
	sumtotal=new JLabel();
	sumtotal.setBounds(10,650,20,20);
	imag.add(sumtotal);
	bms.addActionListener(new ActionListener()
	{
		
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			int d;
			int g=Integer.parseInt(gtktfront.getText());
			int s=Integer.parseInt(stktfront.getText());
			
			d=g+s;
			System.out.println(d);
			sumtotal.setText(String.valueOf(d));
			if(timing912.isSelected())
			{
				
				
				
				
				int c;
				int a=Integer.parseInt(mulcount.getText());
				int b=Integer.parseInt(mulcounts.getText());
				c=a+b;
				
				qty=String.valueOf(c);
				gold=vctrseatselected.toString().substring(1,vctrseatselected.toString().length()-1);
				silver=vctrsilverseatselected.toString().substring(1,vctrsilverseatselected.toString().length()-1);
				System.out.println(vctrsilverseatselected.toString());
				objf=new clsfinal(moviename.getText(),gold,silver,sumtotal.getText(),uid.getText(),unm.getText(),"str912",curentdate.getText(),qty);
				
				dbh.insertintotblticket(uid.getText(),mid.getText(),tid.getText(),unm.getText(),mob.getText(),eid.getText(),gold,silver,curentdate.getText(),"str912",sumtotal.getText());
				dbh.insertintotblseatbooked(uid.getText(),mid.getText(),String.valueOf(max),String.valueOf(max),gold,silver,curentdate.getText(),String.valueOf(goldseatsremaining),String.valueOf(silverseatremaining),"str912");
				upd=dbh.dispgoldseatbooked(mid.getText());
				upds=dbh.dispsilverseatsbooked(mid.getText());
				System.out.println(upds);
				System.out.println(upd);
				
				
				
				
				if(!(upd.equals(gold)&&upds.equals(silver)))
				{
					update=upd+", "+gold;
					System.out.println("yes paji sahi hai");
					

					updates=upds+", "+silver;
					for(String strsilver:updates.split("null, "))
					{
						System.out.println(strsilver);
						dbh.updatesilverseatsbooked(strsilver,mid.getText(),"str912");
					}
					for(String strgold:update.split("null, "))
					{
						System.out.println("hanji");
						dbh.updategoldseatsbooked(strgold,mid.getText(),"str912");
					
					}
				}
				}
			
			if(timing1215.isSelected())
			{
				gold=vctrseatselected.toString().substring(1,vctrseatselected.toString().length()-1);
				silver=vctrsilverseatselected.toString().substring(1,vctrsilverseatselected.toString().length()-1);
				dbh.insertintotblticket(uid.getText(),mid.getText(),tid.getText(),unm.getText(),mob.getText(),eid.getText(),gold,silver,curentdate.getText(),"str1215",sumtotal.getText());
				dbh.insertintotblseatbooked(uid.getText(),mid.getText(),String.valueOf(max),String.valueOf(max),gold,silver,curentdate.getText(),String.valueOf(goldseatsremaining),String.valueOf(silverseatremaining),"str1215");
				upd=dbh.dispgoldseatbooked(mid.getText());
				upds=dbh.dispsilverseatsbooked(mid.getText());
				System.out.println(upds);
				System.out.println(upd);
				objf=new clsfinal(moviename.getText(),gold,silver,sumtotal.getText(),uid.getText(),unm.getText(),"str11215",curentdate.getText(),qty);
				if(!(upd.equals(gold)&&upds.equals(silver)))
				{
					update=upd+", "+gold;
					
					

					updates=upds+", "+silver;
					for(String strsilver:updates.split("null, "))
					{
						System.out.println(strsilver);
						dbh.updatesilverseatsbooked(strsilver,mid.getText(),"str1215");
					}
					for(String strgold:update.split("null, "))
					{
						System.out.println("hanji");
						dbh.updategoldseatsbooked(strgold,mid.getText(),"str1215");
					
					}
					
					
					
					
				}
			
			}
			
			if(timing1518.isSelected())
			{
				gold=vctrseatselected.toString().substring(1,vctrseatselected.toString().length()-1);
				silver=vctrsilverseatselected.toString().substring(1,vctrsilverseatselected.toString().length()-1);
				dbh.insertintotblticket(uid.getText(),mid.getText(),tid.getText(),unm.getText(),mob.getText(),eid.getText(),gold,silver,curentdate.getText(),"str1518",sumtotal.getText());
				dbh.insertintotblseatbooked(uid.getText(),mid.getText(),String.valueOf(max),String.valueOf(max),gold,silver,curentdate.getText(),String.valueOf(goldseatsremaining),String.valueOf(silverseatremaining),"str1518");
				upd=dbh.dispgoldseatbooked(mid.getText());
				upds=dbh.dispsilverseatsbooked(mid.getText());
				System.out.println(upds);
				System.out.println(upd);
			
				objf=new clsfinal(moviename.getText(),gold,silver,sumtotal.getText(),uid.getText(),unm.getText(),"str1518",curentdate.getText(),qty);
				if(!(upd.equals(gold)&&upds.equals(silver)))
				{
					update=upd+", "+gold;
					updates=upds+", "+silver;
					for(String strsilver:updates.split("null, "))
					{
						System.out.println(strsilver);
						dbh.updatesilverseatsbooked(strsilver,mid.getText(),"str1518");
					}
					for(String strgold:update.split("null, "))
					{
						System.out.println("hanji");
						dbh.updategoldseatsbooked(strgold,mid.getText(),"str1518");
					
					}
					
					
					
					
				}			
			}
			
			if(timing1821.isSelected())
			{
				gold=vctrseatselected.toString().substring(1,vctrseatselected.toString().length()-1);
				silver=vctrsilverseatselected.toString().substring(1,vctrsilverseatselected.toString().length()-1);
				
				dbh.insertintotblticket(uid.getText(),mid.getText(),tid.getText(),unm.getText(),mob.getText(),eid.getText(),gold,silver,curentdate.getText(),"str1821",sumtotal.getText());
				dbh.insertintotblseatbooked(uid.getText(),mid.getText(),String.valueOf(max),String.valueOf(max),gold,silver,curentdate.getText(),String.valueOf(goldseatsremaining),String.valueOf(silverseatremaining),"str1821");
				upd=dbh.dispgoldseatbooked(mid.getText());
				upds=dbh.dispsilverseatsbooked(mid.getText());
				System.out.println(upds);
				System.out.println(upd);
				objf=new clsfinal(moviename.getText(),gold,silver,sumtotal.getText(),uid.getText(),unm.getText(),"str1821",curentdate.getText(),qty);
				
				
				if(!(upd.equals(gold)&&upds.equals(silver)))
				{
					update=upd+", "+gold;
					
					

					updates=upds+", "+silver;
					for(String strsilver:updates.split("null, "))
					{
						System.out.println(strsilver);
						dbh.updatesilverseatsbooked(strsilver,mid.getText(),"str1821");
					}
					for(String strgold:update.split("null, "))
					{
						System.out.println("hanji");
						dbh.updategoldseatsbooked(strgold,mid.getText(),"str1821");
					
					}	
					
					
				}
			
			
			
			
			}
			new Ticketbooked(objf);
			System.out.println("btn clicked ");
			
			}
		});
			
	

	
	
	
	
	
	
	
	setLayout(null);
	setVisible(true);
	setBounds(0,0,1360,710);
	
	setTitle("ticket book panel");
	setDefaultCloseOperation(2);
//	
//
//	 sheela=dbh.dispgoldseatbooked(mid.getText());
//	 //if(objt.equals(null))
//
//	System.out.println(sheela);
//	
//		
//		//System.out.println(gold);
//		
//		g=sheela.substring(1,sheela.length());
//		//System.out.println(g);
//		System.out.println(g);
//		
//		
//		munni=dbh.dispsilverseatsbooked(mid.getText());
//		System.out.println(munni);
//		s=munni.substring(1,munni.length());
//		System.out.println(s);
	
	
		
	
	

	

	timing912.addItemListener(new ItemListener()
	{
		
		@Override
		public void itemStateChanged(ItemEvent arg0)
		{

			//for reseting 1215 staff
			if(timingvaluesilver1215!=null)
			{
			for(String siid:s1215.split(", s",0))
			{
			arrs[Integer.parseInt(siid)-1].setEnabled(true);	
			}
			}

			if(timingvaluegold1215!=null)
			{
			for(String sii:g1215.split(", g",0))
			{
				System.out.println("thik");
			arr[Integer.parseInt(sii)-1].setEnabled(true);	
			}
			}

			//for reseting 1518 staff
			if(timingvaluesilver1518!=null)
			{
			for(String siid:s1518.split(", s",0))
			{
			arrs[Integer.parseInt(siid)-1].setEnabled(true);	
			}
			}

			if(timingvaluegold1518!=null)
			{
			for(String sii:g1518.split(", g",0))
			{
				
			arr[Integer.parseInt(sii)-1].setEnabled(true);	
			}
			}
			
			//for reseting 1821 staff
			if(timingvaluesilver1821!=null)
			{
			for(String siid:s1821.split(", s",0))
			{
			arrs[Integer.parseInt(siid)-1].setEnabled(true);	
			}
			}

			if(timingvaluegold1821!=null)
			{
			for(String sii:g1821.split(", g",0))
			{
				
			arr[Integer.parseInt(sii)-1].setEnabled(true);	
			}
			}
			
			imag.setBackground(Color.blue);
			imag.setOpaque(true);
			System.out.println("912 is showing");
			objt1=dbh.getseatsbookedbyidandtime(mid.getText(),"str912");
			timingvaluesilver912=objt1.getStrsilver912();
			timingvaluegold912=objt1.getStrgld912();

		
			System.out.println(timingvaluesilver912+".");
			//System.out.println(Integer.parseInt(timingvaluesilver912));
			System.out.println(timingvaluegold912);
			if(timingvaluesilver912!=null)
			{
				System.out.println("yes hogya kaaam");
				System.out.println("yes case is running");
			s912=timingvaluesilver912.substring(1,timingvaluesilver912.length());
			for(String siid:s912.split(", s",0))
			{
			arrs[Integer.parseInt(siid)-1].setEnabled(false);	
			}
			

			
			}
			
			 if(timingvaluegold912!=null)
			{
				
				g912=timingvaluegold912.substring(1,timingvaluegold912.length());
				
				
			for(String sii:g912.split(", g",0))
			{
				System.out.println("thik");
				arr[Integer.parseInt(sii)-1].setEnabled(false);	
			}
			
		}
		
		}
		
	}); 
	
		
	
			
			

						
				
	


		timing1215.addItemListener(new ItemListener()
		{
			
			
			public void itemStateChanged(ItemEvent arg0) 
			{
				
				
				//for rseting of 912
				if(timingvaluesilver912!=null)
				{
				for(String siid:s912.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(true);	
				}
				}

				if(timingvaluegold912!=null)
				{
				for(String sii:g912.split(", g",0))
				{
					System.out.println("thik");
				arr[Integer.parseInt(sii)-1].setEnabled(true);	
				}
				}
				
				
				//for reseting 1518 staff
				if(timingvaluesilver1518!=null)
				{
				for(String siid:s1518.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(true);	
				}
				}

				if(timingvaluegold1518!=null)
				{
				for(String sii:g1518.split(", g",0))
				{
					
				arr[Integer.parseInt(sii)-1].setEnabled(true);	
				}
				}
				
				//for reseting 1821 staff
				if(timingvaluesilver1821!=null)
				{
				for(String siid:s1821.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(true);	
				}
				}

				if(timingvaluegold1821!=null)
				{
				for(String sii:g1821.split(", g",0))
				{
					
				arr[Integer.parseInt(sii)-1].setEnabled(true);	
				}
				}
				


				imag.setBackground(Color.green);
				imag.setOpaque(true);
				System.out.println("1215 is showing");
				
				
				objt1=dbh.getseatsbookedbyidandtime(mid.getText(),"str1215");
				timingvaluegold1215=objt1.getStrgld912();
				timingvaluesilver1215=objt1.getStrsilver912();
				
				if(timingvaluegold1215!=null)
				{	
				g1215=timingvaluegold1215.substring(1,timingvaluegold1215.length());
				for(String sii:g1215.split(", g",0))
				{
					System.out.println(sii);
				arr[Integer.parseInt(sii)-1].setEnabled(false);	
				}
				}
				
				
				if(timingvaluesilver1215!=null)
				{
				s1215=timingvaluesilver1215.substring(1,timingvaluesilver1215.length());
				for(String siid:s1215.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(false);	
				}
				
			}
			}
		});
		

		timing1518.addItemListener(new ItemListener()
		{
			
			@Override
			public void itemStateChanged(ItemEvent arg0)
			{
				//for rsesting 9-12 slot value 
				if(timingvaluesilver912!=null)
				{
				for(String siid:s912.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(true);	
				}
				}

				if(timingvaluegold912!=null)
				{
				for(String sii:g912.split(", g",0))
				{
					System.out.println("thik");
				arr[Integer.parseInt(sii)-1].setEnabled(true);	
				}
				}

	
				//for reseting 1215 staff
				if(timingvaluesilver1215!=null)
				{
				for(String siid:s1215.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(true);	
				}
				}

				if(timingvaluegold1215!=null)
				{
				for(String sii:g1215.split(", g",0))
				{
					System.out.println("thik");
				arr[Integer.parseInt(sii)-1].setEnabled(true);	
				}
				}
				
				
				//for reseting 1821 staff
				if(timingvaluesilver1821!=null)
				{
				for(String siid:s1821.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(true);	
				}
				}

				if(timingvaluegold1821!=null)
				{
				for(String sii:g1821.split(", g",0))
				{
					
				arr[Integer.parseInt(sii)-1].setEnabled(true);	
				}
				}
				

				
				imag.setBackground(Color.LIGHT_GRAY);
				imag.setOpaque(true);
				System.out.println("1518 is showing");
				
				
				
				objt1=dbh.getseatsbookedbyidandtime(mid.getText(),"str1518");
				timingvaluegold1518=objt1.getStrgld912();
				timingvaluesilver1518=objt1.getStrsilver912();
				
				if(timingvaluegold1518!=null)
				{
				
				g1518=timingvaluegold1518.substring(1,timingvaluegold1518.length());
				for(String sii:g1518.split(", g",0))
				{
				arr[Integer.parseInt(sii)-1].setEnabled(false);	
				}
				}
			
				if(timingvaluesilver1518!=null)
				{
			s1518=timingvaluesilver1518.substring(1,timingvaluesilver1518.length());
			for(String siid:s1518.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(false);	
				}
				
			}
			}
		});
		
		timing1821.addItemListener(new ItemListener()
		{
			
			@Override
			public void itemStateChanged(ItemEvent arg0)
			{
				
				
				imag.setBackground(Color.CYAN);
				imag.setOpaque(true);
				System.out.println("1821 is showing");
				
				//for rsesting 9-12 slot value 
				if(timingvaluesilver912!=null)
				{
				for(String siid:s912.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(true);	
				}
				}

				if(timingvaluegold912!=null)
				{
				for(String sii:g912.split(", g",0))
				{
					System.out.println("thik");
				arr[Integer.parseInt(sii)-1].setEnabled(true);	
				}
				}

	
				//for reseting 1215 staff
				if(timingvaluesilver1215!=null)
				{
				for(String siid:s1215.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(true);	
				}
				}

				if(timingvaluegold1215!=null)
				{
				for(String sii:g1215.split(", g",0))
				{
					System.out.println("thik");
				arr[Integer.parseInt(sii)-1].setEnabled(true);	
				}
				}
				
				
				//for reseting 1518 staff
				if(timingvaluesilver1518!=null)
				{
				for(String siid:s1518.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(true);	
				}
				}

				if(timingvaluegold1518!=null)
				{
				for(String sii:g1518.split(", g",0))
				{
					
				arr[Integer.parseInt(sii)-1].setEnabled(true);	
				}
				}
				

				
				
				objt1=dbh.getseatsbookedbyidandtime(mid.getText(),"str1821");
				timingvaluegold1821=objt1.getStrgld912();
				timingvaluesilver1821=objt1.getStrsilver912();
				if(timingvaluegold1821!=null)	
				{	
				g1821=timingvaluegold1821.substring(1,timingvaluegold1821.length());
				for(String sii:g1821.split(", g",0))
				{
				arr[Integer.parseInt(sii)-1].setEnabled(false);	
				}
			}
				
				
				if(timingvaluesilver1821!=null)
				{		
				s1821=timingvaluesilver1821.substring(1,timingvaluesilver1821.length());
			
				for(String siid:s1821.split(", s",0))
				{
				arrs[Integer.parseInt(siid)-1].setEnabled(false);	
				}
			
			}
			}
		});


}

}
		
	
	
	

