package com.dsa.gfg.stack;
import java.util.Stack;
public class SortStack {

    public static Stack<Integer> sortstack(Stack<Integer> 
                                             input)
    {
        Stack<Integer> tmpStack = new Stack<Integer>();
        while(!input.isEmpty())
        {
            int tmp = input.pop();
         
            while(!tmpStack.isEmpty() && tmpStack.peek() 
                                                 < tmp)
            {
            input.push(tmpStack.pop());
            }
             
            tmpStack.push(tmp);
        }
        return tmpStack;
    }
     
    // Driver Code
    public static void main(String args[])
    {
        Stack<Integer> input = new Stack<Integer>();
        input.add(34);
        input.add(3);
        input.add(31);
        input.add(98);
        input.add(92);
        input.add(23);
     
        Stack<Integer> tmpStack=sortstack(input);
        System.out.println("Sorted numbers are:");
     
        while (!tmpStack.empty())
        {
            System.out.print(tmpStack.pop()+" ");
        } 
    }
}

/*
 * Tc-O(n2)
 * SC-O(n)*/
