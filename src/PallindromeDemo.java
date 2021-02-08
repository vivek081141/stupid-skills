public class PallindromeDemo {

  public static void main(String[] args) {
    System.out.println(isPallindrome("HELLO"));
    System.out.println(isPallindrome("CIVIc"));
    System.out.println(isPallindrome("LEVEL"));

  }

  /**
   *
   * LEVEL
   * CIVIC
   * HELLO => OLLEH
   *
   * Approach:
   * s1 = "hello"
   * s2 = "olleh"
   * if s1 && s2 are equal, then is pallindrome
   *
   * value = "HELLO"
   * char[] = ['H','E', 'L', 'L', 'O']
   * 0 -> H
   * 1 -> E
   * 2 -> L
   * 3 -> L
   * 4 -> O
   * 5 -> ArrayOutOfBoundException
   */
  public static boolean isPallindrome(String value) {
    boolean flag = false;
    int length = value.length();  //5
    String temp = "";

    /**
     * 1st Iteration
     * i = 4, temp = "O"
     * i = 3, temp = temp + "L"  = "OL"
     * i = 2, temp = temp + "L"  = "OLL"
     * i = 1, temp = temp + "E"  = OLLE
     * i= 0, temp = "OLLE" + "H" = OLLEH
     * i = -1
     */
    for(int i =length-1; i > -1; i--) {
      temp = temp  + value.charAt(i);
    }

    /*if (temp.equals(value)) {
      flag = true;
    }else {
      flag = false;
    }*/

    if (temp.equalsIgnoreCase(value)){
      flag = true;
    }

   // return temp.equals(value);
    return flag;
  }


  public static boolean isAdvPallindrome(String value) {
    boolean flag = true;
    int length = value.length();  //5
    int mid = length / 2;

    /**
     *    C I V I C
     *  0 => C
     *  1 -> I
     *  2 -> V
     *  3 -> I
     *  4 -> c
     *
     *  Length = 5
     *  Mid = 5/2 = 2.5 = 2
     */
    for(int i =0, l = length-1; i < mid; i++, l--) {
      if (value.charAt(i) != value.charAt(l)) {
        flag = false;
        break;
      }
    }


    return flag;
  }

}
