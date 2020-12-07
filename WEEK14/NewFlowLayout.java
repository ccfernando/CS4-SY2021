import java.awt.*;
import javax.swing.*;
public class NewFlowLayout {
    JFrame NewFrame;
    NewFlowLayout() {
        NewFrame = new JFrame();
        JButton button1 = new JButton("Left");
        JButton button2 = new JButton("Right");
        JButton button3 = new JButton("Center");
        NewFrame.add(button1);
        NewFrame.add(button2);
        NewFrame.add(button3);
        NewFrame.setLayout(new FlowLayout(FlowLayout.CENTER));
        NewFrame.setSize(400, 400);
        NewFrame.setVisible(true);
    }
    public static void main(String[] args) {
        new NewFlowLayout();
    }
}
