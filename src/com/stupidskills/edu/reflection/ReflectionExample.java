package com.stupidskills.edu.reflection;

import com.stupidskills.edu.Student;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionExample {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
    Student student = new Student("abc", 28);
    reflectionActions(student);
    changeFieldValue(student);
  }

  public void sample() {
    //DB (TABLE) // object
    //Table Name = STUDENT_TBL
    //
  }


  public static void reflectionActions(Student student)
          throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
    Class clazz = student.getClass();
    System.out.println("Fully qualified name of the class "+ clazz.getName());
    String simpleClassName = clazz.getSimpleName();
    System.out.println("Class Name: "+ simpleClassName);
    //Access Modifiers
    int modifiers = clazz.getModifiers();
    Modifier.isAbstract( modifiers);
    Modifier.isPrivate( modifiers);
    Modifier.isProtected(modifiers);
    boolean isPublic = Modifier.isPublic( modifiers);

    if(isPublic) {
      System.out.println("This class is public.");
    }

    //class level annotation
    System.out.println("Annotation:: "+ clazz.getAnnotations()[0].annotationType().getName());

    //get package info
    Package packageInfo = clazz.getPackage();
    System.out.println(packageInfo.getName());

    //get constructor information
    Constructor[] constructors = clazz.getConstructors();
    for(Constructor constructor: constructors) {
      System.out.println(constructor.getName());
      Class[] parameterTypes = constructor.getParameterTypes();

    }
    //get all public methods
    Method[] methods = clazz.getMethods();
    for(Method method: methods) {
      System.out.println(method.getName());

    }

    //invoking private method
    Method privateStringMethod = clazz.getDeclaredMethod("printName", null);
    privateStringMethod.setAccessible(true);
    privateStringMethod.invoke(student, null);

    //get interfaces
    Class[] interfaces = clazz.getInterfaces();


    //get all fields
    Field[] fields = clazz.getFields();


  }

  /** changing value of an instance using reflection **/
  public static void changeFieldValue(Object objectInstance) throws NoSuchFieldException, IllegalAccessException {
    Class aClass = objectInstance.getClass();
    Field declaredField = aClass.getDeclaredFields()[0];
    declaredField.setAccessible(true);
    declaredField.set(objectInstance, "Vivek");
    System.out.println(declaredField.get(objectInstance));
  }
}
