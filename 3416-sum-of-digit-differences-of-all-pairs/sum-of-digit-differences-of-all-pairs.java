class Solution {
    public long sumDigitDifferences(int[] nums) {
        int numDigits = String.valueOf(nums[0]).length();  // All numbers have the same number of digits
        List<Map<Integer, Integer>> digitPositionCounts = new ArrayList<>();

        // Initialize the list of maps
        for (int i = 0; i < numDigits; i++) {
            digitPositionCounts.add(new HashMap<>());
        }

        // Populate the frequency maps
        for (int num : nums) {
            for (int i = 0; i < numDigits; i++) {
                int digit = (num / (int) Math.pow(10, numDigits - 1 - i)) % 10;
                Map<Integer, Integer> map = digitPositionCounts.get(i);
                map.put(digit, map.getOrDefault(digit, 0) + 1);
            }
        }

        long totalDifferences = 0;
        int n = nums.length;

        // Calculate the sum of digit differences
        for (Map<Integer, Integer> map : digitPositionCounts) {
            for (int count : map.values()) {
                totalDifferences += (long) count * (n - count);
            }
        }

        return totalDifferences/2;
    }
}