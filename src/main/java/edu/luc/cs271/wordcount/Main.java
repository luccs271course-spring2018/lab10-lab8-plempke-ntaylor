package edu.luc.cs271.wordcount;

import java.util.*;

public class Main {

  public static void main(final String[] args) throws InterruptedException {
    // set up the scanner so that it separates words based on space and punctuation
    final Scanner input = new Scanner(System.in).useDelimiter("[^\\p{Alnum}]+");
    
    Map<String, Integer> someMap = new HashMap<>();
    
    WordCounter counter = new WordCounter(someMap); // 1.

    counter.countWords(input);

    int size = counter.getCounts().size(); // 2.

    List<Map.Entry<String, Integer>> entryList = new ArrayList<>(size);
    
    entryList.addAll(counter.getCounts().entrySet());

    Collections.sort(entryList, new DescendingByCount());

    if (counter.getCounts().size() < 11)
    {
      for (int i = 0; i < counter.getCounts().size(); i++)
      {
        System.out.println(entryList.get(i));
      }
    }
    else
    {
      for (int i = 0; i <= 9; i++) {
        System.out.println(entryList.get(i));
      }
    }
    
    //worked on needs to be finished

    // TODO complete this main program
    // 1. DONE create a WordCounter instance
    // 2. DONE use this to count the words in the input
    // 3. DONE determine the size of the resulting map
    // 4. DONE create an ArrayList of that size and
    // 5. DONE store the map's entries in it (these are of type Map.Entry<String, Integer>
    // 6. sort the ArrayList in descending order by count
    //    using Collections.sort and an instance of the provided comparator (after fixing the latter)
    // 7. print the (up to) ten most frequent words in the text

  }
}
