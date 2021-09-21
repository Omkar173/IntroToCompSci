package blokBirdy;

import javax.swing.JPanel;
import java.awt.*;

public class BirdPanel extends JPanel
{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void paintComponent(Graphics g) 
	
	{
		
		super.paintComponent(g);
		
		blokBirdy.blokBirdy.repaint(g);
		
		
	}
	
}
