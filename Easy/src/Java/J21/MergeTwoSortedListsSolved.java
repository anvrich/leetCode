package Java.J21;

public class MergeTwoSortedListsSolved {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(10);
        ListNode current = head;
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
        return head.next;
    }

    public static ListNode arrayToList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }
    public static String listToString(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val).append(" -> ");
            head = head.next;
        }
        sb.append("null");
        return sb.toString();
    }

    public static void main(String[] args) {
        MergeTwoSortedListsSolved solution = new MergeTwoSortedListsSolved();

        // Пример 1
        int[] arr1_1 = {1, 2, 4};
        int[] arr1_2 = {1, 3, 4};
        ListNode list1_1 = arrayToList(arr1_1);
        ListNode list1_2 = arrayToList(arr1_2);
        ListNode result1 = solution.mergeTwoLists(list1_1, list1_2);
        System.out.println("Merged list: " + listToString(result1)); // [1,1,2,3,4,4]

        // Пример 2
        int[] arr2_1 = {};
        int[] arr2_2 = {};
        ListNode list2_1 = arrayToList(arr2_1);
        ListNode list2_2 = arrayToList(arr2_2);
        ListNode result2 = solution.mergeTwoLists(list2_1, list2_2);
        System.out.println("Merged list: " + listToString(result2)); // []

        // Пример 3
        int[] arr3_1 = {};
        int[] arr3_2 = {0};
        ListNode list3_1 = arrayToList(arr3_1);
        ListNode list3_2 = arrayToList(arr3_2);
        ListNode result3 = solution.mergeTwoLists(list3_1, list3_2);
        System.out.println("Merged list: " + listToString(result3)); // [0]
    }
}
