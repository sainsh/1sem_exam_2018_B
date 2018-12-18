public class Picture extends Media {

    private String filetype;
    private int width;
    private int height;
    private String photographer;

    public Picture(String name, String fileName, Boolean brugerGenereret, String filetype, int width, int height, String photographer) {
        super(name, fileName, brugerGenereret);
        this.filetype = filetype;
        this.width = width;
        this.height = height;
        this.photographer = photographer;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
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
