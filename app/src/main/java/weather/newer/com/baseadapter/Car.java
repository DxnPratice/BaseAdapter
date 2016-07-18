package weather.newer.com.baseadapter;

/**
 * Created by windows on 2016/7/18.
 */
public class Car {
    int logo;//汽车标志
    String  title;//汽车标题
String info;

    public Car(String info, int logo, String title) {
        this.info = info;
        this.logo = logo;
        this.title = title;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Car{" +
                "logo=" + logo +
                ", title='" + title + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}
