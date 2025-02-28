import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a=sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b=sc.nextInt();

        System.out.println("Enter Operation : 1. Addition, 2.Subtrsction, 3. Multiplication, 4.Division ");
        int Choice=sc.nextInt();
        
        switch(Choice){
        
            case 1 :
            System.out.println("Addition of two Numbers are : "+ (a+b) );
            break;

            case 2 :
            System.out.println("Subtraction of two Numbers are : " + (a-b) );
            break;

            case 3 :
            System.out.println("Division of two Numbers are : " + (a/b) );
            break;

            case 4 :
            System.out.println("Multiplication of two Numbers are : "+ (a*b) );
            break;

            default:
            System.out.println("Invalid Operation");
            break;

        }

    }
}