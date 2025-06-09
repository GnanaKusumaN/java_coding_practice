
import java.util.Scanner;


/*Q2. Grading System
Write a program that takes marks as input and prints the grade:

Marks >= 90: Grade A

Marks >= 80: Grade B

Marks >= 70: Grade C

Marks >= 60: Grade D

Else: Grade F*/
class Grading
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks");
    int marks = sc.nextInt();
    if(marks>=90)
    {
        System.out.println("Grade A");
    }
    else if(marks>=80)
    {
        System.out.println("Grade B");
    }
     else if(marks>=70)
     {
         System.out.println("Grade C");
    }
    else if(marks>=60)
    {
        System.out.println("Grade D");
    }
    else
    {
        System.out.println("Grade F");
    }
   
}
}