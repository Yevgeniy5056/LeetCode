package medium;

import java.util.HashMap;
import java.util.Map;

public class LRUCache_146 {
    private int capacity;
    private Map<Integer, Node> map = new HashMap<>();
    private Node head;
    private Node tail;

    public LRUCache_146(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            moveToTail(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.val = value;
            moveToTail(node);
        } else {
            Node node = new Node(key, value);
            if (map.size() < capacity) {
                addToTail(node);
            } else {
                map.remove(head.key);
                removeHead();
                addToTail(node);
            }
            map.put(key, node);
        }
    }

    private void moveToTail(Node node) {
        if (node != tail) {
            if (node != head) {
                node.left.right = node.right;
                node.right.left = node.left;
                tail.right = node;
                node.left = tail;
                tail = node;
                tail.right = null;
            } else {
                Node prevHead = removeHead();
                tail.right = prevHead;
                prevHead.left = tail;
                tail = prevHead;
            }
        }
    }

    private Node removeHead() {
        if (head == tail) {
            Node tmp = head;
            head = null;
            tail = null;
            return tmp;
        } else {
            Node prevHead = head;
            head = head.right;
            head.left = null;
            prevHead.right = null;
            return prevHead;
        }
    }

    private void addToTail(Node node) {
        if (tail != null) {
            tail.right = node;
            node.left = tail;
        } else {
            head = node;
        }
        tail = node;
    }

    private static class Node {
        int key;
        int val;
        Node left;
        Node right;

        private Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
