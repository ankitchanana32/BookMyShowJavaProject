package bookmyshow;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class bookingframe extends JFrame 
{
	JLabel imag;
	JPanel panel;
	JPanel panel2;
	JPanel basic;
public bookingframe()
{
	imag=new JLabel();
	imag.setBackground(Color.gray);
	imag.setOpaque(true);
	imag.setBounds(0,0,1300,700);
	
	
	
	basic=new JPanel();
	basic.setLayout(new BoxLayout(basic, BoxLayout.Y_AXIS));
	add(basic);

	panel=new JPanel();
	panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	panel.setLayout(new GridLayout(6,8, 5, 5));
	panel.setBackground(Color.yellow);
	Checkbox arr[]=new Checkbox[48];
	String[] checkbox=
		{
			"g1","g2","g3","g4","g5","g6","g7","g8",
			"g9","g10","g11","g12","g13","g14","g15","g16",
			"g17","g18","g19","g20","g21","g22","g23","g24",
			"g25","g26","g27","g28","g29","g30","g31","g32",
			"g33","g34","g35","g36","g37","g38","g39","g40",
			"g41","g42","g43","g44","g45","g46","g47","g48"
		};
	

	for (int i = 0; i < checkbox.length; i++)
	{
		
		panel.add(new Checkbox(checkbox[i]));
		arr[i]=new Checkbox(checkbox[i]);
		
	}
	
	for (int i = 0; i < checkbox.length; i++)
	{
		
		//panel.checkbox[i]
		
	}
	panel.setPreferredSize(new Dimension(300,300));

	
	panel2=new JPanel();
	panel2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
	panel2.setLayout(new GridLayout(6,8, 5, 5));
	panel2.setBackground(Color.blue);
	String[] checkbox1=
		{
			"g1","g2","g3","g4","g5","g6","g7","g8",
			"g9","g10","g11","g12","g13","g14","g15","g16",
			"g17","g18","g19","g20","g21","g22","g23","g24",
			"g25","g26","g27","g28","g29","g30","g31","g32",
			"g33","g34","g35","g36","g37","g38","g39","g40",
			"g41","g42","g43","g44","g45","g46","g47","g48"
		};
	
	for (int i = 0; i < checkbox1.length; i++)
	{
		
		panel2.add(new JCheckBox(checkbox1[i]));
		
	}
	
	panel2.setPreferredSize(new Dimension(300,300));

	basic.add(panel);
	basic.add(panel2);
	//add(imag);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//setLayout(null);
	setVisible(true);
	setBounds(0,0,1300,700);
	
	setTitle("ticket book panel");
	setDefaultCloseOperation(2);
	
}
}
