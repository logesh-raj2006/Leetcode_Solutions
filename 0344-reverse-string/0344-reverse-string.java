
class Solution {
    public void reverseString(char[] s) {
        int start =0;
        int last = s.length -1;
        while (start < last){
            char ch = s[start];
            s[start] = s[last];
            s[last]= ch;

            start++;
            last--;
        }
        
    }
}