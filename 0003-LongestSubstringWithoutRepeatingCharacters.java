class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> valuesFound = new HashMap<>();
        int result = 0;
        for(int left = 0, right = 0  ; left < s.length(); left++){
            if(valuesFound.containsKey(s.charAt(left))){
               right = Math.max(valuesFound.get(s.charAt(left)), right); 
            }
            result = Math.max(result, left - right + 1);
            valuesFound.put(s.charAt(left),  left + 1);
        }
        return result;
    }
}
