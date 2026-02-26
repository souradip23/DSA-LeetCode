
public class SwapsNodePairs {

    // Iterative Approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public ListNode swapPairs(ListNode head) {

        // Dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while (prev.next != null && prev.next.next != null) {

            ListNode first = prev.next;
            ListNode second = prev.next.next;

            // Swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev pointer forward
            prev = first;
        }

        return dummy.next;
    }

    // Recursive Approach
    // Time: O(n)

    // Space: O(n) (due to recursion stack)
    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode second = head.next;
        head.next = swapPairs(second.next);
        second.next = head;

        return second;
    }
}
