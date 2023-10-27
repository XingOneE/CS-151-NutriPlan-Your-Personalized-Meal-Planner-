import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Set the stage title
        primaryStage.setTitle("Simple JavaFX App");

        // Create a TextField for input
        TextField inputField = new TextField();

        // Create a Label to display the output
        Label outputLabel = new Label();

        // Create a Button to trigger the action
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            // Get the user input from the text field
            String inputText = inputField.getText();

            // Process the input
            String outputText = "You entered: " + inputText;

            // Update the output label with the result
            outputLabel.setText(outputText);
        });

        // Create a VBox to organize the elements
        VBox layout = new VBox(10);
        layout.getChildren().addAll(inputField, submitButton, outputLabel);

        // Create a Scene and set it on the Stage
        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);

        // Show the Stage
        primaryStage.show();
    }
}
