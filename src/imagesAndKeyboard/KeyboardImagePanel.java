package imagesAndKeyboard;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

//change the class name:
public class KeyboardImagePanel extends JPanel
{
	private int w, h;
	
	//change the name here to match the class:
	public KeyboardImagePanel(int w, int h)
	{
		this.w = w;
		this.h = h;
		this.setPreferredSize(new Dimension(w,h));
		this.setBackground(Color.black);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
	}

}
