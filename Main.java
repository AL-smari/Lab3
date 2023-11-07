import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //user review and average rating

        Review r1 = new Review("khalid" , 5,"good book");
        Review r2 = new Review("khalid" , 3,"good book");
        Review r3 = new Review("khalid" , 4,"good book");
        ArrayList<Review> reviews = new ArrayList<Review>();
        reviews.add(r1);
        reviews.add(r2);
        reviews.add(r3);
        Book b1 = new Book("math","fahad","142251",59.9,12,reviews);
        Book b2 = new Book("history","hamad","96851",59.9,34,reviews);
        ArrayList<Media> shopping = new ArrayList<>() ;
        ArrayList<Media> purchase = new ArrayList<>() ;
        shopping.add(b1);
        shopping.add(b2);
        User u1 = new User("khalid","khalid123@gmail.com",purchase ,shopping );
        ArrayList<User> users = new ArrayList<>();
        users.add(u1);
        ArrayList<Media>media = new ArrayList<>();
        media.add(b1);
        media.add(b2);
        Store s1 = new Store(users,media);


        System.out.println(b1.getAverageRating());
        System.out.println(b1.getMediaType());


        s1.displayMedia();

        s1.displayUser();


        //checkout method
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < u1.getShoppingCart().size(); i++) {
            System.out.println(u1.getShoppingCart().get(i).getTitle());

        }
        System.out.println("-------------------------------------------------");
        u1.checkOut();
        for (int i = 0; i < u1.getPurchaseMediaList().size(); i++) {
            System.out.println(u1.getPurchaseMediaList().get(i).getTitle());

        }
        System.out.println("-------------------------------------------------");



    Movie m1 = new Movie("lionking","faisal","4325",99.9,120);
    Movie m2 = new Movie("avengers","faisal","4325",99.9,120);
    Movie m3 = new Movie("titanic","abdulaziz","4325",99.9,119);
    Movie m4 = new Movie("the matrix","faisal","4325",99.9,120);

    ArrayList<Movie>movies= new ArrayList<Movie>();
    movies.add(m1);
    movies.add(m2);
    movies.add(m3);
        ArrayList<Movie>recomend = m4.recommendSimilarMovie(movies);

        for (int i = 0; i < recomend.size(); i++) {
            System.out.println(recomend.get(i).getTitle());

        }
        media.add(m1);
        media.add(m2);
        media.add(m3);
        media.add(m4);
        System.out.println(m4.getMediaType());
        System.out.println(m3.getMediaType());

        u1.addToCart(m1);
        u1.addToCart(m2);
        //user add to cart
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < u1.getShoppingCart().size(); i++) {
            System.out.println(u1.getShoppingCart().get(i).getTitle());

        }


        //user remove
        u1.removeFromCart(m2);
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < u1.getShoppingCart().size(); i++) {
            System.out.println(u1.getShoppingCart().get(i).getTitle());

        }
        System.out.println("-------------------------------------------------");




        Music mu1 = new Music("snowman","sia","21415",9.99);
        Music mu2 = new Music("alamaken","mohamed","21415",9.99);
        Music mu3 = new Music("ghiab","mohamed","21415",10.99);
        ArrayList<Music> music = new ArrayList<>();
        music.add(mu1);
        music.add(mu2);
        ArrayList<Music> generate=mu3.generatePlaylist(music);
        for (int i = 0; i < generate.size(); i++) {
            System.out.println(generate.get(i).getTitle());
        }
        System.out.println(mu3.getMediaType());
        System.out.println(mu2.getMediaType());


        System.out.println("-------------------------------------------------");
        Novel n1 = new Novel("story123","maher","4525",40,5,reviews,"fiction");
        System.out.println(n1.getMediaType());
        n1.purchase(u1);
        System.out.println(n1.getStock());
        AcademicBook a1 = new AcademicBook("the human history","nasser","42525",20,3,reviews,"history");
        System.out.println(a1.getMediaType());
        a1.reStock(5);
        System.out.println(a1.getStock());






    }
}