public class Video extends Media {

    private String filetype;
    private int length;     //i sekunder, skal konverteres til minuter og sekunder når length vises
    private String resolution;
    private String photographer;

    public Video(String name, String fileName, String fileType, int length, String resolution, String photographer) {
        super(name,fileName);
        this.filetype = fileType;
        this.length = length;
        this.resolution = resolution;
        this.photographer = photographer;
    }

    @Override
    public void logToConsole(){
        System.out.printf("name: %s, media type: %s\n",super.getName(),getClass().toString());

    }

}
