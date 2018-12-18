import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.ArrayList;

public class Test  {


    // Denne metode indeholder kode, som kan vise applikationens funktionalitet (ikke unit test)
    public static void test() throws SQLException {

        System.out.println("TV2 Media Manager "+ Main.SOFTWARE_VERSION);

        Media m1 = new Media("julemanden","julemand.jpg");
        System.out.println(m1.toString());
        m1.logToConsole();
        MediaManager manager = new MediaManager();
        manager.logMediaFolder(Main.MEDIA_MAPPE);
        //manager.readMediaFolder(Main.MEDIA_MAPPE); //throws exception for now
        //manager.backUpMedia(manager.readMediaFolder(Main.MEDIA_MAPPE));



        // Her kommer din kode

    }


}
