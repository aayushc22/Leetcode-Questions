class Solution {
    public long sumDigitDifferences(int[] nums) {
         Map<Integer, Map<Character, Long>> mp = new HashMap<>();

        for (int num : nums) {
            String s = String.valueOf(num);
            for (int i = 0; i < s.length(); i++) {
                char digit = s.charAt(i);
                mp.putIfAbsent(i, new HashMap<>());
                Map<Character, Long> innerMap = mp.get(i);
                innerMap.put(digit, innerMap.getOrDefault(digit, 0L) + 1);
            }
        }

        long result = 0;
        int len = nums.length;

        for (int num : nums) {
            String s = String.valueOf(num);
            for (int i = 0; i < s.length(); i++) {
                char digit = s.charAt(i);
                result += (len - mp.get(i).get(digit));
            }
        }

        return result / 2;
    }
}