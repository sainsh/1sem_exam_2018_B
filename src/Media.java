import java.io.File;
import java.time.Instant;
import java.util.Date;

public class Media {
    //først member variabler
    private int assetId;
    private String name;
    private Date created = new Date();      // instantiere et nyt Date objekt
    private String fileName;


    public Media() {    //constructor
        assetId = MediaID.generate();   //bruger MediaID klassen til at generere et unikt ID
        created = Date.from(Instant.now()); //bruger Date klassen til at få tidspunktet hvor objected konstrueres
    }

    //getters og setters

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void logToConsole(){
        System.out.printf("name: %s, media type: %s",name, this.getClass().toString());
    }

    @Override
    public String toString() {  //her overskrives toString metoden til at give alle variable pakket ind i "media{}"
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}