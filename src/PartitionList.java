package org.src;

import java.util.Queue;
import java.util.LinkedList;

public class PartitionList {
    public ListNode partition(ListNode head, int x) {

        Queue<ListNode> queue = new LinkedList<>();
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(head!=null){
            if (head.val < x) {
                ListNode node = new ListNode(head.val);
                current.next = node;
                current = current.next; // 포인터 이동
            } else {
                queue.add(new ListNode(head.val));
            }
            head = head.next;
        }

        while (!queue.isEmpty()) {
            current.next = queue.poll();
            current = current.next;
        }

        return dummy.next;

    }
    public static void main(String[] argc){
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        // 기준값 x = 3
        int x = 3;

        // 2. Solution 객체 생성 및 실행
        PartitionList main = new PartitionList();
        ListNode result = main.partition(head, x);
        System.out.println(result);
    }
}
