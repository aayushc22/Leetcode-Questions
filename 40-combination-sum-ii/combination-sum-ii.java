import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        
        // 1. Array ko sort karna bohot zaroori hai taaki duplicates agal-bagal aa jayein
        Arrays.sort(candidates); 
        
        helper(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    private void helper(int[] arr, int target, int index, List<Integer> list, List<List<Integer>> ans) {
        // Base condition: agar target 0 ho gaya, toh combination mil gaya
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        // For-loop pattern (Slot filling)
        for (int i = index; i < arr.length; i++) {
            
            // 2. Optimization: array sorted hai, agar current element target se bada hai, 
            // toh aage ke saare elements bhi bade honge. Isliye loop break kar do.
            if (arr[i] > target) {
                break;
            }
            
            // 3. Duplicates ko skip karna (same level par)
            if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            // Element ko pick karna
            list.add(arr[i]);
            
            // Target reduce karke next index (i+1) par call karna (kyunki har element ek hi baar use ho sakta hai)
            helper(arr, target - arr[i], i + 1, list, ans);
            
            // Backtrack: list se remove karna taaki agla option (next iteration) try kar sakein
            list.remove(list.size() - 1);
        }
    }
}