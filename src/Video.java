public class Video extends Media {

    private String filetype;
    private int length;     //i sekunder, skal konverteres til minuter og sekunder når length vises
    private String resolution;
    private String photographer;

    public Video(String name, String fileName,Boolean brugerGenereret, String fileType, int length, String resolution, String photographer) {
        super(name,fileName,brugerGenereret);
        this.filetype = fileType;
        this.length = length;
        this.resolution = resolution;
        this.photographer = photographer;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    @Override
    public void logToConsole(){
        System.out.printf("name: %s, media type: %s\n",super.getName(),getClass().toString());

    }

}
