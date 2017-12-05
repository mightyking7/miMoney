package application;

import javafx.application.Application;  
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class MainAccount extends Application{

	public static Stage stage;

	private static Scene currScene;
	
	public Parent root;
	
	public void start(Stage primaryStage) {
		
		try {

			//if(! session.currentUser.isPassAuthenticated()) {
				Parent root = FXMLLoader.load(getClass().getResource("view/resources/CreateAccount2.fxml"));
				Scene scene = new Scene(root);
			
				primaryStage.setScene(scene);
				primaryStage.show();

		}catch(Exception e) {


			e.printStackTrace();

			System.err.printf("The resource 'view/resources/CreateAccount.fxml' could not be located");


			System.out.printf("The resource 'CreateAccount.fxml' could not be located");

		}
		MainAccount.stage = primaryStage;
	}
	public static void main(String[] args) {
		launch(args);
	}
	
	public static void setScene(Scene scene)
	{
		currScene = scene;
		stage.setScene(currScene);
	}// END setScene()
}
