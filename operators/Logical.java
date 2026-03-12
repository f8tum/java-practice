package operators;

public class Logical {
   public static void main(String[] args) {
    // logical AND &&
    // logical OR ||
    // logical NOT !

    int a = 5;
    int b = 7;
    int c = 4;

    boolean res1 = (a > b && a > c);
    boolean res2 = (a > b || a > c);
    boolean res3 = !(a > b);

    System.out.printf("%b %b %b", res1, res2, res3);
   }
}