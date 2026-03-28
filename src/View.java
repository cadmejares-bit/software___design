import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    public JTextField nameField = new JTextField(15);
    public JTextField ageField = new JTextField(5);

    public JButton addButton = new JButton("Add Student");
    public JButton loadButton = new JButton("Show Students");

    public JTextArea display = new JTextArea(10, 30);

    public View() {
        setTitle("Student MVC System");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Name:"));
        add(nameField);

        add(new JLabel("Age:"));
        add(ageField);

        add(addButton);
        add(loadButton);

        add(new JScrollPane(display));

        setVisible(true);
    }
}