import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class RadioButton extends JFrame implements ActionListener{
  private final JLabel imageLabel;
  private final JLabel messageLabel;
  private final ButtonGroup group;
  public RadioButton(){
    super("Radio Button");
    setLayout(new FlowLayout());
    //creating the buttons.
    JRadioButton doveButton = new JRadioButton("Dove");
    doveButton.setActionCommand("dove");
    doveButton.addActionListener(this);
    add(doveButton);
    JRadioButton catButton = new JRadioButton("Cat");
    catButton.setActionCommand("cat");
    catButton.addActionListener(this);
    add(catButton);
    JRadioButton dogButton = new JRadioButton("Dog");
    dogButton.setActionCommand("dog");
    dogButton.addActionListener(this);
    add(dogButton);
    JRadioButton rabbitButton = new JRadioButton("Rabbit");
    rabbitButton.setActionCommand("rabbit");
    rabbitButton.addActionListener(this);
    add(rabbitButton);
    JRadioButton cowButton = new JRadioButton("Cow");
    cowButton.setActionCommand("cow");
    cowButton.addActionListener(this);
    add(cowButton);
    messageLabel = new JLabel("No animal selected");
  messageLabel.setHorizontalAlignment(SwingConstants.CENTER);  
  add(messageLabel, BorderLayout.SOUTH);  
   //grouping the buttons.
   group = new ButtonGroup();
   group.add(doveButton);
   group.add(catButton);
   group.add(dogButton);
   group.add(rabbitButton);
   group.add(cowButton);
   //creating the images.
   imageLabel = new JLabel();
        imageLabel.setPreferredSize(new Dimension(800, 500));
        add(imageLabel);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
      String selectedPet = e.getActionCommand();
      ImageIcon image = null;
       // Set the image based on the selected pet
       switch (selectedPet) {
        case "dove":
            image = new ImageIcon("dove.jpg");
            messageLabel.setText("You selected dove");
            break;
        case "cat":
            image = new ImageIcon("cat.jpg");
            messageLabel.setText("You selected cat");
            break;
        case "dog":
            image = new ImageIcon("dog.jpg");
            messageLabel.setText("You selected dog");
            break;
        case "rabbit":
            image = new ImageIcon("rabbit.jpg");
            messageLabel.setText("You selected rabbit");
            break;
        case "cow":
            image = new ImageIcon("cow.jpg");
            messageLabel.setText("You selected cow");
            break;
      }

      // Display the image
      imageLabel.setIcon(image);
      imageLabel.revalidate();
      messageLabel.setText("You have selected: " + image);
  }

  public static void main(String[] args) {
      JFrame frame = new RadioButton();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
  }
}