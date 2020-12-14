import java.awt.*;
import javax.swing.*;

public class ComplexLayout {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		
		Container northContainer = new JPanel(new FlowLayout());
		northContainer.add(new JButton("Left"));
		northContainer.add(new JButton("Right"));
		
		Container southContainer = new JPanel(new BorderLayout());
		southContainer.add(new JLabel("Buttom Left"), BorderLayout.WEST);
		southContainer.add(new JLabel("Buttom Right"), BorderLayout.EAST);
		
		// overall panel contains the smaller panels (composite)
		Container overallContainer = new JPanel(new BorderLayout());
		overallContainer.add(northContainer, BorderLayout.NORTH);
		overallContainer.add(new JButton("Center"), BorderLayout.CENTER);
		overallContainer.add(southContainer, BorderLayout.SOUTH);
		
		frame.add(overallContainer);
		frame.setSize(200,120);
		frame.setVisible(true);
	}
}
