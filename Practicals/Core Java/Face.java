import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
public class Face extends Frame 
{	
	int x=10,y=0;;
	int dow=100;
	Thread tt;
	Calendar gc;
	Date dat;
	String showtime="Time";
	boolean flag=true,shut=true;
	int second,min,hour,varx=250,vary=0,count=0;
	Face()
	{
		//tt = new Thread();
		//tt.start();
		//run();
		addWindowListener(new WindowAdapter(){
		public void windowActivated(WindowEvent we)
		{
				gc=new GregorianCalendar();
				dat=new Date();
				gc.setTime(dat);
				second=gc.get(Calendar.SECOND);
				if(second%2!=0)
				{
					flag=false;
				}
				else
					flag=true;
				repaint();
		}
		public void windowClosing(WindowEvent we)
		{
			setVisible(false);
			System.exit(0);
		}
		});
		addMouseListener(new MouseAdapter(){
		public void mouseClicked(MouseEvent me)
		{
			count=me.getClickCount();
			if(flag)
			{
				repaint();
				flag=false;
			}
			else
			{
				repaint();
				flag=true;
			}
		}
		});
	}
	
	public void paint(Graphics g)
	{
			
			g.fillArc(122,100,105,60,0,180);//hair
			g.drawOval(100,100,150,200);//head
			g.fillArc(120,155,40,10,0,180);//right eye brow
			g.fillArc(195,155,40,10,0,180);//left eye brow
			if(flag&&shut)
			{
				g.drawOval(125,165,35,25);//left eye
				g.fillOval(140,170,12,12);//left eye
				g.drawOval(195,165,35,25);//right eye
				g.fillOval(205,170,12,12);//right eye
			}
			else
			{
				g.drawOval(125,165,35,25);//left eye
				//g.fillOval(140,170,12,12);//left eye
				g.drawOval(195,165,35,25);//right eye
				//g.fillOval(205,170,12,12);//right eye
			}
			g.drawOval(75,170,25,45);//left ear
			g.drawOval(250,170,25,45);//right ear
			g.drawOval(170,190,15,50);//nose
			g.setColor(Color.pink);
			g.fillArc(138,235,75,30,0,-180);//lips
			g.setColor(Color.red);
			if(count!=2)
			{
				g.fillArc(160,230,40,40,0,-180);//tounge
			}
			g.setColor(Color.white);
			g.fillRect(200,102,3,35);
	}
	/*public void run()
	{
		if(shut)
				shut=false;
			else
				shut=true;
		try
		{
			tt.sleep(500);	
		}catch(InterruptedException e)	
				
	}*/
	public static void main(String tahir[])
	{
		Face sm= new Face();
		sm.setSize(400,400);
		sm.setVisible(true);
	}
}