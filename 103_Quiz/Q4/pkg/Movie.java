package pkg;

public class Movie {

    String name;
    double rating;
    int numRatings;
    int revenue;

    //constructors
    public Movie(String a, double b, int c, int d) {
        name = a;
        rating = b;
        numRatings = c;
        revenue = d;
    }

    public Movie(String a, double b, int c) {
        name = a;
        rating = b;
        numRatings = c;
        revenue = 0;
    }

    public Movie(String a, double b) {
        name = a;
        rating = b;
        numRatings = 0;
        revenue = 0;
    }

    public Movie(String a) {
        name = a;
        rating = 0;
        numRatings = 0;
        revenue = 0;
    }

    public Movie() {
        name = "unknown";
        rating = 0;
        numRatings = 0;
        revenue = 0;
    }

    //methods

    public void movieToString() {
        
        System.out.println("Movie: " + name);
        System.out.println("Rating: " + rating);
        System.out.println("Number of Ratings: " + numRatings);
        System.out.println("Revenue: " + revenue);
        System.out.println();

    }

    public String getMovieName() {
        return name;
    }

    public int getRevenue() {
        return revenue;
    }

    public void addRating(double input) {
        double derivedRating = rating*numRatings;
        derivedRating = derivedRating + input;
        rating = derivedRating/(numRatings + 1);

    }

    public String revenueToString() {
        System.out.print(revenue);
    }



}