package application.model;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;

import application.model.ExpenseTracker;
//import application.model.Goals.*;
import application.model.Expense.*;

/**
 * A DataList will handle all of the data
 * for a DataList which can be used for expenses,
 * FixedExpenses, Goals, Budgets(?)
 * @author Jonathan Remote
 *
 */
public class DatalistModel {
	
	private LocalDate date;
	
	private ExpenseTracker et;
	
	private Expense e;

	private Date d;
		
	/*
	 * constructor for generic DataList use case
	 */	
	
	public void add(String category, double total, LocalDate date, String item) {
		et.addExpense(decideType(category, total, date, item));
	}//END add()
	
	public DatalistModel() {
		//d = new Date(1, 1, 2017);
		et = new ExpenseTracker();
	}//END constructor

	public Expense decideType(String category, double t, LocalDate date, String i) {
		switch(category) {
		case "Apparel":
			d = DateConverter.convertDate(date);
			e = new Apparel(t, d, i);
			break;
		case"Auto Maintenance":
			d = DateConverter.convertDate(date);
			e = new AutoMaintenance(t, d, i);
			break;
		case "Home Maintenance":
			d = DateConverter.convertDate(date);
			e = new HomeMaintenance(t, d, i);
			break;
		case "Medical":
			d = DateConverter.convertDate(date);
			e = new Medical(t, d, i);
			break;
		case "Education":
			d = DateConverter.convertDate(date);
			e = new Education(t, d, i);
			break;
		case "Entertainment":
			d = DateConverter.convertDate(date);
			e = new Entertainment(t, d, i);
			break;
		case "Food":
			d = DateConverter.convertDate(date);
			e = new Food(t, d, i);
			break;
		case "Gas":
			d = DateConverter.convertDate(date);
			e = new Gas(t, d, i);
			break;
		case "Luxury":
			d = DateConverter.convertDate(date);
			e = new Luxury(t, d, i);
			break;
		case "Personal Care":
			d = DateConverter.convertDate(date);
			e = new PersonalCare(t, d, i);
			break;
		case "Public Transportation":
			d = DateConverter.convertDate(date);
			e = new PublicTransportation(t, d, i);
			break;
		case "Subscriptions":
			d = DateConverter.convertDate(date);
			e = new Subscriptions(t, d, i);
			break;
		case "Miscellaneous":
			d = DateConverter.convertDate(date);
			e = new Miscellaneous(t, d, i);
			break;
		}//END switch(category
		
		return e;
	}//END 

}//END MODEL CLASS DatalistModel
