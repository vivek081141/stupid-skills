package com.stupidskills.edu.exception.exercise1;

public class MultiCatchBlock {

  public void multiCatchFunction() {
    try {
      int a[] = new int[5];
      a[5] = 30 / 0;
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurs");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBounds Exception occurs");
    } catch (Exception e) {
      System.out.println("Parent Exception occurs");
    }
    System.out.println("rest of the code");
  }

  @Override
  protected void finalize() throws Throwable {
    super.finalize();
  }

  public void multiCatchFunction2() {
    try {
      int a[] = new int[5];
      a[5] = 30 / 0;
    } catch (ArithmeticException |ArrayIndexOutOfBoundsException | NullPointerException e) {
      System.out.println("Arithmetic Exception occurs");
    }catch (Exception e) {
      System.out.println("Parent Exception occurs");
    }
    System.out.println("rest of the code");
  }
}
