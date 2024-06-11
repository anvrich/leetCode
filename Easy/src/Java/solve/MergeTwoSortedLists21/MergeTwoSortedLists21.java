package Java.solve.MergeTwoSortedLists21;

public class MergeTwoSortedLists21 {
    public static void main(String[] args) {
        ListNode list1Node1 = new ListNode(1);
        ListNode list1Node2 = new ListNode(2);
        ListNode list1Node3 = new ListNode(4);
        // 1 -> 2 -> 4 -> null;
        ListNode list2Node1 = new ListNode(1);
        ListNode list2Node2 = new ListNode(3);
        ListNode list2Node3 = new ListNode(4);
        // 1 -> 3 -> 4 -> null;

        list1Node1.next = list1Node2;
        list1Node2.next = list1Node3;
        list1Node3.next = null;
        //----------------------
        list2Node1.next = list2Node2;
        list2Node2.next = list2Node3;
        list2Node3.next = null;

        ListNode mergedList = ListNode.mergeTwoLists(list1Node1, list2Node1);

        System.out.print("Merged List: ");
        while (mergedList != null) {
            System.out.print(mergedList.val + " -> ");
            mergedList = mergedList.next;
        }
        System.out.println("null");
    }
}

