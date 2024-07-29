package Java.J206;

public class ReverseLinkedList {
    public  static ListNode reverseList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
//        Input: head = [1,2,3,4,5]
//        Output:       [5,4,3,2,1]
        ListNode head = new ListNode(1);
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode forth = new ListNode(5);


        head.next = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        System.out.println("Before reverse list");
        PrintNode.print(head);

        System.out.println("\nAfter reverse list");
        head = ReverseLinkedList.reverseList(head);
        PrintNode.print(head);
    }
}
