public class Video extends Media {

    private String filetype;
    private int length;     //i sekunder, skal konverteres til minuter og sekunder når length vises
    private String resolution;
    private Picture picture;

    @Override
    public void logToConsole(){
        System.out.printf("name: %s, media type: %s",super.getName(),getClass().toString());

    }

}
