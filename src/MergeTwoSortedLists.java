package org.src;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
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
        } else if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;

    }

    public static void main(String[] argc){

        MergeTwoSortedLists main = new MergeTwoSortedLists();

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2,l1);
        ListNode l4 = new ListNode(4,l2);

        ListNode l11 = new ListNode(1);
        ListNode l33 = new ListNode(3,l11);
        ListNode l44 = new ListNode(4,l33);

        main.mergeTwoLists(l4,l44);

    }

}
