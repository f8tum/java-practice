package operators;

public class Assignment {
  public static void main(String[] args) {
    int a = 8;

    int b = a--;
    int c = --a;
    int d = a++;
    int e = ++a;

    int f = 0;
    f += a;
    f -= 1;
    f *= 2;
    f /= 4;
    
    System.out.println(b + " " + c + " " + d + " " + e + " " + f);
  }
}
