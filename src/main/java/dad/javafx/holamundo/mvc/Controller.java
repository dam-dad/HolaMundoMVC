package dad.javafx.holamundo.mvc;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;

public class Controller {
	
	private Model model = new Model();
	private View view = new View();
	
	public Controller() {
		
		model.nombreProperty().bind(view.getNombreText().textProperty());
		
		view.getSaludoLabel().textProperty().bind(
				Bindings
					.when(model.saludoProperty().isEmpty())
					.then("¡Hola nadie!")
					.otherwise(model.saludoProperty())
			);
		
		view.getSaludarButton().setOnAction(e -> onSaludarAction(e));
	}
	
	private void onSaludarAction(ActionEvent e) {
		if (!model.getNombre().isEmpty())
			model.setSaludo("¿Qué pasó " + model.getNombre() + "?");
		else
			model.setSaludo("");
	}

	public View getRoot() {
		return view;
	}

}
