package tests;

public class Test {
    public static void main(String[] args) {
        // Создание связанного списка l1, представляющего число 342
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        // 2 -> 4 -> 3 -> null

        // Создание связанного списка l2, представляющего число 465
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        // 5 -> 6 -> 4 -> null

        // Вывод содержимого списков l1 и l2
        printList(l1); // 2 -> 4 -> 3 -> null
        printList(l2); // 5 -> 6 -> 4 -> null

        // Выполнение сложения чисел, представленных списками l1 и l2
        ListNode res = add(l1, l2); // 342 + 465 = 807 ; res = [7,0,8]
        printList(res);
    }

    // Метод для сложения чисел, представленных в виде связанных списков
    public static ListNode add(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;

        // Итерация по обоим спискам для сложения соответствующих разрядов
        while (p != null && q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        // Добавление остаточного переноса, если он есть
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next; // Возвращается начало нового списка, содержащего результат сложения
    }

    // Метод для вывода содержимого связанного списка
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next; // Переход к следующему узлу
        }
        System.out.println("null"); // Вывод признака конца списка
    }
}

// Класс, представляющий узел связанного списка
class ListNode {
    int val;
    ListNode next;

    // Конструкторы
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
