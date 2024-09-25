class Solution {  
    // Method to check if a string can be a valid palindrome by removing at most one character  
    public boolean validPalindrome(String s) {  
        // If the string length is 1, it is already a valid palindrome  
        if (s.length() == 1)  
            return true;  

        // Initialize two pointers, one at the beginning (left) and one at the end (right) of the string  
        int left = 0;  
        int right = s.length() - 1;  
        
        // Loop until the two pointers meet  
        while (left < right) {  
            // If characters at the left and right pointers do not match  
            if (s.charAt(left) != s.charAt(right)) {  
                // Check if the string is a palindrome by skipping either the left or the right character  
                return isPalindrome(s, left, right - 1) || isPalindrome(s, left + 1, right);  
            } else {  
                // Move both pointers towards the center if the characters match  
                left++;  
                right--;  
            }  
        }  
        // If we finish the loop without finding a mismatch, it is a valid palindrome  
        return true;  
    }  

    // Helper method to check if a substring (from index i to j) is a palindrome  
    private static boolean isPalindrome(String str, int i, int j) {  
        // Check characters from both ends towards the center  
        while (i < j) {  
            // If characters do not match, it is not a palindrome  
            if (str.charAt(i) != str.charAt(j))  
                return false;  
            // Move towards the center  
            i++;  
            j--;  
        }  
        // If all characters match, it is a palindrome  
        return true;  
    }  
}