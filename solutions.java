import java.util.*;

public class solutions {

    public static int average(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;
    }
    
    public static void main(String args[]){

        System.out.println("Enter any three numbers :");
        Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            sc.close();

            System.out.println("Avg is :"+average(a,b,c));
        }
    }

