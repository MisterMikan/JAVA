import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GradeCheckerApp {

    public static void main (String[] args) {

// --- Frame Construction --- //

        JFrame frame = new JFrame("Grade Checker");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

// --- Taskbars & Content Construction --- //

    JPanel barContainer = new JPanel();
    barContainer.setLayout(new BoxLayout(barContainer, BoxLayout.Y_AXIS));

    JPanel topBar = new JPanel();
    topBar.setBackground(new Color(0, 32, 96));
    topBar.setPreferredSize(new Dimension(Integer.MAX_VALUE, 50));
    topBar.setMaximumSize(new Dimension(Integer.MAX_VALUE, 50));
    topBar.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));

    ImageIcon logo = new ImageIcon("NULogo.png");
    Image logoImg = logo.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);

    JLabel logoLabel = new JLabel(new ImageIcon(logoImg));
    JLabel textLabel = new JLabel("Grade Checker");
    textLabel.setForeground(Color.WHITE);
    textLabel.setFont(new Font("Arial", Font.BOLD, 18));

    topBar.add(logoLabel);
    topBar.add(textLabel);


    JPanel subBar = new JPanel();
    subBar.setBackground(new Color(212, 175, 55));
    subBar.setPreferredSize(new Dimension(800, 35));
    subBar.setMaximumSize(new Dimension(Integer.MAX_VALUE, 35));

    barContainer.add(topBar);
    barContainer.add(subBar);

    JPanel mainPanel = new JPanel() {
    Image bgImage = new ImageIcon("NU_bg.jpg").getImage(); 

       @Override
       protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(bgImage, 0, 0, getWidth(), getHeight(), this);
       }
    };
    mainPanel.setLayout(new GridBagLayout());

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.insets = new Insets(5, 5, 5, 5);
    
    JPanel cardPanel = new JPanel(new GridBagLayout());
    cardPanel.setBackground(new Color(173, 216, 230, 220));
    cardPanel.setBorder(
        BorderFactory.createLineBorder(new Color(0, 51, 102), 2)
    );

// --- Inputs --- //

    JPanel gradePanel = new JPanel(new GridBagLayout());
    gradePanel.setOpaque(false);
    
    GridBagConstraints gpc = new GridBagConstraints();
    gpc.insets = new Insets(5, 5, 5, 5);

    JLabel gradeLabel = new JLabel("Enter Grade: ");
    JTextField gradeField = new JTextField(10);

    gpc.gridx = 0;
    gpc.gridy = 0;
    gradePanel.add(gradeLabel, gpc);

    gpc.gridx = 1; 
    gradePanel.add(gradeField, gpc);
    
// --- Buttons --- //

    JPanel buttonPanel = new JPanel(new FlowLayout());
    buttonPanel.setOpaque(false);

    JButton checkButton = new JButton("Check");
    JButton clearButton = new JButton("Clear");
   
    buttonPanel.add(checkButton);
    buttonPanel.add(clearButton);

// --- Output --- //

    JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
    resultPanel.setOpaque(false);

    JLabel resultLabel = new JLabel("Result: ");
    resultLabel.setFont(new Font("Arial", Font.BOLD, 14));

    resultPanel.add(resultLabel);

// --- Card Panel Components --- //

    GridBagConstraints cbc = new GridBagConstraints();
    cbc.insets = new Insets(8, 12, 8, 12);
    cbc.fill = GridBagConstraints.HORIZONTAL;

    cbc.gridx = 0;
    cbc.gridy = 0;
    cardPanel.add(gradePanel, cbc);

    cbc.gridy = 1;
    cardPanel.add(buttonPanel, cbc);

    cbc.gridy = 2;
    cardPanel.add(resultPanel, cbc);

    gbc.gridx = 0;
    gbc.gridy = 0;
    mainPanel.add(cardPanel, gbc);

// --- Button Actions & Statements --- //

    checkButton.addActionListener(e -> {

        try {
            double grade = Double.parseDouble(gradeField.getText());
            String result;
            String status;

            if (grade >= 90) {
                result = "EXCELLENT";
            } else if (grade >= 80) {
                result = "VERY GOOD";
            } else if (grade >= 75) {
                result = "GOOD";
            } else if (grade >= 60) {
                result = "NEEDS IMPROVEMENT";
            } else {
                result = "FAILED";
            }

             status = (grade >= 75) ? "PASSED" : "FAILED";
            resultLabel.setText("Result: " + result + ", Status: " + status);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input. Please enter a numeric grade.");
        }
    });

    clearButton.addActionListener(e -> {
        gradeField.setText("");
        resultLabel.setText("Result: ");
    });

// --- Logo & Frame Setup ---  //

    ImageIcon icon = new ImageIcon("NULogo.png");
    Image img = icon.getImage();

    frame.add(mainPanel, BorderLayout.CENTER);
    frame.setIconImage(img);
    frame.add(barContainer, BorderLayout.NORTH);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);

 }
}