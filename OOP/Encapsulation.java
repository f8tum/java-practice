package OOP;

class Human 
{
  // private variables prevents data from being
  // accesses outside the class
  private int age;
  private String name;

  public Human(int age, String name)
  {
    this.age = age;
    this.name = name;
  }

  // setters edit the variables
  public void setAge(int age)
  { 
    this.age = age;
  }

  public void setName(String name)
  { 
    this.name = name;
  }

  // getters print or return them
  public int getAge()
  {
    return age;
  }

  public String getName()
  {
    return name;
  }
}

public class Encapsulation 
{
  public static void main(String[] args)
  {
    Human obj1 = new Human(17, "John");
    System.out.println("Age: " + obj1.getAge() + ", Name: " + obj1.getName());
    obj1.setAge(19);
    obj1.setName("Doe");
    System.out.println("Age: " + obj1.getAge() + ", Name: " + obj1.getName());
  }
}
