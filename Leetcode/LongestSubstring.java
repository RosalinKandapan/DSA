package leetcode;

public class LongestSubstring {

	public static void main(String[] args) {
		String s= "abcabc";
		char[] ch= s.toCharArray();
		String rev1="";
		String rev2="";
		String rev3 ="";

		for(int i=0;i<ch.length;i++) {
			 for(int j=i+1;j<ch.length;j++) {
				   if(ch[i]!=ch[j])
				   {
					   rev1=rev1+ch[i];
							   rev2=rev2+ch[j];
							   rev3 = rev1+rev2;
				   }
			   }
		}
		  
		

	}

}
