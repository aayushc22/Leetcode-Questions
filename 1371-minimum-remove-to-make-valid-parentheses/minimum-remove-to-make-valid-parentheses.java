class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Boolean> toRemove = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    toRemove.put(i, true);
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            toRemove.put(stack.pop(), true);
        }

       
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!toRemove.containsKey(i)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}

