import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application {

    public static final String SOFTWARE_VERSION = "0.1.0";  //konstant inderholder software versions nummeret
    public static final String MEDIA_MAPPE = "media/";  //konstant indeholder en fil-sti til media mappen

    public static void main(String[] args)throws SQLException {    //start af program

        Test.test();    //kører test metoden i Test klassen
        launch(args);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        primaryStage.setTitle("GUI");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();

    }


}

