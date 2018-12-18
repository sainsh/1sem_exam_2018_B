

public class Article extends Media {

    private String authour;
    private String articleText;
    private String imageFilePath;

    public Article(String name, String fileName,Boolean brugerGenereret, String authour, String articleText, String imageFilePath) {
        super(name, fileName, brugerGenereret);
        this.authour = authour;
        this.articleText = articleText;
        this.imageFilePath = imageFilePath;
    }

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    public String getArticleText() {
        return articleText;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    public String getImageFilePath() {
        return imageFilePath;
    }

    public void setImageFilePath(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    @Override
    public void logToConsole(){
        System.out.printf("name: %s, media type: %s\n",super.getName(),getClass().toString());

    }
}
