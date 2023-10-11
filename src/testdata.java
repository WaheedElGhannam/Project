import java.util.ArrayList;

public class testdata extends MovieDatabase {
    public Movie movie1;
    public Movie movie2;
    public Movie movie3;
    public Movie movie4;
    public Movie movie5;
    public Movie movie6;
    public Movie movie7;
    public Movie movie8;
    public ArrayList <Movie> movielist;
    public ArrayList <Movie> favorites = new ArrayList<>();
    void run(){
        ArrayList <String> cast1, cast2, cast3, cast4, cast5, cast6, cast7, cast8; // An array list which will contain the cast of movies
        cast1 = new ArrayList<>();
        cast2 = new ArrayList<>();
        cast3 = new ArrayList<>();
        cast4 = new ArrayList<>();
        cast5 = new ArrayList<>();
        cast6 = new ArrayList<>();
        cast7 = new ArrayList<>();
        cast8 = new ArrayList<>();
        cast1.add("Tom Holland");
        cast1.add("Toby Maguire");
        cast1.add("Andrew Garfield");
        movie1 = new Movie("Spiderman: No Way Home", 2022, "Action", cast1, "Spider-Man: No Way Home is a superhero film released in 2021. The movie follows Peter Parker (played by Tom Holland) as he seeks the help of Doctor Strange to erase the knowledge of his secret identity from the world after it is revealed by Mysterio. However, a spell goes wrong, causing a multiverse to collide and bringing villains from other dimensions into Peter's world.");
        cast2.add("Leonardo Di Caprio");
        cast2.add("Joseph Gordon-Levitt");
        cast2.add("Ellen Page");
        movie2 = new Movie("Inception", 2010, "Sci-fi", cast2, "Inception is a 2010 science fiction thriller directed by Christopher Nolan. The film revolves around the concept of shared dreaming and follows a skilled thief named Dom Cobb (played by Leonardo DiCaprio) who specializes in a form of corporate espionage that involves entering the dreams of others to steal their secrets.");
        cast3.add("Tom Hanks");
        cast3.add("Robin Wright");
        cast3.add("Gary Sinise");
        movie3 = new Movie("Forrest Gump", 1994, "Drama", cast3, "Forrest Gump is a 1994 film directed by Robert Zemeckis. The story is narrated by Forrest Gump (played by Tom Hanks), a man with low intelligence but a kind heart, as he recounts his extraordinary life experiences.");
        cast4.add("Harrison Ford");
        cast4.add("Karen Allen");
        cast4.add("Paul Freeman");
        movie4 = new Movie("Raiders of The Lost Ark", 1981, "Action", cast4,"Raiders of the Lost Ark is a 1981 action-adventure film directed by Steven Spielberg and produced by George Lucas. The movie follows the iconic archaeologist and adventurer, Dr. Indiana Jones (played by Harrison Ford), in his quest to find the Ark of the Covenant, an ancient biblical artifact believed to possess extraordinary power." );
        cast5.add("Christian Bale");
        cast5.add("Heath Ledger");
        cast5.add("Aaron Eckhart");
        movie5 = new Movie("The Dark Knight", 2008, "Action", cast5, "The Dark Knight is a 2008 superhero film directed by Christopher Nolan and is the second installment of Nolan's Batman trilogy. The film follows the journey of Gotham City's vigilante, Batman, as he faces one of his most formidable adversaries, the Joker.");
        cast6.add("Tim Robbins");
        cast6.add("Morgan Freeman");
        cast6.add("Bob Gunto");
        movie6 = new Movie("Shawshank Redemption", 1994, "Drama", cast6, "The Shawshank Redemption is a 1994 drama film directed by Frank Darabont, based on a novella by Stephen King. The story revolves around Andy Dufresne, a banker who is wrongfully convicted of the murder of his wife and her lover and is sentenced to life in Shawshank State Penitentiary.");
        cast7.add("Elijah Wood");
        cast7.add("Viggo Mortensen");
        cast7.add("Ian McKellen");
        movie7 = new Movie("The Lord of the Rings: The Return of the King", 2003, "Fantasy", cast7,"The Lord of the Rings: The Return of the King is the third and final installment of Peter Jackson's film adaptation of J.R.R. Tolkien's epic fantasy novel, \"The Lord of the Rings.\" The film, released in 2003, continues the journey of Frodo Baggins, a hobbit, and his companions in their quest to destroy the One Ring and bring an end to the Dark Lord Sauron's reign of terror." );
        cast8.add("John Travolta");
        cast8.add("Uma Thurman");
        cast8.add("Samuel Jackson");
        movie8 = new Movie("Pulp Fiction", 1994, "Action", cast8, "Pulp Fiction is a 1994 neo-noir crime film directed by Quentin Tarantino. The story is told in a non-linear narrative style and follows various interconnected characters through a series of interlocking crime stories in Los Angeles.");
        movielist = new ArrayList<>();
        movielist.add(movie1);
        movielist.add(movie2);
        movielist.add(movie3);
        movielist.add(movie4);
        movielist.add(movie5);
        movielist.add(movie6);
        movielist.add(movie7);
        movielist.add(movie8);
    }

    static void searchtitle(Movie movie, String name){
        if(movie.getTitle() == name){
            System.out.println("Movie Found");
        }else{
            System.out.println("Movie not Found");
        }
    }
    void printgenremovies(String userchoice){
        ArrayList<String> usergenre = new ArrayList<>();
        for (Movie movie : movielist) {
            if (movie.getGenre().equals(userchoice)) {
                usergenre.add(movie.getTitle());
            }
        }
        for(int i = 0; i < usergenre.size(); i++){
            System.out.println(usergenre.get(i));
        }

    }
    void printyearmovies(int userchoice){
        ArrayList<String> useryear = new ArrayList<>();
        ArrayList <Integer> releaseyear = new ArrayList<>();
        for (Movie movie : movielist) {
            if (movie.getYear() >= userchoice) {
                useryear.add(movie.getTitle());
                releaseyear.add(movie.getYear());
            }
        }
        System.out.println("Here are the list of Movies released during and after " + userchoice);
        for(int i = 0; i < useryear.size(); i++){
            System.out.println("(" + useryear.get(i) + ")" + " was released in " + releaseyear.get(i));
        }

    }
    void printMovieInfo(){
        for (Movie movie : movielist) {
            System.out.println("Movie Name: " + movie.getTitle());
            System.out.println("Movie Year: " + movie.getYear());
            System.out.println("Movie Genre: " + movie.getGenre());
            System.out.println("Cast: " + movie.getCast());
            System.out.println();
        }
    }
    void printTitles(){
        ArrayList <String> titles = new ArrayList<>();
        for(Movie movie : movielist){
            titles.add(movie.getTitle());
        }
        for(int i = 0; i < titles.size(); i++){
            System.out.println(i+1 + " " + titles.get(i));
        }
    }
    void extrainfo(int userchoice){
        System.out.println("This is the plot of " + movielist.get(userchoice).getTitle() + ": " + movielist.get(userchoice).getPlot());
        System.out.println("The cast of " + movielist.get(userchoice).getTitle() + ": " + movielist.get(userchoice).getCast());
    }
    void addfav(int choice){
        favorites.add(movielist.get(choice));
    }
    void viewfav(){
        for(int i = 0; i < favorites.size(); i++){
            System.out.println(favorites.get(i).getTitle());
        }
    }
    void ratefilm(int rate, String review){
        
    }
}
