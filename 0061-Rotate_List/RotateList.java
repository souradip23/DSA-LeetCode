public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;
        ListNode curr = head;
        int length = 1;
        while (curr.next != null) {
            curr = curr.next;
            length++;
        }
        int index = k % length;
        curr.next = head;
        if (index == 0) {
            curr.next = null;
            return head;
        }
        ListNode first = head;
        for (int i = 0; i < length - index - 1; i++) {
            first = first.next;
        }
        ListNode temp = first.next;
        first.next = null;
        return temp;
    }
}
