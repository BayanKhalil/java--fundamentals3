package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater implements ableToReview {
    String name;

    public Theater(String name){
        this.name=name;
    }

    List<String> movies=new ArrayList<>();;
    List<Review> theaterReviews = new ArrayList<>();


    public void addMovie(String movie) {
        if (movies.contains(movie)){
            System.out.println("this move is already exist");
        }else {
            movies.add(movie);
        }

    }
    public void removeMovie(String movie){
        if(!movies.contains(movie)){
            System.out.println("There are no movies with this name in list");
        } else {
            movies.remove(movie);
        }
    }


    @Override
    public void createReview(String body, String author, int numOfStars) {
        Review theaterReview=new Review(body,author,numOfStars);
        theaterReviews.add(theaterReview);
    }
    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                ", theaterReviews=" + theaterReviews +
                '}';
    }

    public void createReview(Review theaterReview) {
        theaterReviews.add(theaterReview);
    }
}
