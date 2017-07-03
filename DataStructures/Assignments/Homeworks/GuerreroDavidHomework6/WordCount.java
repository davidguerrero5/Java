package GuerreroDavidHomework6;

import java.io.*;
import java.util.*;

public class WordCount {
  public static void main(String[] args) throws FileNotFoundException {
    HashMap map = new HashMap(); 

    // read each word from the file
    Scanner file = new Scanner(new File("sentence.txt"));
    while (file.hasNext()) {
      String word = file.next().toLowerCase();
      
      if(map.containsKey(word)) {
        // if we have already seen this word before,
        // increment its count by one
        Integer count = (Integer)map.get(word);
        map.put(word, new Integer(count.intValue() + 1));
      } else {
        // we haven't seen this word, so add it with count of 1
        map.put(word, new Integer(1));
      }
    }

    // now print out every word in the book, along with its count,
    // in alphabetical order
    ArrayList arraylist = new ArrayList(map.keySet());
    Collections.sort(arraylist);
    System.out.println(arraylist);
    
    for (int i = 0; i < arraylist.size(); i++) {
      String key = (String)arraylist.get(i);
      Integer count = (Integer)map.get(key);
      System.out.println(key + " " + count);
    }

  }
}
