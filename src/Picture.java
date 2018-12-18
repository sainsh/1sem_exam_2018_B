public class Picture extends Media {

    private String filetype;
    private int width;
    private int height;
    private String photographer;

    public Picture(String name, String fileName, String filetype, int width, int height, String photographer) {
        super(name, fileName);
        this.filetype = filetype;
        this.width = width;
        this.height = height;
        this.photographer = photographer;
    }

    @Override
    public void logToConsole(){
        System.out.printf("name: %s, media type: %s\n",super.getName(),getClass().toString());

    }

}
