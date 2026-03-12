package variables;
class Variables 
{
  public static void main(String[] args) 
  {
  // Primitive data types:
    // integer (byte(1 byte), short(2byte), int(4 byte), long(8 bytes))
    // decimal (float, double)
    // character (char(2 bytes))
    // boolean

  int n = 9;
  byte b = 127;
  short s = 558;
  long l = 696969l;

  float f = 5.8f;
  double d = 5.8;

  char c = 'k';
  boolean bool = true;

  System.out.printf("%d %d %d %d %f %f %c %b%n", n, b, s, l, f, d, c, bool);
  }
}