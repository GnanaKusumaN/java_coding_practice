
import java.util.Scanner;

 class leapyear
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int year = sc.nextInt();
        if(year%400==0)
        {
            System.out.println("Leap year");
        }
        else if(((year%100)==0) && !((year%400)==0) )
        {
             System.out.println("not leap year");
        }
        else if((year%4==0) && !(year%100==0))
        {
            System.out.println("leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
        sc.close();
    }
}
