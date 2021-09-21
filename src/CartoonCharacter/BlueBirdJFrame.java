package CartoonCharacter;
import javax.swing.JFrame;

public class BlueBirdJFrame 
{

    public static void main(String[] args) 
    {

        JFrame frame = new JFrame("BlueAngryBird");     
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BlueAngryBirdPanel panel = new BlueAngryBirdPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setBounds(100, 80, 600, 700);
    }

}