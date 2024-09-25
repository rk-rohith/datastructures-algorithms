class Solution {
    public String reverseWords(String s) {
        // Trim any leading or trailing whitespace from the input string
        s = s.trim(); // Note: Assign the trimmed value back to s

        // Split the trimmed string into an array of words, using one or more whitespace
        // characters as the delimiter
        String[] splitWord = s.split("\\s+");

        // Initialize pointers for the start and the end of the array
        int start = 0;
        int right = splitWord.length - 1;

        // StringBuilder to hold the reversed words
        StringBuilder reverseWord = new StringBuilder();

        // Loop to reverse the words in the array
        while (start <= right) {
            // Append the word at the current 'right' index to the StringBuilder
            reverseWord.append(splitWord[right]);
            // Move the right pointer to the left
            right--;

            // If there are more words to add, append a space
            if (right >= 0)
                reverseWord.append(" ");
        }

        // Convert the StringBuilder to a string and return it
        return reverseWord.toString();
    }
}