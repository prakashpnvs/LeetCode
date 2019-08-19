package easy.Remove_All_Adjacent_Duplicates_In_String;

import java.util.Stack;

class Solution {
    public String removeDuplicates(String S) {

        String[] strArray = S.split("");
        String result = "";

        Stack<String> stack = new Stack<>();
        stack.push(strArray[0]);

        for(int i=1; i<strArray.length; i++) {
            if(!stack.isEmpty() && strArray[i].equals(stack.peek())) {
                stack.pop();
                continue;
            } else {
                stack.push(strArray[i]);
            }
        }

        for(String element: stack) {
            result = result + element;
        }

        return result;

    }
}
