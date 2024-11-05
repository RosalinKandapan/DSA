package com.dsa.gfg.stack;

import java.util.Arrays;
import java.util.Stack;

public class SimplifyPath {

	public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String [] p = path.split("/");
        System.out.println("p:"+Arrays.toString(p));
        for(String s : p) {
            if(s.equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if(!s.equals(".") && !s.equals("..") && !s.equals(".")
             && !s.equals(""))
            {
                System.out.println("with in else:"+ s);
                stack.push(s);
            }
        }
        if(stack.isEmpty()){
            return "/";
        }
        while(!stack.isEmpty()){
            System.out.println("stack:"+stack.toString());
            sb.insert(0,stack.pop()).insert(0,"/");
        }
        return sb.toString();
    }
}

//Tc:O(n)
//Sc:O(n)


