class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> groupedAnagrams = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap();

        for (int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            String sortedString = String.valueOf(charArray);

            if (!anagramMap.containsKey(sortedString)) {
                anagramMap.put(sortedString, new ArrayList<>(Collections.singletonList(strs[i])));
            } else {
                anagramMap.get(sortedString).add(strs[i]);
            }
        }

        for (Map.Entry<String, List<String>> entry : anagramMap.entrySet()) {
            groupedAnagrams.add(entry.getValue());
        }
        return groupedAnagrams;
    }
}