package discountPaint;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

// add two squares to our panel
// one will be blue, the other yellow
//when you click on blue the color changes to blue
//when you click on yellow the color changes
//you will need to use the idea of hitboxes, clicks and a color variable


//change the class name:
public class PaintPanel extends JPanel

{
	
    private int w, h;
    private Rectangle PaintHitBox;

    //variables for where we click:
    private Point point;

    //arrayLidt to store all clicks:
    ArrayList <Point> allPoints;

    //change the name here to match the frame
    
    
    //for color changing
    private int bluex, bluey, blueSize;
    private int yellowx, yellowy, yellowSize;
    private Rectangle BlueHitBox;
    private Rectangle YellowHitBox;
    private Color c;
    private ArrayList<Color> allColors;

  public PaintPanel(int w, int h) 
  
    {
    	
        this.w = w;
        this.h = h;

        this.setPreferredSize(new Dimension(w,h));
        this.setBackground(Color.black);

        //set up the point variable:
        point = new Point(0,0);

        //set up our ArrayList:
        allPoints = new ArrayList <Point>();

        //add mouse clicking:
        this.addMouseListener(new ClickListener());
        this.addMouseMotionListener(new ClickListener());
        
        //set up our new variables:
        bluex = 20;
        bluey = 20;
        blueSize = 50;
        
        yellowx = 20;
        yellowy = bluey + blueSize + 20;
        yellowSize = blueSize;
        
        BlueHitBox = new Rectangle(bluex, bluey, blueSize, blueSize);
        YellowHitBox = new Rectangle(yellowx, yellowy, yellowSize, yellowSize);
        c = Color.yellow;
        allColors = new ArrayList <Color>();
        
    }

    public void paintComponent(Graphics g)
    
  {
    	
        super.paintComponent(g);
      
        //g.setColor(c);
        
        //old single point
       //g.fillOval(point.x, point.y, 10, 10);
        
        //draw all values in arraylist
        
 for (int i = 0; i < allPoints.size(); i++)
	 
 {
	 
	 g.setColor(allColors.get(i));
	 g.fillOval(allPoints.get(i).x, allPoints.get(i).y, 10, 10);
	 
 }
 
 //draw the two buttons: 
 g.setColor(Color.blue);
 g.fillRect(bluex, bluey, blueSize, blueSize);
 g.setColor(Color.yellow);
 g.fillRect(yellowx, yellowy, yellowSize, yellowSize);

    }
    
        private class ClickListener implements MouseListener, MouseMotionListener
        
        {


        
        
        public void mouseClicked(MouseEvent e) 
        
        {
          

        }

        public void mousePressed(MouseEvent e) 
        
        {
        	//click and hold
        	//check for hitboxes:
        	
        	if(BlueHitBox.contains(e.getPoint()))
        	{
        		c = Color.blue;		
        	}
        	
        	if(YellowHitBox.contains(e.getPoint()))
        		
        			{
        				c = Color.yellow;
        			}
        		
        	
        }


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


		@Override
		public void mouseDragged(MouseEvent e) 
		{
			Point click = e.getPoint();
			//update our arraylist:
			
			allPoints.add(click);
			allColors.add(c);

             
             repaint();
			
		}


		@Override
		public void mouseMoved(MouseEvent e)
		{
			// TODO Auto-generated method stub
			
		}
        }
}