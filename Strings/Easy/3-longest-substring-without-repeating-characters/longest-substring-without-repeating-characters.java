class Solution {
    public int lengthOfLongestSubstring(String s) {

        int start = 0;
        int end = 0;
        int maxLength = 0;

        List<Character> subStrList = new ArrayList<>();

        while (end < s.length()) {
            if (!subStrList.contains(s.charAt(end))) {
                subStrList.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, subStrList.size());
            } else {
                subStrList.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return maxLength;
    }
}