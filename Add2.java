import java.util.*;
public class Add2{
    public static void main(String args[]){
    System.out.println("Enter any two numbers");
    Scanner sc = new Scanner(System.in);
    sc.close();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int sum= a+b;
    System.out.print("the addition of two numbers is :"+sum);
    }
}