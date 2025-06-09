/* Age Eligibility
Write a program that checks a person's age and prints:

"Child" if age < 13

"Teenager" if age is between 13 and 19

"Adult" if age is 20 or more*/ 
import java.util.Scanner;
class Eligibility
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        if(age<13)
        {
            System.out.println("child");
        }
        else if(age>=13&&age<=19)
        {
            System.out.println("teenager");
        }
        else if(age>=20)
        {
            System.out.println("adult");
        }
        sc.close();
    }
    
}
