class Solution {  
    public List<List<String>> groupAnagrams(String[] strs) {  
        // Initialize a list to hold the lists of grouped anagrams  
        List<List<String>> groupedAnagrams = new ArrayList<>();  
        // Create a map to associate sorted strings with their anagram groups  
        Map<String, List<String>> anagramMap = new HashMap<>();  

        // Iterate through each string in the input array  
        for (int i = 0; i < strs.length; i++) {  
            // Convert the current string to a character array to sort the characters  
            char[] charArray = strs[i].toCharArray();  
            // Sort the character array to generate the key for anagrams  
            Arrays.sort(charArray);  
            // Convert the sorted character array back to a string  
            String sortedString = String.valueOf(charArray);  

            // Check if the map already contains this sorted string as a key  
            if (!anagramMap.containsKey(sortedString)) {  
                // If not, create a new entry in the map with a new ArrayList containing the current string  
                anagramMap.put(sortedString, new ArrayList<>(Collections.singletonList(strs[i])));  
            } else {  
                // If it exists, retrieve the existing list and add the current string to this list  
                anagramMap.get(sortedString).add(strs[i]);  
            }  
        }  

        // After grouping the anagrams, iterate over the map entries to convert them into the result list  
        for (Map.Entry<String, List<String>> entry : anagramMap.entrySet()) {  
            // Add the list of anagrams to the result list  
            groupedAnagrams.add(entry.getValue());  
        }  
        // Return the final list of grouped anagrams  
        return groupedAnagrams;  
    }  
}