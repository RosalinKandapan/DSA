package com.dsa.gfg.stack;

import java.util.Vector;

public class DeleteConsecutiveWords {
	
	public static Vector<String> deleteConsecutive(Vector<String> v) {
		int n = v.size();
	   for(int i =0;i<n-1;) {
			if(v.get(i).equals(v.get(i+1))) {
				v.remove(i);
				v.remove(i);
				if(i>0) {
					i--;
				}
				n=n-2;
			}else {
				i++;
			}
		}
	   return v;
	}

	public static void main(String[] args) {
    Vector<String> vec = new Vector<>();
    vec.addElement("ab");
    vec.addElement("aa");
    vec.addElement("aa");
    vec.addElement("abc");
    vec.addElement("bc");
   Vector<String> ans= deleteConsecutive(vec);
   System.out.println(ans); 
	}

}
