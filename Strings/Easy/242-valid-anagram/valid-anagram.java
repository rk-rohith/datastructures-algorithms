class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            char[] s1 = s.toLowerCase().toCharArray();
            char[] t1 = t.toLowerCase().toCharArray();

            Arrays.sort(s1);
            Arrays.sort(t1);
            return Arrays.equals(s1,t1);
        }

    }
}