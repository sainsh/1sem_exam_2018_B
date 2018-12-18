
import java.io.File;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MediaManager {

    // Her kommer din kode

    private String[] mediaArray;
    private List<Media> mediaList = new ArrayList<>();


    public void logMediaFolder(String folderName) {

        String[] files = null;

        try {

            File file = new File(folderName);   //instantiate new File object with filepath
            if (file.exists()) {    //if file exists


                if (file.isDirectory()) {   // if file is a folder

                    files = file.list();   //get all filenames in file(folder)
                    for (String fileName : files) {
                        System.out.println(fileName);   //print all filenames

                    }


                }

            }


        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    public List<Media> readMediaFolder(String folderName) {

        try {
            File file = new File(folderName);   //instantiate new File object with filepath
            if (file.exists()) {    //if file exists


                if (file.isDirectory()) {   // if file is a folder

                    mediaArray = file.list();   //get all filenames in file(folder)

                    for (String fileName : mediaArray) {    //writes all filenames to console
                        System.out.println(fileName);

                        File mediaFile = new File(Main.MEDIA_MAPPE + fileName);   //instantiate new File object with fileName


                        String[] fileExtension = fileName.split("\\."); //get file extension from file

                        if (fileExtension[1].equals("mp4") || fileExtension[1].equals("m4v") || fileExtension[1].equals("mov")) {     // if file is video

                            javafx.scene.media.Media mp = new javafx.scene.media.Media(mediaFile.toURI().toString());  //instantiate new javafx Media object from filenName

                            String resolution;
                            if (mp.getWidth() >= 1920 && mp.getHeight() >= 1080) {
                                resolution = "HD";
                            } else {
                                resolution = "SD";
                            }

                            String photographer = "";


                            mediaList.add(new Video(fileExtension[0], fileName,false, fileExtension[1], (int) mp.getDuration().toSeconds(), resolution, photographer));

                        } else if (fileExtension[1].equals("jpg") || fileExtension[1].equals("png") || fileExtension[1].equals("gif")) {    //if file is picture

                            javafx.scene.media.Media mp = new javafx.scene.media.Media(mediaFile.toURI().toString());  //instantiate new javafx Media object from filenName


                            String photographer = "";


                            mediaList.add(new Picture(fileExtension[0], fileName,false, fileExtension[1], mp.getWidth(), mp.getHeight(), photographer));

                        } else if (fileExtension[1].equals("txt")) {    //if file is article

                            Scanner input = new Scanner(fileName);
                            input.nextLine();
                            String author = input.nextLine().split("af ")[1];
                            input.close();
                            input = new Scanner(fileName);
                            String articleText = "";
                            while (input.hasNext()) {
                                articleText += input.next();
                            }

                            mediaList.add(new Article(fileExtension[0], fileName,false, author, articleText, fileExtension[0] + ".png"));

                        } else {

                        }
                    }
                }


            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mediaList;
    }

    public void backUpMedia(List<Media> mediaArray) throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("der er fejl med din database driver JDBC");
            e.printStackTrace();
        }
        System.out.println("Driver loaded");

        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://127.0.0.1:33067/MediaManager", "admin", "admin");    //connects to database

        Statement statement = connection.createStatement();
        String sql = "";
        for (Media media : mediaList) { //Inserts everything in the list into the database
            sql ="INSERT INTO media(assetID,name,created,fileName) VALUES("+media.getAssetId()+","+ media.getName()+","+media.getCreated()+","+media.getFileName()+")";
            System.out.println(sql);
            statement.execute(sql);


        }

        sql = "SELECT * FROM media";
        ResultSet results = statement.executeQuery(sql);

        while(results.next()){
            System.out.printf("",results.getInt(0), results.getString(1),results.getDate(2),results.getString(3));
        }

        connection.close();


    }


}
