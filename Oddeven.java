import java.util.*;
public class Oddeven {
    public static void main(String args[]){
        System.out.println("Enter Any 2 Numbers");

        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        sc.close();

        if(x%2==0){
            System.out.println("even");
    
        }else{
            System.out.println("odd");
        }
    }
}