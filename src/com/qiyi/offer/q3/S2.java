package com.qiyi.offer.q3;

/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 * �ݹ�ʵ��
 */
import java.util.ArrayList;
public class S2 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        //ListNode tmp = listNode;
        while(listNode!=null)
        {
            list.add(0,listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
}


//ʱ�临�Ӷȣ�O��n��
//�ռ临�Ӷȣ�O��n��