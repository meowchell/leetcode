package solution.leetcode.com;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by huijiej on 4/17/2018.
 */
public class LinkedListComponent {
    public static void main(String[] args) {
        LinkedListComponent l = new LinkedListComponent();
        ListNode ln = l.buildListNodes(new int[]{0, 1,2,3});
        System.out.println(l.numComponents(ln, new int[]{0,1 ,3}));


    }

    public int numComponents2(ListNode head, int[] G) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : G) {
            set.add(i);
        }
        while (head!=null){
            if ((set.contains(head.val)) && (head.next == null || set.contains(head.next.val))) count++;
            head = head.next;
        }
        return count;

    }
    public int numComponents(ListNode head, int[] G) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : G) {
            set.add(i);
        }
        while (head!=null){
            if (set.contains(head.val)){
                count++;
                head = head.next;
                while (head!=null){
                    if (!set.contains(head.val)) {
                        break;
                    }
                    head = head.next;
                }
            }else {
                head = head.next;
            }
        }

        return count;
    }

    public ListNode buildListNodes(int[] vals){
        ListNode cur = new ListNode(vals[0]);
        ListNode root = cur;
        for (int i=1; i < vals.length; i++){
            ListNode next = new ListNode(vals[i]);
            cur.next = next;
            cur = next;
        }
        return root;

    }

}
