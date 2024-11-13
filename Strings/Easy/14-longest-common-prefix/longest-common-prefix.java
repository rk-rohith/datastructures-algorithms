class Solution {
    public String longestCommonPrefix(String[] strs) {
          if (strs == null || strs.length == 0) {  
            return "";  
        }  

        // Start with the first string as the prefix  
        String prefix = strs[0];  

        // Compare the prefix with each string in the array  
        for (int i = 1; i < strs.length; i++) {  
            // Update the prefix by comparing it to the current string  
            while (strs[i].indexOf(prefix) != 0) {  
                // Remove the last character from the prefix  
                prefix = prefix.substring(0, prefix.length() - 1);  
                if (prefix.isEmpty()) {  
                    return "";  
                }  
            }  
        }  

        return prefix;  
    }
}