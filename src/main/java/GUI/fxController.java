package GUI;

import coffee.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class fxController implements Initializable {

	@FXML
	Button bCream;
	@FXML
	Button bSugar;
	@FXML
	Button bShot;

	@FXML
	Text tCost;

	@FXML
	Button bOrder;

	@FXML
	Button bDelete;
	Coffee cup;
	double cost;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {


		cup = new BasicCoffee();

		bCream.setOnAction( e -> {
			cup = new Cream(cup);

		});

		bSugar.setOnAction( e -> {
			cup = new Sugar(cup);
		});

		bShot.setOnAction( e -> {
			cup = new ExtraShot(cup);
		});

		bOrder.setOnAction( e -> {
			tCost.setText(Double.toString(cup.makeCoffee()));
		});

		bDelete.setOnAction( e -> {
			cup = new BasicCoffee();
		});











		Text tCost;













	}
}
