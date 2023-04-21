import java.util.Scanner;
public class UserInterface {
    public LoginSystem loginSyst = new LoginSystem();
    public OnlineStore store = new OnlineStore();

    Scanner sc = new Scanner(System.in);
    Scanner scString = new Scanner(System.in);
    public void loadingInterface() {

        System.out.println("Welcome to the Online Store!");
        System.out.println("1. REGISTER");
        System.out.println("2. LOG IN");
        System.out.println("3. LOG OUT");

        int option = sc.nextInt();
        switch(option) {

            case 1:

                loginSyst.register();
                loadingInterface();
                break;

            case 2:

                if(!loginSyst.login()) {

                    loadingInterface();
                }
                else {

                    store.getProducts();
                    System.out.println("Choose the products that you desire to buy by entering the name of the product and the quantity: ");
                    System.out.println("Product: ");
                    String product = scString.nextLine();
                    System.out.println("Quantity: ");
                    float pricePerProduct = sc.nextInt();
                    store.addToCart(product, pricePerProduct);
                    while(true) {
                        System.out.println("Do you want to add more products? (y->YES or n->NO or c->CheckOut)");
                        String choice = scString.nextLine();
                        if (choice.equals("y")) {

                            System.out.println("Choose the products that you desire to buy by entering the name of the product and the quantity: ");
                            System.out.println("Product: ");
                            String product1 = scString.nextLine();
                            System.out.println("Quantity: ");
                            float pricePerProduct1 = sc.nextInt();
                            store.addToCart(product1, pricePerProduct1);
                        }
                        if(choice.equals("c")) {
                            store.checkout();
                        }
                        if(choice.equals("n")) {
                            store.checkout();
                            break;
                        }
                    }
                }
                break;

            case 3:

                loginSyst.logout();
                break;

            case 4:

                loginSyst.DisplayDataBase();
                loadingInterface();
                break;

            default:

                System.out.println("Wrong input");
                loadingInterface();
                break;
        }
    }
}
