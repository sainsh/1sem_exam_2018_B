import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


import java.io.File;

public class Controller {

    @FXML
    TextArea table;


    public void loadMediaBTNClick(ActionEvent actionEvent) {


        try {
            File file = new File(Main.MEDIA_MAPPE);   //instantiate new File object with filepath
            if (file.exists()) {    //if file exists


                if (file.isDirectory()) {   // if file is a folder

                    String[] mediaArray = file.list();   //get all filenames in file(folder)

                    for (String fileName : mediaArray) {

                        table.appendText(fileName + "\n");

                    }
                }


            }

        } catch (Exception e) {

        }
    }
}
