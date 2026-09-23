class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.merge(c, 1, (valueOld, valueNew) -> Integer.sum(valueOld, valueNew));
        }

        for (char c : t.toCharArray()) {
            tMap.merge(c, 1, (valueOld, valueNew) -> Integer.sum(valueOld, valueNew));
        }

        return sMap.equals(tMap);

    }
}
