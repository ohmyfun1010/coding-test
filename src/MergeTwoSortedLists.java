package org.src;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        List<Integer> list = new ArrayList<>();
        ListNode prevNode;

        if(list1!=null){
            list.add(list1.val);
            while(list1.next != null){
                prevNode = list1.next;
                list.add(prevNode.val);
                list1 = prevNode;
            }
        }

        if(list2!=null){
            list.add(list2.val);
            while(list2.next != null){
                prevNode = list2.next;
                list.add(prevNode.val);
                list2 = prevNode;
            }
        }

        Collections.sort(list, Collections.reverseOrder());
        ListNode result = null;

        if(!list.isEmpty()){
            result = new ListNode(list.get(0));
            for(int i = 1;i<list.size();i++){
                result = new ListNode(list.get(i),result);
            }
        }

        return result;

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
