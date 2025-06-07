import java.util.Scanner;

public class datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age (int): ");
        int age = sc.nextInt();

        System.out.print("Enter your height (float): ");
        float height = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter a long number: ");
        long lg = sc.nextLong();

        System.out.print("Enter a byte value: ");
        byte by = sc.nextByte();

        System.out.print("Enter a short number: ");
        short sh = sc.nextShort();

        sc.nextLine(); // Clear the leftover newline
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Are you okay? (true/false): ");
        boolean isOk = sc.nextBoolean();

        // Display entered values
        System.out.println("\n--- Output ---");
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Double: " + d);
        System.out.println("Char: " + ch);
        System.out.println("Long: " + lg);
        System.out.println("Byte: " + by);
        System.out.println("Short: " + sh);
        System.out.println("Name: " + name);
        System.out.println("Boolean: " + isOk);

        sc.close();
    }
}
