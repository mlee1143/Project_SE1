package edu.westga.cs3151.collectiblemanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Entry point for application.
 * 
 * @author CS3151
 * @version Spring
 */
public class CollectibleManagerApplication extends Application {

	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("view/LoginPageGui.fxml"));
			Pane pane = loader.load();
			Scene scene = new Scene(pane);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Homework 5 by Michael Lee");
			primaryStage.show();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * Entry point
	 * 
	 * @pre none
	 * @post none
	 * @param args
	 *            Not used
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
