import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class ColorChooser implements ActionListener
{
	JFrame f=new JFrame();
	JButton b1=new JButton("Set Color");
	
//JPanel jp=new JPanel();
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Set Color"))
		{
				JFrame f1=new JFrame();
				JColorChooser jc=new JColorChooser();
				f1.add(jc);
				f1.setSize(400,500);
				f1.setVisible(true);
		}
		
		
	}
	ColorChooser()
	{
			//f.add(jp,BorderLayout.NORTH);
			f.add(b1);
			
			f.setVisible(true);
			f.setSize(200,200);
			b1.addActionListener(this);
			
			
	}
	public static void main(String args[])
	{
		ColorChooser obj=new ColorChooser();
		
	}
	
}