import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.BorderFactory; 
import javax.swing.border.Border;

public class forget implements ActionListener
{
	JFrame fr;
	JLabel l1,l2,l3,lclose,l4,lpic;
	JTextField t1,t2;
	JButton b1;
	
	public forget()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		fr = new JFrame();
		fr.setBounds((dim.width-500)/2,(dim.height-300)/2,500,300);
		fr.setContentPane(new JLabel(new ImageIcon("images/signin.png")));
		fr.setLayout(null);

		lpic = new JLabel();

		l1 = new JLabel("UserName");
		l2 = new JLabel("Email-Id");
		l1.setBounds(70,90,150,30);
		l2.setBounds(70,130,150,30);
		l1.setForeground(Color.cyan);
		l2.setForeground(Color.cyan);
		l1.setFont(new Font("verdana",Font.BOLD,18));
		l2.setFont(new Font("verdana",Font.BOLD,18));
		fr.add(l1);
		fr.add(l2);
		
		Border border = BorderFactory.createLineBorder(Color.red);
		
		t1 = new JTextField();
		t2 = new JTextField();
		t1.setCaretColor(Color.red);
		t2.setCaretColor(Color.red);
		t1.setBounds(200,90,220,30);
		t2.setBounds(200,130,220,30);
		t1.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(1,5,1,1)));	
		t2.setBorder(BorderFactory.createCompoundBorder(border,BorderFactory.createEmptyBorder(1,5,1,1)));	
		t1.setForeground(Color.red);
		t2.setForeground(Color.red);
		t1.setFont(new Font("verdana",Font.BOLD,18));
		t2.setFont(new Font("verdana",Font.BOLD,18));
		t1.setOpaque(false);
		t2.setOpaque(false);
		fr.add(t1);
		fr.add(t2);

		lclose = new JLabel(new ImageIcon("images/close1.png"));
		lclose.setBounds(450,15,32,32);
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

		b1 = new JButton("Submit");
		b1.setBounds(200,170,120,30);
		b1.setForeground(Color.blue);
		b1.setFont(new Font("verdana",Font.BOLD,18));
		b1.addActionListener(this);
		fr.add(b1);	

		fr.setUndecorated(true);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(t1.getText().trim().length()==0)
		{
			JOptionPane.showMessageDialog(fr,"please enter username");
			t1.requestFocus();
		}			
		else if(t2.getText().trim().length()==0)
		{
			JOptionPane.showMessageDialog(fr,"please enter email-id");
			t2.requestFocus();
		}	
		else
		{	
			if(t1.getText().trim().equals("sharad") && t2.getText().trim().equals("sharad@gmail.com"))
			{
				JOptionPane.showMessageDialog(fr,"Your Password : career123");
			}
			else
			{
				JOptionPane.showMessageDialog(fr,"Sorry! Invalid UserName or Email-Id");
			}
		}		
	}
}