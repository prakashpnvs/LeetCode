package easy.Length_of_Last_Word;

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if(s == null || s.isEmpty()) {
            return 0;
        }
        String[] arr = s.split(" ");
        String last = arr[arr.length - 1];
        return last.length();
    }
}
