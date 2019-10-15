package dad.javafx.holamundo.mvc;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class View extends VBox {

	private TextField nombreText;
	private Button saludarButton;
	private Label saludoLabel;

	public View() {
		super();

		nombreText = new TextField();
		nombreText.setPromptText("Introduce un nombre");
		nombreText.setMaxWidth(200);

		saludarButton = new Button("Saludar");
		saludarButton.setDefaultButton(true);

		saludoLabel = new Label();

		this.setSpacing(5);
		this.setAlignment(Pos.CENTER);
		this.getChildren().addAll(nombreText, saludarButton, saludoLabel);
	}

	public TextField getNombreText() {
		return nombreText;
	}

	public Button getSaludarButton() {
		return saludarButton;
	}

	public Label getSaludoLabel() {
		return saludoLabel;
	}

}
