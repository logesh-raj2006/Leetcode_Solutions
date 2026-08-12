class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            windowCount[s2.charAt(i) - 'a']++;

            if (i >= s1.length()) {
                windowCount[s2.charAt(i - s1.length()) - 'a']--;
            }

            if (i >= s1.length() - 1) {
                boolean same = true;

                for (int j = 0; j < 26; j++) {
                    if (s1Count[j] != windowCount[j]) {
                        same = false;
                        break;
                    }
                }

                if (same) {
                    return true;
                }
            }
        }

        return false;
    }
}