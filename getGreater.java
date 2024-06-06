import java.util.*;

public class getGreater {

    public static int motha(int a,int b){
        if(a>b){
            System.out.println(a);
        } 
        else{
            System.out.println(b);
        }
        return 1;
    }
    public static void main(String[] args) {

        System.out.println("enter the 2 no.s :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.close();
        motha(a,b);
    }
}
