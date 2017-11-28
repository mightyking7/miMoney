package application.controller;

import javafx.scene.control.TextField;
import application.model.SavingsCalculatorModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;


/**
 * 
 * @author Sam Dash
 *
 */

public class CalculatorController implements EventHandler<ActionEvent>{
	
    @FXML
    private TextField goal;
    
    @FXML
    private TextField deposit;
    
    @FXML
    private TextField time;
    
    private double num1 = 0;
    private double num2 = 0;
    private SavingsCalculatorModel model = new SavingsCalculatorModel(num1, num2);
    
    /**
     * Do computations here, call the handle methods above if you have to
     * @param event
     */
    @Override
    public void handle(ActionEvent event)
    {
    	String g = goal.getText();
    	String d = deposit.getText();
    	num1 = Double.parseDouble(g);
    	num2 = Double.parseDouble(d);
    	time.setText(String.valueOf(model.savingsTime(num1,num2)));
    	System.out.println("clicked!");
    	}
}