package conditionals;

public class Ifelse 
{
  public static void main(String[] args) 
  {
    int x = 5;
    int y = 9;
    int z = 8;

    if (x >= y && x >= z)
      System.out.println(x + " = x is the greatest");
    else if (y >= x && y >= z)
      System.out.println(y + " = y is the greatest");
    else 
      System.out.println(z + " = z is the greatest");
  } 
}
