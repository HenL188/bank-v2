package main;
import javax.swing.*;

public class Window {
    public void createWindow() {
        JFrame frame = new JFrame("My First window");
        frame.setSize(800, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
