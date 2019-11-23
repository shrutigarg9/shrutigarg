import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.nio.file.Files;

public class deletemobile implements ActionListener
{
	JFrame fr,fn;
	JLabel lclose,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	JTextField t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;
	JLabel lpic1,lpic2,lpic3,lpic4;
	JLabel lreset,lqty,lprice;
	JComboBox cb;	
	JButton b1;	
	Image original,scaled;	

	public deletemobile(JFrame fx)
	{
		fn = fx;

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		fr = new JFrame();
		fr.setBounds((dim.width-900)/2,(dim.height-680)/2,900,680);
		fr.setContentPane(new JLabel(new ImageIcon("images/deletemobileform.png")));
		fr.setLayout(null);

		lclose = new JLabel(new ImageIcon("images/close1.png"));
		lclose.setBounds(850,15,32,32);
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
				fn.setEnabled(true);
				fr.dispose();
			}	
		});

		l1 = new JLabel("Model Name");
		l2 = new JLabel("Company Name");
		l3 = new JLabel("Processor(Ghz)");
		l4 = new JLabel("RAM(GB)");
		l5 = new JLabel("Internal Storage(GB)");
		l6 = new JLabel("Operating System");
		l7 = new JLabel("Version");
		l8 = new JLabel("Frame & Screen Size(cm)");
		l9 = new JLabel("Weight(gm) & Color");
  		l10 = new JLabel("Sim Support");
  		l11 = new JLabel("Wireless(LTE/VOLTE/GSM)");
		l12 = new JLabel("Battery(mAh)");
		l13 = new JLabel("Front & Back Camera(px)");
		l14 = new JLabel("Camera Type(VGA/HD/DSLR)");
		l15 = new JLabel("Warrenty(Years)");
		l16 = new JLabel("Manufacturing Year");

		l1.setBounds(60,127,250,25);
		l1.setFont(new Font("verdana",Font.BOLD,15));
		l1.setForeground(Color.blue);
		fr.add(l1);

		l2.setBounds(60,180,250,25);
		l2.setFont(new Font("verdana",Font.BOLD,15));
		l2.setForeground(Color.blue);
		fr.add(l2);

		l3.setBounds(60,290,250,25);
		l3.setFont(new Font("verdana",Font.BOLD,15));
		l3.setForeground(Color.blue);
		fr.add(l3);

		l4.setBounds(60,343,250,25);
		l4.setFont(new Font("verdana",Font.BOLD,15));
		l4.setForeground(Color.blue);
		fr.add(l4);

		l5.setBounds(60,396,200,25);
		l5.setFont(new Font("verdana",Font.BOLD,15));
		l5.setForeground(Color.blue);
		fr.add(l5);

		l6.setBounds(60,508,250,25);
		l6.setFont(new Font("verdana",Font.BOLD,15));
		l6.setForeground(Color.blue);
		fr.add(l6);

		l7.setBounds(60,561,250,25);
		l7.setFont(new Font("verdana",Font.BOLD,15));
		l7.setForeground(Color.blue);
		fr.add(l7);
		
		l8.setBounds(390,127,250,25);
		l8.setFont(new Font("verdana",Font.BOLD,15));
		l8.setForeground(Color.blue);
		fr.add(l8);

		l9.setBounds(390,180,250,25);
		l9.setFont(new Font("verdana",Font.BOLD,15));
		l9.setForeground(Color.blue);
		fr.add(l9);

		l10.setBounds(390,233,250,25);
		l10.setFont(new Font("verdana",Font.BOLD,15));
		l10.setForeground(Color.blue);
		fr.add(l10);

		l11.setBounds(390,286,250,25);
		l11.setFont(new Font("verdana",Font.BOLD,15));
		l11.setForeground(Color.blue);
		fr.add(l11);

		l12.setBounds(390,339,250,25);
		l12.setFont(new Font("verdana",Font.BOLD,15));
		l12.setForeground(Color.blue);
		fr.add(l12);

		l13.setBounds(390,392,250,25);
		l13.setFont(new Font("verdana",Font.BOLD,15));
		l13.setForeground(Color.blue);
		fr.add(l13);

		l14.setBounds(390,445,250,25);
		l14.setFont(new Font("verdana",Font.BOLD,15));
		l14.setForeground(Color.blue);
		fr.add(l14);

		l15.setBounds(390,498,250,25);
		l15.setFont(new Font("verdana",Font.BOLD,15));
		l15.setForeground(Color.blue);
		fr.add(l15);

		l16.setBounds(390,551,250,25);
		l16.setFont(new Font("verdana",Font.BOLD,15));
		l16.setForeground(Color.blue);
		fr.add(l16);
	
		cb = new JComboBox();
		cb.setBounds(60,150,175,25);
		cb.setFont(new Font("verdana",Font.BOLD,14));
		cb.setForeground(Color.black);
		fr.add(cb);

		b1 = new JButton("Search");
		b1.setBounds(240,150,85,25);
		b1.setForeground(Color.red);
		b1.setFont(new Font("verdana",Font.BOLD,12));
		b1.addActionListener(this);
		fr.add(b1);

		t2 = new JTextField();
		t2.setBounds(60,203,265,25);
		t2.setFont(new Font("verdana",Font.BOLD,14));
		t2.setForeground(Color.black);
		fr.add(t2);

		t3 = new JTextField();
		t3.setBounds(60,313,265,25);
		t3.setFont(new Font("verdana",Font.BOLD,14));
		t3.setForeground(Color.black);
		fr.add(t3);

		t4 = new JTextField();
		t4.setBounds(60,366,265,25);
		t4.setFont(new Font("verdana",Font.BOLD,14));
		t4.setForeground(Color.black);
		fr.add(t4);

		t5 = new JTextField();
		t5.setBounds(60,419,265,25);
		t5.setFont(new Font("verdana",Font.BOLD,14));
		t5.setForeground(Color.black);
		fr.add(t5);

		t6 = new JTextField();
		t6.setBounds(60,531,265,25);
		t6.setFont(new Font("verdana",Font.BOLD,14));
		t6.setForeground(Color.black);
		fr.add(t6);

		t7 = new JTextField();
		t7.setBounds(60,584,265,25);
		t7.setFont(new Font("verdana",Font.BOLD,14));
		t7.setForeground(Color.black);
		fr.add(t7);

		t8 = new JTextField();
		t8.setBounds(390,150,265,25);
		t8.setFont(new Font("verdana",Font.BOLD,14));
		t8.setForeground(Color.black);
		fr.add(t8);

		t9 = new JTextField();
		t9.setBounds(390,203,265,25);
		t9.setFont(new Font("verdana",Font.BOLD,14));
		t9.setForeground(Color.black);
		fr.add(t9);

		t10 = new JTextField();
		t10.setBounds(390,256,265,25);
		t10.setFont(new Font("verdana",Font.BOLD,14));
		t10.setForeground(Color.black);
		fr.add(t10);

		t11 = new JTextField();
		t11.setBounds(390,309,265,25);
		t11.setFont(new Font("verdana",Font.BOLD,14));
		t11.setForeground(Color.black);
		fr.add(t11);

		t12 = new JTextField();
		t12.setBounds(390,362,265,25);
		t12.setFont(new Font("verdana",Font.BOLD,14));
		t12.setForeground(Color.black);
		fr.add(t12);

		t13 = new JTextField();
		t13.setBounds(390,415,265,25);
		t13.setFont(new Font("verdana",Font.BOLD,14));
		t13.setForeground(Color.black);
		fr.add(t13);

		t14 = new JTextField();
		t14.setBounds(390,468,265,25);
		t14.setFont(new Font("verdana",Font.BOLD,14));
		t14.setForeground(Color.black);
		fr.add(t14);

		t15 = new JTextField();
		t15.setBounds(390,521,265,25);
		t15.setFont(new Font("verdana",Font.BOLD,14));
		t15.setForeground(Color.black);
		fr.add(t15);

		t16 = new JTextField();
		t16.setBounds(390,574,265,25);
		t16.setFont(new Font("verdana",Font.BOLD,14));
		t16.setForeground(Color.black);
		fr.add(t16);

		lqty = new JLabel("Quantity");
		lqty.setBounds(330,15,100,32);
		lqty.setFont(new Font("verdana",Font.BOLD,18));
		lqty.setForeground(Color.white);
		fr.add(lqty);
		t17 = new JTextField();
		t17.setBounds(430,20,60,28);
		t17.setFont(new Font("verdana",Font.BOLD,18));
		t17.setForeground(Color.black);
		fr.add(t17);	

		lprice = new JLabel("Price");
		lprice.setBounds(530,15,100,32);
		lprice.setFont(new Font("verdana",Font.BOLD,18));
		lprice.setForeground(Color.white);
		fr.add(lprice);
		t18 = new JTextField();
		t18.setBounds(600,20,90,28);
		t18.setFont(new Font("verdana",Font.BOLD,18));
		t18.setForeground(Color.black);
		fr.add(t18);	


		t2.setEditable(false);
		t3.setEditable(false);
		t4.setEditable(false);
		t5.setEditable(false);
		t6.setEditable(false);
		t7.setEditable(false);
		t8.setEditable(false);
		t9.setEditable(false);
		t10.setEditable(false);
		t11.setEditable(false);
		t12.setEditable(false);
		t13.setEditable(false);
		t14.setEditable(false);
		t15.setEditable(false);
		t16.setEditable(false);
		t17.setEditable(false);
				
		lpic1 = new JLabel(new ImageIcon("images/loadimage1.png"));
		lpic1.setBounds(690,140,120,100);
		lpic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lpic1);
		
		lpic2 = new JLabel(new ImageIcon("images/loadimage2.png"));
		lpic2.setBounds(690,260,120,100);
		lpic2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lpic2);
		
		lpic3 = new JLabel(new ImageIcon("images/loadimage3.png"));
		lpic3.setBounds(690,380,120,100);
		lpic3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lpic3);
		
		lpic4 = new JLabel(new ImageIcon("images/loadimage4.png"));
		lpic4.setBounds(690,500,120,100);
		lpic4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lpic4);

		lreset = new JLabel("<html><u>Reset</u></html>");
		lreset.setBounds(740,15,65,32);
		lreset.setFont(new Font("verdana",Font.BOLD,18));
		lreset.setForeground(Color.white);
		lreset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lreset);
		lreset.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				lreset.setForeground(Color.green);
				lreset.setFont(new Font("verdana",Font.BOLD,19));
			}
			public void mouseExited(MouseEvent me)
			{
				lreset.setForeground(Color.white);
				lreset.setFont(new Font("verdana",Font.BOLD,18));
			}
			public void mouseClicked(MouseEvent me)
			{
				clearall();
			}
		});

		fr.setUndecorated(true);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		loadmobilemodel();
	}

	public void loadmobilemodel()
	{
		try
		{
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("select * from mobile_shopee order by model_name asc");
			ResultSet rs = ps.executeQuery();
			while(rs.next()==true)
			{
				cb.addItem(rs.getString("model_name"));
			}
			con.close();	
		}
		catch(Exception e)
		{
		}
	}

	public void clearall()
	{
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		t7.setText("");
		t8.setText("");
		t9.setText("");
		t10.setText("");
		t11.setText("");
		t12.setText("");
		t13.setText("");
		t14.setText("");
		t15.setText("");
		t16.setText("");
		t17.setText("");
		t18.setText("");
		lpic1.setIcon(new ImageIcon("images/loadimage1.png"));
		lpic2.setIcon(new ImageIcon("images/loadimage2.png"));
		lpic3.setIcon(new ImageIcon("images/loadimage3.png"));
		lpic4.setIcon(new ImageIcon("images/loadimage4.png"));
	}

	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			Connection con = dao.createconnection();
			PreparedStatement ps = con.prepareStatement("select * from mobile_shopee where model_name=?");
			ps.setString(1,cb.getSelectedItem().toString());
			ResultSet rs = ps.executeQuery();
			if(rs.next()==true)
			{
				t2.setText(rs.getString("company_name"));
				t3.setText(rs.getString("processor"));
				t4.setText(rs.getString("ram"));
				t5.setText(rs.getString("internal_storage"));
				t6.setText(rs.getString("operating_system"));
				t7.setText(rs.getString("version"));
				t8.setText(rs.getString("frame_screen_size"));
				t9.setText(rs.getString("weight_color"));
				t10.setText(rs.getString("sim_support"));
				t11.setText(rs.getString("wireless"));
				t12.setText(rs.getString("battry"));
				t13.setText(rs.getString("front_back_camera"));
				t14.setText(rs.getString("camera_type"));
				t15.setText(rs.getString("warrenty"));
				t16.setText(rs.getString("manufacturing_year"));
				t17.setText(rs.getString("quantity"));
				t18.setText(rs.getString("price"));
				
				original = Toolkit.getDefaultToolkit().getImage("mobilephotos/"+cb.getSelectedItem().toString()+"_1.jpg");	
				scaled = original.getScaledInstance(120,100,Image.SCALE_DEFAULT);
				lpic1.setIcon(new ImageIcon(scaled));
			
				original = Toolkit.getDefaultToolkit().getImage("mobilephotos/"+cb.getSelectedItem().toString()+"_2.jpg");	
				scaled = original.getScaledInstance(120,100,Image.SCALE_DEFAULT);
				lpic2.setIcon(new ImageIcon(scaled));
					
				original = Toolkit.getDefaultToolkit().getImage("mobilephotos/"+cb.getSelectedItem().toString()+"_3.jpg");	
				scaled = original.getScaledInstance(120,100,Image.SCALE_DEFAULT);
				lpic3.setIcon(new ImageIcon(scaled));
			
				original = Toolkit.getDefaultToolkit().getImage("mobilephotos/"+cb.getSelectedItem().toString()+"_4.jpg");	
				scaled = original.getScaledInstance(120,100,Image.SCALE_DEFAULT);
				lpic4.setIcon(new ImageIcon(scaled));

				int z = JOptionPane.showConfirmDialog(fr,"Are You Sure to Delete?");
				if(z==0)
				{
					ps = con.prepareStatement("delete from mobile_shopee where model_name=?");
					ps.setString(1,cb.getSelectedItem().toString());
					ps.executeUpdate();
					clearall();
				}
			}
			else
			{
				JOptionPane.showMessageDialog(fr,"Model Name does not exists.....");
			}
			con.close();
			cb.removeAllItems();
			loadmobilemodel();	
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(fr,"There is no Mobile in database.....");
		}	
	}	
}