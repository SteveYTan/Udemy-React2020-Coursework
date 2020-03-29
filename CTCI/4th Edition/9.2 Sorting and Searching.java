//9.2 Write a method to sort an array of strings so that all anagrams are next to each other


public class SortAnagram implements Comparator<String>{
	public String sortCh(String s){
		char[] arrayOfStrings = s.toCharArray();
		Arrays.sort(arrayOfStrings);
		return new String(arrayOfStrings);
	}

	public int compare(String stringA, String stringB){
		return sortCh(stringA).compareTo(sortCh(stringB));
	}
}