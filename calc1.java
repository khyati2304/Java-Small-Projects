import java.awt.*;
import java.awt.event.*;

class calc1 implements ActionListener 
{
	
	Frame f=new Frame("Calculator");
	
	
	//Labels
	Label no1=new Label("Enter 1st no");
	Label no2=new Label("Enter 2nd no");
	Label result=new Label("Answer");
	
	
	//TextFields
	TextField n1=new TextField();
	TextField n2=new TextField();
	TextField ans=new TextField();
	
	
	//Buttons
	Button b1=new Button("ADD");	
	Button b2=new Button("SUB");	
	Button b3=new Button("MUL");	
	Button b4=new Button("DIV");
	Button b5=new Button("MODULO");
	Button b6=new Button("RESET");		
	
	
	int sum2;
	int sum1;
	public static void main(String args[]) 
	{
		calc1 s = new calc1();
		try{
		s.design();
		}
		catch(Exception e)
		{}
	}
	public void actionPerformed(ActionEvent e)
	{
			sum1=Integer.parseInt(n1.getText());
			sum2=Integer.parseInt(n2.getText());
			if(e.getSource()==b1)
			ans.setText(""+(sum1+sum2));
			else if(e.getSource()==b2)
			ans.setText(""+(sum1-sum2));
			else if(e.getSource()==b3)
			ans.setText(""+(sum1*sum2));
			else if(e.getSource()==b4)
			ans.setText(""+(sum1/sum2));
			else if(e.getSource()==b5)
			ans.setText(""+(sum1%sum2));
			else if(e.getSource()==b6)
			{
				n1.setText("");
				n2.setText("");
				ans.setText("");
			}
	}
	// optional f.setTitle("Nick");*/
	
void design() throws Exception
{	
	
	createFrameInCenter(f);
	f.setVisible(true);
	
	GridLayout g=new GridLayout(6,2);
	f.setLayout(g);
	f.add(no1);
	f.add(n1);
	f.add(no2);
	f.add(n2);
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	f.add(b6);
	f.add(result);
	f.add(ans);
	try
	{
	}
	catch(Exception e)
	{	
	}
	f.setResizable(false);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	
}
	
	
	void createFrameInCenter(Frame f)
	{
	Dimension d=Toolkit.getDefaultToolkit().getScreenSize();//=new Dimension();
	int w,h,sw=400,sh=500;
	w=d.width/2;
	h=d.height/2;
	int x=w-sw/2;
	int y=h-sh/2;
	f.setBounds(x,y,w,h);
	}
}



