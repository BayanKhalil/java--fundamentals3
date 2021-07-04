package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ableToReview {

    private String name;
    private String description;
    private int numOfDollarSigns;
    List<Review> shopReviews = new ArrayList<>();

    public Shop(String name, String description, int numOfDollarSigns) {
        this.name = name;
        this.description = description;
        this.numOfDollarSigns = numOfDollarSigns;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numOfDollarSigns=" + numOfDollarSigns +
                ", reviews=" + shopReviews +
                '}';
    }

    @Override
    public void createReview(String body, String author, int numOfStars) {
        Review shopReview=new Review(body,author,numOfStars);
        shopReviews.add(shopReview);

    }


    public void createReview(Review shopReview) {
        this.shopReviews.add(shopReview);
    }
}
