package dad.maven.imc;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class IMC extends Application{
	
	private TextField pesoIntroducido;
	private TextField alturaIntroducida;	
	
	
	public void start(Stage primaryStage) throws Exception {
		HBox root1 = new HBox();
		
		Label lineaPeso = new Label();
		lineaPeso.setText("Peso: ");
		
		pesoIntroducido = new TextField();
		
		Label lineaAltura = new Label();
		lineaPeso.setText("Altura: ");
		
		alturaIntroducida = new TextField();

		VBox root = new VBox();
		root.setSpacing(5);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(lineaPeso, lineaAltura, alturaIntroducida, pesoIntroducido);
		
		Scene escena = new Scene(root, 300, 200);

		primaryStage.setScene(escena);
		primaryStage.setTitle("IMC");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);		
	}


}
