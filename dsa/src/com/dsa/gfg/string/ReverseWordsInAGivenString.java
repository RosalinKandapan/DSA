package com.dsa.gfg.string;

public class ReverseWordsInAGivenString {
	public static String reverseString(String s)
    {
        StringBuilder ans=new StringBuilder();
         
        String temp = "";
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch==' ')
            {
                //if we find white space add temp in the start
                if(!temp.equals(""))
                {
                    //adding in the front every time
                    ans.insert(0,temp+" ");
                }
                 
                temp = "";
           }
            else
                temp += ch;
            if(i == s.length()-1 &&temp.charAt(temp.length()-1)==ch) {
            	ans.insert(0,temp+" ");
            }
        }
     
        //just removing the extra space at the end of the ans
     //   return ans.toString().substring(0,ans.length()-1);
        
        //Case where extra space not present at first and last index
        return ans.toString();
         
    }
     
    public static void main(String[] args) {
         
        String s1="Welcome to DSA Learning";
        System.out.println(s1.length());
        System.out.println("Before reversing length of string : "+s1.length());
        String ans1=reverseString(s1);
        System.out.println(ans1);
        
        String s2 =  "i like this program very much";
        String ans2 = reverseString(s2);
        
        System.out.println(ans2);
         
    }
}
