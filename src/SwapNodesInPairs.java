package org.src;

import java.util.*;

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        if(head == null){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        list.add(head.val);
        while(head.next != null){
            head = head.next;
            list.add(head.val);
        }
        for(int i = 0;i<list.size()-1;i=i+2){
            Collections.swap(list,i,i+1);
        }
        Collections.reverse(list);
        ListNode prevNode = null;
        ListNode headNode = null;
        for(int i = 0;i<list.size();i++){
            headNode = new ListNode(list.get(i), prevNode);
            prevNode = headNode;
        }
        return headNode;
    }

    public static void main(String[] argc){
        ListNode l3 = new ListNode(3);
        ListNode l2 = new ListNode(2,l3);
        ListNode l1 = new ListNode(1,l2);
        SwapNodesInPairs sip = new SwapNodesInPairs();
        sip.swapPairs(l1);
    }

}
