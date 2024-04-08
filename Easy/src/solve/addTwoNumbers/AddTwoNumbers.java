package solve.addTwoNumbers;

import java.util.Stack;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        System.out.print("List 1: ");
        printList(l1);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.print("List 2: ");
        printList(l2);

        System.out.print("Reversed List 1: ");
        printReverseList(l1);

        System.out.print("Reversed List 2: ");
        printReverseList(l2);

        ListNode res = addTwoNumbers(l1,l2);
        System.out.println("Результат = " + res.toString());

    }

    public static void printList(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void printReverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode current = head;
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " -> ");
        }
        System.out.println("null");
    }
    public static ListNode addTwoNumbers(ListNode l1 , ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, cur = dummyHead;
        int carry = 0;

        while (p != null && q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            System.out.println(x + " + " + y + " = " + sum + "----> carry: " + carry);
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        // Добавление остаточного переноса, если он есть
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return dummyHead.next; // Возвращается начало нового списка, содержащего результат сложения
    }
}
