import java.util.Scanner;

public class userinput {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name :");
        String name = sc.nextLine();

        System.out.println("what is your age ?");
        int age = sc.nextInt();

        sc.nextLine();          /*note this line is necessary because after using integer value, if you want to use next input as string then it is necessary to clear space*/
        
        System.out.println("what is your fav food ?");
        String food = sc.nextLine();
        sc.close();

        System.out.println("\nHello "+name);
        System.out.println("you are "+age+" years old");
        System.out.println("your favourite food is "+food);
    }
}
