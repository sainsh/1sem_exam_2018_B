public class Picture extends Media {

    private String filetype;
    private int width;
    private int height;
    private String photographer;

    @Override
    public void logToConsole(){
        System.out.printf("name: %s, media type: %s",super.getName(),getClass().toString());

    }

}
