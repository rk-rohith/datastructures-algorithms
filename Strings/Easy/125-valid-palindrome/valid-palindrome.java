class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove special characters and convert to lower case  
        char[] strCharArray = cleanString.toCharArray();    // Convert the cleaned string to a character array  

        int start = 0;
        int end = strCharArray.length - 1;
        while(start < end) {
            // Compare characters from both ends  
            if(strCharArray[start] != strCharArray[end]) {
                return false;
            }
            start++;
            end--;

        }
        return true;
        
    }
}