import java.awt.*;
import javax.swing.*;

public class splash implements Runnable
{
	JFrame fr;
	JLabel lb;
	Thread th=null;
	boolean bn=true;
	int w=0;
	public splash()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		fr = new JFrame();
		fr.setBounds((dim.width-500)/2,(dim.height-300)/2,500,300);
		fr.setContentPane(new JLabel(new ImageIcon("images/splash.png")));
		fr.setLayout(null);

		lb = new JLabel(new ImageIcon("images/line.png"));
		lb.setBounds(1,260,w,4);
		fr.add(lb);
		th = new Thread(this);
		th.start();

		fr.setUndecorated(true);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}

	public void run()
	{
		while(bn)
		{
			try
			{
				Thread.sleep(5);			
				w++;
				lb.setSize(w,4);
				if(w==500)
				{
					th=null;
					bn=false;
					fr.dispose();
					new signin();
				}				
			}
			catch(Exception e)
			{
			}
		}
	}

	public static void main(String args[])
	{
		new splash();		
	}
}