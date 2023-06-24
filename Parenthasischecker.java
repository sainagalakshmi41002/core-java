package Datastructures;

import java.util.Scanner;
import java.util.Stack;

public class Parenthasischecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            boolean result=isBalanced(input);
            System.out.println(result);
        }
    }
    public static boolean isBalanced(String str){
        Stack<Character> stack=new Stack<>();
        char[]ch=str.toCharArray();
        for(Character c:ch){
            if(c=='{' || c=='[' || c=='('){
                stack.push(c);
            }
            else if(c==')' || c=='}' || c==']'){
                if (stack.isEmpty()) {
                    return false;}
                else{
                    Character previouschar=stack.peek();
                    if (c=='}' && previouschar == '{' || c==')' && previouschar == '(' || c==']' && previouschar == '['){
                        stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
