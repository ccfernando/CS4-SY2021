import java.awt. * ;
import javax.swing. * ;
public class GridlayoutExample {
  JFrame GridFrame;
  BorderExample() {
    GridFrame = new JFrame();
    JButton gridbutton1 = new JButton("Gridbutton1");
    JButton gridbutton2 = new JButton("Gridbutton2");
    JButton gridbutton3 = new JButton("Gridbutton3");
    JButton gridbutton4 = new JButton("Gridbutton4");
    JButton gridbutton5 = new JButton("Gridbutton5");
    JButton gridbutton6 = new JButton("Gridbutton6");
    JButton gridbutton7 = new JButton("Gridbutton7");
    JButton gridbutton8 = new JButton("Gridbutton8");
    JButton gridbutton9 = new JButton("Gridbutton9");
    GridFrame.add(gridbutton1);
    GridFrame.add(gridbutton2);
    GridFrame.add(gridbutton3);
    GridFrame.add(gridbutton4);
    GridFrame.add(gridbutton5);
    GridFrame.add(gridbutton6);
    GridFrame.add(gridbutton7);
    GridFrame.add(gridbutton8);
    GridFrame.add(gridbutton9);
    GridFrame.setLayout(new GridLayout(3, 3));
    //setting grid layout of 3 rows and 3 columns
    GridFrame.setSize(300, 300);
    GridFrame.setVisible(true);
  }
  public static void main(String[] args) {
    new BorderExample();
  }
}
