public class swapvariables {
    public static void main(String[] args) {
        String x = "Pranjal";
        String y = "Soham";

        System.out.println("x is: " +x);
        System.out.println("y is: "+y);

        String temp;
        temp = x;
        x=y;
        y=temp;

        System.out.println("x is: "+x);
        System.out.println("y is: "+y);
    }
}
