public class implementation {
    // Node class
    public static class node {
        int data;
        node next;
        node(int data) {
            this.data = data;
        }
    }

    // LinkedList class
    public static class LinkedList {
        node head = null;
        node tail = null;

        // Insert at end
        void inseratend(int val) {
            node temp = new node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        // Insert at head
        void inserthead(int val) {
            node temp = new node(val);
            if (head == null) {
                // if there is one node then we can use this condion 
                head = temp;
                tail = temp;
            } else {
                temp.next = head;  // ✅ correct way
                head = temp;
            }
        }

        // Display
        void display() {
            node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Size
        int size() {
            node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    // Main function
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.inseratend(6);
        li.inseratend(7);
        li.display();             // 6 7
        System.out.println(li.size());  // 2

        li.inserthead(4);
        li.inserthead(5);
        li.display();             // 5 4 6 7
        System.out.println(li.size());  // 4
    }
}
