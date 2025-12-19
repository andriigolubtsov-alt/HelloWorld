package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    static ListNode build(int[] a) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        for (int x : a) {
            cur.next = new ListNode(x);
            cur = cur.next;
        }
        return dummy.next;
    }

    static void print(ListNode h) {
        System.out.print("[");
        while (h != null) {
            System.out.print(h.val);
            if (h.next != null) System.out.print(", ");
            h = h.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        ListNode l1 = build(new int[]{1,2,4});
        ListNode l2 = build(new int[]{1,3,4});
        print(s.mergeTwoLists(l1,l2));

        LinkedList<Integer> a = new LinkedList<>();
        LinkedList<Integer> b = new LinkedList<>();
        a.add(1); a.add(2); a.add(4);
        b.add(1); b.add(3); b.add(4);
        a.addAll(b);
        Collections.sort(a);
        System.out.println(a);
    }
}