public class StringInternDemo {

  public static void main(String[] args) {
    String s1 = "HELLO";
    /*
    JVM
    a) Heap Memory (Perm Gen space)
      String pool gets created
      s1 = "HELLO";
      object x = 500@abcd

    b) Java Stack
    c)
     */

    String s2 = "HELLO";
    /**
     * s2 = x; //500@abcd
     *
     */

    if (s1 == s2) {
      System.out.println("S1 and S2 are both using same reference");
    }

    String s3 = new String("HELLO");
    /*
     s3 = 501@abcd
     501@abcd = "HELLO"
     */

    if (s1 == s3) {
      System.out.println("S1 and S3 are both using same reference");
    }else {
      System.out.println("S3 creates a new String object");
    }

    String s4 = s3.intern();
    /**
     s3.intern = jvm - if this string is already present in heap memory,
     string pool, please return me that instance
     s4 = x; //500@abcd
     */

    if (s1 == s4) {
      System.out.println("After intern, both uses the same cached reference.");
    }
  }
}
