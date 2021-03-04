package com.stupidskills.edu.designpattern.singleton;


import java.util.HashMap;
import java.util.Map;

/**
 * Premise: Object gets created single time
 */
public class SingletonExample {

  private Map<String, String> map = new HashMap<>();

  //eager loading
  public static SingletonExample instance = new SingletonExample();






  //lazy loading

  /**
   * T1                && T2          &&     T3 have reached line 27 at same time
   * instace@t1         instance@T2         instance@t3
   *
   * instance@t3
   *
   *
   * T1  instance@t1
   * &&
   * T2  instance@01
   * &&
   * T3  instance@01
   *
   * 100
   */
  /**
   * t4, t5, t6
   * @return
   */
  public static  SingletonExample getInstance() {
   // T1, T2, T3 at line 38

    if (instance == null) {

      //t1, t2, t3 [ instnace = null]

      //t1  - instance@t1

    //T1, T2, T3
      //T1 - resource1, resource2
      // t2 -> resource2, resource1
      synchronized (SingletonExample.class) {
        //t1
        if (instance == null) {
          instance = new SingletonExample();
        }

        synchronized (SingletonExample.class) {
          //t2
          if (instance == null) {
            instance = new SingletonExample();
          }
        }

      }

   }


    return instance; //instance@t1
  }


  private SingletonExample() {
    //read a configuration file
    map.put("key","value");
  }


  public String getValue(String key) {
    return map.get(key);
  }
}
