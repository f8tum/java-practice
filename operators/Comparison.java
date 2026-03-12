package operators;

public class Comparison {
  public static void main(String[] args) {
    int x = 6;
    int y = 6;

    boolean res1 = x <= y;
    boolean res2 = x >= y;
    boolean res3 = x == y;
    boolean res4 = x != y;
    boolean res5 = x < y;
    boolean res6 = x > y;

    System.err.printf("%b %b %b %b %b %b\n", res1, res2, res3, res4, res5, res6);
  } 
}