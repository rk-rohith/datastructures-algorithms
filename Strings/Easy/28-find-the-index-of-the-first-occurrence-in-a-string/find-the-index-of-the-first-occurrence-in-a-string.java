class Solution {  
    public int strStr(String haystack, String needle) {  
        // If the length of the haystack is less than the length of the needle,  
        // it is impossible for the needle to be found in the haystack, so return -1.  
        if (haystack.length() < needle.length()) {  
            return -1;  
        }  

        // Loop through the haystack, stopping at the point where the remaining characters  
        // are less than the length of the needle.  
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {  
            // Check if the substring of the haystack, starting from index i   
            // and of the length of needle, is equal to the needle.  
            if (haystack.substring(i, i + needle.length()).equals(needle)) {  
                // If a match is found, return the starting index i.  
                return i;  
            }  
        }  

        // If no match is found after examining all possible positions, return -1.  
        return -1;  
    }  
}