import java.awt. * ;
import javax.swing. * ;
public class BorderExample {
  JFrame Bframe;
  BorderExample() {
    Bframe = new JFrame();
    JButton borderbutton = new JButton("UP");;
    JButton borderbutton = new JButton("DOWN");;
    JButton borderbutton = new JButton("RIGHT");;
    JButton borderbutton = new JButton("LEFT");;
    JButton borderbutton = new JButton("CENTER");;
    Bframe.add(borderbutton, BorderLayout.NORTH);
    Bframe.add(borderbutton, BorderLayout.SOUTH);
    Bframe.add(borderbutton, BorderLayout.EAST);
    Bframe.add(borderbutton, BorderLayout.WEST);
    Bframe.add(borderbutton, BorderLayout.CENTER);
    Bframe.setSize(400, 400);
    Bframe.setVisible(true);
  }
  public static void main(String[] args) {
    new BorderExample();
  }
}
