package CartoonCharacter;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class AngryBirdPanel extends JPanel

{

	public AngryBirdPanel()

	{
		
	}
	
	
	public void paintComponent(Graphics g)
	
	{
		super.paintComponent(g);
		
		this.setBackground(Color.CYAN);
		
		
		//Shadow
		g.setColor(Color.black);
		g.fillOval(47, 87, 525, 525);
		
		//Body
		g.setColor(Color.red);
		g.fillOval(60,100,500, 500);
		
		//LeftEyeShadow
		g.setColor(Color.black);
		g.fillOval(195,300,130, 130);
		
		//RightEyeShadow
		g.setColor(Color.black);
		g.fillOval(315,300,130, 130);
		
		//LeftEyeBall
		g.setColor(Color.white);
		g.fillOval(200,300,125, 125);
		
		//RightEyeBall
		g.setColor(Color.white);
		g.fillOval(315,300,125, 125);
		
		//LeftEye
		g.setColor(Color.black);
		g.fillOval(260,335,35, 35);
		
		//RightEye
		g.setColor(Color.black);
		g.fillOval(345,335,35, 35);
		
		//LeftEyeReflection
		g.setColor(Color.white);
		g.fillOval(257,350,10, 10);
		
		//RightEyeReflection
		g.setColor(Color.white);
		g.fillOval(341,350,10, 10);
		
		//LeftEyebrow
		g.setColor(Color.black);
		g.fillRect(215,300,100, 15);
		
		//RightEyebrow
		g.setColor(Color.black);
		g.fillRect(327,300,100, 15);
		
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
