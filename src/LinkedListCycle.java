package org.src;


import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if(head==null) return false;

        Set<ListNode> set = new HashSet<>();

        while(head.next != null){

            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;

        }

        return false;

    }

    public static void main(String[] argc){

        ListNode l4 = new ListNode(3);
        ListNode l3 = new ListNode(2);
        ListNode l2 = new ListNode(0);
        ListNode l1 = new ListNode(-4);

        l4.next = l3;
        l3.next = l2;
        l2.next = l1;
        l1.next = l3;

        LinkedListCycle main = new LinkedListCycle();
        System.out.println(main.hasCycle(l4));


    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }


}
