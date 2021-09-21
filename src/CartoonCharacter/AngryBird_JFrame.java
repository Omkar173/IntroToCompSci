package CartoonCharacter;
import javax.swing.JFrame;

public class AngryBird_JFrame 
{

    public static void main(String[] args) 
    {
    	

    	
        JFrame frame = new JFrame("AngryBirdProject");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        AngryBirdPanel panel = new AngryBirdPanel();
        
        frame.getContentPane().add(panel);
        
        frame.pack();
        
        frame.setVisible(true);
        
        frame.setBounds(100, 80, 600, 700);
        
    }

}