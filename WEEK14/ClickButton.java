public class ClickButton {
  public static void main(String[] args) {
    Frame newframe = new Frame("Example");
    Button newbutton = new Button("Hit Me!");
    newbutton.setBounds(40, 80, 60, 200);
    newframe.add(newbutton);
    newframe.setSize(200, 200);
    newframe.setLayout(null);
    newframe.setVisible(true);
  }
}
