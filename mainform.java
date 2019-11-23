import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mainform
{
	JFrame fr;
	JLabel lun,lclose,l1,l2,l3,l4,l5; 
	String user;

	public mainform(String un)
	{
		user = un;

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		fr = new JFrame();
		fr.setSize(dim.width,dim.height);
		fr.setContentPane(new JLabel(new ImageIcon("images/mainform.png")));
		fr.setLayout(null);

		lun = new JLabel("welcome, "+user.toUpperCase());
		lun.setBounds(20,20,300,30);
		lun.setFont(new Font("verdana",Font.BOLD,14));
		lun.setForeground(Color.blue);
		fr.add(lun);

		lclose = new JLabel(new ImageIcon("images/close1.png"));
		lclose.setBounds(dim.width-50,15,32,32);
		lclose.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lclose);	
		lclose.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				lclose.setIcon(new ImageIcon("images/close2.png"));
			}	
			public void mouseExited(MouseEvent me)
			{
				lclose.setIcon(new ImageIcon("images/close1.png"));
			}	
			public void mouseClicked(MouseEvent me)
			{
				fr.dispose();
			}	
		});

		l1 = new JLabel(new ImageIcon("images/addmobilepic1.png"));
		l1.setBounds(30,80,120,100);
		l1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	
		fr.add(l1);
		l1.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{	
				l1.setIcon(new ImageIcon("images/addmobilepic2.png"));
			}
			public void mouseExited(MouseEvent me)
			{	
				l1.setIcon(new ImageIcon("images/addmobilepic1.png"));
			}
			public void mouseClicked(MouseEvent me)
			{
				fr.setEnabled(false);
				new addmobile(fr);	
			}
		});

		l2 = new JLabel(new ImageIcon("images/searchmobile1.png"));
		l2.setBounds(30,200,120,100);
		l2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	
		fr.add(l2);
		l2.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{	
				l2.setIcon(new ImageIcon("images/searchmobile2.png"));
			}
			public void mouseExited(MouseEvent me)
			{	
				l2.setIcon(new ImageIcon("images/searchmobile1.png"));
			}
			public void mouseClicked(MouseEvent me)
			{
				fr.setEnabled(false);
				new searchmobile(fr);	
			}
		});

		l3 = new JLabel(new ImageIcon("images/deletemobile1.png"));
		l3.setBounds(30,320,120,100);
		l3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	
		fr.add(l3);
		l3.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{	
				l3.setIcon(new ImageIcon("images/deletemobile2.png"));
			}
			public void mouseExited(MouseEvent me)
			{	
				l3.setIcon(new ImageIcon("images/deletemobile1.png"));
			}
			public void mouseClicked(MouseEvent me)
			{
				fr.setEnabled(false);
				new deletemobile(fr);	
			}
		});

		l4 = new JLabel(new ImageIcon("images/modifymobile1.png"));
		l4.setBounds(30,440,120,100);
		l4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	
		fr.add(l4);
		l4.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{	
				l4.setIcon(new ImageIcon("images/modifymobile2.png"));
			}
			public void mouseExited(MouseEvent me)
			{	
				l4.setIcon(new ImageIcon("images/modifymobile1.png"));
			}
			public void mouseClicked(MouseEvent me)
			{
				fr.setEnabled(false);
				new modifymobile(fr);	
			}
		});

		l5 = new JLabel(new ImageIcon("images/mobilesale1.png"));
		l5.setBounds(30,560,120,100);
		l5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	
		fr.add(l5);
		l5.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{	
				l5.setIcon(new ImageIcon("images/mobilesale2.png"));
			}
			public void mouseExited(MouseEvent me)
			{	
				l5.setIcon(new ImageIcon("images/mobilesale1.png"));
			}
			public void mouseClicked(MouseEvent me)
			{
				fr.setEnabled(false);
				new mobilesale(fr);	
			}
		});


		fr.setUndecorated(true);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	public static void main(String args[])
	{
		new mainform("sharad");
	}
}