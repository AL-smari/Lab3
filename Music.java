import java.util.ArrayList;

public class Music extends Media{
    private String artist;

    public Music(String title, String auteur, String ISBN, double price) {
        super(title, auteur, ISBN, price);
        this.artist = auteur;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void listen(User user){
        user.addToCart(this);
    }
    public ArrayList<Music> generatePlaylist(ArrayList<Music>music){
        ArrayList<Music>generate = new ArrayList<Music>();
        for (int i = 0; i < music.size(); i++) {
            if(this.artist == music.get(i).getArtist()){
                generate.add(music.get(i));
            }

        }
        return generate;

    }
    public String getMediaType(){
        if(this.getPrice()>=10){
            return "Premium Music";
        }else return "Music";
    }

    @Override
    public String toString() {
        return "Music{" +
                "artist='" + artist + '\'' + super.toString() +
                '}';
    }
}
