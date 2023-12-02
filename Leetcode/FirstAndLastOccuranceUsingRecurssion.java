package leetcode;

public class FirstAndLastOccuranceUsingRecurssion {
	
	public static int first=-1;
	public static int last=-1;
	
	
	public static int  FirstAndLastOccurance(String s, int idx, char element) {
		if(idx==s.length()) {
			System.out.println("first"+first);
			System.out.println("last"+last);
		}
		char  currentOccurance =s.charAt(idx);
		if (currentOccurance == element ) {
			if(first==-1) {
				first=idx;
			} else {
				last=idx;
			}
		}
		FirstAndLastOccurance( s,idx+1, element);
		return first;
	}

	public static void main(String[] args) {
    String s="abcaaha";
    FirstAndLastOccurance(s, 0, 'a');
	}

}
