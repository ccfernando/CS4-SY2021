import java.awt.EventQueue;

import javax.swing.JFrame;

public class javaswing {

  private JFrame frame;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          javaswing window = new javaswing();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the application.
   */
  public javaswing() {
    initialize();
  }

  /**
   * Initialize the contents of the frame.
   */
  private void initialize() {

    //Creating an instance of the simple_panel object as panel
    simple_panel panel = new simple_panel();

    frame = new JFrame();

    //adding the panel instance to the frame
    frame.getContentPane().add(panel);

    //sizes the frame according to their preferred sizes
    frame.pack();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

}
