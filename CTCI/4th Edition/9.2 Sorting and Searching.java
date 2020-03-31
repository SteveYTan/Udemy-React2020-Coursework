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


//2.2 Algorithm that finds the nth to last element of a singly linked list

LinkedListNode nthToLast(LinkedListNode head, int n){
	if (head == null || n < 1) {
		return null;
	}
	LinkedListNode p1 = head;
	LinkedListNode p2 = head;
	for (int j = 0; j < n-1; ++j){
		if (p2 == null){
			return null;
		}
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
}