import java.util.ArrayList;

public class Book extends Media {
    private int stock;
    private ArrayList<Review> reviews = new ArrayList<Review>();


    public Book(String title, String auteur, String ISBN, double price, int stock,ArrayList<Review> reviews) {
        super(title, auteur, ISBN, price);
        this.stock = stock;
        this.reviews=reviews;

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public void addReview(Review review){
        this.reviews.add(review);


    }
    public double getAverageRating(){
        double count=0;
        for (int i = 0; i < reviews.size(); i++) {
            count =count+reviews.get(i).getRating();

        }
        return count/reviews.size();
    }

    public void purchase(User user){
        if(this.stock>0) {
            user.addToCart(this);
            this.stock--;
        }else System.out.println("empty stock sold out");
    }
    public boolean isBestseller(){
        if(getAverageRating()>=4.5){
            return true;
        }else return false;
    }
    public void reStock(int quantity){
        stock=stock+quantity;
        System.out.println("restocking complete");

    }
    public String getMediaType(){
        if(isBestseller()){
            return "Bestselling Book";

        }else return "Book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "stock=" + stock +
                ", reviews=" + reviews + super.toString() +
                '}';
    }
}
