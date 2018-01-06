package passbiomed;


import passbiomed.MainApp;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainApp extends Application {
		
	private Stage primaryStage;

	
	public MainApp() {
        
    }
	
	
	@Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("PassBioMed");

        showLogin();
    }
	
	public void showLogin() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/Login.fxml"));
            AnchorPane login = (AnchorPane) loader.load();
            
            
            Scene scene = new Scene(login);
            primaryStage.setScene(scene);
            primaryStage.show();
            primaryStage.setResizable(false);
            // Give the controller access to the main app.
            //*LoginController controller = loader.getController();*
            //*controller.setMainApp(this);*
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

	public Stage getPrimaryStage() {
        return primaryStage;
    }
	
	public static void main(String[] args) {
        launch(args);
    }
}
