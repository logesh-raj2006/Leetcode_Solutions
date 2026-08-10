class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        for(int i=0;i<k;i++){
            char c = blocks.charAt(i);
            if(c=='W'){
                count++;
            }
        }
        int mincount = count;
        for(int i=k;i<blocks.length();i++){
            char c = blocks.charAt(i);
            if(c=='W'){
                count++;
            }
            c = blocks.charAt(i-k);
            if(c=='W'){
                count--;
            }
            mincount = Math.min(mincount, count);
        }
        return mincount;
    }
}