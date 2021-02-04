/**
 *
 * Class - public class HelloWorld
 *
 * Entrypoint of this class
 * Function: main
 */

public class HelloWorld {

  /*
  1. What is Class + main method
  2. Main Method
  3. Build
  4. Run
   */

  /**
   * public : it can be accessed from anywhere
   * static: HelloWorld.main *complicate
   * This method is static
   *
   * void: this method/function is not returning anything
   * main: Method Name
   *
   * String[] args: Passing Parameter
   *        0         1         2       3
   * args = [string1, string2, string3, string4 ]
   */
  public static void main(String[] args) {
    System.out.println(args[0]) ;//println
    sum(5,10);
  }

  public static int sum(int a, int b) {
    int c = a + b;
    return c;
  }
}
