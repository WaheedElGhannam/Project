import java.util.ArrayList;

public class MovieDatabase {
    public static class Movie {
        private String title;
        private int year;
        private String genre;
        private ArrayList<String> cast;
        public String plot;

        public Movie(String title, int year, String genre, ArrayList<String> cast, String plot) {
            this.title = title;
            this.year = year;
            this.genre = genre;
            this.cast = cast;
            this.plot = plot;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        public String getGenre() {
            return genre;
        }

        public ArrayList<String> getCast() {
            return cast;
        }
        public int getsizeofcast(){
            return cast.size();
        }

        public String getPlot() {
            return plot;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public void setCast(ArrayList<String> cast) {
            this.cast = cast;
        }

        public void setPlot(String plot) {
            this.plot = plot;
        }
        public void printMovieInfo(){
            System.out.println("Movie Name: " + title);
            System.out.println("Movie Year: " + year);
            System.out.println("Movie Genre: " + genre);
            System.out.print("Cast: ");
            for(int i = 0; i < cast.size(); i++){
                if (i < cast.size() - 1){
                    System.out.print(cast.get(i) + ", ");
                }else{
                    System.out.println(cast.get(i));
                }
            }
            System.out.println();
        }
}

}