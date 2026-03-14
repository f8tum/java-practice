package loops;

public class Loops 
{
  public static void main(String[] args) 
  {
    int i = 0;
    // checks condition at the start
    while (i < 10)
    {
      System.out.println(i);
      i++;
    }  

    // concise
    for (int j = 6; j > 0; --j)
    {
      System.err.println(j);
    }

    int k = 1;
    // checks condition at the end
    // always executes once
    do 
    {
      System.err.println(k);  
    } while (k < 1);
  }  
}
