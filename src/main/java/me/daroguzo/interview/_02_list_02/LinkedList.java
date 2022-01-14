package me.daroguzo.interview._02_list_02;

import java.util.HashMap;
import java.util.Map;

public class LinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(4));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));

        list.print();
        LinkedNode node = list.findFromLast2(2);
        System.out.println(node.number);
    }

    /**
     * TODO 단일 연결 리스트의 끝에서 n번째에 위치한 노드를 찾는 함수를 구현하라.
     *  예) findFromLast(1 -> 4 -> 2 -> 3, 2), 끝에서 2번째에 위치한 2를 리턴한다.
     * @param n
     * @return
     */
    private LinkedNode findFromLast1(int n) {
        Map<Integer, LinkedNode> hashMap = new HashMap<>();
        LinkedNode current = this.head;
        int i = 0;
        while (current != null) {
            hashMap.put(i++, current);
            current = current.next;
        }
        return hashMap.get(hashMap.size() - n);
    }

    private LinkedNode findFromLast2(int n) {
        int size = 0;
        LinkedNode current = this.head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int index = size - n;
        LinkedNode target = this.head;
        while (index > 0) {
            index--;
            target = target.next;
        }

        return target;
    }

    private LinkedNode findFromLast3(int n) {
        LinkedNode left = this.head;
        LinkedNode right = this.head;
        int count = 0;
        while(right.next != null) {
            if (count == n - 1) {
                left = left.next;
                right = right.next;
            } else if (count++ < n) {
                right = right.next;
            }
        }
        return left;
    }

    private void print() {
        LinkedNode nodeToPrint = this.head;
        while(nodeToPrint != null) {
            System.out.println(nodeToPrint.number);
            nodeToPrint = nodeToPrint.next;
        }
    }

    private void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else if (tail != null) {
            tail.next = node;
            tail = tail.next;
        }
    }

}
