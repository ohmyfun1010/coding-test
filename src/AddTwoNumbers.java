package org.src;

import java.math.BigDecimal;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();

        if(l1==null){
            one.append("0");
        }else{
            while(l1.next != null){
                one.append(l1.val);
                l1=l1.next;
            }
            one.append(l1.val);
        }
        if(l2==null){
            two.append("0");
        }else{
            while(l2.next != null){
                two.append(l2.val);
                l2=l2.next;
            }
            two.append(l2.val);
        }
        one = one.reverse();
        two = two.reverse();
        BigDecimal intOne = new BigDecimal(one.toString());
        BigDecimal intTwo = new BigDecimal (two.toString());
        BigDecimal result = intOne.add(intTwo);
        String resultString = String.valueOf(result);
        ListNode prevNode = null;
        ListNode node = null;
        for(int i = 0;i<resultString.length();i++){
            String val = resultString.substring(i,i+1);
            node = new ListNode(Integer.parseInt(val),prevNode);
            prevNode = node;
        }

        return node;

    }

    public static void main(String[] argc){

        // l1 = [2 -> 4 -> 3]
        ListNode l1 = new ListNode(2,
                new ListNode(4,
                        new ListNode(3)));

        // l2 = [5 -> 6 -> 4]
        ListNode l2 = new ListNode(5,
                new ListNode(6,
                        new ListNode(4)));

        AddTwoNumbers atn = new AddTwoNumbers();
        atn.addTwoNumbers(l1,l2);

    }

}
