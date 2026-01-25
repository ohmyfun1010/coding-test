package org.src;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) return head;

        ListNode last = head;
        int listCnt = 1;

        while(last.next != null){
            listCnt++;
            last = last.next;
        }

        int loopList = k % listCnt;
        if(loopList == 0) return head;

        // 시작과 끝을 연결하여 원형으로 만듦
        last.next = head;
        ListNode newTail = head;

        // 자를 꼬리 찾기
        for(int i = 0; i < listCnt - loopList - 1; i++){
            newTail = newTail.next;
        }

        // 꼬리의 next 가 신규 헤더
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;

    }
    public static void main(String[] argc){

        ListNode l3 = new ListNode(2,null);
        ListNode l2 = new ListNode(1,l3);
        ListNode l1 = new ListNode(0,l2);

        RotateList main = new RotateList();
        System.out.println(main.rotateRight(l1,2));

    }
}
