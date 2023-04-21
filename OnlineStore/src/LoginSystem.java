import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LoginSystem {
    public Set<User> users = new HashSet<User>();
    public OnlineStore store = new OnlineStore();
    Scanner sc = new Scanner(System.in);
    public User user = new User();


    public void register() {

        User user = new User();
        System.out.println("Please Register!");

        System.out.println("Username: ");
        String username = sc.nextLine();
        user.setUsername(username);

        System.out.println("Password: ");
        String password = sc.nextLine();
        user.setPassword(password);

        users.add(user);

        System.out.println("You are registered, now LOG IN");

    }

    public boolean login() {

        System.out.println("please LogIn!");
        System.out.println("Enter USERNAME and PASSWORD: (username password)");
        User credentials = new User();
        System.out.println("Username: ");
        credentials.setUsername(sc.nextLine());
        System.out.println("Password: ");
        credentials.setPassword(sc.nextLine());
        if(users.isEmpty()) {

            System.out.println("The database is empty");
            register();
            return false;
        }
        else {

            for(User u : users) {
                if (u.equals(credentials)) {

                    System.out.println("Welcome " + credentials.getUsername());

                } else {

                    System.out.println("Your account does not exist, please REGISTER");
                    register();
                    return false;
                }
            }
        }


        return true;
    }

    public boolean logout() {


        return true;
    }

    public void DisplayDataBase() {

        for(User u : users) {
            System.out.println(u.toString());
        }
    }

    public static void main(String[] args) {


    }
}
