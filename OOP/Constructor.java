package OOP;

class Mobile 
{
  String brand;
  int price;
  // the variable belongs to the class itself not the object
  // you dont need to create an object to use it
  // that is why main is also static
  static String name;
  
  // Will be called only once for statci variables
  static
  {
    name = "Phone";
    System.out.println("In static block");
  }

  // Default constructor
  public Mobile()
  {
    brand = "Meow";
    price = 200;
    System.out.println("In constructor");
  }

  // Parameterised constructor
  public Mobile(String brand, int price)
  {
    this.brand = brand;
    this.price = price;
  }

  public void show()
  {
    System.out.println(brand + " : $" + price + " : " + name);
  } 
}

public class Constructor 
{
  public static void main(String[] args) 
  {
    Mobile obj1 = new Mobile();
    obj1.show();
  }  
}
