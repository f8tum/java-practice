package strings;

public class Strings
{
  public static void main(String[] args) 
  {
    // strings in java are classes 
    // when we write String a = "";
    // it is procesed as String a = new String("");

    // these are immutble
    // meaning: changing them will create a new object
    // original will still exist till garbage collection
    String name = "losthread";
    System.out.println(name);

    // mutable strings can be created using string buffer or string builder 
    StringBuffer mutable = new StringBuffer("hey");
    System.out.println(mutable);

    // string methods
    mutable.append(" bro");

    // convert StrinBuffer to String
    String converted = mutable.toString();
    System.out.println(converted);

    mutable.deleteCharAt(5);
    mutable.insert(2, " Java ");

    System.out.println(mutable);

    System.err.println(mutable.substring(0, 3));
  }  
}