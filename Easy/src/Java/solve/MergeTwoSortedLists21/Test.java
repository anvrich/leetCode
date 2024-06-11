package Java.solve.MergeTwoSortedLists21;

public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(20);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(23);
        ListNode l5 = new ListNode(14);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;

        while (l1.next != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }
    }
}
