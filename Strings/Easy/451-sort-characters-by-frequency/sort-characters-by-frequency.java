class Solution {  
    public String frequencySort(String s) {  
        // Create a map to count the frequency of each character  
        Map<Character, Integer> mp = new HashMap<>();  
        // Use a TreeMap to store characters by their frequencies in descending order  
        TreeMap<Integer, List<Character>> r = new TreeMap<>(Collections.reverseOrder());  
        // StringBuilder to build the final sorted string  
        StringBuilder ss = new StringBuilder();  

        // Count the frequency of each character in the string  
        for (char a : s.toCharArray())  
            mp.put(a, mp.getOrDefault(a, 0) + 1);  

        // Populate the TreeMap with characters grouped by their frequencies  
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {  
            // If the frequency key does not exist, create a new entry in TreeMap  
            if (!r.containsKey(entry.getValue())) {  
                r.put(entry.getValue(), new ArrayList<>());  
            }  
            // Add the character to the list of characters with that frequency  
            r.get(entry.getValue()).add(entry.getKey());  
        }  

        // Iterate over the TreeMap to construct the resulting string  
        for (Map.Entry<Integer, List<Character>> entry : r.entrySet()) {  
            int freq = entry.getKey(); // Get the frequency  
            List<Character> chars = entry.getValue(); // Get the list of characters with that frequency  
            // Append each character 'freq' times to the StringBuilder  
            for (char c : chars) {  
                for (int i = 0; i < freq; i++) {  
                    ss.append(c);  
                }  
            }  
        }  

        // Return the final string with characters sorted by frequency  
        return ss.toString();  
    }  
}