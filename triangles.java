/* . Triangle Type
Write a program to check the type of a triangle based on the length of its sides (a, b, c):

Equilateral: All sides equal

Isosceles: Any two sides equal

Scalene: All sides different*/
import java.util.Scanner;
class triangles
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter c");
        int c = sc.nextInt();
        if((a==b)&&(b==c)&&(c==a))
        {
            System.out.println("Equilatera triangle");
        }
        else if((a==b)||(b==c)||(c==a))
        {
           System.out.println("Isosceles");
        }
        else 
        {
            System.out.println("All sides different");
        }
        }

    }
