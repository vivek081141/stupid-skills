package com.stupidskills.edu.exception.exercise1;

import com.stupidskills.edu.Student;
import com.stupidskills.edu.sort.comparable.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnCheckedExceptionTest {

  UnCheckedException exception = new UnCheckedException();

  @Test
  public void arithmeticTest() {
    Integer result = exception.arithmeticTest(100, 0);
    System.out.println(result);
    Assertions.assertEquals(Integer.MAX_VALUE, result);

    result = exception.arithmeticTest(6, 3);
    Assertions.assertEquals( 2, result);

  }

  @Test
  void nullPointerTest() {
    String name = null;
    int length = exception.nullPointerTest(name);
    Assertions.assertEquals( 0, length);

  }

  @Test
  void classCastException() {
    Student student = new Student("V", 30);
    Player player = exception.classCastException(student);
    System.out.println(player);
  }

  @Test
  void arrayIndexOUtOfBoundException() {
    Integer[] arr = {11, 12, 12};
    System.out.println(exception.arrayIndexOutOfBoundException(null));
  }

  @Test
  public void testFinalize() {
    Player virat = new Player("Virat", 87, 7401);
    System.out.println(exception.testFinalize());
    System.out.println(exception.dummyMethod());
    System.out.println(exception.dummyMethod());

  }


}