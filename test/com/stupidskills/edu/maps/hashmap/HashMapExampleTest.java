package com.stupidskills.edu.maps.hashmap;

import com.stupidskills.edu.sort.comparable.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExampleTest {

  public static final String MALE = "MALE";
  public static final String FEMALE = "FEMALE";
  public static final String VIRAT = "Virat";
  public static final String ROHIT = "Rohit";
  public static final String VIRAT_DESCRIPTION = "This will point to contact of Virat";


  enum PlayerNames {
    SACHIN, VIRAT, ROHIT, SHIKHAR, PUJARA
  }

  HashMapExample example = new HashMapExample();

  @Test
  public void test() {
    HashMap<PlayerNames, String> hashMap = new HashMap<PlayerNames, String>();
    hashMap.put(PlayerNames.SACHIN, "This will point to address of sachin");
    hashMap.put(PlayerNames.VIRAT, "This will point to contact of Virat");

    String s = hashMap.get(PlayerNames.VIRAT); //key
    Assertions.assertEquals(VIRAT_DESCRIPTION, s);

  }

  @Test
  public void createHashMap() {
    Assertions.assertEquals(9,example.createMap().size() );
  }

  @Test
  public void putMapTest() {
    Assertions.assertEquals(1,example.putMap().size() );
  }

  @Test
  public void removeTest() {
    Assertions.assertEquals(0,example.removeMap().size() );
  }

  /**
   * Array LIst
   * 1. for
   * 2. for each
   * 3. while
   * 4. do while
   * 5. iterator
   *
   */
  @Test
  public void iterationTest() {
    // Map<K, V>
    Map<PlayerNames, Player> hashMap = getPlayerMap();

    // ["A", "B", "D" , "C"]
    // [VIRAT, ROHIT, SACHIN, PUJARA, DHAWAN ]
    for (PlayerNames key: hashMap.keySet()) {
      Player player = hashMap.get(key);
      System.out.println(player.toString());
    }

    Iterator<PlayerNames> itr = hashMap.keySet().iterator();
    while(itr.hasNext()) {
      PlayerNames key = itr.next();
      Player player = hashMap.get(key);
      System.out.println(player.toString());
    }

    // a SET of ENTRY
    // ENTRY<K,V> is an interface - implementation KEY, VALUE
    // [please@123123, please@123124, please@123126, please@123127, please@123128]

    for(Map.Entry m : hashMap.entrySet()){
      System.out.println(m.getKey()+" "+m.getValue());
    }


    /**
     *  Map<String,String> map = </String,String>
     *  Set<Map<String,String> = new HashSet<>
     *
     */

  }

  /**
   * 1. Default size 16 -> 32 -> 64
   * 2. Load factor = 0.75
   * 3. Rehashing 12 -> 24 ->
   *
   * two theads call put(K, V)
   * hash - 11 elements
   */

  @Test
  public void hashCodeExample() {
    Map< Player, String> map = new HashMap<>();
    Player virat = new Player(VIRAT, 87, 7401); //virat@509

    String hello = new String("HELLO");
    hello = hello.intern();
    String helloWorld = new String("HELLO");

    //same instance
    String a = "Hello";
    String b = "Hello";

    //hascode = 53
    map.put(virat, VIRAT);


    Player viratDup = new Player(VIRAT, 87, 7401); //virat@510
    //hascode = 53
   // map.put(viratDup, "VIRAT_DUP");


    System.out.println(map.get(viratDup));



  }





    private Map<PlayerNames,Player> getPlayerMap() {
    Map<PlayerNames, Player> map = new HashMap<>();
    Player virat = new Player(VIRAT, 87, 7401); //virat@509



    Player rohit = new Player(ROHIT, 35, 2288);
    Player shikharDhawan = new Player("Shikhar", 35, 2088);
    Player sachin = new Player("Sachin", 200, 15921);
    Player pujara = new Player("Pujara", 82, 6199);
    map.put(PlayerNames.VIRAT, virat);
    map.put(PlayerNames.ROHIT, rohit);
    map.put(PlayerNames.SHIKHAR, shikharDhawan);
    map.put(PlayerNames.SACHIN, sachin);
    map.put(PlayerNames.PUJARA, pujara);
    return map;
  }
}