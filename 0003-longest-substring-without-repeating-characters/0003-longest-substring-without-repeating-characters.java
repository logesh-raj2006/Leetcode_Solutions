class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] arr = new int[128];

        int left = 0;
        int maxLength = 0;

        char[] chars = s.toCharArray();

        for (int right = 0; right < chars.length; right++) {

            char c = chars[right];

            arr[c]++;

            while (arr[c] > 1) {
                arr[chars[left]]--;
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}