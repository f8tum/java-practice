package OOP;

class Calculator 
{
  // private variable
  private int d = 7;

  // class method
  public int add(int a, int b) 
  {
    return a + b;
  }

  // method overloading
  public int add(int a, int b, int c) 
  {
    return a + b + c + d;
  }
}

public class Classes 
{
  public static void main(String[] args) 
  {
    int num1 = 4;
    int num2 = 5;
  
    // Object
    Calculator calc = new Calculator();

    int result = calc.add(num1, num2);

    System.err.println(result);
  } 
}