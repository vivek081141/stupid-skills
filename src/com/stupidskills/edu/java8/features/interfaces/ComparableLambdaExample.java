package com.stupidskills.edu.java8.features.interfaces;


import com.stupidskills.edu.java8.features.interfaces.model.Person;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableLambdaExample {

  public void test () {
    List<Person> personList = new ArrayList<>();

    personList.add(new Person("A", "30"));
    personList.add(new Person("B", "31"));
    personList.add(new Person("C", "32"));
    personList.add(new Person("D", "33"));

    Collections.sort(personList, new PersonComparator());
  }

  public void test2 () {
    List<Person> personList = new ArrayList<>();

    personList.add(new Person("A", "30"));
    personList.add(new Person("B", "31"));
    personList.add(new Person("C", "32"));
    personList.add(new Person("D", "33"));

    Collections.sort(personList, new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
      }
    });

  }


  public void test3 () {
    List<Person> personList = new ArrayList<>();

    personList.add(new Person("A", "30"));
    personList.add(new Person("B", "31"));
    personList.add(new Person("C", "32"));
    personList.add(new Person("D", "33"));


  }
}


class PersonComparator implements Comparator<Person> {

  @Override
  public int compare(Person o1, Person o2) {
    return o1.getName().compareTo(o2.getName());
  }
}
