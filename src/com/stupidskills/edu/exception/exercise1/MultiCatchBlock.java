package com.stupidskills.edu.exception.exercise1;

import com.stupidskills.edu.Student;
import com.stupidskills.edu.StudentDemo;
import java.util.ArrayList;

public class MultiCatchBlock {

  public void multiCatchFunction() {
    try {
      int a[] = new int[5];
      a[5] = 30 / 0;


      //CRUD:MYSQL - SQLDEVELOPER
      //1. OPEN CONNECTION
      //hostid:3600@username::12345
      /**
       * 2. PS
       * 3. INSERT - DONE
       * + UPDATE - SQLException
       */
      //con.commit(true)
      // Fruits

      // smaller - grapes
      // larger - oranges
      //largest - apples

      //subclass/derived class - should be on the TOP
      //Parent/Super - should be on the lower
    } catch (ArithmeticException e) {
      System.out.println("Arithmetic Exception occurs");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBounds Exception occurs");
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Parent Exception occurs");
    }finally {
      System.out.println("rest of the code");
    }

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


  //TODO
  public void tryWIthResource (Student student) throws Exception {
      try (student){
          student.setAddressList(new ArrayList<>());
      }

  }
}
