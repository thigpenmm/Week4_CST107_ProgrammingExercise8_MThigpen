/**Program: ProgEx8-6 Program
 *File: Exercise6.java
 *Summary: Program displays 6 words vertically in random color
 *Author: Mercedes Thigpen
 *Date: April 6, 2018
 **/

// This is my own work <Mercedes Thigpen> 


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Exercise6 extends Application {
    Pane checkerBoard;
    Rectangle box;
   


 public static void main(String[] args) { //launches the program
  launch(args);
 }    
    
    
       @Override
    
    public void start(Stage primaryStage){ //starts the program method
        
  checkerBoard = new Pane();
    int i = 0; // counting rows starting at 0
    int j = 0; //counting columns starting at 0

  
    for(i = 0; i < 8; i++) { //creating a loop of 8 rows
    for(j = 0; j < 8; j++) { //creating a loop of 8 columns
            
    box = new Rectangle(40*j, 40*i, 40, 40); //setting size of each rectangle
    //rectangles will be 40 x 40 pixels, each new rectangle starts 40 pixels away from the next
    if( (j % 2) == (i % 2) ){ //if the value of the row is the same as the value of the column,
        
     box.setFill(Color.BLACK); //the rectangle is black
    } else {
     box.setFill(Color.WHITE); //if not, the rectangle will be white
    }
 
    checkerBoard.getChildren().add(box); //adding the array of rectangles to the pane
   }
  }
  
  Scene scene = new Scene(checkerBoard, 320, 320); //adding the pane to the scene
  primaryStage.setTitle("Programming Exercise 8 - Exercise 6");
  primaryStage.setScene(scene);
  primaryStage.show(); //displaying the scene
 }

} // End of program