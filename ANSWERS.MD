Try using a TreeMap instead of a HashMap. Does this make any difference?

  Everything works with a TreeMap instead of a HashMap, the difference is the TreeMap takes longer.


What happens if you invoke countWords multiple times for different String iterators?
  
  The same list/map would be used for all of the String iterators


What crucial role does the Iterator abstraction play in making WordCounter testable?

  If the map is empty, it can't be tested so the iterator adds entries to the map so it CAN be tested.
