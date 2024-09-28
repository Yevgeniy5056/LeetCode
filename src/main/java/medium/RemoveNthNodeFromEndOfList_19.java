package medium;

public class RemoveNthNodeFromEndOfList_19 {

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + " " + next;
        }
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        int n = 2;

        System.out.println(removeNthFromEnd(head, n));
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode left = temp;
        ListNode right = temp;

        for (int i = 0; i <= n; i++) {
            right = right.next;
        }
        while (right != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;
        return temp.next;
    }
}
