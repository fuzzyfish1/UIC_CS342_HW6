import coffee.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CoffeeShop extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Who want's coffee!!!");

		Parent root = FXMLLoader.load(getClass()
				.getResource("/coffeeOrder.fxml"));

		Scene s1 = new Scene(root, 500,500);
		s1.getStylesheets().add("/coffeeOrder.css");
		primaryStage.setScene(s1);
		primaryStage.show();
		
		Coffee order = new Sugar(new Cream( new ExtraShot(new BasicCoffee())));
		
		double cost = order.makeCoffee();
		System.out.println("Total: "+cost);
	}

}
