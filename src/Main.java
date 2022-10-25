public class Main {
    public static void main(String[] args) {

        Country sw = new Country("Sweden", 528.5);
        Country lv = new Country("Latvia", 64.5);
        Country lt = new Country("Lithuania", 65.3);
        Country ee = new Country("Estonia", 45.3);

        Country[] countries = {sw, lv, lt, ee};

        System.out.println("The country with the largest area is: " + maximum(countries));

    }

    public static Measurable maximum(Measurable[] objects) {
        Measurable largestCountry = new Country();
        double maxArea = 0;

        for (Measurable object : objects) {
            double area = object.getMeasure();

            if (area > maxArea) {
                maxArea = area;
                largestCountry = object;
            }
        }

        return largestCountry;
    }

}


