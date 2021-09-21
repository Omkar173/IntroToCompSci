package discountPaint;
import javax.swing.JFrame;

//change the class name:
public class PaintFrame
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Generic");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//change the "StandardPanel" to match your other class name
		//change the dimensions to match what you want
		frame.getContentPane().add(new PaintPanel(600,600));
		frame.pack();
		frame.setVisible(true);

	}

}
