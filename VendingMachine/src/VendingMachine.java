
import java.util.Scanner;
import java.util.HashMap;

public class VendingMachine extends Products {


    //attributes
    public int credit;
    HashMap<String, String> products = new HashMap<>();
    String prod;


    //methods
    public void displayProudcts() {

        Products produs1 = new Products();
        Products produs2 = new Products();
        Products produs3 = new Products();
        Products produs4 = new Products();
        Products produs5 = new Products();
        Products produs6 = new Products();
        Products produs7 = new Products();
        Products produs8 = new Products();
        Products produs9 = new Products();

        produs1.SetNameAndId("Loca Moca Java Monster", "1");
        produs2.SetNameAndId("Khaotic Juice Monster", "4");
        produs3.SetNameAndId("Farmer's Oats Java Monster", "7");
        produs4.SetNameAndId("Green Tea Monster Dragon Iced Tea", "2");
        produs5.SetNameAndId("Irish Blend Java Monster", "9");
        produs6.SetNameAndId("Papillon Juice Monster", "10");
        produs7.SetNameAndId("Zero-Sugar Ultra Blue", "26");
        produs8.SetNameAndId("Mango Matic Monster MAXX", "15");
        produs9.SetNameAndId("Peach Tea Monster Rehab", "16");


        products.put(produs1.productName, produs1.idProduct);
        products.put(produs2.productName, produs2.idProduct);
        products.put(produs3.productName, produs3.idProduct);
        products.put(produs4.productName, produs4.idProduct);
        products.put(produs5.productName, produs5.idProduct);
        products.put(produs6.productName, produs6.idProduct);
        products.put(produs7.productName, produs7.idProduct);
        products.put(produs8.productName, produs8.idProduct);
        products.put(produs9.productName, produs9.idProduct);

        System.out.println("///////////////////////////////////////");
        System.out.println("///     MONSTER VENDING MACHINE     ///");
        System.out.println("///////////////////////////////////////");

        for (String i : products.keySet()) {
            System.out.println("PRODUCT: " + i + " ID: " + products.get(i));
        }

        System.out.println("///////////////////////////////////////");
        System.out.println("///                                 ///");
        System.out.println("///////////////////////////////////////");

    }

    public void insertCoin(int value) {

        this.credit = value;
    }

    public String selectProduct(int id) {

        String idString = String.valueOf(id);
        this.idProduct = idString;
        //System.out.println(idString);

        for(String i : products.keySet()) {

            if(idString.equals(products.get(i))) {

                prod = i;
            }
        }

        return prod;
    }

    public void displayCredit() {

        System.out.println("Current credit is: " + this.credit);
    }

    public void userMenu() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add more credit \n2. Select product \n3. Extract credit \n");
        System.out.println("I choose option: ");
        int option = sc.nextInt();

        switch(option) {
            //INSERT CREDIT INTO THE VENDING MACHINE
            case 1:

                while(true) {

                    System.out.println("Do you want to add more credit? (1-> yes || 0->no)");
                    int decision = sc.nextInt();

                    if(decision == 1) {

                        System.out.println("Enter credit(must be 5): ");
                        int money1 = sc.nextInt();
                        while (money1 != 5) {

                            System.out.println("I accept only 5");
                            System.out.println("Try again: ");

                            money1 = sc.nextInt();

                        }
                        insertCoin(money1 + credit);
                        displayCredit();
                    }

                    if(decision == 0) {
                        userMenu();
                        break;
                    }
                }
                break;

            //CHOOSE A PRODUCT
            case 2:

                System.out.println("PLEASE ENTER THE ID OF THE DISERED PRODUCT: ");
                int id = sc.nextInt();
                if(this.credit > 7) {

                    System.out.println(selectProduct(id));
                    insertCoin(credit - 7);
                    displayCredit();
                }
                else {

                    System.out.println("Not enough credit, Try to add more");
                    displayCredit();
                    userMenu();
                }

                userMenu();

                break;
            case 3:

                insertCoin(0);
                displayCredit();
                System.out.println("Please pick up your change");
                break;
            default:
                System.out.println("I have no such technology");
                break;
        }
    }


    //main method
    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.displayProudcts();

        System.out.println("!!!ONE CAN OF MONSTER COSTS 7 CREDITS!!!");
        Scanner sc = new Scanner(System.in);

        vendingMachine.userMenu();

    }
}