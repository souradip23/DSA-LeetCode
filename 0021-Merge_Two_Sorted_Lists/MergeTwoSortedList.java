
public class MergeTwoSortedList {

    public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        List<Integer> values = new ArrayList<>();

        ListNode curr1 = list1;
        while (curr1 != null) {
            values.add(curr1.val);
            curr1 = curr1.next;
        }

        ListNode curr2 = list2;
        while (curr2 != null) {
            values.add(curr2.val);
            curr2 = curr2.next;
        }

        Collections.sort(values);

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummy.next;
    }

    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // Attach remaining nodes
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next;
    }
}
