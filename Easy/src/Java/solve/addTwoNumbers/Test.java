package Java.solve.addTwoNumbers;

public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        System.out.print("List 1: ");
        printListNode(l1);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.print("List 2: ");
        printListNode(l2);

        System.out.println(asd(l1,l2));
    }

    public static ListNode asd(ListNode l1, ListNode l2){
        ListNode head = new ListNode();
        ListNode p = l1;
        ListNode q = l2;
        while (p != null & q != null){
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            System.out.println(x + " " + y);
             int sum = x+y;
             head = new ListNode(sum);
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        return head;
    }


    public static void printListNode(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print( current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
