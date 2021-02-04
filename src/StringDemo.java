public class StringDemo {


  /**
   * public : used from anywhere
   * static : instance of this class
   * void: no return type
   * main - function name
   * args -
   */
  public static void main(String[] args) {
    //name is local variable
    String name = "Vikash"; // ARRAY OF CHARACTERS
    //int age = 28;

    if (name.equals("vikash")) {
   //   int age = 38;
      Integer age = new Integer(38);

      System.out.println(name + age);
    }else if (name.equals("Vivek")) {
      int age = 28;
      System.out.println(name + age);
    }




  }


}
