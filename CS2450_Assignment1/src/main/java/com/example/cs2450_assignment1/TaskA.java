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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TaskA extends Application {
    // Initialize constructs for the charge of food
    Label foodChargeLabel = new Label("Enter meal cost: ");
    TextField foodCharge = new TextField();

    // Initialize constructs for 7 percent sales tax
    Label taxLabel = new Label("7 percent sales tax: ");
    TextField tax = new TextField();

    // Initialize constructs for 18 percent tip
    Label tipLabel = new Label("18 percent tip: ");
    TextField tip = new TextField();

    // Initialize constructs for total of food charge, tax, and tip
    Label totalLabel = new Label("Total: ");
    TextField total = new TextField();

    @Override
    public void start(Stage stage) throws Exception {
        // Set labels non-editable
        tax.setEditable(false);
        tip.setEditable(false);
        total.setEditable(false);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(20));
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.add(foodChargeLabel, 0, 1);
        gridPane.add(foodCharge, 1, 1);
        gridPane.add(taxLabel, 2, 1);
        gridPane.add(tax, 3, 1);
        gridPane.add(tipLabel, 2, 2);
        gridPane.add(tip, 3, 2);
        gridPane.add(totalLabel, 2, 3);
        gridPane.add(total, 3, 3);

        Button calcButton = new Button("Calculate");
        calcButton.setOnAction(new calcClickHandler());

        // Initialize VBox to hold all other controls
        VBox vBox = new VBox(gridPane, calcButton);
        vBox.setPadding(new Insets(50));
        vBox.setAlignment(Pos.CENTER);
        // Initialize Scene with VBox as the root
        Scene myScene = new Scene(vBox, 700, 200);

        // Stage initialization
        stage.setScene(myScene);
        stage.setTitle("Task A - Tip, Tax, and Total ");
        stage.show();
    }

    // Handler class for calcButton
    class calcClickHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent actionEvent) {
            // Calculate values
            double charge = Double.parseDouble(foodCharge.getText());
            double percentTax = charge * 0.07;
            double percentTip = charge * 0.18;

            // Utilize BigDecimal Class to round values to hundredths decimal place
            BigDecimal taxRound = BigDecimal.valueOf(percentTax).setScale(2, RoundingMode.DOWN);
            BigDecimal tipRound = BigDecimal.valueOf(percentTip).setScale(2, RoundingMode.DOWN);
            BigDecimal totalRound = BigDecimal.valueOf(percentTax + percentTip + charge).setScale(2, RoundingMode.DOWN);

            // Display final values on TextFields
            tax.setText(String.valueOf(taxRound));
            tip.setText(String.valueOf(tipRound));
            total.setText(String.valueOf(totalRound));
        }
    }

}
