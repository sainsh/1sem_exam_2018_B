

public class Article extends Media {

    private String authour;
    private String articleText;
    private String imageFilePath;

    @Override
    public void logToConsole(){
        System.out.printf("name: %s, media type: %s",super.getName(),getClass().toString());

    }
}
