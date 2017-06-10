package bookmyshow;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.text.MaskFormatter;

public class Movieselection extends JFrame
{

	JLabel movieid,moviename,stars,startdate,enddate,slot912,slot1215,slot1518;              
	JLabel slot1821,goldprice,silverprice,imagename;  
	BufferedImage img;
	JLabel imag;
	JLabel lbl;
	JPanel panel;
	JTextField name,gprice,iname,sprice;
	JFormattedTextField sdate,edate;
	Choice chstar,id;
	ImageIcon icon;
	JRadioButton true1,false1,true2,false2,true3,false3,true4,false4;
	DBhandler dbh=new DBhandler();
	JLabel label;
	JButton bk;
	JLabel lbluid,lblunm,lbleid,lblumob;
	JLabel txtuid,txtunm,txteid,txtumob;
	clsticket objt=new clsticket();
	public void clearscreen()
	{
		name.setText(null);
		gprice.setText(null);
		sprice.setText(null);
		iname.setText(null);
		sdate.setText(null);
		edate.setText(null);
		true1.setSelected(false);
		false1.setSelected(false);
		
		true2.setSelected(false);
		false2.setSelected(false);
		
		
		true3.setSelected(false);
		false3.setSelected(false);
		
		true4.setSelected(false);
		false4.setSelected(false);
		
		
		
	}
	
