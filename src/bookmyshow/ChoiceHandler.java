package bookmyshow;

//import DBHandler;
//import clsemp;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;

public class ChoiceHandler implements ItemListener
{

	Admindelform a;
	public ChoiceHandler(Admindelform admindelform)
	{
		a=admindelform;
	}


	@Override
	public void itemStateChanged(ItemEvent arg0)
	{
		String strid=a.id.getSelectedItem();
		a.setTitle("ch selceted"+strid);
		fillform(strid);

	}

	public void fillform(String strid)
	{
		
		String s2;
		DBhandler objdh=new DBhandler();
		clsmov objci=objdh.getmoviedetailbyid(strid);
		a.name.setText(objci.getStrname());
		a.sdate.setText(objci.getStrsdate());
		a.edate.setText(objci.getStredate());
	//	a.chstar.set);
		
		System.out.println(objci.getStrstar());
		System.out.println(objci.getStr912());
		if(objci.getStr912().equals("true"))
		{
			System.out.println("yes");
			a.true1.setSelected(true);
		}
		 if(objci.getStr912().equals("false"))
		{
			a.false1.setSelected(true);
		}
		if(objci.getStr1215().equals("true"))
		{
			a.true2.setSelected(true);
		}
		if(objci.getStr1215().equals("false"))
		{
			a.false2.setSelected(true);
		}
		if(objci.getStr1518().equals("true"))
		{
			a.true3.setSelected(true);
		}
		if(objci.getStr1518().equals("false"))
		{
			a.false3.setSelected(true);
		}
		if(objci.getStr1821().equals("true"))
		{
			a.true4.setSelected(true);
		}
		if(objci.getStr1821().equals("false"))
		{
			a.false4.setSelected(true);
		}
		
		//a.chstar.addItem(Integer.parseInt(objci.getStrstar()));
		a.gprice.setText(objci.getStrgprice());
		a.sprice.setText(objci.getStrsprice());
		a.iname.setText(objci.getStriname());
		//icon=new ImageIcon(img);
        //a.lbl.setIcon(icon);
		System.out.println(objci.getStrstar());
		a.chstar.select(objci.getStrstar());
		System.out.println(objci.getStriname());
		ImageIcon icn=new ImageIcon(objci.getStriname());
		a.label.setIcon(icn);

	}

}
