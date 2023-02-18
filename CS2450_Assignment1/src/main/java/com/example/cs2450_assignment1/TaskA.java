/** Author: Andrew Lam
 *  Course: CS 2450
 *  Assignment: Assignment 1
 *  Due Date: 02.27.2023
 *  Objective:  Tip, Tax, and Total - Create a JavaFX application that lets the user enter the food charge for a meal
 *              at a restaurant. When a button is clicked, the application should calculate and display the amount of
 *              an 18 percent tip on the total food charge, 7 percent sales tax, and the total of all three amounts.
 */

package com.example.cs2450_assignment1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaskA extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Initialize constructs for the charge of food
        Label foodChargeLabel = new Label("Enter meal cost: ");
        TextField foodCharge = new TextField();

        // Initialize constructs for 7 percent sales tax
        

        // Initialize constructs for 18 percent tip



        // Initialize VBox to hold all other controls
        VBox vBox = new VBox();
        // Initialize Scene with VBox as the root
        Scene myScene = new Scene(vBox, 600, 400);

        // Stage initialization
        stage.setScene(myScene);
        stage.setTitle("Task A - Tip, Tax, and Total ");
        stage.show();
    }
}
