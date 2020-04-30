import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class AdCalculator extends Frame implements ActionListener
{
	Button b[] = new Button[20];
	String label[] = {"1","2","3","%","4","5","6","/","7","8","9","*","0","+","-",".","=","C","sqrt","On"};
	GridBagLayout gbl;
	GridBagConstraints gbc;
	TextField tx;
	
	AdCalculator()
	{
		gbl = new GridBagLayout();
		setLayout(gbl);
		gbc = new GridBagConstraints();
		setFont(new Font("Times New Roman",Font.PLAIN,16));
				
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		tx = new TextField();
		add(tx, 0,0,2,1);
		tx.addActionListener(this);
		int i,j=0,k=1;
		for(i = 0; i<b.length; i++)
		{
			gbc.fill = GridBagConstraints.NONE;
			gbc.anchor = GridBagConstraints.CENTER;
			b[i] = new Button(label[i]);
			add(b[i],j,k,1,1);
			b[i].addActionListener(this);
			if(j==3)
			{
				j=0;
				k++;
			}
			else 
			{
				j++;
							
			}
		}
	}
	public void add(Component c,int x, int y,int w,int h)
	{
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = w;
		gbc.gridheight = h;
		add(c, gbc);
	}
	public void actionPerformed(ActionEvent ae)
	{
	}
	public static void main(String tak[])
	{
		AdCalculator ac = new AdCalculator();
		ac.setSize(300,300);
		ac.setVisible(true);
	}
}