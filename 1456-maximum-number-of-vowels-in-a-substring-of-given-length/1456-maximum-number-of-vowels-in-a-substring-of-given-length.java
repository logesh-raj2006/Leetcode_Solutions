class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;
        for (int i=0;i<k;i++){
             char c=s.charAt(i);
             if (isVowel(c)) {
                 count++;
             }
        }
        int maxCount = count;
        for (int i=k;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=s.charAt(i-k);
            if (isVowel(c1)) {  
                count++;
            }
            if (isVowel(c2)) {
                count--;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
    
    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
