package com.harsh.leetcode.onetohundred;

import com.harsh.leetcode.onetohundred.utils.ListNode;

import java.math.BigInteger;

public class Problem2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//        StringBuilder str1 = new StringBuilder();
//        StringBuilder str2 = new StringBuilder();
//
//        do {
//            str1.append(l1.val);
//            l1 = l1.next;
//        } while (l1 != null);
//
//
//        do {
//            str2.append(l2.val);
//            l2 = l2.next;
//        } while (l2 != null);
//
//        BigInteger num1 = new BigInteger(str1.reverse().toString());
//        BigInteger num2 = new BigInteger(str2.reverse().toString());
//        BigInteger sum = num1.add(num2);
//
//        //long num1 = Long.parseLong(str1.reverse().toString());
//        //long num2 = Long.parseLong(str2.reverse().toString());
////        long sum = num1 + num2;
//
////        System.out.println("num1: " + num1);
////        System.out.println("num2: " + num2);
////
////        System.out.println("Sum : " +sum);
//
//        StringBuilder result = new StringBuilder(String.valueOf(sum));
//        result = result.reverse();
//
//        ListNode resultNode = createListNodeFromStringBuilder(result, 0);
//
////        StringBuilder something = new StringBuilder();
////        do {
////            something.append(resultNode.val);
////            resultNode = resultNode.next;
////        } while (resultNode != null);
////
////        System.out.println(something);
//
//        return resultNode;
//    }
//
//    public ListNode createListNodeFromStringBuilder(StringBuilder result, int i) {
//        ListNode listNode = new ListNode();
//        if(i >= result.length())
//            return null;
//        listNode.val = Character.getNumericValue(result.charAt(i));
//        listNode.next = createListNodeFromStringBuilder(result, i + 1);
//        return listNode;
//    }

    /*
     ********FOR TESTING IN MAIN METHOD,********
     ********COPY THE BELOW LINES IN METHOD********
     */
    public void copyToMainForTest() {
        Problem2 problem2 = new Problem2();

//        ListNode n13 = new ListNode(3);
//        ListNode n12 = new ListNode(4, n13);
//        ListNode n11 = new ListNode(2, n12);
//
//        ListNode n23 = new ListNode(4);
//        ListNode n22 = new ListNode(6, n23);
//        ListNode n21 = new ListNode(5, n22);

//        ListNode n11 = new ListNode(0);
//        ListNode n21 = new ListNode(0);

        ListNode n11 = new ListNode(9);

        ListNode n210 = new ListNode(9);
        ListNode n29 = new ListNode(9, n210);
        ListNode n28 = new ListNode(9, n29);
        ListNode n27 = new ListNode(9, n28);
        ListNode n26 = new ListNode(9, n27);
        ListNode n25 = new ListNode(9, n26);
        ListNode n24 = new ListNode(9, n25);
        ListNode n23 = new ListNode(9, n24);
        ListNode n22 = new ListNode(9, n23);
        ListNode n21 = new ListNode(1, n22);

        problem2.addTwoNumbers(n11, n21);
    }

}