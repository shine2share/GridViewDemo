package come.wordpress.share2study.gridviewdemo;

/**
 * Created by thela on 10/11/2017.
 */

public class Images {
    private String name;
    private int image;

    public Images(String name, int image) {
        this.name = name;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {

        return name;
    }

    public int getImage() {
        return image;
    }

    public Images() {

    }
}
