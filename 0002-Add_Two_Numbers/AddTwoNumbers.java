
public class AddTwoNumbers {

public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode dummy=new ListNode();
        ListNode res=dummy;
        while(l1!=null || l2!=null || carry > 0){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            res.next=new ListNode(sum%10);
            res=res.next;
        }return dummy.next;
}

}
