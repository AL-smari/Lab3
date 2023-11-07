import java.util.ArrayList;

public class Movie extends Media{

    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title, auteur, ISBN, price);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void watch(User user){
        user.addToCart(this);
    }
    public ArrayList<Movie> recommendSimilarMovie(ArrayList<Movie>movieCatalog){
        ArrayList<Movie> recomend = new ArrayList<Movie>();
        for (int i = 0; i < movieCatalog.size(); i++) {
            if(this.getAuteur() == movieCatalog.get(i).getAuteur()){
                recomend.add(movieCatalog.get(i));
            }

        }
        return recomend;

    }
 public String getMediaType(){
        if(duration >=120){
            return "Long Movie";
        }else return "Movie";
 }

    @Override
    public String toString() {
        return "Movie{" +
                "duration=" + duration + super.toString() +
                '}';
    }
}
