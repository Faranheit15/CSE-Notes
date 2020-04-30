import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="MouseApplet" width=500 height=300></applet>*/
public class MouseApplet extends Applet implements MouseListener, MouseMotionListener
{
	int x,y ; String msg="";
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg ,x , y);
	}
	public void mouseClicked(MouseEvent me)
	{
		x=10;y=10;
		msg = "Mouse Clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent me)
	{
		x=10;y=20;
		msg = "Mouse entered";
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		x=10;y=30;
		msg = "Mouse Exited";
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		x=10;y=40;
		msg = "Mouse Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		x=10;y=50;
		msg = "Mouse released";
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		x=10;y=60;
		msg = "Mouse Dragged";
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		x=10;y=70;
		msg = "Mouse Moved";
		repaint();
	}

}
