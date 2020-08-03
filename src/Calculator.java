import java.util.*;
import java.io.*;
class Calculator
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double a=sc.nextDouble();
        System.out.println("Enter another number");
        double b=sc.nextDouble();
        System.out.println("Enter a operation(+,-,*,/,%):");
        
        char s=sc.next().charAt(0);
        double c=0;
        
        switch(s)
        {
            case '+':
                 c=a+b;
                break;
            case '-':
                 c=a-b;
                 break;
            case '/':
                 c=a/b;
                break;
            case '*':
                c=a*b;
                break;
            case '%':
                c=a%b;
                break;
            
            default:
                System.out.println("no operation found");
                break;
        }
        System.out.println(a +" "+s+" "+b+" "+"="+c);

        
    }
}
