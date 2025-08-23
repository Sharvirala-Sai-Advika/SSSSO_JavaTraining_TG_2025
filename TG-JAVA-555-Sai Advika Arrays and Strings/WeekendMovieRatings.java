public class WeekendMovieRatings {
    public static void main(String[] args) {
        int[] ratings = {3, 5, 4, 2, 5, 1};
        int maxRating = ratings[0];
        int movieIndex = 0;

        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > maxRating) {
                maxRating = ratings[i];
                movieIndex = i;
            }
        }

        System.out.println("Highest rating: " + maxRating + " stars for movie " + (movieIndex + 1));
    }
}
