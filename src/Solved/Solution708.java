package Solved;

public class Solution708 {
    class Node {
        public int val;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _next) {
            val = _val;
            next = _next;
        }
    };
    public Node insert(Node head, int insertVal) {
        if (head == null){
            Node node = new Node(insertVal);
            node.next = node;
            return node;
        }
        Node ret = head;
        Node start = head.next;
        if (start.val >= head.val)
            while(start != head){
                if (start.val > start.next.val) {
                    start = start.next;
                    break;
                }
                start = start.next;
            }
        int length = 1;
        Node p = head.next;
        while (p != head){
            p = p.next;
            length += 1;
        }
        for (int i = 0; i < length-1; i++) {
            if (start.val <= insertVal && start.next.val >= insertVal) {
                Node tmp = start.next;
                start.next = new Node(insertVal);
                start.next.next = tmp;
                return head;
            }
            start = start.next;
        }
        Node tmp = start.next;
        start.next = new Node(insertVal);
        start.next.next = tmp;
        return head;
    }
}
