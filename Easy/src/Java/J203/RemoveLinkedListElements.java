package Java.J203;

public class RemoveLinkedListElements {
//               1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6 -> null
public static ListNode removeElements(ListNode head, int val) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = dummy;

    while (current.next != null) {
        if (current.next.val == val) {
            current.next = current.next.next;
        } else {
            current = current.next;
        }
    }
    return dummy.next;
}
//    Input: head = [1,2,6,3,4,5,6], val = 6
//    Output: [1,2,3,4,5]

    public static void main(String[] args) {
        int val = 6;
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        RemoveLinkedListElements.removeElements(head,val);
        PrintNode.print(head);
    }
}
