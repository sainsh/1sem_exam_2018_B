

public class Article extends Media {

    private String authour;
    private String articleText;
    private String imageFilePath;

    public Article(String name, String fileName, String authour, String articleText, String imageFilePath) {
        super(name, fileName);
        this.authour = authour;
        this.articleText = articleText;
        this.imageFilePath = imageFilePath;
    }

    @Override
    public void logToConsole(){
        System.out.printf("name: %s, media type: %s\n",super.getName(),getClass().toString());

    }
}
