package leetcode;

public class LongestCommonPrefix_Leetcode2_copy {
	public static String longestCommonPrefix(String[] strs) {
		String subString=strs[0].substring(0, 2);
		String string="";
		String preFixMatch="";
		System.out.println(strs.length);
		for (int i=1;i<strs.length;i++) {
			if(subString.equals(strs[i].substring(0, 2).toString())) {
				if(i==strs.length-1) {
					preFixMatch="1";
				}
			}
		}
		if(preFixMatch.equals("1")) {
			System.out.println("substring matched");
			return subString ;
		}
		else{
			return string;
		}
	}

	public static void main(String[] args) {
		String[]strs =new  String[] {"flower","flow","flight"};
		longestCommonPrefix(strs);
	}

}
/*
 * return not print in console
 * for length method of string array length
 * use .equals in case of string comparison
 * 
 * another son but i here middle string not checked only first and second
 *    Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
 */ 
