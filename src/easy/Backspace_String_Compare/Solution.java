package easy.Backspace_String_Compare;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();

        char[] SArr = S.toCharArray();
        char[] TArr = T.toCharArray();

        for(char element: SArr) {
            if(!stackS.isEmpty() && element == '#') {
                stackS.pop();
                continue;
            }
            if(element != '#') {
                stackS.push(element);
            }
        }

        for(char element: TArr) {
            if(!stackT.isEmpty() && element == '#') {
                stackT.pop();
                continue;
            }
            if(element != '#') {
                stackT.push(element);
            }
        }

        if(stackS.size() != stackT.size()) {
            return false;
        }

        while(!stackS.isEmpty() && !stackT.isEmpty()) {
            if(stackS.pop() != stackT.pop()) {
                return false;
            }
        }

        return true;

    }
}
