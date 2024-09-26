class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Initialize two pointers for the sliding window: 'start' and 'end'
        int start = 0; // Start index of the current substring
        int end = 0; // End index of the current substring
        int maxLength = 0; // Variable to store the maximum length found

        // List to track the current substring characters
        List<Character> subStrList = new ArrayList<>();

        // Iterate until the end pointer reaches the length of the string
        while (end < s.length()) {
            // If the character at 'end' is not in the current substring list
            if (!subStrList.contains(s.charAt(end))) {
                // Add the character at 'end' to the substring list
                subStrList.add(s.charAt(end));
                // Move 'end' pointer to the right
                end++;
                // Update the maximum length found
                maxLength = Math.max(maxLength, subStrList.size());
            } else {
                // If the character at 'end' is already in the substring
                // Remove the character at 'start' from the list
                subStrList.remove(Character.valueOf(s.charAt(start)));
                // Move 'start' pointer to the right to shrink the window
                start++;
            }
        }
        // Return the maximum length of substring found
        return maxLength;
    }
}