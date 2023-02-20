/** Author: Andrew Lam
 *  Course: CS 2450
 *  Assignment: Assignment 1
 *  Due Date: 02.27.2023
 *  Objective:  Dice Simulator - Create a JavaFX application that simulates rolling a pair of dice. When the user clicks
 *              a button, the application should generate two random numbers, each in the range of 1 through 6, to
 *              represent the value of the dice. Use ImageView controls to display the dice. (In the Dice.zip file
 *              on canvas, you will find six images named Die1.png, Die2.png, Die3.png, Die4.png, Die5.png,
 *              and Die6.png that you can use in the ImageView controls.)
 */

package com.example.cs2450_assignment1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaskB extends Application {
    // Initialize dice Images
    Image die1 = new Image("file:///Users/andrewlam/Desktop/CS2450/CS2450_Assignment1/CS2450_Assignment1/Assignment%201-Dice/Die1.png");
    Image die2 = new Image("file:///Users/andrewlam/Desktop/CS2450/CS2450_Assignment1/CS2450_Assignment1/Assignment%201-Dice/Die2.png");
    Image die3 = new Image("file:///Users/andrewlam/Desktop/CS2450/CS2450_Assignment1/CS2450_Assignment1/Assignment%201-Dice/Die3.png");
    Image die4 = new Image("file:///Users/andrewlam/Desktop/CS2450/CS2450_Assignment1/CS2450_Assignment1/Assignment%201-Dice/Die4.png");
    Image die5 = new Image("file:///Users/andrewlam/Desktop/CS2450/CS2450_Assignment1/CS2450_Assignment1/Assignment%201-Dice/Die5.png");
    Image die6 = new Image("file:///Users/andrewlam/Desktop/CS2450/CS2450_Assignment1/CS2450_Assignment1/Assignment%201-Dice/Die6.png");

    // Initialize dice ImageViews
    ImageView dice1 = new ImageView(die1);
    ImageView dice2 = new ImageView(die2);

    @Override
    public void start(Stage stage) throws Exception {
        // Initialize GridPane
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(25));
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(20);
        gridPane.setHgap(20);
        gridPane.add(dice1, 0, 1);
        gridPane.add(dice2, 1, 1);

        // Initialize Button
        Button rollButton = new Button("Roll Dice");
        rollButton.setOnAction(new rollClickHandler());

        // Initialize VBox
        VBox vBox = new VBox(gridPane, rollButton);
        vBox.setAlignment(Pos.CENTER);

        // Initialize Scene
        Scene myScene = new Scene(vBox, 400, 250);

        // Set up Stage
        stage.setTitle("Task B - Dice Simulator");
        stage.setScene(myScene);
        stage.show();

    }

    class rollClickHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            // randomize dice
            dice1.setImage(die2);
            dice2.setImage(die3);
        }
    }


}
