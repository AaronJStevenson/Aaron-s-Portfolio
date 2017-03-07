/*
 * This class' sequentialSearch method searches an int array for a specified value.
 */
public class SearchArray {
	/*
	 * The sequentialSearch method searches array for value.
	 * If the value is found in the array, the element's subscript
	 * is returned. Otherwise, -1 is returned.
	 */

	public static int sequentialSearch(int[] array, int value) {
		int index; // Loop control variable
		int element; // element the value is found at
		boolean found; // Flag indicating the search results
		
		// Elelment 0 is the starting point of the search
		index = 0;
		
		// Store the default values for element and found
		element = -1;
		found = false;
		
		// search the array
		while (!found && index < array.length){
			// does this element have value?
			if(array[index] == value)
			{
				found = true;  // indicates the value is found
				element = index; // saves the subscript of the value
			}
			
			// increment index so we can look at the next elelment.
			index++;
		}
		
		// Return either the subscript of the value(if found)
		// or -1 to indicate the value was not found
		return element;
		
	}

}
