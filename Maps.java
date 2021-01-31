import java.util.*;  
public class Maps{  
   public static void main(String args[]) {
  // create six hash maps
  HashMap <Integer,String> hash_map1 = new HashMap <Integer,String> ();
  HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
  HashMap <Integer,String> hash_map3 = new HashMap <Integer,String> ();
  HashMap <Integer,String> hash_map4 = new HashMap <Integer,String> ();
  HashMap <Integer,String> hash_map5 = new HashMap <Integer,String> ();
  HashMap <Integer,String> hash_map6 = new HashMap <Integer,String> ();
  
  // populate hash maps
  hash_map1.put(1, "name");
  hash_map1.put(2, "gender");
  hash_map1.put(3, "city");
  System.out.println("\nValues in first map: " + hash_map1);
  hash_map2.put(1, "street")

  // put all values in secondmap
  hash_map2.putAll(hash_map1);
  System.out.println("\nNow values in second map: " + hash_map2);
  
  // populate hash maps
  hash_map3.put(1, "fav_Color");
  hash_map3.put(2, "Fav_pet");
  hash_map3.put(3, "hobby");
  System.out.println("\nValues in first map: " + hash_map3);
  
  

  // put all values in fourthmap names of random colors
  hash_map4.putAll(hash_map3);
  System.out.println("\nNow values in second map: " + hash_map4);
  
  // populate hash maps
  hash_map5.put(1, "Red");
  hash_map5.put(2, "blue");
  hash_map5.put(3, "purple");
  System.out.println("\nValues in first map: " + hash_map5);

  // put all values in sixth
  hash_map6.putAll(hash_map6);
  System.out.println("\nNow values in second map: " + hash_map6);
  
  
 }
}
