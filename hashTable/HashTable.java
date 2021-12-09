package hashTable;

import java.util.LinkedList;

public class HashTable {
    static class Node {
        String key;
        String value;

        public Node(String key, String value) {
            this.key = key;
            this.value = value;
        }

        String value() {
            return value;
        }

        void value(String value) {
            this.value = value;
        }
    }

    LinkedList<Node>[] data;

    HashTable(int size) {
        this.data = new LinkedList[size];
    }

    int getHashCode(String key) {
        int hashCode = 0;
        for (char c : key.toCharArray()) hashCode += c;
        return hashCode;
    }

    int convertToIndex(int hashCode) {
        return hashCode % data.length;
    }

    Node searchKey(LinkedList<Node> list, String key) {
        if (list == null) return null;
        return list.stream()
                   .filter(node -> node.key.equals(key))
                   .findFirst()
                   .orElse(null);
    }

    void put(String key, String value) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        if (list == null) {
            list = new LinkedList<>();
            data[index] = list;
        }
        Node node = searchKey(list, key);
        if (node == null) list.addLast(new Node(key, value));
        else node.value(value);
    }

    String get(String key) {
        int hashcode = getHashCode(key);
        int index = convertToIndex(hashcode);
        LinkedList<Node> list = data[index];
        Node node = searchKey(list, key);
        return node == null ? "Not found" : node.value();
    }

    public static void main(String[] args) {
        HashTable h = new HashTable(3);
        h.put("kim", "good");
        h.put("park", "bad");
        System.out.println(h.get("kim"));
        System.out.println(h.get("park"));
    }
}
