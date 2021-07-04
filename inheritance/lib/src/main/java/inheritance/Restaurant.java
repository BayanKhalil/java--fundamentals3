package inheritance;

import java.util.ArrayList;
import java.util.List;

 public class Restaurant implements ableToReview{
    private String name;
    private int numOfStars;
    private String priceCategory;
    List<Review> restReviews = new ArrayList<>();

    public Restaurant(String name, int numOfStars, String priceCategory) {
        this.name = name;
        this.numOfStars = numOfStars;
        this.priceCategory = priceCategory;
    }

    public String getName() {
        return name;
    }

    public int getNumOfStars() {
        return numOfStars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfStars(int numOfStars) {
        this.numOfStars = numOfStars;
    }

    public void setPriceCategory(String priceCategory) {
        this.priceCategory = priceCategory;
    }



        @Override
        public String toString() {
            return "Restaurant{" +
                    "name='" + name + '\'' +
                    ", numOfStars=" + numOfStars +
                    ", priceCategory='" + priceCategory + '\'' +
                    ", reviews=" + restReviews +
                    '}';
        }




    public void createReview(Review review) {
        if( ! this.restReviews.contains(review)) {
            this.setNumOfStars(review.getNumOfStars());
            this.restReviews.add(review);
        }
    }


     @Override
     public void createReview(String body, String author, int numOfStars) {
      body="override ";
     }


 }
