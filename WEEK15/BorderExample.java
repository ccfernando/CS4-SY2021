import java.awt. * ;
import javax.swing. * ;
public class BorderExample {
  JFrame Bframe;
  BorderExample() {
    Bframe = new JFrame();
    JButton borderbutton1 = new JButton("UP");
    JButton borderbutton2 = new JButton("DOWN");
    JButton borderbutton3 = new JButton("RIGHT");
    JButton borderbutton4 = new JButton("LEFT");
    JButton borderbutton5 = new JButton("CENTER");
    Bframe.add(borderbutton1, BorderLayout.NORTH);
    Bframe.add(borderbutton2, BorderLayout.SOUTH);
    Bframe.add(borderbutton3, BorderLayout.EAST);
    Bframe.add(borderbutton4, BorderLayout.WEST);
    Bframe.add(borderbutton5, BorderLayout.CENTER);
    Bframe.setSize(400, 400);
    Bframe.setVisible(true);
  }
  public static void main(String[] args) {
    new BorderExample();
  }
}
