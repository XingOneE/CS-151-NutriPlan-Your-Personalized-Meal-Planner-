import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The MealPlannerApp class is the main class for the Meal Planner Application.
 */
public class MealPlannerApp {
    /**
     * The main method of the application.
     *
     * @param args Command line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Run the GUI creation on the event dispatch thread
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    /**
     * Method to create and show the GUI.
     */
    private static void createAndShowGUI() {
        // Create the main frame for the application
        JFrame frame = new JFrame("Meal Planner Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the main panel with a BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Create buttons for various options
        JButton createPlanButton = new JButton("Create Meal Plan");
        JButton getPlanButton = new JButton("Get Meal Plan for the Day");
        JButton nutritionalInfoButton = new JButton("Nutritional Information");
        JButton viewEditPlanButton = new JButton("View/Edit Meal Plan");
        JButton setGoalButton = new JButton("Set Goal for Meal Plan");
        JButton exitButton = new JButton("Exit");

        // ActionListener for the "Create Meal Plan" option
        createPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "Create Meal Plan" option
                JOptionPane.showMessageDialog(frame, "Create Meal Plan Option Selected");
            }
        });

        // ActionListener for the "Get Meal Plan for the Day" option
        getPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "Get Meal Plan for the Day" option
                JOptionPane.showMessageDialog(frame, "Get Meal Plan for the Day Option Selected");
            }
        });

        // ActionListener for the "Nutritional Information" option
        nutritionalInfoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "Nutritional Information" option
                JOptionPane.showMessageDialog(frame, "Nutritional Information Option Selected");
            }
        });

        // ActionListener for the "View/Edit Meal Plan" option
        viewEditPlanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "View/Edit Meal Plan" option
                JOptionPane.showMessageDialog(frame, "View/Edit Meal Plan Option Selected");
            }
        });

        // ActionListener for the "Set Goal for Meal Plan" option
        setGoalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "Set Goal for Meal Plan" option
                JOptionPane.showMessageDialog(frame, "Set Goal for Meal Plan Option Selected");
            }
        });

        // ActionListener for the "Exit" option
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Logic for the "Exit" option
                System.exit(0);
            }
        });

        // Add buttons to the main panel in BorderLayout positions
        mainPanel.add(createPlanButton, BorderLayout.NORTH);
        mainPanel.add(getPlanButton, BorderLayout.CENTER);
        mainPanel.add(nutritionalInfoButton, BorderLayout.SOUTH);

        // Create a side panel with buttons and add it to the main panel
        JPanel sidePanel = new JPanel();
        sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.Y_AXIS));
        sidePanel.add(viewEditPlanButton);
        sidePanel.add(setGoalButton);
        sidePanel.add(exitButton);
        mainPanel.add(sidePanel, BorderLayout.EAST);

        // Add the main panel to the frame and make it visible
        frame.add(mainPanel);
        frame.setVisible(true);
    }
}