	public Movieselection()
	{
		
	}

public Movieselection(clsuser objt2)
{
		
		//for inserting background image
		//imag=new JLabel(new ImageIcon("pvr.jpg"));
	
		
		
		//for background color
		imag=new JLabel();
		//imag.getToolkit().getScreenResolution();
		imag.setBounds(0,0,1350,700);
		imag.setBackground(Color.GRAY);
		imag.setOpaque(true);
		add(imag);
		
		
	//	Image img=Toolkit.getDefaultToolkit().createImage("pvr.jpg");
		
		movieid=new JLabel("MOVIE ID");
		movieid.setBounds(50,70,100,20);
		imag.add(movieid);
		
	id=new Choice();
		id.setBounds(160, 70,100, 20);
		id.addItemListener(new ChoiceHandlerdisplay(this));
		imag.add(id);
		fillid();
		
	
	
		moviename=new JLabel("MOVIE NAME");
		moviename.setBounds(50,110,100,20);
		imag.add(moviename);
		
		name=new JTextField();
		name.setBounds(160,110,100,20);
		imag.add(name);
		
		
		stars=new JLabel("STARS");
		stars.setBounds(50,150,100,20);
		imag.add(stars);
		
		chstar=new Choice();
		
		int[] array={1,2,3,4,5};
		
		for(int i=0;i<array.length;i++)
		{
			chstar.addItem(String.valueOf(array[i]));
		}
		chstar.setBounds(160,150,100,20);
		imag.add(chstar);
		
		
		
		startdate=new JLabel("START DATE");
		startdate.setBounds(50,190,100,20);
		imag.add(startdate);
	 
		
		try {
			sdate=new JFormattedTextField(new MaskFormatter("##-##-####"));
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//sdate.setText("mm-dd-yyyy");
		sdate.setBounds(160,190,100,20);
		
	//	sdate.setValue(new Date());
		//sdate.setColumns(5);
	imag.add(sdate);
		
		
		
		
		enddate=new JLabel("END DATE");
		enddate.setBounds(50,230,100,20);
		imag.add(enddate);
		
		try {
			edate=new JFormattedTextField(new MaskFormatter("##-##-####"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		edate.setBounds(160, 230, 100, 20);
		imag.add(edate);
		
		slot912=new JLabel("SLOT 912");
		slot912.setBounds(50,270,100,20);
		imag.add(slot912);
		
		true1 =new JRadioButton("TRUE");
		true1.setBounds(160, 270,100,20);
		
		
		false1=new JRadioButton("FALSE");
		false1.setBounds(270, 270, 100, 20);
		
		
		ButtonGroup group1=new ButtonGroup();
		group1.add(true1);
		group1.add(false1);
		imag.add(true1);
		imag.add(false1);
		
		slot1215 =new JLabel("SLOT1215");
		slot1215.setBounds(50,310,100,20);
		imag.add(slot1215);
		
		true2 =new JRadioButton("TRUE");
		true2.setBounds(160, 310,100,20);
		
		
		false2=new JRadioButton("FALSE");
		false2.setBounds(270, 310, 100, 20);
		
		
		ButtonGroup group2=new ButtonGroup();
		group2.add(true2);
		group2.add(false2);
		imag.add(true2);
		imag.add(false2);
		
		
		
		
		
		slot1518=new JLabel("SLOT1518");
		slot1518.setBounds(50,350,100,20);
		imag.add(slot1518);

		true3 =new JRadioButton("TRUE");
		true3.setBounds(160, 350,100,20);
		
		
		false3=new JRadioButton("FALSE");
		false3.setBounds(270, 350, 100, 20);
		
		
		ButtonGroup group3=new ButtonGroup();
		group3.add(true3);
		group3.add(false3);
		imag.add(true3);
		imag.add(false3);
		

		
		
		
		
		slot1821=new JLabel("SLOT1821");
		slot1821.setBounds(50,390,100,20);
		imag.add(slot1821);
		
		
		true4 =new JRadioButton("TRUE");
		true4.setBounds(160, 390,100,20);
		
		
		false4=new JRadioButton("FALSE");
		false4.setBounds(270, 390, 100, 20);
		
		
		ButtonGroup group4=new ButtonGroup();
		group4.add(true4);
		group4.add(false4);
		imag.add(true4);
		imag.add(false4);
		

		
		
		
		
		
		goldprice=new JLabel("GOLD PRICE");
		goldprice.setBounds(50,430,100,20);
		imag.add(goldprice);
		
		gprice=new JTextField();
		gprice.setBounds(160, 430, 100,20);
		imag.add(gprice);
		
	//	System.out.println(true1.SELECTED_ICON_CHANGED_PROPERTY);
		silverprice=new JLabel("SILVER PRICE");
		silverprice.setBounds(50,470,100,20);
		imag.add(silverprice);
		
		sprice=new JTextField();
		sprice.setBounds(160,470,100,20);
		imag.add(sprice);
		
		
		imagename=new JLabel("IMAGE NAME");
		imagename.setBounds(50,510,100,20);
		imag.add(imagename);
		
		
		iname=new JTextField();
		iname.setBounds(160,510,100,20);
		imag.add(iname);
		
		panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		
		lbluid=new JLabel("USER ID");
		lbluid.setBounds(600,70,120,20);
		imag.add(lbluid);
		
		lblunm=new JLabel("USER Name");
		lblunm.setBounds(600,100,120,20);
		imag.add(lblunm);
		
		lbleid=new JLabel("EMAIL ID");
		lbleid.setBounds(600,130,120,20);
		imag.add(lbleid);
		
		lblumob=new JLabel("MOBLIE NO");
		lblumob.setBounds(600,160,120,20);
		imag.add(lblumob);
	
		//lbluid,lblunm,lbleid,lblumob;
		//JLabel txtuid,txtunm,txteid,txtumob;
		
		
		txtuid=new JLabel("0");
		txtuid.setBounds(700,70,120,20);
		imag.add(txtuid);
		txtuid.setText(objt2.getStruid());
		

		txtunm=new JLabel("0");
		txtunm.setBounds(700,100,120,20);
		imag.add(txtunm);
		txtunm.setText(objt2.getStruname());

		txteid=new JLabel("0");
		txteid.setBounds(700,130,120,20);
		imag.add(txteid);
		txteid.setText(objt2.getEmailid());
		

		txtumob=new JLabel("0");
		txtumob.setBounds(700,160,120,20);
		imag.add(txtumob);
		txtumob.setText(objt2.getStrmob());
		JButton cancel=new JButton("Cancel");
		cancel.setBounds(180,550,100,20);
		imag.add(cancel);
		
		label=new JLabel();
		label.setBounds(700,250,550,400);
		label.setBackground(Color.black);
		label.setOpaque(true);
		imag.add(label);

		
		
		JButton openb = new JButton("open");
		openb.setBounds(270, 510, 100, 20);
		imag.add(openb);
		JButton back=new JButton("BACK");
		back.setBounds(200,600,100,40);
		imag.add(back);

		bk=new JButton("book your show");
		bk.setBounds(70,550,140,20);
		imag.add(bk);
		bk.setVisible(false);
		
		bk.addActionListener(new ActionListener()
		{
			
			
			public void actionPerformed(ActionEvent arg0)
			{
			
				//1
				if(false1.isSelected()&&false2.isSelected()&&false3.isSelected()&&false4.isSelected())
				{
					
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"false","false","false","false",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
				//2
				 if(false1.isSelected()&&false2.isSelected()&&false3.isSelected()&&true4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"false","false","false","true",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
				//3
				 if(false1.isSelected()&&false2.isSelected()&&true3.isSelected()&&false4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"true","true","false","true",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
				//4
				 if(false1.isSelected()&&false2.isSelected()&&true3.isSelected()&&true4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"false","false","true","true",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
				
				//5
				 if(false1.isSelected()&&true2.isSelected()&&false3.isSelected()&&false4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"false","true","false","false",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
					
				//6	
				 if(false1.isSelected()&&true2.isSelected()&&false3.isSelected()&&true4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"false","true","false","true",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
					
				//7
				 if(false1.isSelected()&&true2.isSelected()&&true3.isSelected()&&false4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"false","true","true","false",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
				
				//8
				 if(false1.isSelected()&&true2.isSelected()&&true3.isSelected()&&true4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"false","true","true","true",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}	
					
				//9
			 if(true1.isSelected()&&false2.isSelected()&&false3.isSelected()&&false4.isSelected())
				{
					
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"true","false","false","false",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
					
				//10
				 if(true1.isSelected()&&false2.isSelected()&&false3.isSelected()&&true4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"true","false","false","true",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
					
				//11
				
				 if(true1.isSelected()&&false2.isSelected()&&true3.isSelected()&&false4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"true","false","true","false",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
				
				
				//12
				 if(true1.isSelected()&&false2.isSelected()&&true3.isSelected()&&true4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"true","false","true","true",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);					
				}
				
				//13
				 if(true1.isSelected()&&true2.isSelected()&&false3.isSelected()&&false4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"true","true","false","false",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
				
				//14
				 if(true1.isSelected()&&true2.isSelected()&&false3.isSelected()&&true4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"true","true","false","true",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);				
				}
				
				//15
				 if(true1.isSelected()&&true2.isSelected()&&true3.isSelected()&&false4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"true","true","true","false",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}
				
				//16
				 if(true1.isSelected()&&true2.isSelected()&&true3.isSelected()&&true4.isSelected())
				{
					clsticket objt=new clsticket(id.getSelectedItem(),name.getText(),"true","true","true","true",gprice.getText(),sprice.getText(),txtuid.getText(),txtunm.getText(),txteid.getText(),txtumob.getText());
					new Ticketstatusform(objt);
				}

				
//				
			
//				tc.mid.setText("Movie id :-"+id.getSelectedItem());
//				tc.moviename.setText("MOVIE Name :-"+name.getText());
//				
//				if(false1.isSelected())
//				{
//					tc.timing912.setEnabled(false);
//					
//				}
//				if(false2.isSelected())
//				{
//					tc.timing1215.setEnabled(false);
//					
//				}
//				if(false3.isSelected())
//				{
//					tc.timing1518.setEnabled(false);
//					
//				}
//				if(false4.isSelected())
//				{
//					tc.timing1821.setEnabled(false);
//					
//				}
//				tc.gprice.setText(gprice.getText());
//				tc.sprice.setText("silver price:-"+sprice.getText());
				System.out.println("btn clicked");
				dispose();
			clearscreen();
			}
		});
		
		
	
		
		
		back.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				// TODO Auto-generated method stub
				dispose();
				new Homescreen();
			}
		});
		
		openb.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent event)
			{
			JFileChooser fileopen = new JFileChooser();
			FileNameExtensionFilter filter = new FileNameExtensionFilter(".jpg","cfiles");
			fileopen.addChoosableFileFilter(filter);
			
			int ret = fileopen.showDialog(panel, "Open file");
			if (ret == JFileChooser.APPROVE_OPTION) 
			{
			File file = fileopen.getSelectedFile();
			iname.setText(fileopen.getSelectedFile().getName());
			try
            {
                img=ImageIO.read(file);
            }
            catch(IOException e1)
			{
            	
			}
			 icon=new ImageIcon(img);
	         label.setIcon(icon);
//	        label.setBounds(370,180 ,400,400);
	         
        }
		
			
//			

//	//imag.add(label);
			}
		
	
			
			});
		
		
		setLayout(null);
		setLocationRelativeTo(null);
		setBounds(0, 0, 1350,700);
	//	setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setTitle("Movies SeLection");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setBackground(Color.blue);
	}
	
	

private void fillid()
{
	DBhandler objDh=new DBhandler();
	Vector<String> vctid=objDh.getidfromtablemovies();
	//in swing
	//choice ch=new Choice(vctrempnos)
	for (String strid:vctid)
	{
		id.add(strid);
	}
	
	
}
}