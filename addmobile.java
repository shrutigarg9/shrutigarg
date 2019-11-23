import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import java.nio.file.Files;

public class addmobile
{
	JFrame fr,fn;
	JLabel lclose,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18;
	JLabel lpic1,lpic2,lpic3,lpic4;
	JLabel lsave,lreset,lqty,lprice;
	String path1,path2,path3,path4;
	Image original,scaled;	
	int p1=0,p2=0,p3=0,p4=0;	

	public addmobile(JFrame fx)
	{
		fn = fx;

		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		
		fr = new JFrame();
		fr.setBounds((dim.width-900)/2,(dim.height-680)/2,900,680);
		fr.setContentPane(new JLabel(new ImageIcon("images/addmobileform.png")));
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
		l15 = new JLabel("Total Warrenty(in Years)");
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

		t1 = new JTextField();
		t1.setBounds(60,150,265,25);
		t1.setFont(new Font("verdana",Font.BOLD,14));
		t1.setForeground(Color.black);
		fr.add(t1);

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
		
		lpic1 = new JLabel(new ImageIcon("images/loadimage1.png"));
		lpic1.setBounds(690,140,120,100);
		lpic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lpic1);
		lpic1.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				try
				{
					FileDialog fd = new FileDialog(fr,"Load Image",FileDialog.LOAD);
					fd.setVisible(true);
					path1 = fd.getDirectory()+fd.getFile();
					if(path1.equals("nullnull"))
					{
						p1=0;
					}
					else
					{
						p1=1;	
						original = Toolkit.getDefaultToolkit().getImage(path1);	
						scaled = original.getScaledInstance(120,100,Image.SCALE_DEFAULT);
						lpic1.setIcon(new ImageIcon(scaled));
					}
				}
				catch(Exception e)
				{
				}
			}
		});

		lpic2 = new JLabel(new ImageIcon("images/loadimage2.png"));
		lpic2.setBounds(690,260,120,100);
		lpic2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lpic2);
		lpic2.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				try
				{
					FileDialog fd = new FileDialog(fr,"Load Image",FileDialog.LOAD);
					fd.setVisible(true);
					path2 = fd.getDirectory()+fd.getFile();
					if(path2.equals("nullnull"))
					{
						p2=0;
					}
					else
					{
						p2=1;
						original = Toolkit.getDefaultToolkit().getImage(path2);	
						scaled = original.getScaledInstance(120,100,Image.SCALE_DEFAULT);
						lpic2.setIcon(new ImageIcon(scaled));
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		});

		lpic3 = new JLabel(new ImageIcon("images/loadimage3.png"));
		lpic3.setBounds(690,380,120,100);
		lpic3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lpic3);
		lpic3.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				try
				{
					FileDialog fd = new FileDialog(fr,"Load Image",FileDialog.LOAD);
					fd.setVisible(true);
					path3 = fd.getDirectory()+fd.getFile();
					if(path3.equals("nullnull"))
					{
						p3=0;
					}
					else
					{
						p3=1;
						original = Toolkit.getDefaultToolkit().getImage(path3);	
						scaled = original.getScaledInstance(120,100,Image.SCALE_DEFAULT);
						lpic3.setIcon(new ImageIcon(scaled));
					}
				}
				catch(Exception e)
				{
				}
			}
		});

		lpic4 = new JLabel(new ImageIcon("images/loadimage4.png"));
		lpic4.setBounds(690,500,120,100);
		lpic4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lpic4);
		lpic4.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				try
				{
					FileDialog fd = new FileDialog(fr,"Load Image",FileDialog.LOAD);
					fd.setVisible(true);
					path4 = fd.getDirectory()+fd.getFile();
					if(path4.equals("nullnull"))
					{
						p4=0;
					}
					else
					{
						p4=1;
						original = Toolkit.getDefaultToolkit().getImage(path4);	
						scaled = original.getScaledInstance(120,100,Image.SCALE_DEFAULT);
						lpic4.setIcon(new ImageIcon(scaled));
					}
				}
				catch(Exception e)
				{
				}
			}
		});

		lqty = new JLabel("Quantity");
		lqty.setBounds(265,15,100,32);
		lqty.setFont(new Font("verdana",Font.BOLD,18));
		lqty.setForeground(Color.white);
		fr.add(lqty);
		t17 = new JTextField();
		t17.setBounds(360,20,60,28);
		t17.setFont(new Font("verdana",Font.BOLD,18));
		t17.setForeground(Color.black);
		fr.add(t17);	

		lprice = new JLabel("Price");
		lprice.setBounds(450,15,100,32);
		lprice.setFont(new Font("verdana",Font.BOLD,18));
		lprice.setForeground(Color.white);
		fr.add(lprice);
		t18 = new JTextField();
		t18.setBounds(510,20,90,28);
		t18.setFont(new Font("verdana",Font.BOLD,18));
		t18.setForeground(Color.black);
		fr.add(t18);	

		lsave = new JLabel("<html><u>Save</u></html>");
		lsave.setBounds(660,15,50,32);
		lsave.setFont(new Font("verdana",Font.BOLD,18));
		lsave.setForeground(Color.white);
		lsave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		fr.add(lsave);
		lsave.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent me)
			{
				lsave.setForeground(Color.green);
				lsave.setFont(new Font("verdana",Font.BOLD,19));
			}
			public void mouseExited(MouseEvent me)
			{
				lsave.setForeground(Color.white);
				lsave.setFont(new Font("verdana",Font.BOLD,18));
			}
			public void mouseClicked(MouseEvent me)
			{

				if(t1.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Model name can't leave blank");
					t1.requestFocus();
				}
				else if(t2.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Company name can't leave blank");
					t2.requestFocus();
				}
				else if(t3.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Processor can't leave blank");
					t3.requestFocus();
				}
				else if(t4.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! RAM can't leave blank");
					t4.requestFocus();
				}
				else if(t5.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Internal storage can't leave blank");
					t5.requestFocus();
				}
				else if(t6.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Operating system can't leave blank");
					t6.requestFocus();
				}
				else if(t7.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Version can't leave blank");
					t7.requestFocus();
				}
				else if(t8.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Frame & Screen size can't leave blank");
					t8.requestFocus();
				}
				else if(t9.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Weight & Color can't leave blank");
					t9.requestFocus();
				}
				else if(t10.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Sim support can't leave blank");
					t10.requestFocus();
				}
				else if(t11.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Wireless can't leave blank");
					t11.requestFocus();
				}
				else if(t12.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Battry can't leave blank");
					t12.requestFocus();
				}
				else if(t13.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Front & Back camera can't leave blank");
					t13.requestFocus();
				}
				else if(t14.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Camera type can't leave blank");
					t14.requestFocus();
				}
				else if(t15.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Warrenty can't leave blank");
					t15.requestFocus();
				}
				else if(t16.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Manufacturing Year can't leave blank");
					t16.requestFocus();
				}
				else if(t17.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Quantity can't leave blank");
					t17.requestFocus();
				}
				else if(t18.getText().trim().length()==0)
				{
					JOptionPane.showMessageDialog(fr,"Error! Price can't leave blank");
					t18.requestFocus();
				}
				else if(p1==0)
				{
					JOptionPane.showMessageDialog(fr,"Please upload front side image");
				}
				else if(p2==0)
				{
					JOptionPane.showMessageDialog(fr,"Please upload back side image");
				}
				else if(p3==0)
				{
					JOptionPane.showMessageDialog(fr,"Please upload left side image");
				}
				else if(p4==0)
				{
					JOptionPane.showMessageDialog(fr,"Please upload right side image");
				}
				else
				{	
					try
					{	
						int qty = Integer.parseInt(t17.getText().trim());				
						int price = Integer.parseInt(t18.getText().trim());				
						try
						{
							Connection con = dao.createconnection();
							PreparedStatement ps = con.prepareStatement("insert into mobile_shopee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
							ps.setString(1,t1.getText());
							ps.setString(2,t2.getText());
							ps.setString(3,t3.getText());
							ps.setString(4,t4.getText());
							ps.setString(5,t5.getText());
							ps.setString(6,t6.getText());
							ps.setString(7,t7.getText());
							ps.setString(8,t8.getText());
							ps.setString(9,t9.getText());
							ps.setString(10,t10.getText());
							ps.setString(11,t11.getText());
							ps.setString(12,t12.getText());
							ps.setString(13,t13.getText());
							ps.setString(14,t14.getText());
							ps.setString(15,t15.getText());
							ps.setString(16,t16.getText());
							ps.setString(17,qty+"");
							ps.setString(18,price+"");
							int z = ps.executeUpdate();
							if(z>0)
							{
								File source1 = new File(path1);
								File destination1 = new File("mobilephotos/"+t1.getText()+"_1.jpg");
								Files.copy(source1.toPath(),destination1.toPath());
						
								File source2 = new File(path2);
								File destination2 = new File("mobilephotos/"+t1.getText()+"_2.jpg");
								Files.copy(source2.toPath(),destination2.toPath());
						
								File source3 = new File(path3);
								File destination3 = new File("mobilephotos/"+t1.getText()+"_3.jpg");
								Files.copy(source3.toPath(),destination3.toPath());
					
								File source4 = new File(path4);
								File destination4 = new File("mobilephotos/"+t1.getText()+"_4.jpg");
								Files.copy(source4.toPath(),destination4.toPath());
					
								JOptionPane.showMessageDialog(fr,"Mobile Added Successfully");
							}
							else
							{
								JOptionPane.showMessageDialog(fr,"Error! in Adding Mobile");
							}
							con.close();
						}
						catch(Exception e)
						{
							JOptionPane.showMessageDialog(fr,"Model Number Already Exists");
						}
					}
					catch(NumberFormatException ne)
					{
						JOptionPane.showMessageDialog(fr,"Quantity & Price must be in number");
					}
				}
			}
		});

		lreset = new JLabel("<html><u>Reset</u></html>");
		lreset.setBounds(755,15,65,32);
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
	}

	public void clearall()
	{
		t1.setText("");
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
		lpic1.setIcon(new ImageIcon("images/loadimage.png"));
		lpic2.setIcon(new ImageIcon("images/loadimage.png"));
		lpic3.setIcon(new ImageIcon("images/loadimage.png"));
		lpic4.setIcon(new ImageIcon("images/loadimage.png"));
	}
}