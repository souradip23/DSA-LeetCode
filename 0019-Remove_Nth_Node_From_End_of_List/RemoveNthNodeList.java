
public class RemoveNthNodeList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null)
            return null;
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int index = length - n;
        if (index == 0)
            return head.next;
        ListNode curr = head;
        ListNode prev = null;
        int i = 0;
        while (i < index) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        prev.next = curr.next;
        curr.next = null;
        return head;

    }
}
