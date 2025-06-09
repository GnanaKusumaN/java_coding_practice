
import java.util.Scanner;

class vowel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entere character");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        switch(ch)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
             System.out.println("vowel");
             break;
         default:
                System.out.println("consonant");
        
    }
}
}