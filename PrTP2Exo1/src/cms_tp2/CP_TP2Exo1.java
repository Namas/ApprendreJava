package cms_tp2;

//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.*;

public class CP_TP2Exo1 
{
	public static void main(String[] args)
	{
		JFrame myFrame = new JFrame("(=.=)");
		Font fontPerso = new Font("Arial",Font.BOLD,24);
		JLabel myLabel = new JLabel("(*^.^) (o o) ( Xx) (B B)");
		
		
		
		myFrame.setBounds(500, 250, 500, 500);
				
		myLabel.setFont(fontPerso);
		
		myLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		myFrame.add(myLabel);
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myFrame.setVisible(true);
		
	}
}
