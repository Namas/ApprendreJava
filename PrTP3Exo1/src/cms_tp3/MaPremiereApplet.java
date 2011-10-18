package cms_tp3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;


public class MaPremiereApplet extends JApplet
{
	public void paint(Graphics g)
	{
		Font police = new Font("Arial",Font.BOLD,24);
		
		g.setColor(Color.BLUE);
		g.drawString("(\\/)", 13, 10);
		g.drawString("(Oo)", 10, 22);
		g.drawString("(  )", 13, 34);
		g.drawString("(B)(B)", 7, 46);
		
		g.setColor(Color.DARK_GRAY);
		g.drawLine(30, 50, 70, 50);
		
		g.setFont(police);
		
		g.setColor(Color.RED);
		g.drawString("Au revoir !", 10, 70);
		
	}
	

}
