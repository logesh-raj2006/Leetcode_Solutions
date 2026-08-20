class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        int[] pCount = new int[26];
        int[] windowCount = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            windowCount[s.charAt(i) - 'a']++;
            if (i >= p.length()) {
                windowCount[s.charAt(i - p.length()) - 'a']--;
            }
            if (i >= p.length() - 1) {
                boolean same = true;

                for (int j = 0; j < 26; j++) {
                    if (pCount[j] != windowCount[j]) {
                        same = false;
                        break;
                    }
                }

                if (same) {
                    result.add(i - p.length() + 1);
                }
            }
        }

        return result;
    }
}