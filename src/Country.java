public class Country implements Measurable{
    private String title;
    private double area;

    public Country() {
        title = "Unknown";
        area = 0;
    }

    public Country(String title, double area) {
        if (title.isEmpty()) {
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
