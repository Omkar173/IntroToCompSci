package SadPong;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

//change the class name:
public class PongPanel extends JPanel
{
	private int w, h;
	
	//score variables
	private int hits, misses, total;
	
	//Player
	private int px, py, pw, ph;
	private Rectangle playerHitBox;
	
	//ball:
	private int bx, by, bSIZE;
	private int movex, movey;
	private Rectangle ballHitBox;
	private Timer t;
	
	//change the name here to match the class:
	public PongPanel(int w, int h)
	{
		this.w = w;
		this.h = h;
		this.setPreferredSize(new Dimension(w,h));
		this.setBackground(Color.black);
		
		//set up player and enemy variables: 
		bx = w/2;
		by = 100;
		bSIZE = 40;
		
		px = w/2;
		py = h - 40;
		pw = 100;
		ph = 20;
		
		movex = 5;
		movey = 7;
		
		hits = 0;
		misses = 0;
		total = 0;
		
		playerHitBox = new Rectangle(px, py, pw, ph);
		ballHitBox = new Rectangle(bx, by, bSIZE, bSIZE);
		
		t = new Timer(20, new BallMover());
		t.start();
		
		this.addMouseMotionListener(new PaddleTracker());
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		//draw player and the ball
		
		g.setColor(Color.white);
		g.fillRect(px, py, pw, ph);
		
		g.fillOval(bx,  by,  bSIZE,  bSIZE);
		
		//update and draw score
		total = hits-misses;
		g.setFont(new Font("Times new Roman", Font.BOLD, 72));
		g.drawString("Score: "+total, 20, 50);
		
	}

	private class BallMover implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) 
		{
			//update the ball hit box
			ballHitBox = new Rectangle(bx, by, bSIZE, bSIZE);
			
			if(playerHitBox.intersects(ballHitBox))
			{
				System.out.println("hit");
				hits++;
				movey*= -1;
			}
			
			//for the score
			if(by > h-bSIZE)
				misses++;
			
			if(bx > w-bSIZE || bx <0)
				movex *= -1;
			
			if(by > h-bSIZE || by < 0)
				movey *= -1;
			
			bx += movex;
			by += movey;
			repaint();
			
		}
		
		
		
	}
	
	private class PaddleTracker implements MouseMotionListener
	{

	
		public void mouseDragged(MouseEvent e) 
		{
			
		}

	
		public void mouseMoved(MouseEvent e) 
		{
			px = e.getX()-pw/2;
			//	py = e.getY();
			playerHitBox = new Rectangle(px, py, pw, ph);
				repaint();

			
		}
	}
}
