package bookmyshow;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;

public class ChoiceHandlerdisplay implements ItemListener
{

	Movieselection a;
	public ChoiceHandlerdisplay(Movieselection now)
	{
		a=now;
	}


	@Override
	public void itemStateChanged(ItemEvent arg0)
	{
		String strid=a.id.getSelectedItem();
		a.bk.setVisible(true);
		a.setTitle("ch selceted"+strid);
		fillform(strid);
a.name.setEditable(false);
a.sdate.setEditable(false);
a.edate.setEditable(false);


a.true1.setEnabled(false);
a.true2.setEnabled(false);
a.true3.setEnabled(false);
a.true4.setEnabled(false);

a.false1.setEnabled(false);
a.false2.setEnabled(false);

a.false3.setEnabled(false);
a.false4.setEnabled(false);
a.gprice.setEditable(false);
a.sprice.setEditable(false);
a.chstar.enable(false);
if(a.false1.isSelected())
{
	a.slot912.setEnabled(false);
	
	
	
}
if(a.true1.isSelected())
{
	a.slot912.setEnabled(true);
	
	
}


if(a.false2.isSelected())
{
	a.slot1215.setEnabled(false);
	
	
}

if(a.true2.isSelected())
{
	a.slot1215.setEnabled(true);
	
	
}


if(a.false3.isSelected())
{
	a.slot1518.setEnabled(false);
	
	
}

if(a.true3.isSelected())
{
	a.slot1518.setEnabled(true);
	
	
}


if(a.false4.isSelected())
{
	a.slot1821.setEnabled(false);
	
	
}

if(a.true4.isSelected())
{
	a.slot1821.setEnabled(true);
	
	
}






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
