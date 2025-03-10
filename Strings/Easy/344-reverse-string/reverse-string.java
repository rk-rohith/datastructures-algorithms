class Solution {
    public void reverseString(char[] s) {
         // Initialize the start pointer to the beginning of the array  
        int start = 0;  
        // Initialize the end pointer to the last index of the array  
        int end = s.length - 1;  

        // Continue swapping until the start pointer is less than the end pointer  
        while (start < end) {  
            // Temporarily store the character at the start position  
            char temp = s[start];  
            // Swap the characters at start and end positions  
            s[start] = s[end];  
            s[end] = temp;  
            // Move the start pointer forward  
            start++;  
            // Move the end pointer backward  
            end--;  
        }
    }
}