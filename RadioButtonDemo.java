import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    JRadioButton bird, cat, dog, rabbit, pig;
    JLabel imageLabel;
    ButtonGroup group;

    public RadioButtonDemo() {
        setTitle("RadioButtonDemo");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new GridLayout(5,1));

        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        leftPanel.add(bird);
        leftPanel.add(cat);
        leftPanel.add(dog);
        leftPanel.add(rabbit);
        leftPanel.add(pig);

        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(JLabel.CENTER);

        add(leftPanel, BorderLayout.WEST);
        add(imageLabel, BorderLayout.CENTER);

        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String pet = "";

        if (bird.isSelected()) {
            pet = "Bird";
            imageLabel.setIcon(new ImageIcon("src/images/bird.png"));
        } else if (cat.isSelected()) {
            pet = "Cat";
            imageLabel.setIcon(new ImageIcon("src/images/cat.png"));
        } else if (dog.isSelected()) {
            pet = "Dog";
            imageLabel.setIcon(new ImageIcon("src/images/dog.png"));
        } else if (rabbit.isSelected()) {
            pet = "Rabbit";
            imageLabel.setIcon(new ImageIcon("src/images/rabbit.png"));
        } else if (pig.isSelected()) {
            pet = "Pig";
            imageLabel.setIcon(new ImageIcon("src/images/pig.png"));
        }

        JOptionPane.showMessageDialog(this, "You selected: " + pet);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}

