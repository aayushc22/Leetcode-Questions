public class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode reversedList = reverseList(head);
        int carry = 0;
        ListNode current = reversedList, previous = null;

        while (current != null) {
            int newValue = current.val * 2 + carry;
            current.val = newValue % 10;
            carry = newValue > 9 ? 1 : 0;
            previous = current;
            current = current.next;
        }

        if (carry != 0) {
            ListNode extraNode = new ListNode(carry);
            previous.next = extraNode;
        }

        ListNode result = reverseList(reversedList);
        return result;
    }

    public ListNode reverseList(ListNode node) {
        ListNode previous = null, current = node, nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }
}
