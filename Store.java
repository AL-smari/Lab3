import java.util.ArrayList;

public class Store {
    private ArrayList<User> user = new ArrayList<User>();
    private ArrayList<Media> media = new ArrayList<Media>();

    public Store(ArrayList<User> user, ArrayList<Media> media) {
        this.user = user;
        this.media = media;
    }

    public void addUser(User user){
        this.user.add(user);
    }

    public void displayUser(){
        for (int i = 0; i < user.size(); i++) {

            System.out.println("User Name: "+user.get(i).getUsername()+"\nUser Email: "+user.get(i).getEmail());

        }
    }
    public void addMedia(Media media){
        this.media.add(media);

    }

    public void displayMedia(){
        for (int i = 0; i < media.size(); i++) {

            System.out.println("Media Name: "+media.get(i).getTitle()+"\nMedia Type: "+media.get(i).getMediaType());


        }

    }

    @Override
    public String toString() {
        return "Store{" +
                "user=" + user +
                ", media=" + media +
                '}';
    }
}
