package leetcode;

import java.util.ArrayList;
import java.util.List;

public class JumpingOnTheClouds_Hackerrank {
	public static int jumpingOnClouds(List<Integer> c) {
	    List<Integer> cloudJumps= new ArrayList<Integer>();
	    int count=0;
	    for(int i=0;i<=c.size()-1;i++){
	        if(c.get(i).equals(0)){
	        	cloudJumps.add(i); 
	        } 
	            
	    }
	  count= cloudJumps.size()-1;
	    	System.out.println(cloudJumps);
	    	System.out.println(count);
	    
	    return count;
	    }
	public static void main(String[] args) {
		List<Integer> c = new ArrayList<Integer>();
		c.add(0);
		c.add(1);
		c.add(0);
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		jumpingOnClouds(c);

	}

}
