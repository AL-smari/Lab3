import java.util.ArrayList;

public class Novel extends Book{
    private String genre;

    public Novel(String title, String auteur, String ISBN, double price, int stock, ArrayList<Review> reviews, String genre) {
        super(title, auteur, ISBN, price, stock, reviews);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMediaType(){
        if(super.isBestseller()){
            return "Bestselling Novel";

        }else return "Novel";
    }

    @Override
    public String toString() {
        return "Novel{" +
                "genre='" + genre + '\'' + super.toString() +
                '}';
    }
}
