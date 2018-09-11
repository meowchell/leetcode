package solution.leetcode.com;

/**
 * Created by Huijie on 9/8/18.
 */






public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l1n = new ListNode(4);
        ListNode l1nn = new ListNode(3);
        l1.next = l1n;
        l1n.next = l1nn;

        ListNode l2 = new ListNode(2);
        ListNode l2n = new ListNode(4);
        ListNode l2nn = new ListNode(3);
        l2.next = l2n;
        l2n.next = l2nn;

        AddTwoNumbers a = new AddTwoNumbers();
        ListNode r = a.add2Numbers(l1, l2);
        while (r != null) {
            System.out.println(r.val);
            r = r.next;
        }


    }
    public ListNode add2Numbers(ListNode l1, ListNode l2){

        int carry = 0;
        int val;
        ListNode ret = l1;
        ListNode cur = l1;
        while (l1!=null || l2!=null ){
            val= carry + (l1 == null? 0:l1.val)+(l2 == null? 0:l2.val);
            carry = val/10;
            val %= 10;
            cur.val = val;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
            if (l1 == null && l2 == null && carry != 0){
                cur.next = new ListNode(0);
            }
            if(l1 == null && l2!=null){
                cur.next = l2;
            }
            cur = cur.next;

        }

        return ret;

    }

}
