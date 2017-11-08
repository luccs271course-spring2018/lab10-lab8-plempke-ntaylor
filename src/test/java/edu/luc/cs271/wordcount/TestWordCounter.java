package edu.luc.cs271.wordcount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class TestWordCounter {

  // TODO complete this test class
  // DONE
  
  
  // TODO declare a reference to the SUT (system under test), i.e., WordCounter
  // DONE
  private Map<String, Integer> tempMap;
  WordCounter count = new WordCounter(tempMap);
  

  @Before
  public void setUp() {
    // TODO create the SUT instance
    // DONE
    tempMap = new HashMap<>();
  }

  @After
  public void tearDown() {
    // TODO set the SUT instance to null
    // DONE
    tempMap = null;
  }

  @Test
  public void testGetCountEmpty() {

    // TODO verify that the SUT initially returns an empty map
    // DONE
    assertTrue(tempMap.isEmpty());


  }

  @Test
  public void testGetCountNonEmpty() {

    // TODO run the SUT on a specific String iterator with some repeated words,
    // then use assertions to verify the correct counts
    // do this for at least two words in the iterator and two not in the iterator
    
    // DONE, BUT CHECK LATER
    // Do you need to have xzc as a test case?
    
    Iterator someIterator = Arrays.asList("asdf", "oiu", "qwer").iterator();
    count.countWords(someIterator);
    assertNotEquals(2, count.getCount("asdf"));
    assertNotEquals(2, count.getCount("oiu"));
    assertNotEquals(2, count.getCount("qwer"));

  }
}

