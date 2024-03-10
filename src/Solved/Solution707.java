package Solved;

public class Solution707 {
    class MyLinkedList {

        private class Node {
            int val;
            Node next, pre;

            public Node(int val) {
                this.val = val;
            }
        }

        Node head,tail;
        int length;

        public MyLinkedList() {
            head = new Node(-1);
            tail = new Node(-1);
            head.next = tail;
            tail.pre = head;
            length = 0;
        }

        public int get(int index) {
            if (index < 0 || index >= length) return -1;
            return getNode(index).val;
        }

        public void addAtHead(int val) {
            Node node = new Node(val);
            node.next = head.next;
            node.pre = head;
            node.next.pre = node;
            head.next = node;
            length += 1;
        }

        public void addAtTail(int val) {
            Node node = new Node(val);
            node.pre = tail.pre;
            node.next = tail;
            node.pre.next = node;
            tail.pre = node;
            length += 1;
        }

        public void addAtIndex(int index, int val) {
            if (index == 0) addAtHead(val);
            else if (index < 0 || index > length) return;
            else {
                Node node = getNode(index - 1);
                Node add = new Node(val);
                add.next = node.next;
                add.pre = node;
                node.next.pre = add;
                node.next = add;
                length += 1;
            }

        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index >= length) return;
            Node node = getNode(index);
            node.pre.next = node.next;
            node.next.pre = node.pre;
            length -= 1;
        }

        private Node getNode(int index){
            Node res = head.next;
            for (int i = 0; i < index; i++) {
                res = res.next;
            }
            return res;
        }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
}
