
import java.util.Scanner;

/*Perfume Inventory Tracker
A perfume store stocks three perfumes.
Each has a unique name, price (decimal), and quantity in stock (integer).
Scenario:
Create variables for the name, price, and quantity of each perfume. Then, print the total inventory value for all perfumes combined (price × quantity).*/
class perfume{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter perfume name");
        String perfumeName1 = sc.nextLine();
        System.out.println("Enter price");
        float price1 = sc.nextFloat();
        System.out.println("Enter quantity");
        int quantity1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter 2nd perfume name");
        String perfumeName2 = sc.nextLine();
        System.out.println("Enter 2nd price");
        float price2 = sc.nextFloat();
        System.out.println("Enter 2nd quantity");
        int quantity2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter 3rd perfume name");
        String perfumeName3 = sc.nextLine();
        System.out.println("Enter 3rd price");
        float price3 = sc.nextFloat();
        System.out.println("Enter 3rd quantity");
        int quantity3 = sc.nextInt();
        sc.nextLine();
        float totalinventory=(price1*quantity1)+(price2*quantity2)+(price3*quantity3);
        System.out.println("The total inventory values for all perfumes is:"+ totalinventory);
    }
}

