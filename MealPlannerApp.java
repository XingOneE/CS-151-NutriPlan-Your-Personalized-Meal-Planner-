package package_a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MealPlannerApp {
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() 
    {
        JFrame frame = new JFrame("Meal Planner Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JButton createPlanButton = new JButton("Create Meal Plan");
        JButton getPlanButton = new JButton("Get Meal Plan for the Day");
        JButton nutritionalInfoButton = new JButton("Nutritional Information");
        JButton viewEditPlanButton = new JButton("View/Edit Meal Plan");
        JButton setGoalButton = new JButton("Set Goal for Meal Plan");
        JButton exitButton = new JButton("Exit");

        createPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "Create Meal Plan" option
                JOptionPane.showMessageDialog(frame, "Create Meal Plan Option Selected");
            }
        });

        getPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "Get Meal Plan for the Day" option
                JOptionPane.showMessageDialog(frame, "Get Meal Plan for the Day Option Selected");
            }
        });

        nutritionalInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "Nutritional Information" option
                JOptionPane.showMessageDialog(frame, "Nutritional Information Option Selected");
            }
        });

        viewEditPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "View/Edit Meal Plan" option
                JOptionPane.showMessageDialog(frame, "View/Edit Meal Plan Option Selected");
            }
        });

        setGoalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "Set Goal for Meal Plan" option
                JOptionPane.showMessageDialog(frame, "Set Goal for Meal Plan Option Selected");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "Exit" option
                System.exit(0);
            }
        });

        mainPanel.add(createPlanButton, BorderLayout.NORTH);
        mainPanel.add(getPlanButton, BorderLayout.CENTER);
        mainPanel.add(nutritionalInfoButton, BorderLayout.SOUTH);

        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.add(viewEditPlanButton);
        sidePanel.add(setGoalButton);
        sidePanel.add(exitButton);

        mainPanel.add(sidePanel, BorderLayout.EAST);

        frame.add(mainPanel);
        frame.setVisible(true);
    }
}