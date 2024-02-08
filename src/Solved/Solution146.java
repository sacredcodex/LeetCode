package Solved;

import java.util.HashMap;


public class Solution146 {
    class LRUCache {
        class LinkedNode{
            int val;
            int key;
            LinkedNode prev, next;

            LinkedNode(int val, int key){
                this.val = val;
                this.key = key;
            }
        }

        class LinkedList{
            LinkedNode head, tail;
            int capacity, length;

            LinkedList(int capacity){
                this.capacity = capacity;
                head = new LinkedNode(0,-1);
                tail = new LinkedNode(0,-1);
                head.next = tail;
                tail.prev = head;
                length = 0;
            }

            int add(LinkedNode node){
                node.next = head.next;
                node.prev = head;
                head.next.prev = node;
                head.next = node;
                length += 1;
                if (length > capacity)
                    return drop();
                return -1;
            }

            int drop(){
                LinkedNode node = tail.prev;
                node.prev.next = tail;
                tail.prev = node.prev;
                length -= 1;
                return node.key;
            }

            void moveFirst(LinkedNode node){
                node.prev.next = node.next;
                node.next.prev = node.prev;
                node.next = head.next;
                node.prev = head;
                head.next.prev = node;
                head.next = node;
            }
        }
        private HashMap<Integer, LinkedNode> keyValue;
        private LinkedList linkedList;

        public LRUCache(int capacity) {
            keyValue = new HashMap<>();
            linkedList = new LinkedList(capacity);
        }

        public int get(int key) {
            if (keyValue.containsKey(key)){
                LinkedNode node = keyValue.get(key);
                linkedList.moveFirst(node);
                return node.val;
            }else return -1;
        }

        public void put(int key, int value) {
            if (keyValue.containsKey(key)){
                LinkedNode node = keyValue.get(key);
                node.val = value;
                linkedList.moveFirst(node);
            }else {
                LinkedNode node = new LinkedNode(value, key);
                keyValue.remove(linkedList.add(node));
                keyValue.put(key, node);
            }
        }
    }


}
