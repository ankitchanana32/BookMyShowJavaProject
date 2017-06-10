package bookmyshow;

import java.awt.Graphics;


public class Entry 
{

	public static void main(String[] args)
	{ 
		Animapbar obj=new Animapbar();
		obj.setVisible(true);
		//Thread objthread=new Thread(obj);
//		objthread.start();
		Thread t=Thread.currentThread();
		{
			try
			{
				t.sleep(11000);//11000
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		obj.dispose();
		//Mainframe frm=new Mainframe();
		Homescreen hms= new Homescreen();
		//hms.setBounds(0,0,1350,750);
		//hms.setResizable(false);
	//	hms.setUndecorated(true);4
	}

}
