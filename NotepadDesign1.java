import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class NotepadDesign1 implements ActionListener
{
	JFrame f;
	JMenuBar mb;
	JMenu m1,m2,m3,m4,m5;
	//For File Menu
	JMenuItem f1,f2,f3,f4,f5,f6,f7;
	
	//For Edit Menu
	JMenuItem e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11;
	
	//For Format Menu
	JMenuItem fo1,fo2;
	
	//For View Menu
	JMenuItem v1;
	
	//For Help Menu
	JMenuItem h1,h2;
	
	//To choose Files
	JFileChooser fc=new JFileChooser();	
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("Open"))
		{
			
			int p=fc.showOpenDialog(f);
			if(p==JFileChooser.APPROVE_OPTION)
			{
				File fileobj=fc.getSelectedFile();
				System.out.println(fileobj.getName()+" is opened");
			}
			else if(p==JFileChooser.CANCEL_OPTION)
			{
				System.out.println("Operation Aborted");
			}
			
		}
		else if(ae.getActionCommand().equals("Save"))
		{
			FileDialog fd;
			fd = new FileDialog(f,"Save",FileDialog.SAVE);
			fd.setVisible(true);
		/*	int p=fc.showSaveDialog(f);
			if(p==JFileChooser.APPROVE_OPTION)
			{
				File fileobj=fc.getSelectedFile();
				System.out.println(fileobj.getName()+" is saved");
			}
			else if(p==JFileChooser.CANCEL_OPTION)
			{
				System.out.println("Operation Aborted");
			}*/
			
		}
		
		else
		{
			System.out.println(ae.getActionCommand());
		}
		
			
	}
	
	NotepadDesign1()
	{
		f = new JFrame("Nick Notepad");
		mb = new JMenuBar();
		
		m1 = new JMenu("File");
		m2 = new JMenu("Edit");
		m3 = new JMenu("Format");
		m4 = new JMenu("View");
		m5 = new JMenu("Help");

		mb.add(m1);
		mb.add(m2);
		mb.add(m3);	
		mb.add(m4);	
		mb.add(m5);	
		
		
		f.setJMenuBar(mb);
		f.getContentPane().setBackground(Color.white);
		f.setVisible(true);
		f.setSize(450,112);
		
		
		//File Menu Start
		m1.setMnemonic('F');
		
		f1 = new JMenuItem("New");
		f2 = new JMenuItem("Open");
		f3 = new JMenuItem("Save");
		f4 = new JMenuItem("Save As");
		f5 = new JMenuItem("Page Setup");
		f6 = new JMenuItem("Print");
		f7 = new JMenuItem("Exit");
		
		f1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_MASK)); //Ctrl+N
		f2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O,KeyEvent.CTRL_MASK));//Ctrl+O
		f3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,KeyEvent.CTRL_MASK));//Ctrl+S
		f6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,KeyEvent.CTRL_MASK));//Ctrl+P
		
		f1.setMnemonic('N');
		f2.setMnemonic('O');
		f3.setMnemonic('S');
		f4.setMnemonic('A');
		f5.setMnemonic('U');
		f6.setMnemonic('P');
		f7.setMnemonic('X');
		
		m1.add(f1);
		m1.add(f2);
		m1.add(f3);
		m1.add(f4);
		m1.add(f5);
		m1.add(f6);
		m1.add(f7);
		
		
		f1.addActionListener(this);
		f2.addActionListener(this);
		f3.addActionListener(this);
		f4.addActionListener(this);
		f5.addActionListener(this);
		f6.addActionListener(this);
		f7.addActionListener(this);
		
		//File Menu End
		
		//Edit Menu Start
		m2.setMnemonic('E');
		
		e1 = new JMenuItem("Undo");
		e2 = new JMenuItem("Cut");
		e3 = new JMenuItem("Copy");
		e4 = new JMenuItem("Paste");
		e5 = new JMenuItem("Delete");
		e6 = new JMenuItem("Find");
		e7 = new JMenuItem("Find Next");
		e8 = new JMenuItem("Replace");
		e9 = new JMenuItem("Go To");
		e10 = new JMenuItem("Select All");
		e11= new JMenuItem("Time/Date");
		
		e1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z,KeyEvent.CTRL_MASK));
		e2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X,KeyEvent.CTRL_MASK));
		e3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_MASK));
		e4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V,KeyEvent.CTRL_MASK));
		e5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE,0));
		e6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F,KeyEvent.CTRL_MASK));
		e7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3,0));
		e8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,KeyEvent.CTRL_MASK));
		e9.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,KeyEvent.CTRL_MASK));
		e10.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_MASK));
		e11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5,0));
		
		e1.setMnemonic('U');
		e2.setMnemonic('T');
		e3.setMnemonic('C');
		e4.setMnemonic('P');
		e5.setMnemonic('L');
		e6.setMnemonic('F');
		e7.setMnemonic('N');
		e8.setMnemonic('R');
		e9.setMnemonic('G');
		e10.setMnemonic('A');
		e11.setMnemonic('D');
		
		
		
		m2.add(e1);
		m2.add(e2);
		m2.add(e3);
		m2.add(e4);
		m2.add(e5);
		m2.add(e6);
		m2.add(e7);
		m2.add(e8);
		m2.add(e9);
		m2.add(e10);
		m2.add(e11);
		
		e1.addActionListener(this);
		e2.addActionListener(this);
		e3.addActionListener(this);
		e4.addActionListener(this);
		e5.addActionListener(this);
		e6.addActionListener(this);
		e7.addActionListener(this);
		e8.addActionListener(this);
		e9.addActionListener(this);
		e10.addActionListener(this);
		e11.addActionListener(this);
		
		//Edit Menu End
		//Format Menu Start
		m3.setMnemonic('O');
	
		fo1=new JMenu("Word Wrap");
		fo2=new JMenu("Font");
		m3.add(fo1);
		m3.add(fo2);
		fo1.setMnemonic('W');
		fo2.setMnemonic('F');		
		fo1.addActionListener(this);
		fo2.addActionListener(this);
		
		//Format Menu End
		
		//View Menu Start
		
		m4.setMnemonic('V');
		v1=new JMenuItem("Status Bar");
		m4.add(v1);
		v1.setMnemonic('S');
		v1.addActionListener(this);
		
		// View Menu End
		
		//Help Menu Start
		m5.setMnemonic('H');
		h1=new JMenuItem("View Help");
		h2=new JMenuItem("About Notepad");
		m5.add(h1);
		m5.add(h2);
		h1.setMnemonic('H');
		h2.setMnemonic('A');
		h1.addActionListener(this);
		h2.addActionListener(this);
		// Help Menu Ends
		
	}

	public static void main(String ar[])
	{
		NotepadDesign1 z = new NotepadDesign1();
	}
}




