/**

	This program displays my printed shirt 

	AUTHOR : Tahir Ahmad Khan
	Date   : June 17, 2005
*/

import javax.swing.*;										
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;

public class RainDemo extends JFrame
{
	private RPanel b;
	RainDemo()
	{
		Container con = getContentPane();
		con.setLayout(new BorderLayout());
		
		b = new RPanel();

		con.add(b, BorderLayout.CENTER);
	}
	public static void main(String []tahir)
	{
		RainDemo ne = new RainDemo();
		ne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension d = tk.getScreenSize();

		final int swidth = d.width;
		final int sheight = d.height;

		ne.setBounds(swidth/8,sheight/8,5*swidth/7,5*sheight/7);	

		ne.setVisible(true);
	}
}

class RPanel extends JPanel implements Runnable
{	
	private Thread t;
	private String receive = "";
	private double[] xofe,yofe;
	private double[] x,y;
	private double w,h;
	private int i,j,size;
	private boolean flag;
	private Dimension d;
	
	RPanel()
	{
		t = new Thread(this);
		setBackground(Color.black);
		flag = true;	
		t.start();
		i = 10;
		j = 20;
		size= 600;	//size of the array of ellipse's coordinates
		x = new double[size]; //declaring size of array of x-axis of ellipse(for run method)
		y = new double[size];	//declaring size of array of y-axis of ellipse(for run method)
		xofe = new double[size];	//declaring size of array of x-axis of ellipse(for paint component)
		yofe = new double[size];	//declaring size of array of y-axis of ellipse(for paint component)
	}

	public void paintComponent(Graphics g)
	{		
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.white);
		d = getSize();
		w = d.width;
		h = d.height;
		if(flag)
		{
			for(i = 0 ; i<size;i++)
			{
				x[i] = Math.random()*w;
				y[i] = Math.random()*h;
				xofe[i] = x[i];
				yofe[i] = y[i];
			}
			
			for(int k=0;k<size;k++)
			{
				Ellipse2D iell = new Ellipse2D.Double(xofe[k], yofe[k], 2,4);
				g2.draw(iell);	
			}
		}
		else
		{
			for(int k=0;k<size;k++)
			{
				Ellipse2D iell = new Ellipse2D.Double(xofe[k],yofe[k]++, 4, 4);
				g2.draw(iell);	
			}
		}
	}
	public void run()
	{
		for(;;)
		{		
				flag = false; 
				for(i = 0 ; i<size;i++)
				{						
					x[i] = Math.random()*w;
					y[i] = y[i];
					//System.out.println("i = "+i); 
					xofe[i] = x[i];
					yofe[i] = y[i];
					repaint();
					try
					{
						t.sleep(50);
					}catch(InterruptedException e){}
					
				}					
		}
	}
}