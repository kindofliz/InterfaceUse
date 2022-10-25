public class Country implements Measurable{
    String title;
    double area;

    public Country() {
    }

    public Country(String title, double area) {
        if (title == (null)) {
            title = "Unknown";
        }
        this.title = title;

        if (area < 0) {
            area = 0;
        }
        this.area = area;
    }

    @Override
    public String toString() {
        return "Country{" +
                "title='" + title + '\'' +
                ", area=" + area +
                '}';
    }

    @Override
    public double getMeasure() {
        return area;
    }
}
