import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //1. Create a frame
        JFrame frame = new JFrame();
        frame.setSize(500,500);

        //2. Create a panel
        //default layout is flowlayout
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(45,88,90));
        panel.setBackground(Color.BLUE);

        //3. Create components
        JLabel label = new JLabel("Hello world");
        JButton button = new JButton("push");
        JTextField textField = new JTextField(10);
        textField.setCaretColor(Color.red);
        textField.setSelectedTextColor(Color.yellow);
        JScrollBar scrollBar = new JScrollBar(0);
        //add an image
        ImageIcon icon = new ImageIcon("Images/PNG 2/2C.png");
        // Scaling the image before putting it on the label
        icon.setImage(icon.getImage().getScaledInstance(50,50,Image.SCALE_DEFAULT));
        // Creating a Label with an icon on it
        JLabel picLabel = new JLabel(icon);

        //4. Add components to the panel
        panel.add(label, BorderLayout.PAGE_START);
        panel.add(button, BorderLayout.EAST);
        panel.add(textField, BorderLayout.LINE_START);
        panel.add(picLabel, BorderLayout.CENTER);
        panel.add(scrollBar, BorderLayout.PAGE_END);

        //5. Add the panel to the frame
        frame.add(panel);
        //6. Make frame visible
        frame.setVisible(true);
    }
}