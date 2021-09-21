package blokBirdy;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class blokBirdy implements ActionListener, MouseListener
{
	public static blokBirdy blokBirdy;
	
	public Random rand;
	
	public final int WIDTH = 700, HEIGHT = 700;
	
	public BirdPanel birdpanel;
	
	public Rectangle bird;
	
	public boolean urtrashkid, gameBegin;
	
	public ArrayList<Rectangle> columns;
	
	public int ticks, Motion, score;
	
	
	
	public blokBirdy()
	{
		JFrame jframe = new JFrame();
		Timer timer = new Timer(20, this);
		
		
		birdpanel = new BirdPanel();
		rand = new Random();
		
		
		jframe.add(birdpanel);
		jframe.setTitle("blokBirdy Motivator - By Omkar");
		jframe.setSize(WIDTH, HEIGHT);
		jframe.addMouseListener(this);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setResizable(false);
		
		bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
		columns = new ArrayList<Rectangle>();
		
		addColumn(true);
		addColumn(true);
		addColumn(true);
		addColumn(true);
		
		timer.start();
		
		
	}
	
	public void addColumn(boolean start)
	{
		int space = 300;
		int width = 100;
		int height = 50 + rand.nextInt(300);
		
		if (start)
			
		{
			
			columns.add(new Rectangle(WIDTH + width + columns.size() * 300, HEIGHT - height - 120, width, height));
			columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * 300, 0, width, HEIGHT - height - space));
			
		}
		
		else 
			
		{
			columns.add(new Rectangle(columns.get(columns.size() -1).x + 600, HEIGHT - height - 120, width, height));
			columns.add(new Rectangle(columns.get(columns.size() -1).x, 0, width, HEIGHT - height - space));
		}	
		
	}
	

	public void paintColumn(Graphics g, Rectangle column)
	{
		
		g.setColor(Color.black);
		g.fillRect(column.x, column.y, column.width, column.height);
		
	}
	
	public void birdgowhee()
	{
		
		if (urtrashkid)
		{
			bird = new Rectangle(WIDTH / 2 - 10, HEIGHT / 2 - 10, 20, 20);
			columns.clear();
			Motion = 0;
			score = 0;
			
			addColumn(true);
			addColumn(true);
			addColumn(true);
			addColumn(true);
			
			urtrashkid = false;
		}
		
		if (!gameBegin)
		{
			
			gameBegin = true;
		}
		else if (!urtrashkid)
		{
			if (Motion > 0)
			{
				Motion = 0;
			}
			
			Motion -= 10;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		int speed = 10;
		
		ticks++;
		
		if (gameBegin)
		{
			
		
		
			for(int i = 0; i < columns.size(); i++)
			{
				Rectangle column =columns.get(i);
				
				column.x -= speed;
			}
			
			if (ticks % 2 ==0 && Motion < 15)
			{
				Motion+=2;
			}
			
			
			for(int i = 0; i < columns.size(); i++)
			{
				Rectangle column =columns.get(i);
				
				if (column.x + column.width < 0)
				{
					columns.remove (column);
					
					if (column.y == 0)
					{
						addColumn(false);
					}	
				}
			}
			
			bird.y += Motion;
			
			for (Rectangle column : columns)
			{
				if(column.intersects(bird))
				{
					urtrashkid = true;
					
					bird.x = column.x - bird.width;
					
				}
			}
			
			if (bird.y > HEIGHT - 120 || bird.y < 0)
			{
				
				urtrashkid = true;
			}
			
			if(bird.y + Motion >= HEIGHT - 120)
			{
				bird.y = HEIGHT - 120 - bird.height;
			}
		}	
		
		
		birdpanel.repaint();
	}
	
	
	
	
	
	public void repaint(Graphics g) 
	{
		g.setColor(Color.blue.brighter());
		g.fillRect(0, 0, WIDTH, HEIGHT);

		
		g.setColor(Color.green);
		g.fillRect(0, HEIGHT - 120, HEIGHT, 120);
		
		g.setColor(Color.red);
		g.fillOval(bird.x, bird.y, bird.width, bird.height);
		
		for (Rectangle column : columns)
		{
			
			paintColumn(g, column);
			
		}
		
		g.setColor(Color.green);
		g.setFont(new Font ("Comic Sans", 1, 100));
		
		if (!gameBegin)
			
		{
			
			g.drawString("click to start :)", 5, HEIGHT / 2 - 5);
			g.drawString("teeheehee", 15, HEIGHT / 6 - 5);
			
		}
		
		if (urtrashkid)
			
		{
			
			g.drawString("ur trash kid", 100, HEIGHT / 2 - 50);
			g.drawString("dang but", 100, HEIGHT / 5);
			
		}
		
	}
	
	public static void main(String[] args)
	{
		
		blokBirdy = new blokBirdy();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) 
	{
		
		birdgowhee();
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	
	{
			
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent e)
	
	{
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	
	{
		
	}

	
}
