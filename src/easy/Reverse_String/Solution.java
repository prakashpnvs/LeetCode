package easy.Reverse_String;

class Solution {
    public void reverseString(char[] s) {
        for(int i=0; i<=s.length-1-i; i++) {
            char head = s[i];
            char tail = s[s.length-1-i];
            s[i] = tail;
            s[s.length-1-i] = head;
        }
    }
}
