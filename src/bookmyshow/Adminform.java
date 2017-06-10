package bookmyshow;

import java.awt.BorderLayout;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.TextUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.EditorKit;
import javax.swing.text.JTextComponent;
import javax.swing.text.MaskFormatter;
import javax.swing.text.View;
import javax.swing.text.Position.Bias;
import javax.xml.bind.ParseConversionEvent;

public class Adminform extends JFrame

{
	JLabel movieid,moviename,stars,startdate,enddate,slot912,slot1215,slot1518;              
	JLabel slot1821,goldprice,silverprice,imagename;  
	BufferedImage img;
	JLabel imag;
	JLabel lbl;
	JTextField id,name,gprice,iname,sprice;
	JFormattedTextField sdate,edate;
	Choice chstar;
	JRadioButton true1,false1,true2,false2,true3,false3,true4,false4;
	DBhandler dbh=new DBhandler();
	
	
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
	public Adminform()
	{
		
		//for inserting background image
		//imag=new JLabel(new ImageIcon("pvr.jpg"));
	
		
		
		//for background color
		imag=new JLabel();
		//imag.getToolkit().getScreenResolution();
		imag.setBounds(0,0,1100,600);
		imag.setBackground(Color.GRAY);
		imag.setOpaque(true);
		add(imag);
		
		
	//	Image img=Toolkit.getDefaultToolkit().createImage("pvr.jpg");
		
		movieid=new JLabel("MOVIE ID");
		movieid.setBounds(50,70,100,20);
		imag.add(movieid);
		
	id=new JTextField();
		id.setBounds(160, 70,100, 20);
		imag.add(id);
		
		
		
		String strMaxid=dbh.getMaxmovieidFromtblmovies();
		id.setText(strMaxid);
		
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
		
		final JLabel label=new JLabel();
		label.setBounds(430,100,400,400);
		label.setBackground(Color.black);
		label.setOpaque(true);
		imag.add(label);
		
		iname=new JTextField();
		iname.setBounds(160,510,100,20);
		imag.add(iname);
		
		final JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		
		
		JButton openb = new JButton("open");
		openb.setBounds(270, 510, 100, 20);
		imag.add(openb);
		JButton back=new JButton("BACK");
		back.setBounds(500,30,100,40);
		imag.add(back);

		JButton insert=new JButton("INSERT");
		insert.setBounds(70,550,100,20);
		imag.add(insert);
		
		insert.addActionListener(new ActionListener()
		{
			
			
			public void actionPerformed(ActionEvent arg0)
			{
				//1
				if(false1.isSelected()&&false2.isSelected()&&false3.isSelected()&&false4.isSelected())
				{
				dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"false","false","false","false",gprice.getText(),sprice.getText(),iname.getText());
				}
				//2
				else if(false1.isSelected()&&false2.isSelected()&&false3.isSelected()&&true4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"false","false","false","true",gprice.getText(),sprice.getText(),iname.getText());
				}
				//3
				else if(false1.isSelected()&&false2.isSelected()&&true3.isSelected()&&false4.isSelected())
				{
					
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"true","true","false","true",gprice.getText(),sprice.getText(),iname.getText());
				}
				//4
				else if(false1.isSelected()&&false2.isSelected()&&true3.isSelected()&&true4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"false","false","true","true",gprice.getText(),sprice.getText(),iname.getText());
				}
				
				//5
				else if(false1.isSelected()&&true2.isSelected()&&false3.isSelected()&&false4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"false","true","false","false",gprice.getText(),sprice.getText(),iname.getText());
				}
					
				//6	
				else if(false1.isSelected()&&true2.isSelected()&&false3.isSelected()&&true4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"false","true","false","true",gprice.getText(),sprice.getText(),iname.getText());
				}
					
				//7
				else if(false1.isSelected()&&true2.isSelected()&&true3.isSelected()&&false4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"false","true","true","false",gprice.getText(),sprice.getText(),iname.getText());
				}
				
				//8
				else if(false1.isSelected()&&true2.isSelected()&&true3.isSelected()&&true4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"false","true","true","true",gprice.getText(),sprice.getText(),iname.getText());
				}	
					
				//9
				else if(true1.isSelected()&&false2.isSelected()&&false3.isSelected()&&false4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"true","false","false","false",gprice.getText(),sprice.getText(),iname.getText());
				}
					
				//10
				else if(true1.isSelected()&&false2.isSelected()&&false3.isSelected()&&true4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"true","false","false","true",gprice.getText(),sprice.getText(),iname.getText());
				}
					
				//11
				
				else if(true1.isSelected()&&false2.isSelected()&&true3.isSelected()&&false4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"true","false","true","false",gprice.getText(),sprice.getText(),iname.getText());
				}
				
				
				//12
				else if(true1.isSelected()&&false2.isSelected()&&true3.isSelected()&&true4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"true","false","true","true",gprice.getText(),sprice.getText(),iname.getText());
				}
				
				//13
				else if(true1.isSelected()&&true2.isSelected()&&false3.isSelected()&&false4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"true","true","false","false",gprice.getText(),sprice.getText(),iname.getText());
				}
				
				//14
				else if(true1.isSelected()&&true2.isSelected()&&false3.isSelected()&&true4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"true","true","false","true",gprice.getText(),sprice.getText(),iname.getText());
				}
				
				//15
				else if(true1.isSelected()&&true2.isSelected()&&true3.isSelected()&&false4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"true","true","true","false",gprice.getText(),sprice.getText(),iname.getText());
				}
				
				//16
				else if(true1.isSelected()&&true2.isSelected()&&true3.isSelected()&&true4.isSelected())
				{
					dbh.InsertIntoTblmovies(id.getText(),name.getText(),chstar.getSelectedItem(),sdate.getText(),edate.getText(),"true","true","true","true",gprice.getText(),sprice.getText(),iname.getText());
				}
				
				System.out.println("btn clicked");
				id.setText(dbh.getMaxmovieidFromtblmovies());
				dbh.disTblmovies();
				clearscreen();
			}
		});
		
		JButton cancel=new JButton("Cancel");
		cancel.setBounds(180,550,100,20);
		imag.add(cancel);
		
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
			ImageIcon icon=new ImageIcon(img);
	         label.setIcon(icon);
//	        label.setBounds(370,180 ,400,400);
        }
		
			
//			

//	//imag.add(label);
			}
		
	
			
			});
		
		setLayout(null);
		setLocationRelativeTo(null);
		setBounds(0, 0, 1100,650);
	//	setSize(Toolkit.getDefaultToolkit().getScreenSize());
		setTitle("admin panel");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setBackground(Color.blue);
	}

}
