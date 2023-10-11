import java.util.ArrayList;

public class users extends testdata{
    ArrayList <String> favorites;
    testdata database;
    void addfav(int choice){
        favorites = new ArrayList<>();
        favorites.add(database.movielist.get(choice).getTitle());
    }
    void viewfav(){
        for(int i = 0; i < favorites.size(); i++){
            System.out.println(movielist.get(i).getTitle());
        }
    }
}
