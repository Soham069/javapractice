import java.util.*;
public class AddTwo{
    public static void main(String args[]){
    System.out.println("Enter any two numbers");
    Scanner sc = new Scanner(System.in);

    int a=sc.nextInt();
    int b=sc.nextInt();

    sc.close();
    int sum= a+b;
    System.out.print("the addition of two numbers is :"+sum);
    }
}