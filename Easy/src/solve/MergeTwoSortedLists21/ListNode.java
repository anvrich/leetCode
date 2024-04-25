package solve.MergeTwoSortedLists21;

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }
        return dummyHead.next;
    }
}

