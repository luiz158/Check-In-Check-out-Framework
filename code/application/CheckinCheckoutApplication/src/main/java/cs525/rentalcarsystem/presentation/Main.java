package cs525.rentalcarsystem.presentation;

import cs525.rentalcarsystem.controller.CarController;
import cs525.rentalcarsystem.controller.CheckoutController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	private Stage primaryStage;
	private Stage rootStage = new Stage();
	private BorderPane rootLayout;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {

		//CarController car = new CarController();
		//car.start(primaryStage);
		
		CheckoutController checkout = new CheckoutController();
		checkout.start(primaryStage);

	}

	public static void main(String[] args) {
		launch(args);
	}

}
