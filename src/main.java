import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {
        users user = new users();
        MovieDatabase moviedata = new MovieDatabase();
        testdata database = new testdata();
        database.run(); //creates the movie database on run
        Scanner sc = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        boolean flag2 = false;
        System.out.println("Welcome to Cinemax Cinemas, If you are a User please press 1, if you are Admin please press 2");
        int choice = sc.nextInt();
        int userchoice = 0;
        while(flag == false){ //to validate the users presses 1 or 2 only
            if((choice == 1) || (choice == 2)){
                flag = true;
            }
            else{
                System.out.println("Invalid input please pick 1 for User or 2 for Admin: ");
                choice = sc.nextInt();
            }
        }
        if(choice == 1){ // interface for the users
            while(true){
            System.out.println("--Welcome to the Cinemax Cinemas User Experience--.");
            System.out.println("Pick any of the options below: ");
            System.out.println("1. View List of Available Movies");
            System.out.println("2. Search for movies by Genre");
            System.out.println("3. Search Movies by release date");
            System.out.println("4. View Information about a Movie");
            System.out.println("5. View Movie Showtimes");
            System.out.println("6. Mark Favorite Movies");
            System.out.println("7. View Favorites");
            System.out.println("8. Rate A Movie");
            System.out.println("9. Purchase Tickets");
            System.out.println("10. Historical Movie Showtimes");
            System.out.println("11. Logout");
            System.out.println("12. Exit");
            userchoice = sc.nextInt(); // kind of a mouse for user
            flag2 = true;
            
            if(userchoice == 1){
                database.printMovieInfo();
            }if (userchoice == 2) {
                System.out.println("Pick which Genre you want, we have Action, Sci-Fi and Drama: ");
                Scanner scgenre = new Scanner(System.in);
                String genrechoice = scgenre.nextLine();
                genrechoice = genrechoice.substring(0, 1).toUpperCase() + genrechoice.substring(1).toLowerCase();
                flag = false;
                while(flag == false){
                    if((genrechoice.equals("Action")) || (genrechoice.equals("Sci-fi")) || (genrechoice.equals("Drama"))){
                    database.printgenremovies(genrechoice);
                    flag = true;
                }else{
                    System.out.println("Genre Entered is incorrect, make sure of spelling and try again: ");
                    System.out.println("We have Action, Sci-Fi and Drama: ");
                    genrechoice = scgenre.nextLine();
                    genrechoice = genrechoice.substring(0, 1).toUpperCase() + genrechoice.substring(1);
                }
                }
            }if(userchoice == 3){
                flag = false;
                System.out.println("From which year would like to see the movies? :");
                Scanner yearchoice = new Scanner(System.in);
                int useryear = yearchoice.nextInt();
                while(flag == false){
                    if  ((useryear < 2023) && (useryear > 1950)){
                        flag = true;
                        database.printyearmovies(useryear);
                    }else{
                        System.out.println("The Year cannot be less than 1950 and not more than 2023 try again: ");
                        useryear = yearchoice.nextInt();
                    }
                }
            }if(userchoice == 4){
                flag = false;
                database.printTitles();
                System.out.println("Pick the corrsponding number to the movie you want to know the plot and its cast: ");
                Scanner extra = new Scanner(System.in);
                int userextra = extra.nextInt();
                userextra = userextra - 1;
                while(flag == false){
                    if((userextra >= 0) && (userextra < database.movielist.size())){
                        database.extrainfo(userextra);
                        flag = true;
                    }else{
                        System.out.println("Pick from the numbered list only one");
                        userextra = extra.nextInt();
                        userextra = userextra - 1;
                    }
                }
            }if(userchoice == 5){

            }if(userchoice == 6){
                flag = false;
                database.printTitles();
                System.out.println("Pick the corrsponding number to add to favorites: ");
                Scanner pickfav = new Scanner(System.in);
                int userfav = pickfav.nextInt();
                userfav = userfav - 1;
                while(flag == false){
                    if((userfav >= 0) && (userfav <=database.movielist.size())){
                    database.addfav(userfav);
                    flag = true;
                    }else{
                        System.out.println("Pick from the numbered list only one: ");
                        userfav = pickfav.nextInt();
                        userfav = userfav - 1;
                    }
                }
            }if(userchoice == 7){
                user.viewfav();
            }if(userchoice == 8){
                database.printTitles();
                System.out.println();
            }
            System.out.print("\nPress Enter to continue to return to the main user menu...");
            scanner.nextLine(); // Wait for Enter key press
            System.out.println();
        }
    }
    
    }
}
