import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 300);
        window.setLocation(400, 200);

        Container cp = window.getContentPane();
        JPanel panel = new JPanel();
        panel.add(new JTextField("hello world"));
        panel.add(new JButton("click on me"));
        panel.add(new JButton("Sign Up"));
        panel.add(new JTextField("Java world"));

        cp.add(panel);

        window.pack();
        window.setVisible(true);

    }
}
