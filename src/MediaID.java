import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {

    private static int latestId = 100;  //initialiserer en statisk integer med værdien 100


    public static int generate() {

        File file = new File("media_id.txt"); //instantierer et nyt File objekt med stien "media_id.txt"

        // Låser filen op før adgang
        // file.setWritable(true);

        try {   //try block sat på for at catch'e IOExceptions ved filmanioulation


            if (file.exists()) {    //hvis filen eksisterer
                FileReader fileReader = new FileReader(file);   //instantierer et ny FileReader object med file
                Scanner scanner = new Scanner(file);    //instantierer et nyt Scanner object med file
                latestId = (int) scanner.nextInt();     //læser den første int i filen og assigner værdien til latestId
            }

            latestId++; //incrementer latestId

            FileWriter fileWriter = new FileWriter(file);   //instantierer et nyt FileWriter objekt med file
            fileWriter.write(Integer.toString(latestId));   //skriver latestID til filen file, efter at latestId er castet til en String
            fileWriter.close();     //lukker FileWriter'er, s filen file kan benyttes igen

        } catch (IOException e) {       //fanger(catch) IOException
            e.printStackTrace();    //udkriver til konsollen StackTrace for IOException e
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        return latestId;    //returnerer LatestId
    }

}