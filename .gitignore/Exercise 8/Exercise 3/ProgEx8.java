/**Program: ProgEx8 Program
 *File: ProgEx8.java
 *Summary: Displays a scene of 3 random playing cards.
 *Author: Mercedes Thigpen
 *Date: April 5, 2018
 **/

import java.util.ArrayList;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class ProgEx8 extends Application {
    Scene cardScene; //program variables
    HBox cardBox;

     public static void main(String[] args){ // Start method for the program
            launch(args); 
     }
     
    @Override 
    
    public void start(Stage primaryStage){ 
        ArrayList<Integer> deck = new ArrayList<>();
        for (int i = 1; i <= 52; i++){ //creates an array list of numbers 1 through 52
            deck.add(i); //adds those numbers to the array list
        }
        
        java.util.Collections.shuffle(deck); // shuffles the array list
        
        // Setup for the cardScene //
        cardBox = new HBox(); //horizontal layout, 
        cardBox.setSpacing(8);//sets spacing between the cards
        cardBox.setAlignment(Pos.CENTER); //all nodes are aligned to the center of the pane
        cardBox.getChildren().add(new ImageView("cards/" + deck.get(0) + ".png")); //adds card image for each number from the 
        cardBox.getChildren().add(new ImageView("cards/" + deck.get(1) + ".png"));  //shuffled deck. Showing 3 cards on this 
        cardBox.getChildren().add(new ImageView("cards/" + deck.get(2) + ".png"));  //window.
        cardScene = new Scene(cardBox, 330, 200); // sets size of the pane
        
        primaryStage.setScene(cardScene); //main window is cardScene
        primaryStage.setTitle("Programming Exercise 8"); //title on the window border
        primaryStage.show(); //display the scene
        
    }
     
        
}  //End of program

