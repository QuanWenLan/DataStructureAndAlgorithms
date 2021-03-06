package common;

import algorithms.LoopList;

/**
 * 链表节点
 *
 *      +------+  prev +-----+  prev +-----+
 * head |      | <===> |     | <===> |     |  tail
 *      +------+  next +-----+  next +-----+
 */
public class ListNode<T> {
    public T val;
    public ListNode<T> prev;
    public ListNode<T> next;
    public ListNode(T x) { val = x; }
    public ListNode(T val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    //打印输出链表
    public static <T> void printAllNodes(ListNode<T> head){
    	if (LoopList.isLoopList(head)) {
    		System.out.println("暂时不支持输出有环链表");
    		return;
    	}
        ListNode<T> node = head;
        while (node != null){
            System.out.print(node.val);
            node = node.next;
            System.out.print(node != null ? "->" : "");
        }
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}
