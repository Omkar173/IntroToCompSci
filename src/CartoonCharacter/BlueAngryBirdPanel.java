package CartoonCharacter;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class BlueAngryBirdPanel extends JPanel

{

	public BlueAngryBirdPanel()
	{
		
	}
	
	
	public void paintComponent(Graphics g)
	
	{
		super.paintComponent(g);
		
		this.setBackground(Color.pink);
		
		
		
		//Body
		g.setColor(Color.blue);
		g.fillOval(50,75,500, 500);
		
		//RedEyeShadowLeft
		g.setColor(Color.red);
		g.fillOval(195,270,110, 110);
		
		//RedEyeShadowRight
		g.setColor(Color.red);
		g.fillOval(310,270,110, 110);
		
		//LeftEyeShadow
		g.setColor(Color.black);
		g.fillOval(195,250,110, 110);
		
		//RightEyeShadow
		g.setColor(Color.black);
		g.fillOval(310,250,110, 110);
		
		//LeftEyeBall
		g.setColor(Color.white);
		g.fillOval(200,250,100, 100);
		
		//RightEyeBall
		g.setColor(Color.white);
		g.fillOval(315,250,100, 100);
		
		//LeftEye
		g.setColor(Color.black);
		g.fillOval(235,290,35, 35);
		
		//RightEye
		g.setColor(Color.black);
		g.fillOval(345,290,35, 35);
		

		
		//Top Beak Shadow
		int[] BeakX = {320, 370, 270};
		int[] BeakY = {380, 450, 450};
				
		g.setColor(Color.black);
		g.fillPolygon(BeakX, BeakY, BeakX.length);

		//Top Beak
				
		int[] YellowBeakX = {320, 360, 280};
		int[] YellowBeakY = {390, 445, 445};
				
		g.setColor(Color.yellow);
		g.fillPolygon(YellowBeakX, YellowBeakY, YellowBeakX.length);
				
		//BottomBeakShadow
				
		int[] BottomBeakShadowX = {280,360,320};
		int[] BottomBeakShadowY = {450, 450, 480};
				
		g.setColor(Color.black);
		g.fillPolygon(BottomBeakShadowX, BottomBeakShadowY, BottomBeakShadowX.length);
				
		//BottomBeak
				
		int[] BottomBeakX = {285, 355, 320};
		int[] BottomBeakY = {450, 450, 475};
		
		g.setColor(Color.yellow);
		g.fillPolygon(BottomBeakX, BottomBeakY, BottomBeakX.length);
		
	}
	
}
