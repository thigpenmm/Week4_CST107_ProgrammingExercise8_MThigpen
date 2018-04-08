/**Program: ProgEx8-4 Program
 *File: Exercise4.java
 *Summary: Program displays 6 words vertically in random color
 *Author: Mercedes Thigpen
 *Date: April 6, 2018
 **/

// This is my own work <Mercedes Thigpen> 

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


public class Exercise4 extends Application {
    Scene wordScene;
    VBox wordBox;
    Label word, word2, word3, word4, word5, word6;

     public static void main(String[] args){ // Launch method for the program
            launch(args); 
     }
     
    @Override
    
    public void start(Stage primaryStage){ // Start of primary stage setup
        
        // design each label. Each one is the word java. Setup the font and sizing. 
        // filled with random color and opacity
        word = new Label("java"); 
        word.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        word.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
        word.setOpacity(Math.random());
        
        word2 = new Label("java");
        word2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22)); 
        word2.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
        word2.setOpacity(Math.random());
        
        word3 = new Label("java");
        word3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        word3.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
        word3.setOpacity(Math.random());
        
        word4 = new Label("java");
        word4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22)); 
        word4.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
        word4.setOpacity(Math.random());
        
        word5 = new Label("java");
        word5.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        word5.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
        word5.setOpacity(Math.random());
        
        word6 = new Label("java");
        word6.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
        word6.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
        word6.setOpacity(Math.random());
        
        // wordScene setup //
        wordBox = new VBox(); //vertical layout, 
        wordBox.setSpacing(15);//sets spacing between the words
        wordBox.setAlignment(Pos.CENTER); //all nodes are aligned to the center of the pane
        wordBox.getChildren().addAll(word, word2, word3, word4, word5, word6); //adds each word to the pane
        wordBox.setRotate(90); //rotates the pane by 90 degrees
        wordBox.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
        wordScene = new Scene(wordBox, 300, 200); // sets size of the pane
        
        primaryStage.setScene(wordScene); //main window is wordScene
        primaryStage.setTitle("Programming Exercise 8- Exercise 4"); //title on the window border
        primaryStage.show(); //display the scene
        
}
}// End of Program