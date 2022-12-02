package GUI;

import coffee.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

public class fxController implements Initializable {

	@FXML
	Button bCream, bSugar, bShot, bFoam, bSyrup, bDelete, bOrder, bComplete;

	@FXML
	Text tCost, orderSummary, totalBox;

	@FXML
	BorderPane Parent;

	@FXML
	VBox orderPanel;


	Coffee cup;
	double cost;

	public void addToSummary(String str) {
		orderSummary.setText(orderSummary.getText() + "\n" + str);
	}

	public void unneccesarilyLongMethodNameForChangingVisibilityOfButtons( boolean value) {

		bCream.setVisible(value);
		bSugar.setVisible(value);
		bShot.setVisible(value);
		bSyrup.setVisible(value);
		bFoam.setVisible(value);

	}

	public void setTotal(double num) {
		totalBox.setText("TOTAL: $" + num + " Damn yousa spendin da big monies");
	}

	public void buttonStuff() {
		this.orderSummary.setText("OrderSummary: ");
		//this.cost = cup.makeCoffee();
		//setTotal(this.cost);
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {

		cup = new BasicCoffee();

		bCream.setOnAction( e -> {
			Cream c = new Cream(cup);
			c.setAddThing(this::addToSummary);
			cup = c;
			buttonStuff();
		});

		bSugar.setOnAction(e -> {
			Sugar c = new Sugar(cup);
			c.setAddThing(this::addToSummary);
			cup = c;
			buttonStuff();
		});

		bShot.setOnAction( e -> {
			ExtraShot c = new ExtraShot(cup);
			c.setAddThing(this::addToSummary);
			cup = c;
			buttonStuff();
		});

		bFoam.setOnAction(e-> {
			Foam c = new Foam(cup);
			c.setAddThing(this::addToSummary);
			cup = c;
			buttonStuff();
		});

		bSyrup.setOnAction(e-> {
			Syrup c = new Syrup(cup);
			c.setAddThing(this::addToSummary);
			cup = c;
			buttonStuff();
		});

		bOrder.setOnAction( e -> {
			orderSummary.setVisible(false);
			unneccesarilyLongMethodNameForChangingVisibilityOfButtons(true);

			BasicCoffee c = new BasicCoffee();
			c.setAddThing(this::addToSummary);
			cup = c;
		});

		bComplete.setOnAction(e -> {
			totalBox.setText("Total: " + Double.toString(cup.makeCoffee()));
			orderSummary.setVisible(true);

		});

		bDelete.setOnAction( e -> {
			orderSummary.setVisible(false);
			totalBox.setText("");
			BasicCoffee c = new BasicCoffee();
			c.setAddThing(this::addToSummary);
			cup = c;
			unneccesarilyLongMethodNameForChangingVisibilityOfButtons(false);
		});

		orderPanel.setMaxWidth(500);
	}
}
