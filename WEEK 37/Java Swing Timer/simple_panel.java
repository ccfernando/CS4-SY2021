import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

//making the simple_panel inherit the properties of a JPanel
public class simple_panel extends JPanel implements ActionListener {

  Timer timer;
  int x = 0, y = 0;
  int angleX = 1, angleY = 1;

  public simple_panel() {

    //the this keyword refers to the current object (simple_panel)
    this.setPreferredSize(new Dimension(450, 250));

    timer = new Timer(1, this);
    timer.start();

  }

  //paint method contains the instructions for painting
  // it takes the Graphics parameters which will be initialized by the compiler
  // the paint method does not need to be called, it will be called automatically when the program is run
  public void paint(Graphics g) {

    //Graphics2D offers more control over geometry compared to the usual Graphics
    //use of Graphics2D is advised
    super.paint(g);
    Graphics2D g2D = (Graphics2D) g;

    //Creating the first circle

    //Creating the black half circle
    g2D.fillOval(x, y, 50, 50);
  }

  @Override
  public void actionPerformed(ActionEvent arg0) {
    // TODO Auto-generated method stub
    if (x + angleX < 0)
      angleX = 1;
    else if (x + angleX > getWidth() - 50)
      angleX = -1;
    else if (y + angleY < 0)
      angleY = 1;
    else if (y + angleY > getHeight() - 50)
      angleY = -1;

    x = x + angleX;
    y = y + angleY;

    repaint();

  }

}
